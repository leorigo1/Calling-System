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

    verifyEmail(email: string): Observable<any> {
        return this.http.get(this.apiUrl + '/user/get-user')
    }

}