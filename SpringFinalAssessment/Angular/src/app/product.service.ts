import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http: HttpClient) { }


  getProducts(): Observable<any> {
    return this.http.get('http://localhost:8087/product/get-all');
  }
  deleteProduct(product): Observable<any> {
    return this.http.delete(`http://localhost:8087/product/deletebyid/${product.product_id}`);
  }
  updateProduct(user): Observable<any> {
    return this.http.put(`http://localhost:8087/product/update`, user);
  }
  addProduct(user): Observable<any> {
    return this.http.post('http://localhost:8087/product/add', user);
  }
}

