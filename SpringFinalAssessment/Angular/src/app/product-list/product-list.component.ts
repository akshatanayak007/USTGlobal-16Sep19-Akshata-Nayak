import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  product;
  constructor(private service: ProductService) {
    console.log('constructor got excecuted');
    this.getproducts();
  }
  getproducts() {
    console.log('hi from product component');
    this.service.getProducts().subscribe(res => {
      console.log(res);
      this.product = res;
    }, err => {
      console.log(err);
    });
    console.log('subscription ended');
  }
  addProduct(form: NgForm) {
    this.service.addProduct(form.value)
      .subscribe(res => {
        console.log(res);
        form.reset();
      }, err => {
        console.log(err);
      });
  }
  deleteProduct(product) {
    console.log(product);
    this.service.deleteProduct(product).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('product deleted successfully');
    })
  }

  updateProduct(product) {
    console.log(product);
    this.service.updateProduct(product).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('product deleted successfully');
    })
  }

  ngOnInit() { }
}  
