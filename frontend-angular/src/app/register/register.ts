import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { UserService } from '../services/UserService';

@Component({
  selector: 'app-register',
  standalone: true,
  imports: [ FormsModule ],
  templateUrl: './register.html',
  styleUrl: './register.scss',
})
export class Register {

  titulo = 'Registre-se';
  name = '';
  email = '';
  password = '';
  passwordconfirm = '';

  constructor(private router: Router, private userService: UserService) {}

  verificar() {
    if (this.password !== this.passwordconfirm) {
      alert('Senhas diferentes');
      return;
    }

    if(this.password.length < 8 ) {
      alert('Mínimo de 8 caracteres');
      return;
    }
  
    const payload = {
    name: this.name,
    email: this.email,
    password: this.password
  };

  this.userService.registerUser(payload).subscribe({
      next: (response) => {
        console.log('Cadastro realizado:', response);
        alert('Cadastro realizado com sucesso!');
        this.router.navigate(['/login']);
      },
      error: (err) => {
        console.error('Erro no cadastro:', err);
        alert('Erro ao cadastrar usuário');
      }
    });
}

  login() {
    this.router.navigate(['/login'])
  }
}