import {AfterViewInit, Component, OnChanges, SimpleChanges, ViewChild} from '@angular/core';
import {LoginComponent} from "./security/login/login.component";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'project-fe';
}
