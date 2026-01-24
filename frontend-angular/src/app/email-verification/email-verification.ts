import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../services/UserService';
import { PasswordService } from '../services/PasswordService';
import { LoaderService } from '../services/LoaderService';

@Component({
  selector: 'app-password-reset',
  standalone: true,
  imports: [],
  templateUrl: './email-verification.html',
  styleUrl: './email-verification.scss',
})
export class EmailVerification {

  email = '';

  constructor (private router: Router, private userService: UserService, private passwordService: PasswordService, private loader: LoaderService) {}

  validar(email: string) {
    this.userService.verificarEmail(email).subscribe(existe => {
  if (existe) {
    this.loader.show();

    setTimeout(() => {
    this.router.navigate(['/password-reset']).then(() => {
        this.loader.hide();
      });
    }, 1000);

  } else {
    alert("Email não encontrado!")
  }
});
  }

}
