package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Matheus
 */
public class FilmeDao {
    
    Connection con;
    PreparedStatement st;
    
    private String url = "jdbc:mysql://localhost:3306/cenaflix";
    private String user = "root";
    private String password = "";
    
    public boolean conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            return true;
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Erro de Conexão: " + ex.getMessage());
            return false;
        }
    }
    
    public int inserir(Filme filme){
        int status;
        // Converter a data para o formato correto (yyyy-MM-dd)
        
        
        try{
            String dataLancamento = filme.getDatalancamento();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date date = sdf.parse(dataLancamento);
            sdf.applyPattern("yyyy-MM-dd");
            String dataLancamentoFormatada = sdf.format(date);
            
            st = con.prepareStatement("INSERT INTO filmes (nome, datalancamento, categoria) VALUES(?,?,?)");
            st.setString(1, filme.getFilme());
            st.setString(2, dataLancamentoFormatada);
            st.setString(3, filme.getCategoria());
            
            status = st.executeUpdate();
            return status;
        }catch(SQLException ex){
            System.out.println("Erro ao conectar " + ex.getMessage());
            return ex.getErrorCode();
        } catch (ParseException ex) {
            // Trate a exceção aqui ou faça algo apropriado, como registrar ou lançar uma nova exceção
            System.out.println("Erro ao fazer parse da data: " + ex.getMessage());
            return ex.getErrorOffset();
        }
    }
    
    public void desconectar(){
        try{
            con.close();
        }catch(SQLException ex){
            
        }
    }
}
