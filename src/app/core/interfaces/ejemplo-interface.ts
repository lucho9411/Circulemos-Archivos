import { Observable } from "rxjs";

export interface EjemploRespose {
    id: number;
    fullName: string;
    documento: string;
    direccion: string;
    telefonoFijo: string;
    telefonoCelular: string;
    email: string;
}

export interface EjempleoServices {
    obtenerUsuarios(): Observable<EjemploRespose[]>;
}