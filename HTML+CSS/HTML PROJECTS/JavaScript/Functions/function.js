//Named Functions

function add(num1,num2)
{
    console.log('Sum=',num1+num2);
}
add(10,20);

//Function Expression(Anonymous)

var sub=function(num1,num2)
{
    var subValue=num1-num2;
    return subValue;
}
var value=sub(90,89)
console.log('Value=',value);

//Self Invoked Functions

(function(num1,num2)
{
    console.log('Value=',num1*num2);
})(10,20)

//Fat Arrow Function

var div1=(num1,num2)=>
{
    console.log('Value=',num1/num2);
}
div1(10,5)

var div2=num1=>
{
    console.log('Value=',num1);
}
div2(3);

var div3=(num1,num2)=>num1+num2;

var value=div3(10,20);
console.log(value);

greeting('Akshaa');

function greeting(msg)
{
    console.log('Hello '+msg)
}

greet('Pooja');
var greet=function(msg)
{
    console.log('Hi'+msg);
}

greets('Meghana');
var greets=(msg)=>
{
    console.log('HI',msg);
}