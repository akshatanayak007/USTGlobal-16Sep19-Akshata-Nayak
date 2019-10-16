import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { CustomValidation } from './custom.validation';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit {
  get moviename() {
    return this.form.get('moviename');

  }
  get imgUrl() {
    return this.form.get('imgUrl');
  }

  form = new FormGroup({
    moviename : new FormControl('', [Validators.required, CustomValidation.unique]),
    imgUrl : new FormControl('', [Validators.required])
  });

  constructor() { }

  ngOnInit() {
  }
  loginData(form) {
    console.log(form);
  }

}
