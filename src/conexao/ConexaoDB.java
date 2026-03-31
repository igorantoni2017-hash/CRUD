package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://127.0.0.1:5432/postgres";
        String usuario = "postgres";
        String senha = "1234";

        try {
            Connection conn = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conectado com sucesso!");

            conn.close();

        } catch (SQLException e) {
            System.out.println("Erro na conexão:");
            e.printStackTrace();
        }
    }
}