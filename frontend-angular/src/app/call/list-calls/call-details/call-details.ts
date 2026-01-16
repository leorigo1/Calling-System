import { Component } from '@angular/core';
import { DatePipe, NgClass } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-call-details',
  standalone: true,
  imports: [DatePipe, FormsModule],
  templateUrl: './call-details.html',
  styleUrl: './call-details.scss',
})
export class CallDetails {

data = '18/09/2006 13:30';
novaMensagem = '';
responsavel = '';

constructor (private router: Router) {}

  sair() {
    this.router.navigate(['/listar-chamados'])
  }

  atualizar() {
    console.log(this.novaMensagem)
  }

  finalizar() {
    console.log('chamado finalizado', this.responsavel)
  }

}
