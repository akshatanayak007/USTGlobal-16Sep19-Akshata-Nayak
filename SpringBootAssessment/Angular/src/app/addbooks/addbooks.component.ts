import { Component, OnInit } from '@angular/core';
import { AdminserviceService } from '../adminservice.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addbooks',
  templateUrl: './addbooks.component.html',
  styleUrls: ['./addbooks.component.css']
})
export class AddbooksComponent implements OnInit {

  constructor(private service: AdminserviceService, private router:Router) { }

  addbook(form: NgForm){
    this.service.addBook(form.value).subscribe(res=>{
      console.log(res);
      form.reset();
    }, err => {
      console.log(err);
    });
  }
  logout(){
    localStorage.removeItem('libBeans');
    this.router.navigateByUrl('/login');
  }

  ngOnInit() {
  }

}
