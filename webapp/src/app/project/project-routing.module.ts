import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProjectListComponent } from './project-list/project-list.component';
import { ProjectComponent } from './project/project.component';

const routes: Routes = [
  // {
  //   path: '',
  //   redirectTo: '/project'
  // },
  {
    path: '',
    component: ProjectListComponent
  },
  {
    path: 'project/:id',
    component: ProjectComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProjectRoutingModule { }
