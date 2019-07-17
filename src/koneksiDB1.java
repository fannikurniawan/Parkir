import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author
 */
public class koneksiDB1 {

    static Object getKoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Connection con;
    Statement stm;
    
public void config(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/fanni","root","");
        stm = con.createStatement();
    }catch (ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
    }
}
   public static Connection mysqlconfig;
        public static Connection configDB()throws SQLException{
        try{
            String url="jdbc:mysql://localhost/fanni";//urldb
            String user="root";//userdb
            String pass="";//passdb
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);
        }catch (SQLException e){
            System.err.println("Koneksi Gagal "+e.getMessage());//peringatan eror
        }
        return mysqlconfig;
        }    
}
