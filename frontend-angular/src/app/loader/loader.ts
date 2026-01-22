import { Component } from '@angular/core';
import { LoaderService } from '../services/LoaderService';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-loader',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './loader.html',
  styleUrl: './loader.scss',
})
export class Loader {
  constructor(public loader: LoaderService) {}
}
