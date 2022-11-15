import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { BodyRoutingModule } from './body-routing.module';
import { BodyComponent } from './body.component';
import { HomepageComponent } from './homepage/homepage.component';
import {NgxSlickJsModule} from "ngx-slickjs";
import { NewsdetailComponent } from './newsdetail/newsdetail.component';
import {ShareModule} from "../share/share.module";

@NgModule({
  declarations: [BodyComponent, HomepageComponent, NewsdetailComponent],
  exports: [
    BodyComponent
  ],
  imports: [
    CommonModule,
    BodyRoutingModule,
    ShareModule,
    NgxSlickJsModule,
  ]
})
export class BodyModule { }
