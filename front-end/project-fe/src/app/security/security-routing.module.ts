import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {LoginComponent} from "./login/login.component";
import {ResetPasswordComponent} from "./reset-password/reset-password.component";
import {SecurityComponent} from "./security.component";


const routes: Routes = [
  {
    path: "authen",
    component: SecurityComponent,
    children: [
      {
        path: "login",
        component: LoginComponent
      },
      {
        path: "resetpassword/:token",
        component: ResetPasswordComponent
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class SecurityRoutingModule { }
