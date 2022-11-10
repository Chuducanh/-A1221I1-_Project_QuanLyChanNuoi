import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';


const routes: Routes = [
  {
    path: 'employee',
    loadChildren: () => import('./employee/employee.module').then(module => module.EmployeeModule)
  },
  {
    path: 'animal',
    loadChildren: () => import('./animal/animal.module').then(module => module.AnimalModule)
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
