import conexao.ConexaoDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class TesteCRUD {

    public static void main(String[] args) {

        try {
            Connection conn = ConexaoDB.conectar();

            // 1. Criar comando SQL
            String sql = "SELECT * FROM usuarios";

            // 2. Criar Statement
            Statement stmt = conn.createStatement();

            // 3. Executar o SELECT
            ResultSet rs = stmt.executeQuery(sql);

            // 4. Percorrer os resultados
            while (rs.next()) {
                int id = rs.getInt("id_principal");
                String nome = rs.getString("nome");

                System.out.println("ID: " + id + " | Nome: " + nome);
            }

            // 5. Fechar tudo
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}