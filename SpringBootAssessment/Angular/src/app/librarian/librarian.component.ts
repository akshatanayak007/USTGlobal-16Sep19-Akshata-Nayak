import { Component, OnInit } from '@angular/core';
import { AdminserviceService } from '../adminservice.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-librarian',
  templateUrl: './librarian.component.html',
  styleUrls: ['./librarian.component.css']
})
export class LibrarianComponent implements OnInit {

 
  

 
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
      this.service.allLibs().subscribe(data => {
        console.log(data);
        this.books = data.libBeans;
      }, err => {
        console.log(err);
      }, () => {
        console.log('Success')
      })
    }
  
    delBook(book){
      console.log(book);
      this.service.deleteLib(book).subscribe(data => {
       console.log('Librarian deleted');
       this.getAllBooks();
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
  
    searchStud(form: NgForm){
      console.log(form);
      this.service.searchLibs(form.value).subscribe(data => {
       console.log('Student found');
       console.log(data);
       this.books = data.libBeans;
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
