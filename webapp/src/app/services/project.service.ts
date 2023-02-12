import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { of } from 'rxjs/internal/observable/of';

@Injectable({
  providedIn: 'root',
})
export class ProjectService {

  MOCK: any[] = [
    { id: 'mock1', name: 'mock data', description: 'something' },
    { id: 'mock2', name: 'mock two', description: 'desc' }
  ];

  constructor() { }

  getAll(): Observable<any[]> {
    return of<any>(this.MOCK);
  }

  getById(id: string): Observable<any> {
    return of<any>(this.MOCK.find(m => m.id === id));
  }

}
