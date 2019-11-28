function fact(n)
{
    var val=1;
    for(var i=1;i<=n;i++)
    {
        val=val*i;
    }
    console.log("Factorial Of Number",val);
}
fact(5);

(function(n)
{
    var val=1;
    for(var i=1;i<=n;i++)
    {
        val=val*i;
    }
    console.log("Factorial of Number",val);
})(5)


var div1=(val)=>
{
    for(var i=1;i<=val;i++){
        val=val*i;
    
}
console.log('Value=',val);
}
div1(5);

var sub=function(n)
{
    for(var i=1;i<=n;i++)
    {
        val=val*i;
    }
    console.log("Factorial of Number",val);
}

