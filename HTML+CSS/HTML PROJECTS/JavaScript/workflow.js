function first()
{
    setTimeout(function(){
        console.log("First Function Executed");
    },0)
    console.log('Executed')
}
function second()
{
    console.log("Second function Executed");

}
first();
second();
console.log("*************************");

console.log("************Call Back Function*************");
function third(callbacker)
{
    setTimeout(function(){
        console.log("First Function Executed");
        callbacker();
    },0)
    console.log('Executed')
}
function fourth()
{
    console.log("Second function Executed");

}
third(fourth);
