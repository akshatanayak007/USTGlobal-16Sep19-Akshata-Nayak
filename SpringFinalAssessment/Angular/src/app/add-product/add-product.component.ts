import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  constructor( private service:ProductService,private router:Router) {}
  addProduct(form: NgForm){
      this.service.addProduct(form.value)
      .subscribe(res=>{
          console.log(res);
          form.reset();
            this.router.navigate(['/product-list']);
      },err=>{
          console.log(err);
      });
  }
  ngOnInit(){}
}
