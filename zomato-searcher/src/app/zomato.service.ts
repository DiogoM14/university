import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ICategoriasResponse, IColecoesResponse } from './models';

const USER_KEY = 'bed9f3011e10e53fc41c20c809e218c3 ';
const BASE_URL = 'https://developers.zomato.com/api/v2.1';

@Injectable({
  providedIn: 'root'
})
export class ZomatoService {
  headers: HttpHeaders;

  constructor(private http: HttpClient) {
    this.headers = new HttpHeaders({
      Accept: 'application/json',
      'user-key': USER_KEY
    });
  }

  getCategories() {
    const url = `${BASE_URL}/categories`;
    return this.http.get<ICategoriasResponse>(url, { headers: this.headers });
  }

  getCollections(latitude: number, longitude: number) {
    const url = `${BASE_URL}/collections?lat=${latitude}&lon=${longitude}`;
    return this.http.get<IColecoesResponse>(url, { headers: this.headers });
  }

  getRestaurantList(cityId: number, categoria: number, colecao: number) {
    const query = `category=${categoria}&collection_id=${colecao}&entity_id=${cityId}&entity_type=city`;
    const url = `${BASE_URL}/search?${query}`;
    return this.http.get(url, { headers: this.headers });
  }
}
