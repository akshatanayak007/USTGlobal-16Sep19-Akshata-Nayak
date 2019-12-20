import { Component, OnInit } from '@angular/core';
import { AdminserviceService } from '../adminservice.service';
import {Librarian} from '../librarian';

@Component({
  selector: 'app-studentdata',
  templateUrl: './studentdata.component.html',
  styleUrls: ['./studentdata.component.css']
})
export class StudentdataComponent implements OnInit { 
  student : Librarian[];
  search : String;
 
selectedUser;
  librarian;
  constructor( private service: AdminserviceService) {
    console.log('constructor got excecuted');
    this.getData();
  }
  getData(){
  console.log('hi from student component');
  this.service.getData().subscribe(res => {
          console.log(res);
          this.librarian = res;
      },err=>{
          console.log(err);
      });
      console.log ('subscription ended');
  }
  // deleteData(student){
  //   console.log(student);
  //   this.service.deleteUser(student.student_id).subscribe(data =>{
  //   console.log(data);
  //   this.getData();
  //   },err=>{
  //       console.log(err);
  //   },()=>{
  //       console.log('data deleted successfully');
  //   })
  //   }
    selectuser(user){
   console.log(user);
    this.selectedUser=user;

    }
    updateData(form){
        console.log(form.value);
        this.service.updateUser(form.value.student_id,form.value).subscribe(data=>{
            console.log(data);
        },err=>{
            console.log(err);
        },()=>{
            console.log('data updated successfully');
        })
    }

  ngOnInit(){}
}