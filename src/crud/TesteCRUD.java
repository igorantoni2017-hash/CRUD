import conexao.ConexaoDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.*;

public class TesteCRUD {

    public static void main(String[] args) {
        //declaração de swings
            JFrame fmInterface = new JFrame("Minha Janela - SQL");
            JButton btnClicksql = new JButton("click para aparecer os dados");
            JLabel lblExibirSQL = new JLabel("Exibir SQL: ");

            fmInterface.setSize(300, 400);
            lblExibirSQL.setBounds(100, 0, 300, 400);

            btnClicksql.setBounds(100, 100, 100, 50);

            //2.1-construção livre da interface
            fmInterface.setLayout(null);

            //3-Quando clicar para fechar ele realmente fecha
            fmInterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //4-exibe a interface
            fmInterface.setVisible(true);

            fmInterface.add(btnClicksql);
            fmInterface.add(lblExibirSQL);


        btnClicksql.addActionListener(event -> {
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
                    String email = rs.getString("email");
                    String cpf= rs.getString("cpf");
                    String senha = rs.getString("senha");
                    String telefone = rs.getString("telefone");

                    lblExibirSQL.setText("ID: " + id + " | Nome: " + nome);
                }

                // 5. Fechar tudo
                rs.close();
                stmt.close();
                conn.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        });
        /*
         */
    }
}