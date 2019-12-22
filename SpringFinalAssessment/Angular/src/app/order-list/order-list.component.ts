import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { OrderService } from '../order.service';

@Component({
  selector: 'app-order-list',
  templateUrl: './order-list.component.html',
  styleUrls: ['./order-list.component.css']
})
export class OrderListComponent implements OnInit {

  order;
  constructor( private service:OrderService) {
  console.log('constructor got excecuted');
  this.getOrders();
}
getOrders(){
console.log('hi from product component');
this.service.getOrders().subscribe(res => {
   console.log(res);
        this.order= res;
    },err=>{
        console.log(err);
    });
    console.log ('subscription ended');
}
  addOrder(form: NgForm){
      this.service.addOrder(form.value)
      .subscribe(res=>{
          console.log(res);
          form.reset();
      },err=>{
          console.log(err);
      });
  }
  deleteOrder(order){
    console.log(order);
    this.service.deleteOrder(order.order_id).subscribe(data =>{
    console.log(data);
    },err=>{
        console.log(err);
    },()=>{
        console.log('order deleted successfully');
    })
    }
  ngOnInit(){}
}  
