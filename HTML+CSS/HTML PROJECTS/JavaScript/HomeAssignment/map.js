const items=[{
    name:'Ear ring',
    id:1,
    price:5000
},
{
    name:'kajal',
    id:2,
    price:100
},
{
    name:'Trimmer',
    id:3,
    price:3000,

},
{
    name:'Beardo',
    id:4,
    price:170
},
{
    name:'Gel',
    id:5,
    price:500
},

{
    name:'Tops',
    id:6,
    price:1800
},
{
    name:'T-shirts',
    id:7,
    price:1500
},
{
    name:'Heels',
    id:8,
    price:600
},
{
    name:'Shoes',
    id:9,
    price:1500,

},
{
    name:'Jeans',
    id:10,
    price:1000
}];
var num=items.map(function(value,index){
    let newValue=value.price+300;
    return newValue;
})
const updateitem=items.map(function(value,index){
    value.price=value.price+300;
    return items;
})
const updateitem2=items.map((value)=>{
    value.price=value.price+300;
    return value;
})
console.log('After Map method',num);


console.log("Fat Arrow Functions");
var nums2=items.map(value=>value.price+500);
console.log('After Using Fat Arrow Function',nums2);

const filtNum=items.filter(function(value,index){
    if(value.price>1000)
        return true;
    else
        return false;
})
console.log('After Using Fat Arrow Function',filtNum);

const filtnewarr=items.filter(value=>value.price>1000);
console.log('After Using Fat Arrow Function',filtnewarr);