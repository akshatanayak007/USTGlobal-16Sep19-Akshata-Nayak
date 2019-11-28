
function sum(n)
{
    var a=0;
    for(var i=0;i<n.length;i++)
    {
        a=a+n[i];
    }
  
    console.log("Sum of all Numbers",a);
}
sum([10,20,30,40]);

(function(n)
{
    var a=0;
    for(var i=0;i<n.length;i++)
    {
        a=a+n[i];
    }
  
    console.log("Sum of all Numbers",a);
    
})([10,20,30,40])

var div1=val=>{
    var a=0;
    for(var i=0;i<n.length;i++)
    {
        a=a+n[i];
    }
  
    console.log("Sum of all Numbers",a);
}
div1([10,20,30,40]);

var sub=function(n)
{
    var a=0;
    for(var i=0;i<n.length;i++)
    {
        a=a+n[i];
    }
  
    console.log("Sum of all Numbers",a);
}
var a=sub([10,20,30,40]);
