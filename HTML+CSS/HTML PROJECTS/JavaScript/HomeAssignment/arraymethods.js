const carbrand=new Array('Audi','BMW','Lambo','Porsche','Ferrari');
const shoesbrand=new Array('Nike','Puma','adidas');
const mobile=new Array('OnePlus','Apple','Samsung');
const pcbrand=new Array('HP','MacBook','Sony');
const hero=new Array('Vicky','Varun','VijaySai');
const actress=new Array('Alia','Emma');
const fruits=new Array('Apple','Mango','Grapes');
const vegetables=new Array('Cucumber','Ladies Finger');
const numbers=new Array(1,2,3,4);
const names=new Array('Akshata','Pooja','Meghana','Chaitra','Deekshita');

console.log(typeof carbrand);
console.log('After this method',carbrand);


console.log("************To Check Whether Array or NOT***************");
isArrayorNot=Array.isArray(carbrand);
console.log(isArrayorNot);
console.log('After this method',carbrand);
isArrayorNot=Array.isArray(shoesbrand);
console.log(isArrayorNot);
console.log('After this method',shoesbrand);
isArrayorNot=Array.isArray(mobile);
console.log(isArrayorNot);
console.log('After this method',mobile);
isArrayorNot=Array.isArray(pcbrand);
console.log(isArrayorNot);
console.log('After this method',pcbrand);
isArrayorNot=Array.isArray(hero);
console.log(isArrayorNot);
console.log('After this method',hero);


console.log("************To Check Whether Element present  or NOT***************");

isPresent=fruits.includes('Apple');
console.log(isPresent);
console.log('After this method',fruits);
isPresent=vegetables.includes('Tomato');
console.log(isPresent);
console.log('After this method',vegetables);
isPresent=shoesbrand.includes('Puma');
console.log(isPresent);
console.log('After this method',shoesbrand);
isPresent=mobile.includes('Apple');
console.log(isPresent);
console.log('After this method',mobile);
isPresent=names.includes('Alia');
console.log(isPresent);
console.log('After this method',names);


console.log("************To Check Whether Element present  or NOT from given range***************");

isPresent=fruits.includes('Apple',3);
console.log(isPresent);
console.log('After this method',fruits);
isPresent=vegetables.includes('Tomato',4);
console.log(isPresent);
console.log('After this method',vegetables);
isPresent=shoesbrand.includes('Puma',2);
console.log(isPresent);
console.log('After this method',shoesbrand);
isPresent=mobile.includes('Apple,1');
console.log(isPresent);
console.log('After this method',mobile);
isPresent=names.includes('Alia',2);
console.log(isPresent);
console.log('After this method',names);



console.log("************To Add new Element to last position***************");

addNewElem=fruits.push('Pineapple','Banana');
console.log(addNewElem);
console.log('After this method',fruits);
addNewElem=mobile.push('Nokia');
console.log(addNewElem);
console.log('After this method',mobile);
addNewElem=vegetables.push('Cauliflower');
console.log(addNewElem);
console.log('After this method',vegetables);
addNewElem=names.push('Alia');
console.log(addNewElem);
console.log('After this method',names);
addNewElem=shoesbrand.push('Fila');
console.log(addNewElem);
console.log('After this method',shoesbrand);


console.log("************To Remove last Element ***************");

RemovedElem=fruits.pop();
console.log(RemovedElem);
console.log('After this method',fruits);
RemovedElem=vegetables.pop();
console.log(RemovedElem);
console.log('After this method',vegetables);
RemovedElem=mobile.pop();
console.log(RemovedElem);
console.log('After this method',mobile);
RemovedElem=names.pop();
console.log(RemovedElem);
console.log('After this method',names);
RemovedElem=carbrand.pop();
console.log(RemovedElem);
console.log('After this method',carbrand);


console.log("************To Add new Element at first position***************");

addNewElem1=fruits.unshift('Tomato');
console.log(addNewElem1);
console.log('After this method',fruits);
addNewElem1=vegetables.unshift('Cauliflower');
console.log(addNewElem1);
console.log('After this method',vegetables);
addNewElem1=mobile.unshift('Nokia');
console.log(addNewElem1);
console.log('After this method',mobile);
addNewElem1=carbrand.unshift('Camero');
console.log(addNewElem1);
console.log('After this method',carbrand);
addNewElem1=names.unshift('Alia');
console.log(addNewElem1);
console.log('After this method',names);


console.log("************To Remove Element from first position***************");

let removeElem1=fruits.unshift('Tomato');
console.log(removeElem1);
console.log('After this method',fruits);
removeElem1=vegetables.unshift('Cauliflower');
console.log(removeElem1);
console.log('After this method',vegetables);
removeElem1=mobile.unshift('Nokia');
console.log(removeElem1);
console.log('After this method',mobile);
removeElem1=carbrand.unshift('Camero');
console.log(removeElem1);
console.log('After this method',carbrand);
removeElem1=names.unshift('Alia');
console.log(removeElem1);
console.log('After this method',names);



console.log("************Splice Method***************");

fruits.splice(1,0,'Kiwi');
console.log('After this method',fruits);
carbrand.splice(3,0,'Kia');
console.log('After this method',carbrand);
vegetables.splice(3,1,'Chilly');
console.log('After this method',vegetables);
actress.splice(3,0,'Sonakshi');
console.log('After this method',actress);
names.splice(2,0,'Kiara');
console.log('After this method',names);


console.log("************Slice Method***************");

h=fruits.slice(0,1);
console.log('After this method',h);
console.log('After this method',fruits);
h=vegetables.slice(0,3);
console.log('After this method',h);
console.log('After this method',vegetables);
h=names.slice(2,4);
console.log('After this method',h);
console.log('After this method',names);
h=carbrand.slice(2,3);
console.log('After this method',h);
console.log('After this method',carbrand);
h=shoesbrand.slice(3,4);
console.log('After this method',h);
console.log('After this method',shoesbrand);

index=fruits.indexOf('Tomato',3);
console.log('Index of Tomato',index);
index=shoesbrand.indexOf('Nike',1);
console.log('Index of Nike',index);
 index=mobile.indexOf('Nokia',3);
console.log('Index of Nokia',index);
 index=pcbrand.indexOf('Lenovo',3);
console.log('Index of Lenovo',index);
index=fruits.indexOf('Apple',2);
console.log('Index of Apple',index);

const bingo=fruits.join('-');
console.log(bingo);
