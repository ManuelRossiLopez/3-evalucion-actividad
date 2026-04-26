package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class App {
 public static void main(String[] args) {
 String host = "192.168.190.133";// ip de la máquina virtual
 int port = 3306; // puerto para acceder a mariaDB, por defecto 3306
 String database = "love_code"; //nombre de tu base de datos
 String user = "miUsuario"; // usuario creado en el paso 5.2
 String password = "miPassword"; // password creado en el paso 5.2
 String url = "jdbc:mariadb://" + host + ":" + port + "/" + database;
 try (Connection conn = DriverManager.getConnection(url, user, password);
 Statement stmt = conn.createStatement();
 ResultSet rs = stmt.executeQuery("SELECT 1 AS resultado")) {
 rs.next();
 System.out.println("Conexión exitosa. Resultado: " + rs.getInt("resultado"));
 } catch (Exception e) {
 System.err.println("Error al conectar con MariaDB:");
 e.printStackTrace();
 }
 }
}