import { Component, OnInit } from '@angular/core';
import { ChamadoService } from '../services/ChamadoService';
import { UserService } from '../services/UserService';
import { Usuario } from '../models/Usuario';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-create-call',
  imports: [ FormsModule, CommonModule ],
  standalone: true,
  templateUrl: './create-call.html',
  styleUrl: './create-call.scss',
})
export class CreateCall implements OnInit{
  
  usuario = '';
  titulo = '';
  descricao = '';
  callingPriority = 1;
  categoria = '';
  formadeContato = '';
PacoteOffice = '';

   usuarios: Usuario[] = [];
   usuarioSelecionadoId!: number;

  constructor(private chamadoService: ChamadoService, private userService: UserService) {}

  salvarChamado() {
    const body = {
      usuarioId: this.usuarioSelecionadoId,
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

  listarUsuarios() {
      this.userService.listUsers().subscribe({
      next: (dados) => {
        console.log('Usuários recebidos:', dados);
        this.usuarios = dados;
      },
      error: (err) => console.error('Erro ao buscar usuários', err)
    });
  }

  ngOnInit(): void {
    this.listarUsuarios();
  }

}
