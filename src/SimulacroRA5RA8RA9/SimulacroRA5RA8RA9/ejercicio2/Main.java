package SimulacroRA5RA8RA9.ejercicio2;

import com.mysql.cj.MysqlConnection;
import java.sql.*;

public class Main {
    /*
        ejercicio2:
        Crea una base de datos (o usa una de las de bases de datos) y lee el contenido de esa base de datos por java.
        Si se tratara por ejemplo de la base de datos de tienda que usamos el otro día, crea también la clase
        Producto y rellena un array de productos con los datos que saques al leer de la base de datos.

     */
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/ejercicio2"; //conector | bdd | ip | puerto | gestorbdd | nombrebDD
            Connection con = DriverManager.getConnection(url, "root", "");

            String consulta = "select * from libro";    //ejecutar consulta
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(consulta);

            while (rs.next()) {       //recorrer el resultado de una consulta
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                System.out.println(id + " - " + titulo);
            }
            con.close();        //cerrar conexion


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
