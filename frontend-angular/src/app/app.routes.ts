import { Routes } from '@angular/router';
import { Login } from './login/login';
import { CreateCall } from './create-call/create-call'
import { ListCalls } from './list-calls/list-calls';
import { Landing } from './landing/landing';
import { Register } from './register/register';

export const routes: Routes = [
    { path: 'login', component: Login },
    { path: 'iniciar-chamado', component: CreateCall },
    { path: 'listar-chamados', component: ListCalls },
    { path: 'register', component: Register },
    { path: '', component: Landing}
];
