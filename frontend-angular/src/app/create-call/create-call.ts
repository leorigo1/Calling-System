import { Component } from '@angular/core';
import { ChamadoService } from '../services/ChamadoService';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-create-call',
  imports: [ FormsModule ],
  standalone: true,
  templateUrl: './create-call.html',
  styleUrl: './create-call.scss',
})
export class CreateCall {

  usuario = '';
  titulo = '';
  descricao = '';
  callingPriority = 1;
  categoria = '';
  formadeContato = '';

  constructor(private chamadoService: ChamadoService) {}

  salvarChamado() {
    const body = {
      usuario: this.usuario,
      titulo: this.titulo,
      descricao: this.descricao,
      callingPriority: this.callingPriority,
      categoria: this.categoria,
      formadeContato: this.formadeContato
    };

    this.chamadoService.criarChamado(body).subscribe({
      next: () => alert('Chamado criado com sucesso'),
      error: err => console.error(err)
    });
  }
}
