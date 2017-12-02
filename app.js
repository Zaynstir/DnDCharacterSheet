var path = require('path');
var fs = require('fs');

var express = require('express');
var app = express();
var exphbs = require('express-handlebars');

var bodyParser = require('body-parser');

/* SET UP HANDLEBARS */
app.use(express.static(path.join(__dirname + '/public')))
exphbs({layoutsDir: path.join(__dirname + '/public')});
const hbs = exphbs.create({layoutsDir: path.join(__dirname + '/public')});

app.engine('handlebars', hbs.engine);
app.set('view engine', 'handlebars');
app.set('views', path.join(__dirname + '/public/'));

app.use(bodyParser.urlencoded({extended: true}));
/*********************/

var java = require('java');

// Location of compiled java class files
java.classpath.push('./java/');

var SACSRunner = java.import('SACSRunner');
var CharacterSheet = java.import('CharacterSheet')

// RUN MAIN method of sacsrunner
var result = java.callStaticMethodSync("SACSRunner", "main", java.newArray("java.lang.String", []));

// console.log("34:: Race Object:: " + SACSRunner.findRaceSync('Dragonborn'));
// console.log("35:: Race Object:: " + SACSRunner.findRaceSync('Human'));

// constructing a character sheet object
var race_Human = SACSRunner.findRaceSync('Human');
var class_Bard = SACSRunner.findClassSync('Bard');

var class_array = java.newArray('Class', [class_Bard]);

var spell = SACSRunner.findSpellSync('Acid Splash');
var spell2 = SACSRunner.findSpellSync('Alarm');
var spell3 = SACSRunner.findSpellSync('Animal Friendship');
var spell_array = java.newArray('Spell', [spell, spell2, spell3]);

var feat = SACSRunner.findFeatSync('Dwarven Combat Training');
var feat_array = java.newArray('Feat', [feat]);

var item_arraylist = java.newInstanceSync('java.util.ArrayList');
item_arraylist.addSync(SACSRunner.findItemSync('Arrows'));
item_arraylist.addSync(SACSRunner.findItemSync('Orb'));


var cs = new CharacterSheet('Tim', race_Human, class_array, spell_array, feat_array, item_arraylist);

console.log("RACE: " + cs.getRaceSync().getNameSync());


app.get('/', function(req, res){
    res.render('index',{
        data: cs
    });
});

app.get('/export', function(req, res){
    var raw_items = cs.getItemsSync();
    var raw_items_array = [];
    for (var i = 0; i < raw_items.sizeSync(); i++) {
        console.log("ITEM_RA: " + raw_items.getSync(i).getNameSync());
        raw_items_array.push({'name': raw_items.getSync(i).getNameSync()});
    }

    var raw_spells = cs.getSpellsSync();
    var raw_spells_array = [];
    for (var i = 0; i < raw_spells.length; i++) {
        raw_spells_array.push({
            name: raw_spells[i].getNameSync(),
            range: raw_spells[i].getRangeSync(),
            duration: raw_spells[i].getDurationSync(),
        });
    }

    var raw_feats = cs.getFeatsSync();
    var raw_feats_array = [];
    for (var i = 0; i < raw_feats.length; i++) {
        raw_feats_array.push({
            name: raw_feats[i].getNameSync()
        })
    }
     console.log(raw_spells_array);

    console.log(raw_items_array);
    res.render('export-page',{
        name: cs.getNameSync(),
        level: cs.getLvlSync(),
        class: cs.getClassesSync()[0].getNameSync(),
        // background: cs.getBackgroundSync()
        background: "placeholder background",
        player_name: "Matt Link",
        race: cs.getRaceSync().getNameSync(),
        alignment: "Chaotic Neutral",
        experience: cs.getExpSync(),
        stats : {
            str: cs.getStrSync(),
            dex: cs.getDexSync(),
            con: cs.getConSync(),
            int: cs.getIntSync(),
            wis: cs.getWisSync(),
            cha: cs.getChaSync()
        },
        AC: 10 + cs.getDexSync(),
        initiative: cs.getDexSync() + 2, // PLUS PROFICIENCY BONUS /*TODO:::*/
        speed: cs.getRaceSync().getSpeedSync(),
        hitpoints: cs.getMaxHealthSync(),
        items: raw_items_array,
        spells: raw_spells_array,
        feats: raw_feats_array
    });
});

app.post('/import', function(req, res){
    // var name = req.body.name;
    var data = req.body;
    var name = data.characterName;
    // var playerClass =
    console.log(req.body);
    // res.render('import-page',{});
});

app.get('/import', function(req, res){
    var races = [];
    var raw_races = SACSRunner.getRaceRaySync();
    for (var i = 0; i < raw_races.sizeSync(); i++) {
        races.push({
            name: raw_races.getSync(i).getNameSync()
        })
    }

    var classes = [];
    var raw_classes = SACSRunner.getClassRaySync();
    for (var i = 0; i < raw_classes.sizeSync(); i++) {
        classes.push({
            name: raw_classes.getSync(i).getNameSync()
        })
    }

    var items = [];
    var items_raw = SACSRunner.getItemRaySync();
    for (var i = 0; i < items_raw.sizeSync(); i++) {
        items.push({
            name: items_raw.getSync(i).getNameSync()
        })
    }

    var spells = [];
    var raw_spells = SACSRunner.getSpellRaySync();
    for (var i = 0; i < raw_spells.sizeSync(); i++) {
        spells.push({
            name: raw_spells.getSync(i).getNameSync()
        })
    }

    var feats = [];
    var raw_feats = SACSRunner.getFeatRaySync();
    for (var i = 0; i < raw_feats.sizeSync(); i++) {
        feats.push({
            name: raw_feats.getSync(i).getNameSync()
        })
    }

    res.render('import-page',{
        races: races,
        classes: classes,
        items: items,
        spells: spells,
        feats: feats
    });
})

app.listen(3000, function(){
    console.log("LISTENING ON 3000");
});
