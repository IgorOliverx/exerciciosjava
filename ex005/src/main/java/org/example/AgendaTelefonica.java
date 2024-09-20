package org.example;

import javax.swing.*;
import java.util.Arrays;

public class AgendaTelefonica extends AgendaTelefonicaService {
    private Contato[] contatos;
    private int contador;

    public AgendaTelefonica(int maxContatos) {
        contatos = new Contato[maxContatos];
        contador = 0;
    }


    @Override
    public void adicionarContato(Contato contato) {
        if (contador >= contatos.length) {
            throw new AgendaException("Agenda Cheia");
        }
        try {
            contatos[contador] = contato;
            contador++;
            System.out.println("Contato adicionado com sucesso" + contato.toString());
        } catch (Exception e) {
            throw new AgendaException("Erro ao adicionar contato");
        }

    }

    @Override
    public void removerContato(String nome) {
            boolean encontrado = false;

        for (int i = 0; i < contador; i++) {
            if(contatos[i].getNome().equalsIgnoreCase(nome)){
                encontrado = true;
                contatos[i] = contatos[contador - 1];
                contatos[contador - 1] = null;
                contador--;
            }

        }
        if(!encontrado){
            throw new AgendaException("Contato não encontrado");
        }
    }

    @Override
    public Contato buscarContato(String telefone) {
        for (int i = 0; i < contador; i++) {
            if (contatos[i].getTelefone().equals(telefone)) {
                return contatos[i];
            }
        }
        throw new AgendaException("Contato não encontrado");
    }

    @Override
    public Contato[] listarContatos() {
        if (contador == 0) {
            throw new AgendaException("Agenda Vazia");
        }
        for (int i = 0; i < contador; i++) {
            System.out.println(contatos[i].toString());
        }
        return Arrays.copyOf(contatos, contador);
    }
}
