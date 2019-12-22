import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class OrderService {

  constructor(private http: HttpClient) { }


  getOrders(): Observable<any> {
    return this.http.get('http://localhost:8087/order/get-all');
  }
  deleteOrder(order_id: number): Observable<any> {
    return this.http.delete(`http://localhost:8087/order/deletebyid/${order_id}`);
  }
  updateOrder(order_id: number, user): Observable<any> {
    return this.http.put(`http://localhost:8087/order/modify/${user.order_id}`, user);
  }
  addOrder(user): Observable<any> {
    return this.http.post('http://localhost:8087/order/add', user);
  }
   deleteProduct(product): Observable<any> {
    return this.http.delete(`http://localhost:8087/product/deletebyid/${product.product_id}`);
  }
}
