import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Category } from './category';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CatoryService {

  constructor(private http: HttpClient) { }


  url: String = 'http://localhost:9000';


  getCategories(): Observable<Category[]> {
    return this.http.get<Category[]>(`${this.url}/tasks`);
  }

  getCategory(id: number): Observable<Category> {
    return this.http.get<Category>(`${this.url}/tasks/${id}`);
  }
}
