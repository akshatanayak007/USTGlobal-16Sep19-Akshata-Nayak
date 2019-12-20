import { Component, OnInit } from '@angular/core';

import { AdminserviceService } from '../adminservice.service';
import {Router} from '@angular/router';
import { NgForm } from '@angular/forms';
@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.css']
})
export class BooksComponent implements OnInit {
  message;
  books;
  isOnline = false;
  bid;
  bname;
  isAdmin;
  

  constructor(private service: AdminserviceService, private router : Router) { 
  this.getAllBooks();


  }
  goToPage(pageName:string){
    this.router.navigate([`${pageName}`]);
  }

  ngOnInit() {
  }

  retBook(book){
    console.log(book);
    this.service.retBook(book).subscribe(data => {
     console.log('book Return');
     this.getAllBooks();
    }, err => {
      console.log(err);
    }, () => {
      console.log('success')
    })

  }
 

  getAllBooks(){
    this.service.allBooks().subscribe(data => {
      console.log(data);
      this.books = data.product;
    }, err => {
      console.log(err);
    }, () => {
      console.log('success')
    })
  }

  logout(){
    localStorage.removeItem('libBeans');
    this.router.navigateByUrl('/login');
  }
  
 

  delBook(book){
    console.log(book);
    this.service.deleteBook(book).subscribe(data => {
     console.log('book deleted');
     this.getAllBooks();
    }, err => {
      console.log(err);
    }, () => {
      console.log('success')
    })

  }

  searchBook(form : NgForm){
    console.log(form);
    this.service.searchBook(form.value).subscribe(data => {
     console.log('Product found');
     console.log(data);
     this.books = data.bookBeans;
     if (data.message==='Success'){
        this.isOnline=true;
     }else{
      this.getAllBooks();
       this.isOnline=false;
       
     }
    }, err => {
      console.log(err);
    }, () => {
      console.log('success')
    })

  }

 


}
