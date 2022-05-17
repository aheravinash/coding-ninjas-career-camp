const express = require('express');
const port = 3000;

const app = express();

app.get('/', function(req, res){
    console.log(req);
    res.send('<h1>Hello, you are at /</h1>');
});

app.listen(port, function(err){
    if(err){
        console.log('Error in running the server ', err);
    }
    console.log('Express server is running on port: ', port);
});