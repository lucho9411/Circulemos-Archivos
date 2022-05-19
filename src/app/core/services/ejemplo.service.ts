import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { environment } from 'src/environments/environment';
import { EjempleoServices, EjemploRespose } from '../interfaces/ejemplo-interface';
import { catchError, map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class EjemploService implements EjempleoServices{

  constructor(
    public httpClient: HttpClient
  ) { }

  obtenerUsuarios(): Observable<EjemploRespose[]> {
    return this.httpClient.get<EjemploRespose[]>(`${environment.apiEjemplo}`).pipe(
        map((response: EjemploRespose[]) =>{
            return response;
        }),
        catchError(e => {
          return throwError(e);
        })
    );
  }

  
}
