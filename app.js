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

// var SACSRunner = java.import('SACSRunner');

// var sr = new SACSRunner();
// console.log(sr);
// console.log(SACSRunner);

var result = java.callStaticMethodSync("SACSRunner", "main", java.newArray("java.lang.String", []));
console.log(result);

// console.log(SACSRunner.mainSync(java.newArray("java.lang.String",[])));
// console.log(SACSRunner.findRaceSync('Dragonborn'));
// console.log(SACSRunner.findRace(function(err, result){
//     // return result;
//     console.log(result);
//}));
// SACSRunner.main(java.newArray("java.lang.String", []));
// console.log(SACSRunner.findRaceSync('Dragonborn'));
// console.log(sr.findRaceSync('Dragonborn'));

// var Item = java.import('Item');
var Weapon = java.import('Weapon');


var wt = java.newArray("java.lang.String", ["hey", "bruh"]);
var w = new Weapon("BOW", java.newChar("w"), wt, "10");

// console.log(wt[0]);
console.log(w.getWeaponTypeSync());

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
