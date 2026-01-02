import { Component } from '@angular/core';

@Component({
  selector: 'app-login',
  imports: [],
  templateUrl: './login.html',
  styleUrl: './login.scss',
})
export class Login {

  titulo = 'Fazer Login';
  email = '';
  senha = '';
  Entrar = 'Entrar';

  salvar(campo: string) {
    window.alert('receba papai');
    return console.log(campo);
  };

}
