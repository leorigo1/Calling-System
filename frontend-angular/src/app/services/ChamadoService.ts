import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";

@Injectable ({
    providedIn: 'root'
})
export class ChamadoService {

    private apiUrl = 'http://localhost:8080/call/create-call';

    constructor(private http:HttpClient) {}

    criarChamado (chamado: any) {
        return this.http.post(this.apiUrl, chamado);
    }

}