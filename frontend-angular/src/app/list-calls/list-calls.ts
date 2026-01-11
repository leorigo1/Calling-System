import { Component, OnInit, ChangeDetectorRef } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ChamadoService } from '../services/ChamadoService';
import { Observable } from 'rxjs';
import { DatePipe } from '@angular/common';

@Component({
  selector: 'app-list-calls',
  standalone: true,
  imports: [CommonModule, DatePipe],
  templateUrl: './list-calls.html',
  styleUrl: './list-calls.scss',
})
export class ListCalls {

chamados$: Observable<any[]>;

  constructor(private service: ChamadoService) {
    this.chamados$ = this.service.listar();
  }
}
