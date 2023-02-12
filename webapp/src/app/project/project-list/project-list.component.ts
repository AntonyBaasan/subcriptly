import { Component } from '@angular/core';

@Component({
  selector: 'app-project-list',
  templateUrl: './project-list.component.html',
  styleUrls: ['./project-list.component.sass']
})
export class ProjectListComponent {
  projects: any[] = [
    { 'id': '1', 'name': 'test1' },
    { 'id': '2', 'name': 'test2' }
  ]
}
