import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProjectRoutingModule } from './project-routing.module';
import { ProjectListComponent } from './project-list/project-list.component';
import { ProjectNewComponent } from './project-new/project-new.component';
import { ProjectComponent } from './project/project.component';
import { ReactiveFormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    ProjectListComponent,
    ProjectComponent,
    ProjectNewComponent
  ],
  imports: [
    ReactiveFormsModule,
    CommonModule,
    ProjectRoutingModule
  ]
})
export class ProjectModule { }
