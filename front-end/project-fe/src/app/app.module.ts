import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {APP_BASE_HREF} from '@angular/common';
import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {BodyModule} from './body/body.module';
import {NgxSlickJsModule} from 'ngx-slickjs';
import {HTTP_INTERCEPTORS, HttpClientModule} from '@angular/common/http';
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {ToastrModule} from "ngx-toastr";
import {SecurityModule} from "./security/security.module";
import {JwtInterceptor} from "./helpers/jwt-interceptor";
import {ShareModule} from "./share/share.module";
import { FocusInvalidInputDirective } from './helpers/focus-invalid-input.directive';
import { FocusInvalidInputDirective } from './focus-invalid-input.directive';


@NgModule({
  declarations: [
    AppComponent,
    FocusInvalidInputDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BodyModule,
    SecurityModule,
    ShareModule,
    NgxSlickJsModule.forRoot({
      links: {
        jquery: 'https://code.jquery.com/jquery-3.4.0.min.js',
        slickJs: 'https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js',
        slickCss: 'https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css',
        slickThemeCss: 'https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick-theme.css'
      }
    },),
    BrowserAnimationsModule,
    ToastrModule.forRoot()
  ],
  providers: [
    {provide: APP_BASE_HREF, useValue: '/'},
    {
      provide: HTTP_INTERCEPTORS,
      useClass: JwtInterceptor,
      multi: true
    }],
  exports: [
    FocusInvalidInputDirective
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
