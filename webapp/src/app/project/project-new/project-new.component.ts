import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { ProjectService } from 'src/app/services/project.service';
import { Location } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { ProjectDto } from 'src/app/Models';
import { environment } from 'src/environments/environment';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-project-new',
  templateUrl: './project-new.component.html',
  styleUrls: ['./project-new.component.sass']
})
export class ProjectNewComponent {

  newProjectForm = new FormGroup({
    name: new FormControl('', Validators.required),
    description: new FormControl('')
  });

  url = environment.backendUrl + '/project';
  projects: Observable<ProjectDto[]> | undefined;

  constructor(
    private projectService: ProjectService,
    private router: Router,
    private httpClient: HttpClient,
    private location: Location) { }

  ok() {
    const project: ProjectDto = {
      id: 'new',
      name: this.newProjectForm.value['name'] || '',
      description: this.newProjectForm.value['description'] || ''
    }
    this.httpClient.post<ProjectDto>(this.url, project)
      .subscribe(response => {
        console.log(response);
        this.router.navigate(['/project']);
        this.router.navigate(['project',response.id]);
      });

  }

  cancel() {
    this.location.back();
  }

}
