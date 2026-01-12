import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  imports: [],
  templateUrl: './login.html',
  styleUrl: './login.scss',
})
export class Login {

  titulo = 'Fazer Login';

  constructor (private router: Router) {}

  logar(email: string, password: string) {
    console.log("Email: ", email);
    console.log("Senha: ", password);
  };

 register() {
  this.router.navigate(["/register"])
 }

 return() {
  this.router.navigate(["/"])
 }

}
