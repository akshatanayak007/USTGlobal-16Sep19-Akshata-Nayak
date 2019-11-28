import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent implements OnInit {
  Inputdata='';
  printAlertmsg() {
    alert('You Are Not Allowed Here');
  }
  dataInput(event1) {
    console.log(event1.target.value);
    this.Inputdata = event1.target.value;
  }

  constructor() {
   }

  ngOnInit() {

}
}