import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Loader } from './loader/loader';
import { LoaderService } from './services/LoaderService';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, Loader],
  templateUrl: './app.html',
  styleUrl: './app.scss'
})
export class App {
  protected readonly title = signal('frontend-angular');

constructor(private loader: LoaderService) {}


}
