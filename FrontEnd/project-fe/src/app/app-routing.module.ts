import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {AnimalListComponent} from "./animal-list/animal-list.component";


const routes: Routes = [
  {
    path: '',
    redirectTo: 'animal/list',
    pathMatch: 'full',
  },
  {
    path: 'animal',
    children: [
      {path: 'list', component: AnimalListComponent}
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
