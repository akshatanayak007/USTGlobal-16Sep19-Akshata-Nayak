//Named Functions
var num;
var fact = 1;
function factorial(num)
{   
    for(i=1;i<=num;i++)
    {
        fact=fact*i;
    }
    console.log('Factorial : '+fact);
}
factorial(4);
/*  if(num!==0)
    {
        var factorial = num*factorial;
        num = num-1;
    }
    fact(num);*/
console.log("==================================")

//Function Expression
var n1,fact=1;
var factorial = function(n1)
{
    for(i=1;i<=n1;i++)
    {
        fact=fact*i;
    }
    return fact;
}
var j = factorial(5);
console.log("Factorial of ",n1," is ",j)

console.log("==================================")
//Self invoked
var n2,fact=1;
(function(n2)
{
    for(i=1;i<=n2;i++)
    {
        fact=fact*i;
    }
    console.log('Factorial of number is ',fact)
})(3)

console.log("==================================")
//Fat arrow
var n3,fact=1;
var facto = function(n3)
{
    for(i=1;i<=n3;i++)
    {
        fact=fact*i;
    }
    console.log('Factorial of given number is '+fact)
}
facto(6)