import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { ProjectDto } from '../Models/Project';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root',
})
export class ProjectService {

  url = environment.backendUrl + '/project';

  // MOCK: ProjectDto[] = [
  //   { id: 'mock1', name: 'mock data', description: 'something' },
  //   { id: 'mock2', name: 'mock two', description: 'desc' }
  // ];

  constructor(private httpClient: HttpClient) { }

  getAll(): Observable<any[]> {
    return this.httpClient.get<ProjectDto[]>(this.url);
    // return of<any>(this.MOCK);
  }

  getById(id: string): Observable<ProjectDto> {
    return this.httpClient.get<ProjectDto>(this.url + '/' + id);
    // return of<any>(this.MOCK.find(m => m.id === id));
  }

}
