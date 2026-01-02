import { Component } from '@angular/core';

@Component({
  selector: 'app-login',
  imports: [],
  templateUrl: './login.html',
  styleUrl: './login.scss',
})
export class Login {

  titulo = 'Fazer Login';

  logar(email: string, password: string) {
    console.log("Email: ", email);
    console.log("Senha: ", password);
  };

}
