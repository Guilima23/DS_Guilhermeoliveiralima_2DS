public class Main {
import java.sql.Connection;
            import java.sql.DriverManager;
            import java.sql.PreparedStatement;
            import java.sql.SQLException;
    public static void main(String[] args) {
            
          // Configuração dos parâmetros de autenticação
        String server = "localhost";
        String port = "3306";
        String database = "meubanco"; // Altere para o nome do seu banco
        String user = "root";
        String passwd = "";

        String url = "jdbc:mysql://" + server + ":" + port + "/" + database
                + "?useSSL=false&serverTimezone=America/Sao_Paulo";

        Connection conexao = null;
        PreparedStatement stmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Conectando ao Banco de Dados...");
            conexao = DriverManager.getConnection(url, user, passwd);
            System.out.println("Conexão efetuada com sucesso!\n");

            // 1. INSERIR dados na tabela funcionario[span_3](start_span)[span_3](end_span)
            String sqlInsert = "INSERT INTO funcionario (nome, email) VALUES (?, ?)";
            stmt = conexao.prepareStatement(sqlInsert);
            stmt.setString(1, "Ana Souza");
            stmt.setString(2, "ana.souza@email.com");
            stmt.executeUpdate();
            stmt.close(); // Fecha o statement anterior para reutilizar a variável
            System.out.println("-> Funcionário inserido com sucesso!");

            // 2. ATUALIZAR dados na tabela funcionario (ex: atualizar o email pelo id)[span_4](start_span)[span_4](end_span)
            String sqlUpdate = "UPDATE funcionario SET email = ? WHERE id = ?";
            stmt = conexao.prepareStatement(sqlUpdate);
            stmt.setString(1, "ana.novo@email.com");
            stmt.setInt(2, 1); // Supondo que o id seja 1
            stmt.executeUpdate();
            stmt.close();
            System.out.println("-> Funcionário atualizado com sucesso!");

            // 3. DELETAR dados da tabela funcionario (ex: deletar pelo id)[span_5](start_span)[span_5](end_span)
            String sqlDelete = "DELETE FROM funcionario WHERE id = ?";
            stmt = conexao.prepareStatement(sqlDelete);
            stmt.setInt(1, 1); // Supondo que deseja deletar o registro com id 1
            stmt.executeUpdate();
            stmt.close();
            System.out.println("-> Funcionário deletado com sucesso!");

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
}
