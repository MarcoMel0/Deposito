package com.example.application.model.produtoModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDao {
    private Connection connection;

    public ProdutoDao() {
        try
        {
            connection = DriverManager.getConnection("jdbc:sqlite:distribuidora.db");
        } catch (SQLException e) {
            System.out.println("Caiu aq");
            e.printStackTrace();
        }
    }

    private void Insert(String sql) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.executeQuery(sql);
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void InsertProduto(ProdutoEnt produto) {
        String insertSql = "INSERT INTO Produto values " +
                "('lucas" + produto.getNome() + "'" +
                "," + produto.getEstoque() + "" +
                "," + produto.getPreco() + ")";
        System.out.println(insertSql);
    }
}
