package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {


    public static void main(String[] args) {// Configuração dos parâmetros de autenticação

        String server = "localhost";
        String port = "3306";
        String database = "meubanco";
        String user = "root";
        String passwd = "";

        String url = "jdbc:mysql://" + server + ":" + port + "/" + database
                + "?useSSL=false&serverTimezone=America/Sao_Paulo";

        Connection conexao = null;
        PreparedStatement stmt = null;

        String instrucaoSQL =
                "INSERT INTO aluno (matricula, nome, email, idade) " +
                        "VALUES (?, ?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Conectando ao Banco de Dados");

            conexao = DriverManager.getConnection(url, user, passwd);

            System.out.println("Conexão efetuada com sucesso");
            System.out.println("Inserindo dados na tabela, aguarde!!");

            stmt = conexao.prepareStatement(instrucaoSQL);

            stmt.setInt(1, 2);
            ((PreparedStatement) stmt).setString(2, "Henrique");
            stmt.setString(3, "henrique@gmail.com");
            stmt.setInt(4, 33);

            stmt.executeUpdate();

            System.out.println("Dados inseridos com sucesso!");

        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC do MySQL não encontrado.");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("Erro ao executar a operação no banco de dados.");
            e.printStackTrace();

        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conexao != null) conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}