// let h1elem=document.getElementById('demo');
// console.log('Element=',h1elem);
// console.log(h1elem.textContent);
// h1elem.textContent='Good Byeeee';
// let buttonelem=document.createElement('button');
// buttonelem.textContent="Click Me";
// console.log('Button Element',buttonelem);

// document.body.appendChild(buttonelem);

// let ulelem=document.createElement('ul');
// let li1elem=document.createElement('li');
// let li2elem=document.createElement('li');
// let li3elem=document.createElement('li');
// let li4elem=document.createElement('li');

// li1elem.textContent='Python';
// li2elem.textContent='Java';
// li3elem.textContent='JS';
// li4elem.textContent='SQL';

// ulelem.appendChild(li1elem);
// ulelem.appendChild(li2elem);
// ulelem.appendChild(li3elem);
// ulelem.appendChild(li4elem);
// document.body.appendChild(ulelem);

// h1elem.style.color="red";
// h1elem.style.fontSize="10px";

function showMessage(){
    alert("HI Welcome to my Channel");
}
function changeColor(){
   let elem= document.getElementById('mover')
   elem.style.color="red";
}
function removeColor(){
    let elem= document.getElementById('mover')
    elem.style.color="black";
 }

function printHello(){
    console.log('Hello');
    let userName=document.getElementById('username').value;
    document.getElementById('showusername').textContent=userName;
}

let name='Rakesh';
let age=21;
let phoneno=7499881144;
console.log('Name is '+name+'Age is '+age+'Phone '+phoneno);
console.log(`Name is ${name} Age is${age}`);
console.log(`2+2=${2+2}`);