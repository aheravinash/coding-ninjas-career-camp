/* Ways of declaring a function */
/*  Way 1 
function add(a, b){
    return a + b;
}
*/
/*  Way 2 
var add = function(a, b){
    return a + b;
}
*/
/* We need to export the function so ... */
module.exports.add = function(a, b){
    return a + b;
}

module.exports.multiply = function(a, b){
    return a * b;
}

/* folowing also works; module keyword is not necessary */
exports.subtract = function(a, b){
    return a - b;
}