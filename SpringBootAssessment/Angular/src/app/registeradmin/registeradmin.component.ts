import { Component, OnInit } from '@angular/core';
import { AdminserviceService } from '../adminservice.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-registeradmin',
  templateUrl: './registeradmin.component.html',
  styleUrls: ['./registeradmin.component.css']
})
export class RegisteradminComponent implements OnInit {

  isLogged=false;
  constructor(private service : AdminserviceService) { }

  regAdmin(form:NgForm){
    this.service.addAdmin(form.value).subscribe(res => {
      if(res.message === 'Success'){
        this.isLogged=true;
        form.reset();
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
