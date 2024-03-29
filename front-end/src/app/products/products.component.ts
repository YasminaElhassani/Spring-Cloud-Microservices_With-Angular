import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrl: './products.component.css',
})
export class ProductsComponent implements OnInit {
  products: any;
  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    this.http
      .get(
        'http://localhost:9999/inventory-service/products?projection=fullProduct'
      )
      .subscribe({
        next: (data: Object) => {
          this.products = data;
        },
        error: (err) => {},
      });
  }
}
