package com.example.application.model.produtoModel;

import com.vaadin.flow.component.textfield.TextField;

public class ProdutoEnt {
   private long Id;
   private String Nome;
   private Integer Estoque;
   private Double Preco;

   public long getId() {
      return Id;
   }

   public void setId(long id) {
      Id = id;
   }

   public String getNome() {
      return Nome;
   }

   public void setNome(String nome) {
      Nome = nome;
   }

   public Integer getEstoque() {
      return Estoque;
   }

   public void setEstoque(Integer estoque) {
      Estoque = estoque;
   }

   public Double getPreco() {
      return Preco;
   }

   public void setPreco(double preco) {
      Preco = preco;
   }
}
