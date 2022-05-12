console.log('Hello World');

function add(a,b){
    return a + b;
}

//console.log(add(2,3));
//console.log(process.argv);

var args = process.argv.slice(2);
var a = parseInt(args[0]);
var b = parseInt(args[1]);
console.log(add(a, b));0