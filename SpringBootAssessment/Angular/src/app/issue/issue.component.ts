import { Component, OnInit } from '@angular/core';
import { AdminserviceService } from '../adminservice.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import {DatePipe} from '@angular/common';

@Component({
  selector: 'app-issue',
  templateUrl: './issue.component.html',
  styleUrls: ['./issue.component.css']
})
export class IssueComponent implements OnInit {
  books: any;
  isOnline: boolean= false;
  currentDate = Date.now();
  constructor(private service: AdminserviceService, private router : Router) { 
    this.getAllBooks();
  }

  ngOnInit() {
  }

  getAllBooks(){
    this.service.allIssueBook().subscribe(data => {
      console.log(data);
      this.books = data.issueBook;
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
  
  goToPage(pageName:string){
    this.router.navigate([`${pageName}`]);
  }


  delBook(book){
    console.log(book);
    this.service.retBook(book).subscribe(data => {
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
     console.log('book found');
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
