import { Component, OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy {

  // tslint:disable-next-line: member-ordering
  Users;
  // tslint:disable-next-line: member-ordering
  selectedUser;
  // tslint:disable-next-line: new-parens
  today = new Date;

  constructor(private service: UserService) {
    console.log('Constructor is Executed'); 
    this.getData();
  }

  ngOnInit() {
    console.log('ngOnInit is executed');
  }
  ngDoCheck() {
    console.log('NgDocheck is executed');
  }
  ngAfterViewInit() {
    console.log('ngAfterVieInit is executed');
  }
  ngAfterViewChecked() {
    console.log('ngAfterViewCheck function is executed');
  }

  ngOnDestroy() {
    console.log('ngOnDestroy function is executed');
  }
  loginData(form: NgForm) {
    console.log(form.value);
    this.service.postUser(form.value).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('data posted successfully');
    });

  }
  getData() {
    this.service.getUsers().subscribe(data => {
      console.log(data);
      this.Users = data;
    }, err => {
      console.log(err);
    }, () => {
      console.log('data got successfully');
    });
  }

  deleteData(user) {
    console.log(user);
    this.service.deleteUser(user.id).subscribe(data => {
      console.log(data);
      this.getData();
    }, err => {
      console.log(err);
    }, () => {
      console.log('Data deleted Sucessfully');
    })
  }

  selectUser(user) {
    console.log(user);
    this.selectedUser = user;
  }

  updateData(form) {
    console.log(form.value);
    this.service.updateUser(form.value.id, form.value).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('data updated sucessfully');
    });
  }

}
