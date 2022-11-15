import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';

import {BodyComponent} from './body.component';
import {HomepageComponent} from "./homepage/homepage.component";
import {NewsdetailComponent} from "./newsdetail/newsdetail.component";

const routes: Routes = [
  {
    path: '', component: BodyComponent, children: [
      {path: '', component: HomepageComponent}
    ]
  },
  {
    path: 'home',
    component: HomepageComponent
  },
  {
    path:'news/:id',component:NewsdetailComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class BodyRoutingModule {
}
