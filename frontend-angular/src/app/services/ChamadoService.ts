import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from 'rxjs';

@Injectable ({
    providedIn: 'root'
})
export class ChamadoService {

    private apiUrl = 'http://localhost:8080';

    constructor(private http:HttpClient) {}

    criarChamado(chamado: any): Observable<any> {
    return this.http.post(
        this.apiUrl + 'call/create-call',
        chamado
    );
    }

    listar(): Observable<any[]> {
        return this.http.get<any[]>(
        `${this.apiUrl}/call/list-all`
        );
    }
}