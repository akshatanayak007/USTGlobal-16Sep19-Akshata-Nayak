console.log('Window Object',window);
console.log('This Keyword',this);
console.log( this === window);

// window.alert('Welcome to JS Class');
// alert('Welcome to JS Class');


// let a=confirm('Are u Sure u want to delete');
// console.log(a);

// let usr=prompt('What is Your name','Akshata');
// console.log('Hello',usr);

const person={
    fname:'Alia',
    age:26,
    lname:'Kapoor',
    getName:function(){
        return this.fname+" "+this.lname;
    }
}
let fullname=person.getName();
console.log('Full Name',fullname);