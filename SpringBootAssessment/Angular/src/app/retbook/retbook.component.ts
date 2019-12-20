import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AdminserviceService } from '../adminservice.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-retbook',
  templateUrl: './retbook.component.html',
  styleUrls: ['./retbook.component.css']
})
export class RetbookComponent implements OnInit {

  books;
  constructor(private service : AdminserviceService, private router: Router) { }

  ngOnInit() {
  }
  getAllBooks(){
    this.service.allBooks().subscribe(data => {
      console.log(data);
      this.books = data.bookBeans;
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

  retBook(form: NgForm){
    console.log(form);
    this.service.retBook(form.value).subscribe(data => {
     console.log('book Return');
     this.getAllBooks();
    }, err => {
      console.log(err);
    }, () => {
      console.log('success')
    })

  }

}
