console.log("*******Variable*********");

var name;
var name='Pailwan';
name="Prasthanam";
console.log(name);

console.log("*******Let*********");

let name1; //only declartion supported
// var name1='Pailwan'; //No redeclaration
name1="Prasthanam"; //Re-initialization is possible
//no hoisting                    
console.log(name1);

console.log("*******Const*********");

// const name1; //only declartion not -supported
const name2='Pailwan';
// const name1="Akshata" re-declaration not supported
// name1="Prasthanam"; //Re-initialization is not supported
//no hoisting                    
console.log(name2);

console.log("*******Var*********");
for(var i=0;i<5;i++){
    console.log('Inside',i);
}
console.log('Outside',i);

console.log("*******Let*********");
for(let j=0;j<5;j++){
    console.log('Inside',j);
}
 console.log('Outside',j);

console.log("*******Const*********");
for(const i=0;i<5;i++){
    console.log('Inside',i);
}
console.log('Outside',i);
