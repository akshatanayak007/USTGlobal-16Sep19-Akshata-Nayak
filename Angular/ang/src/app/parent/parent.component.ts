import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  Cars = [
    {
      name: 'Bugati',
      imgUrl: 'https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278__340.jpg'
    },
    {
      name: 'Ferrari',
      imgUrl: 'https://cdn.pixabay.com/photo/2014/09/07/22/34/car-race-438467__340.jpg'
    },
    {
      name: 'Mercedes',
      imgUrl: 'https://cdn.pixabay.com/photo/2016/12/03/18/57/amg-1880381__340.jpg'
    },
    {
      name: 'Rolls Royce',
      imgUrl: 'https://cdn.pixabay.com/photo/2016/11/22/23/55/automobile-1851299__340.jpg'
    }
  ]
  selectedCar: any;

  constructor() { }

  ngOnInit() {
  }
  sendCar(car) {
    console.log(car);
    this.selectedCar = car;
  }

}
