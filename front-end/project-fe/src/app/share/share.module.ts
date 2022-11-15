import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ShareRoutingModule } from './share-routing.module';
import { ShareComponent } from './share.component';
import {FooterComponent} from "./footer/footer.component";
import {HeaderComponent} from "./header/header.component";
import {LogosliderComponent} from "./logoslider/logoslider.component";


@NgModule({
  declarations: [ShareComponent, FooterComponent, HeaderComponent, LogosliderComponent],
  exports: [
    HeaderComponent,
    LogosliderComponent,
    FooterComponent,
    ShareComponent
  ],
  imports: [
    CommonModule,
    ShareRoutingModule
  ]
})
export class ShareModule { }
