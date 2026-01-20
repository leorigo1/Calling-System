import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../services/UserService';

@Component({
  selector: 'app-login',
  imports: [],
  templateUrl: './login.html',
  styleUrl: './login.scss',
})
export class Login {

  email = '';
  password = '';

  constructor (private router: Router, private userService: UserService) {}

  logar(email: string, password: string) {
    console.log("Email: ", email);
    console.log("Senha: ", password);

  const payload = {
    email: this.email,
    password: this.password
  };

  return this.userService.login(payload).subscribe({
    next: (response) => {
      console.log('Login ok', response)
      this.router.navigate(['/iniciar-chamado'])
    },
    error: (err) => {
      console.log('Erro: ', err)
    }
  })
  }

  register() {
    this.router.navigate(["/register"])
  }

  passwordReset() {
    this.router.navigate(['/email-verification'])
  }

  };

