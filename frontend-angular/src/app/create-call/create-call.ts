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

  titulo = '';
  descricao = '';
  callingPriority = 1;
  categoria = '';

  constructor(private chamadoService: ChamadoService) {}

  salvarChamado() {
    const body = {
      titulo: this.titulo,
      descricao: this.descricao,
      callingPriority: this.callingPriority,
      categoria: this.categoria
    };

    this.chamadoService.criarChamado(body).subscribe({
      next: () => alert('Chamado criado com sucesso'),
      error: err => console.error(err)
    });
  }
}
