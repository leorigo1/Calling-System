import { Component, OnInit, ChangeDetectorRef } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ChamadoService } from '../services/ChamadoService';

@Component({
  selector: 'app-list-calls',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './list-calls.html',
  styleUrl: './list-calls.scss',
})
export class ListCalls implements OnInit {

  chamados: any[] = [];

  constructor(
    private service: ChamadoService,
    private cdr: ChangeDetectorRef
  ) {}

  ngOnInit(): void {
    this.service.listar().subscribe(dados => {
      console.log('DADOS:', dados);
      this.chamados = dados;
      this.cdr.detectChanges(); // 🔥 FORÇA renderização
    });
  }
}
