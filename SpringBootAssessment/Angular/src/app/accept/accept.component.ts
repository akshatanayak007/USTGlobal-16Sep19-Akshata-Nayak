import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AdminserviceService } from '../adminservice.service';

@Component({
  selector: 'app-accept',
  templateUrl: './accept.component.html',
  styleUrls: ['./accept.component.css']
})
export class AcceptComponent implements OnInit {

  constructor(private service: AdminserviceService) { }

  ngOnInit() {
  }

  acceptBook(form: NgForm){
    console.log('fprm',form.value)
    this.service.acceptBook(form.value).subscribe(data => {
      console.log('request',data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('success')
    });

  }

}
