package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Venda {
   private Map <String, List <Produto>> vendasCPF;

   public Venda(){
       super();
       vendasCPF = new HashMap<>();
   }

    /**
     * Método que cadastra uma venda
     * @param cpf
     * @param p
     */
   public void cadastroVenda(String cpf, Produto p){
         for (String cpfUsuario: vendasCPF.keySet()){
             if(cpfUsuario.equalsIgnoreCase(cpf)){
                 List<Produto> produtosCPF = vendasCPF.get(cpf);
                 produtosCPF.add(p);
                 vendasCPF.put(cpf, produtosCPF);
                 return;
             }
         }
             List<Produto> produtosCPFVazio = new ArrayList<>();
               produtosCPFVazio.add(p);
               vendasCPF.put(cpf, produtosCPFVazio);
        }

    /**
     * Método que lista os produtos de um determinado CPF
     * @param cpf
     * @return
     */
    public List<Produto> listarProdutos(String cpf){
        return vendasCPF.getOrDefault(cpf, Collections.emptyList());
   }

    /**
     * Método que lista os produtos de um determinado CPF com um valor mínimo
     * @param cpf
     * @param valorMinimo
     * @return
     * @throws Exception
     */
   public List<Produto> listarProdutosFiltros(String cpf, double valorMinimo) throws Exception {
        List<Produto> listaCpfFiltro = vendasCPF.getOrDefault(cpf, Collections.emptyList());
        if(listaCpfFiltro.isEmpty()){
            throw new Exception("CPF não encontrado");
        }else{
         List<Produto> resultado = listaCpfFiltro.stream()
                 .filter(p -> p.getPreco() >= valorMinimo)
                 .toList();
         return resultado;
        }
   }
}
