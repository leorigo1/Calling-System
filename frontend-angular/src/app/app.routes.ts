import { Routes } from '@angular/router';
import { Login } from './login/login';
import { CreateCall } from './create-call/create-call'
import { ListCalls } from './call/list-calls/list-calls';
import { Landing } from './landing/landing';
import { Register } from './register/register';
import { CallDetails } from './call/list-calls/call-details/call-details';
import { EmailVerification } from './email-verification/email-verification';
import { PasswordReset } from './password-reset/password-reset';
import { Loader } from './loader/loader';
 
export const routes: Routes = [
    { path: 'login', component: Login },
    { path: 'iniciar-chamado', component: CreateCall },
    { path: 'listar-chamados', component: ListCalls },
    { path: 'listar-chamados/chamado', component: CallDetails},  //alterar para :id quando usar o backend
    { path: 'register', component: Register },
    { path: 'email-verification', component: EmailVerification },
    { path: 'password-reset', component: PasswordReset },
    { path: 'loader', component: Loader},
    { path: '', component: Landing}
];
