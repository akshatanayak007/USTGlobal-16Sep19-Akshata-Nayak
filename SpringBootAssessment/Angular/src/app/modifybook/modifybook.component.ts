import { Component, OnInit } from '@angular/core';
import { AdminserviceService } from '../adminservice.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-modifybook',
  templateUrl: './modifybook.component.html',
  styleUrls: ['./modifybook.component.css']
})
export class ModifybookComponent implements OnInit {

  constructor(private service : AdminserviceService) { }

  modifybook(form: NgForm){
    this.service.editBook(form.value).subscribe(res => {
      console.log(res);
      form.reset();
    }, err => {
      console.log(err);
    });

  }


  ngOnInit() {
  }

}
