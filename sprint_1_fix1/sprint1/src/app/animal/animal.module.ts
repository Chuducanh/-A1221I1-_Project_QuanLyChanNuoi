import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AnimalRoutingModule } from './animal-routing.module';
import {ReactiveFormsModule} from "@angular/forms";
import {AnimalListComponent} from "./animal-list/animal-list.component";
import {ToastrModule} from "ngx-toastr";
import {HttpClientModule} from "@angular/common/http";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {BrowserModule} from "@angular/platform-browser";


@NgModule({
  declarations: [AnimalListComponent],
  imports: [
    BrowserModule,
    CommonModule,
    AnimalRoutingModule,
    ReactiveFormsModule,
    ToastrModule.forRoot(),
    HttpClientModule,
    BrowserAnimationsModule,
  ]
})
export class AnimalModule { }
