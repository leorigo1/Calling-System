import { Routes } from '@angular/router';
import { Login } from './login/login';
import { CreateCall } from './create-call/create-call'

export const routes: Routes = [
    { path: 'login', component: Login },
    { path: 'iniciar-chamado', component: CreateCall },
];
