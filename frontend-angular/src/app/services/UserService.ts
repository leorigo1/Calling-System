import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from 'rxjs';

@Injectable ({
    providedIn: 'root'
})
export class UserService {

    private apiUrl = 'http://localhost:8080';

    constructor(private http:HttpClient) {}

    listUsers(): Observable<any> {
   return this.http.get<any[]>(
        `${this.apiUrl}/user/list-all`
        );
    }

    registerUser(data: { name: string; email: string; password: string }): Observable<any> {
        return this.http.post(this.apiUrl + '/auth/register', data);
    }

    login(data: {email: string, password: string}): Observable<any> {
        return this.http.post(this.apiUrl + '/auth/login', data)
    }

    losePassword(email: string): Observable<any> {
        return this.http.post(this.apiUrl + '/auth/esqueci-senha', email)
    }

    changePassword(password: string): Observable<any> {
        return this.http.post(this.apiUrl + '/auth/redefinir-senha', password)
    }

    verificarEmail(email: string): Observable<boolean> {
        return this.http.get<boolean>(`${this.apiUrl}/user/email-existe?email=${email}`)
    }

}