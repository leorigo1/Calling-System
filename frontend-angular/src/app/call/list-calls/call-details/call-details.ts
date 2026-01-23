import { Component } from '@angular/core';
import { DatePipe, NgClass } from '@angular/common';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { UserService } from '../../../services/UserService';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-call-details',
  standalone: true,
  imports: [DatePipe, FormsModule, CommonModule],
  templateUrl: './call-details.html',
  styleUrl: './call-details.scss',
})
export class CallDetails {

data = '18/09/2006 13:30';
novaMensagem = '';
responsavel = '';

usuarios$: Observable<any[]>;

constructor (private router: Router, private usuarios: UserService) {
 this.usuarios$ = this.usuarios.listUsers();
}


  sair() {
    this.router.navigate(['/listar-chamados'])
  }

  atualizar() {
    if (!this.novaMensagem.trim()) {
      alert('Digite alguma coisa')
      return;
    }
    if(!this.responsavel.trim()){
      alert('Digite alguma coisa')
      return;
    }

    console.log(this.novaMensagem)
  }

  finalizar() {
    if (!this.novaMensagem.trim()) {
      alert('Digite alguma coisa')
      return;
    }
    if(!this.responsavel.trim()){
      alert('Digite alguma coisa')
      return;
    }
    console.log('chamado finalizado', this.responsavel)
  }
}
