import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {AnimalListComponent} from "./animal-list/animal-list.component";


const routes: Routes = [
  {
    path: 'list',
    component: AnimalListComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AnimalRoutingModule { }
