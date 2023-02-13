import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { ProjectService } from 'src/app/services/project.service';
import { Location } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { ProjectDto } from 'src/app/Models/Project';
import { environment } from 'src/environments/environment';

@Component({
  selector: 'app-project-new',
  templateUrl: './project-new.component.html',
  styleUrls: ['./project-new.component.sass']
})
export class ProjectNewComponent {
  url = environment.backendUrl + '/project';
  projects: Observable<any[]> | undefined;

  constructor(
    private projectService: ProjectService,
    private router: Router,
    private httpClient: HttpClient,
    private location: Location) { }

  ngOnInit() {

  }

  ok() {
    let project: ProjectDto = {
      id: 'new',
      name: 'from Angular',
      description: 'from Angular description'
    }
    this.httpClient.post<ProjectDto>(this.url, project)
      .subscribe(response => {
        console.log(response);
        this.router.navigate(['/project']);
      });

  }

  cancel() {
    this.location.back();
  }

}
