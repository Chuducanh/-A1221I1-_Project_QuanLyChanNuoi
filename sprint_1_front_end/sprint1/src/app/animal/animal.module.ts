import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AnimalRoutingModule } from './animal-routing.module';
import { AnimalListComponent } from './animal-list/animal-list.component';
import {ReactiveFormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {ToastrModule} from "ngx-toastr";


@NgModule({
  declarations: [AnimalListComponent],
  imports: [
    CommonModule,
    AnimalRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    ToastrModule.forRoot(),
  ]
})
export class AnimalModule { }
