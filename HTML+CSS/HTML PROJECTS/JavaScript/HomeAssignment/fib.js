
function fib(n)
{
    var var1=0;
    var var2=1;
    var var3;
    for(var i=3;i<=n;i++)
    {
        var3=var1+var2;
        var1=var2;
        var2=var3;
        
    }
    console.log("Fib Of Number",var3);
}
fib(5);

(function(n)
{
    var var1=0;
    var var2=1;
    var var3;
    for(var i=3;i<=n;i++)
    {
        var3=var1+var2;
        var1=var2;
        var2=var3;
    }
    console.log("Fib Of Number",var3);
})(5)

var div1=val=>{
    var var1=0;
    var var2=1;
    var var3;
    for(var i=3;i<=val;i++)
    {
        var3=var1+var2;
        var1=var2;
        var2=var3;
    }
    console.log("Fib Of Number",var3);
}
div1(5);

var sub=function(n)
{
        var var1=0;
        var var2=1;
        var var3;
        for(var i=3;i<=n;i++)
        {
            var3=var1+var2;
            var1=var2;
            var2=var3;
        }
        console.log("Fib Of Number",var3);
}
var a=sub(5);

