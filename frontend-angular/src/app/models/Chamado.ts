export interface Chamado {
  id: number;
  titulo: string;
  descricao: string;
  callingPriority: string;
  categoria: string;
  formadeContato: string;
  dataCriacao: string;
  usuario: Usuario; 
}

export interface Usuario {
  id: number;
  name: string;
  email: string;
}
