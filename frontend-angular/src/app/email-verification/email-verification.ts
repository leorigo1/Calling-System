import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../services/UserService';

@Component({
  selector: 'app-password-reset',
  standalone: true,
  imports: [],
  templateUrl: './email-verification.html',
  styleUrl: './email-verification.scss',
})
export class EmailVerification {

  email = '';
  password = '';

  constructor (private router: Router, private userService: UserService) {}

  validar(email: string) {
    console.log("Email: ", email);
    
  }

}
