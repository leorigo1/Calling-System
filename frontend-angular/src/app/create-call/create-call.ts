import { Component, OnInit } from '@angular/core';
import { ChamadoService } from '../services/ChamadoService';
import { UserService } from '../services/UserService';
import { Usuario } from '../models/Usuario';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';

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
  callingPriority: string | null = null;
  categoria = '';
  formadeContato = '';

   usuarios: Usuario[] = [];
   usuarioSelecionadoId!: number;

  constructor(private chamadoService: ChamadoService, private userService: UserService, private router: Router) {}

  ngOnInit(): void {
    this.listarUsuarios();
  }

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
      next: (res) => {
        alert('Chamado criado com sucesso'),
        this.router.navigate([`/listar-chamados/${res.id}`])
      },
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
}
