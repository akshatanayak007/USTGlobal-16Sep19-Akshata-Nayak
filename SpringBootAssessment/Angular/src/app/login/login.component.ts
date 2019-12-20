import { Component, OnInit } from '@angular/core';

import { AdminserviceService } from '../adminservice.service';
import { NgForm } from '@angular/forms';
import {Router} from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  logins = false;
  role;
 

  constructor(private service: AdminserviceService, private router : Router) { }

  login(form: NgForm) {
   
    console.log(form.value);
    this.service.loginadmin(form.value).subscribe(res => {
      console.log(res);
      form.reset();
      if (res.message === 'Success') {
        this.router.navigate(['/get-book']);
      }
    }, err => {
      console.log(err);
    });
  }



  ngOnInit() {
  }

}
