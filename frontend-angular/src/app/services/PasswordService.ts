import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { Injectable } from "@angular/core";

@Injectable ({
    providedIn: 'root'
})
export class PasswordService {

    private apiUrl = 'http://localhost:8080'

    constructor(private http:HttpClient) {}

    verificarEmail(email: string): Observable<boolean> {
        return this.http.get<boolean>(`${this.apiUrl}/user/search-by-email?email=${email}`)
    }

}