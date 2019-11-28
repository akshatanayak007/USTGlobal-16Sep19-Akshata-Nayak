const hobbies=['Sleeping','Cricket','Eating','Coding','Roaming'];
console.log(typeof hobbies);
console.log('After this method',hobbies);


console.log("************To Check Whether Array or NOT***************");
const isArrayorNot=Array.isArray(hobbies);
console.log(isArrayorNot);
console.log('After this method',hobbies);


console.log("************To Check Whether Element present  or NOT***************");

const isPresent=hobbies.includes('Cricket');
console.log(isPresent);
console.log('After this method',hobbies);


console.log("************To Check Whether Element present  or NOT from given range***************");

const isPresentRange=hobbies.includes('Cricket',100);
console.log(isPresentRange);
console.log('After this method',hobbies);


console.log("************To Add new Element to last position***************");

const addNewElem=hobbies.push('Guitar','Volleyball');
console.log(addNewElem);
console.log('After this method',hobbies);


console.log("************To Remove last Element ***************");

const RemovedElem=hobbies.pop();
console.log(RemovedElem);
console.log('After this method',hobbies);


console.log("************To Add new Element at first position***************");

const addNewElem1=hobbies.unshift('Numismatics','Singing');
console.log(addNewElem1);
console.log('After this method',hobbies);


console.log("************To Remove Element from first position***************");

const RemovedElem1=hobbies.shift();
console.log(RemovedElem1);
console.log('After this method',hobbies);

const hobbies1=['Sleeping','Cricket','Eating','Coding','Roaming'];

console.log("************Splice Method***************");

hobbies1.splice(1,0,'Bird watching','PubG');
console.log('After this method',hobbies1);


console.log("************Slice Method***************");

const h=hobbies1.slice(1,4);
console.log('After this method',h);
console.log('After this method',hobbies1);

const index=hobbies.indexOf('Roaming',3);
console.log('Index of Roaming',index);

const bingo=hobbies1.join('-');
console.log(bingo);


const numbers=[100,200,300,400,500];
var num=numbers.map(function(value,index){
    let newValue=value+50;
    return newValue;
})
console.log('After Map method',num);


console.log("Fat Arrow Functions");
var nums2=numbers.map(value=>value+500);
console.log('After Using Fat Arrow Function',nums2);

const filtNum=numbers.filter(function(value,index){
    if(value>200)
        return true;
    else
        return false;
})
console.log('After Using Fat Arrow Function',filtNum);

const filtnewarr=numbers.filter(value=>value>200);
console.log('After Using Fat Arrow Function',filtnewarr);