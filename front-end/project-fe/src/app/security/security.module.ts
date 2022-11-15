import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SecurityRoutingModule } from './security-routing.module';
import { LoginComponent } from './login/login.component';
import {ReactiveFormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import {ToastrModule} from "ngx-toastr";
import { ResetPasswordComponent } from './reset-password/reset-password.component';
import {SecurityComponent} from "./security.component";
import {FocusInvalidInputDirective} from "../helpers/focus-invalid-input.directive";


@NgModule({
  declarations: [SecurityComponent, LoginComponent, ResetPasswordComponent],
  imports: [
    CommonModule,
    SecurityRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    ToastrModule.forRoot(),
  ]
})
export class SecurityModule { }
