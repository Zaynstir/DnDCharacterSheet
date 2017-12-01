var path = require('path');
var fs = require('fs');

var express = require('express');
var app = express();
var exphbs = require('express-handlebars');

/* SET UP HANDLEBARS */
app.use(express.static(path.join(__dirname + '/public')))
exphbs({layoutsDir: path.join(__dirname + '/public')});
const hbs = exphbs.create({layoutsDir: path.join(__dirname + '/public')});

app.engine('handlebars', hbs.engine);
app.set('view engine', 'handlebars');
app.set('views', path.join(__dirname + '/public/'));
/*********************/

var java = require('java');

// Location of compiled java files
java.classpath.push('./java/');
java.classpath.push('.');

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
var spell_array = java.newArray('Spell', [spell]);

var feat = SACSRunner.findFeatSync('Dwarven Combat Training');
var feat_array = java.newArray('Feat', [feat]);

var item_arraylist = java.newInstanceSync('java.util.ArrayList');
item_arraylist.addSync(SACSRunner.findItemSync('Arrows'));

var cs = new CharacterSheet('Tim', race_Human, class_array, spell_array, feat_array, item_arraylist);

console.log("RACE: " + cs.getRaceSync().getNameSync());



app.get('/', function(req, res){
    res.render('index',{
        data: w.getWeaponTypeSync()
    });
});

app.get('/export', function(req, res){
    res.render('export-page',{});
});

app.listen(3000, function(){
    console.log("LISTENING ON 3000");
});
