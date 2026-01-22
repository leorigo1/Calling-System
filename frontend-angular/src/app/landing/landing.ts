import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { LoaderService } from '../services/LoaderService';

@Component({
  selector: 'app-landing',
  imports: [],
  templateUrl: './landing.html',
  styleUrl: './landing.scss',
})
export class Landing {

constructor (private router: Router, private loader: LoaderService,){ }

  login() {
    this.loader.show();

    setTimeout(() => {
      this.router.navigate(['/login']).then(() => {
        this.loader.hide();
      });
    }, 1000);
  }

  contact(){
    this.router.navigate(['/login'])
  }

}
