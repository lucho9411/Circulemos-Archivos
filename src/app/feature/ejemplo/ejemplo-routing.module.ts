import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EjemploComponent } from './ejemplo/ejemplo.component';

const routes: Routes = [
  {
    path: '',
    children: [{
      path: '',
      component: EjemploComponent
    }]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class EjemploRoutingModule { }
