import { Component, OnInit } from '@angular/core';
import { AdminserviceService } from '../adminservice.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  isAdmin;
  books;

  constructor(private service : AdminserviceService) { }

  ngOnInit() {
  }

 

}
