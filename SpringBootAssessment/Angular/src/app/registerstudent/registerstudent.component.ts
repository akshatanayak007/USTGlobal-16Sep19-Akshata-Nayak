import { Component, OnInit } from '@angular/core';
import { AdminserviceService } from '../adminservice.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registerstudent',
  templateUrl: './registerstudent.component.html',
  styleUrls: ['./registerstudent.component.css']
})
export class RegisterstudentComponent implements OnInit {

  constructor(private service: AdminserviceService, private router: Router) { }

  regStud(form : NgForm){
    this.service.addStud(form.value).subscribe(res => {
      console.log(res);
      form.reset();
      if(res.message === 'Success'){
        this.router.navigate(['/get-stud']);
      }else{
        console.log('Error');
      }
    }, err => {
      console.log(err);
    });
  }
  ngOnInit() {
  }

}
