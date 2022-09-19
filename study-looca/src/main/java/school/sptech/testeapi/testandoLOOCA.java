package school.sptech.testeapi;

import com.github.britooo.looca.api.core.Looca;
import java.sql.*;

public class testandoLOOCA {

    static final String DB_URL = "jdbc:mysql://localhost/databaseLooca";
    static final String USER = "aluno";
    static final String PASS = "sptech";
    static final String QUERY = "SELECT idTeste, teste FROM Teste";

    public static void main(String[] args) {

        Looca looca = new Looca();

        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(QUERY);) {

            
            // INSERIR NO BANCO DE DADOS
            System.out.println("\nTESTANDO INSERÇÃO");
            String sql = "INSERT INTO Teste VALUES (NULL, 'você inseriu no banco de dados')";
            stmt.executeUpdate(sql);
            
            
            /*
            // PEGAR VALORES DO BANCO DE DADOS
            while (rs.next()) {
                // Retrieve by column name
                System.out.print("\nID: " + rs.getInt("idTeste"));
                System.out.print(", TEXTO: " + rs.getString("teste"));
            }
            */
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
