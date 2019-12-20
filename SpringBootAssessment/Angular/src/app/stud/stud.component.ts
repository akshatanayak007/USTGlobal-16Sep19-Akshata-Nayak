import { Component, OnInit } from '@angular/core';
import { AdminserviceService } from '../adminservice.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-stud',
  templateUrl: './stud.component.html',
  styleUrls: ['./stud.component.css']
})
export class StudComponent implements OnInit {
  books: any;
  isOnline = false;

  constructor(private service: AdminserviceService, private router : Router) { 
    this.getAllBooks();
  
  
    }
    goToPage(pageName: string){
      this.router.navigate([`${pageName}`]);
    }
  
    ngOnInit() {
    }
  
   
  
    getAllBooks(){
      this.service.getData().subscribe(data => {
        console.log(data);
        this.books = data.studentBeans;
      }, err => {
        console.log(err);
      }, () => {
        console.log('Success')
      })
    }
  
    delBook(book){
      console.log(book);
      this.service.deleteStud(book.value).subscribe(data => {
       console.log('Student deleted');
       this.getAllBooks();
      }, err => {
        console.log(err);
      }, () => {
        console.log('success')
      })
  
    }
  
    searchStud(form: NgForm){
      console.log(form);
      this.service.searchStud(form.value).subscribe(data => {
       console.log('Student found');
       console.log(data);
       this.books = data.studentBeans;
       if (data.message === 'Success'){
          this.isOnline = true;
       } else{
        this.getAllBooks();
         this.isOnline = false;
         
         
       }
      }, err => {
        console.log(err);
      }, () => {
        console.log('success')
      })
  
  }

}
