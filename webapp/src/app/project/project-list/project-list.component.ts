import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { ProjectService } from 'src/app/services/project.service';

@Component({
  selector: 'app-project-list',
  templateUrl: './project-list.component.html',
  styleUrls: ['./project-list.component.sass']
})
export class ProjectListComponent {
  projects: Observable<any[]> | undefined;

  constructor(private projectService: ProjectService) {}

  ngOnInit() {
    this.projects = this.projectService.getAll();

  }

}
