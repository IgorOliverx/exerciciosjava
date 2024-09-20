package org.example;

public abstract class AgendaTelefonicaService {
    public abstract void adicionarContato(Contato contato);
    public abstract void removerContato(String nome);
    public abstract Contato buscarContato(String telefone);
    public abstract Contato[] listarContatos();
}
