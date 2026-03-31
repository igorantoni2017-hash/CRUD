package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

    public static Connection conectar() throws SQLException {

        String url = "jdbc:postgresql://127.0.0.1:5432/postgres";
        String usuario = "postgres";
        String senha = "1234";

        return DriverManager.getConnection(url, usuario, senha);
    }
}