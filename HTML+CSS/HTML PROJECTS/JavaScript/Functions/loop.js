console.log("******************FOR-OF-LOOP*****************");

var brands=['Kingfisher','Bisleri','Aqua','Kinley']

for(var element of brands){             //It will store elements in element variable
    console.log("Brand=",element);
}
console.log("*****************FOR-IN-LOOP******************");

var brands=['Kingfisher','Bisleri','Aqua','Kinley'] 

for(var element in brands){             //It will store index in element variable
    console.log("Brand=", brands[element]);
}
console.log("****************FOR_IN_LOOP*******************");

var person={
    name:'Sundari',
    age:33,
    color:'white',
}

for(var key in person){             //It will store index in element variable /* It can be used for both Arrays and Objects */
    console.log("value=", person[key]);
}

console.log("*****************FOR-EACH-METHOD******************");

var movies=['Sholay','MayaBazaar','Jurassic Park','Titanic'];

movies.forEach(function(value,index){             //For-Each is a method used only in arrays.
    console.log("movie=",value);
    console.log("movie=",index);
});
console.log("***********************************");

var items=[{
    item:'Bangles',
    id:1,
    price:100
},
{
    item:'Eyeliner',
    id:2,
    price:100
},
{
    item:'Watch',
    id:3,
    price:500
},
{
    item:'Bike',
    id:4,
    price:100000
}]

for(var element of items)
{
    console.log("Item=",element);
}
console.log("***********************************");

for(var element in items)
{
    console.log(items[element]);
}
console.log("***********************************");
items.forEach(function(value,ind)
{
    console.log(value);
})
console.log("***********************************");

var mov=['Baahubali','Spider Man'];
mov[3]='Akii';

for(var element of mov)
{
    console.log("Item=",element);
}
console.log("***********************************");
for(var element in mov)
{
    console.log(mov[element]);
}
console.log("***********************************");
mov.forEach(function(value,ind)
{
    console.log(value);
})
console.log("***********************************");

for(var i=0;i<mov.length;i++)
{
    console.log(mov[i]);
}
console.log("***********************************");

mov['b']=100;
for(var element of mov)
{
    console.log("Item=",element);
}
console.log("***********************************");
for(var element in mov)
{
    console.log(mov[element]);
}
console.log("***********************************");
mov.forEach(function(value,ind)
{
    console.log(value);
})
console.log("***********************************");

for(var i=0;i<mov.length;i++)
{
    console.log(mov[i]);
}
console.log("***********************************");