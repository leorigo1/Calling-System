import { Component,OnInit } from '@angular/core';
import { DatePipe, NgClass } from '@angular/common';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { UserService } from '../../../services/UserService';
import { Observable } from 'rxjs';
import { ChamadoService } from '../../../services/ChamadoService';
import { ActivatedRoute } from '@angular/router';
import { Chamado } from '../../../models/Chamado';


@Component({
  selector: 'app-call-details',
  standalone: true,
  imports: [DatePipe, FormsModule, CommonModule],
  templateUrl: './call-details.html',
  styleUrl: './call-details.scss',
})
export class CallDetails implements OnInit{

novaMensagem = '';
responsavel = '';

usuarios$!: Observable<any[]>;
chamado$!: Observable<Chamado>;

  constructor(
    private router: Router,
    private usuarios: UserService,
    private chamadoService: ChamadoService,
    private route: ActivatedRoute
  ) {}

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

  ngOnInit(): void {
    const idChamado = Number(this.route.snapshot.paramMap.get('id'));

    this.usuarios$ = this.usuarios.listUsers();
    this.chamado$ = this.chamadoService.detalhar(idChamado);
  }


}
