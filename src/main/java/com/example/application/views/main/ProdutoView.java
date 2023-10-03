package com.example.application.views.main;

import com.example.application.controller.ProdutoController;
import com.example.application.model.produtoModel.ProdutoEnt;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.textfield.TextField;


@Route("Produto")
public class ProdutoView extends VerticalLayout {

    ProdutoController proControl = new ProdutoController();
   /* private Button btnEnviar;
    private TextField Nome;
    private TextField Estoque;
    private TextField Preco;
    //private TextField envio;*/

    public ProdutoView() {
        Button BtnGravar = new Button("Gravar");
        TextField TextFieldNome = new TextField("Nome Produto:");
        TextField TextFieldEstoque = new TextField("Estoque:");
        TextField TextFieldPreco = new TextField("Preço:");
        ProdutoEnt produto = new ProdutoEnt();
        var layout = new VerticalLayout(
                TextFieldNome,TextFieldEstoque,TextFieldPreco,BtnGravar);
        BtnGravar.addClickListener(e ->{
            produto.setNome(TextFieldNome.getValue());
            produto.setEstoque(Integer.valueOf(TextFieldEstoque.getValue()));
            produto.setPreco(Double.valueOf(TextFieldPreco.getValue()));
            TextFieldPreco.getValue();
            proControl.createProduto(produto);
        });

        layout.setWidthFull();
        layout.setJustifyContentMode(JustifyContentMode.CENTER);
        layout.setAlignItems(Alignment.CENTER);
        add(layout);

        //createProduto();
    }

    /*public void createProduto() {
        ProdutoEnt produto = new ProdutoEnt();
        // Crie um objeto ProdutoEnt com os valores
        produto.setNome(String.valueOf(Nome));
        String nome = Nome.getValue();

        produto.setEstoque(Estoque);
        String estoque = this.Estoque.getValue();

        produto.setPreco(Preco);
        String preco = this.Preco.getValue();

            proControl.createProduto(produto);

    }*/

    /*public Button createButton() {
        var button = new Button("Gravar");
        button.addClickListener(event ->{

        });
        button.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        return button;
    }*/

}
