import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
  name: string = 'Akshata Nayak';
  imgUrl = 'https://cdn.pixabay.com/photo/2019/09/24/01/05/flower-4499972_960_720.jpg';
  address: string = 'Banashankari Extension, Hanumanthanagar, Bengaluru';
  colorName: string ='Purple';
  isActive: boolean = false;
  colSpanName : Number = 2;
  constructor() { }

  ngOnInit() {
    setInterval(() => {
      this.colorName = 'red';
      this.isActive = !this.isActive;
    }, 5000);
  }

}
