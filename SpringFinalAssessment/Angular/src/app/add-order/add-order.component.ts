import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { OrderService } from '../order.service';

@Component({
  selector: 'app-add-order',
  templateUrl: './add-order.component.html',
  styleUrls: ['./add-order.component.css']
})
export class AddOrderComponent implements OnInit {

 
  constructor( private service:OrderService,private router:Router) {}
  addOrder(form: NgForm){
      this.service.addOrder(form.value)
      .subscribe(res=>{
          console.log(res);
          form.reset();
            this.router.navigate(['/order-list']);
      },err=>{
          console.log(err);
      });
  }
  ngOnInit(){}
}
