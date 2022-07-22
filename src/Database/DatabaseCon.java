package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

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
            
           
        }catch (Exception e) {
            e.printStackTrace();
            
            
        }
        
        
    }
  public int SQLexecute(String sql) {
	  
	  try {
		  Statement stm = con.createStatement();
		  int res = stm.executeUpdate(sql);
		  con.close();
		  return res;	  
		  
	  }catch (Exception e) {
		  e.printStackTrace();
		  return 0;
	  }
	  
	  
  }
    
}
