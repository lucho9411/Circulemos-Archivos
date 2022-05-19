import { Component, Inject, OnInit } from '@angular/core';
import { EjempleoServices, EjemploRespose } from 'src/app/core/interfaces/ejemplo-interface';

@Component({
  selector: 'app-ejemplo',
  templateUrl: './ejemplo.component.html',
  styleUrls: ['./ejemplo.component.css']
})
export class EjemploComponent implements OnInit {

  constructor(
    @Inject('EjempleoServices') private readonly ejemploServices: EjempleoServices
  ) { }

  ngOnInit(): void {
    this.ejemploServices.obtenerUsuarios().subscribe((response: EjemploRespose[]) => {
      console.log(response);
    },
    error => {
      console.error(error);
    });
  }

}
