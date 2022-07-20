package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseCon {
	private String url;
    private String usuario;
    private String senha;
    private Connection con;
    
  public DatabaseCon(){
        url = "jdbc:postgresql://localhost:5432/postgres";
        usuario = "postgres";
        senha = "17022919";
        
        try{
            
            Class.forName("org.postgresql.Driver");            
            con = DriverManager.getConnection(url,usuario,senha);
            System.out.println("caguei");
           
            
            
        }catch (Exception e) {
            System.out.println("erro");
            
            
        }
        
        
    }
    
}
