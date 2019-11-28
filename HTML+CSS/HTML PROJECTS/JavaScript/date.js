var todayDate=new Date();
console.log('Todays Date',todayDate);

console.log('Day='+todayDate.getDay());
console.log('Year='+todayDate.getFullYear());
console.log('Month='+todayDate.getMonth());
console.log('Hours='+todayDate.getHours());
console.log('Minutes='+todayDate.getMinutes());
console.log('Seconds='+todayDate.getSeconds());

var constMilli=new Date(0);
console.log('Date ',constMilli);
var constString=new Date('Nov 1');
console.log('Date String constructor',constString);
var constYear=new Date(2017,10);
console.log('Date Year',constYear);