import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';
import { ProjectDto } from 'src/app/Models/Project';
import { ProjectService } from 'src/app/services/project.service';

@Component({
  selector: 'app-project',
  templateUrl: './project.component.html',
  styleUrls: ['./project.component.sass']
})
export class ProjectComponent implements OnInit {

  projectId = '';
  project: Observable<ProjectDto> | undefined;

  constructor(private route: ActivatedRoute, private projectService: ProjectService) {
  }

  ngOnInit() {
    this.route.params
      .subscribe(params => {
        this.projectId = params['id'];
        this.project = this.projectService.getById(this.projectId);
      });
  }
}
