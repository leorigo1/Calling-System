import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-password-reset',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './password-reset.html',
  styleUrl: './password-reset.scss',
})
export class PasswordReset {

  password = '';
  passwordconfirm = '';

constructor (private router: Router) {}

  alterar(password: String, passwordconfirm: String) {
    if (password != passwordconfirm) {
      alert('As senhas não conferem!')
      return;
    }
    if (password.length < 8 || passwordconfirm.length < 8) {
      alert('Sua senha deve ter mais que 8 caracteres!')
      return
    }

    console.log(password, passwordconfirm)
    return this.router.navigate(['/iniciar-chamado'])
  }


}
