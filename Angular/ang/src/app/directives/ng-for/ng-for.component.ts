import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {
  Products=[{
    img :'https://cdn.pixabay.com/photo/2019/09/28/12/41/porsche-4510684__340.jpg',
    name:"Porshe",
    price :237777
 },
 {
  img : 'https://cdn.pixabay.com/photo/2015/05/28/23/12/auto-788747_960_720.jpg',
  name:"Porshe2",
  price:237
 }
];

  constructor() { }

  ngOnInit() {
  }

}
