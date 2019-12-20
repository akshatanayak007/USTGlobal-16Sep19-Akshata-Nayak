import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AdminserviceService } from '../adminservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-modifylib',
  templateUrl: './modifylib.component.html',
  styleUrls: ['./modifylib.component.css']
})
export class ModifylibComponent implements OnInit {
  ngOnInit() {
   
  }

  constructor(private service : AdminserviceService, private router: Router) { }

  modifybook(form: NgForm){
    this.service.editLib(form.value).subscribe(res => {
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

}
