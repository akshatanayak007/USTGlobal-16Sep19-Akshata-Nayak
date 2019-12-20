import { Component, OnInit } from '@angular/core';
import { AdminserviceService } from '../adminservice.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-issuebook',
  templateUrl: './issuebook.component.html',
  styleUrls: ['./issuebook.component.css']
})
export class IssuebookComponent implements OnInit {
books;
  constructor(private service:AdminserviceService, private router:Router) { }

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

  issueBook(form: NgForm){
    console.log('fprm',form.value)
    this.service.issueBook(form.value).subscribe(data => {
      console.log('request',data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('success')
    });

  }

}
