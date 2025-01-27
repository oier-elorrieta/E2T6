package controlador;

import java.sql.*;
import java.util.ArrayList;

public class Conexioa {
    public static ArrayList<String> conexiaoBueltatu() {
    	ArrayList<String> emaitza = new ArrayList<String>();
        try {

        	Class.forName("com.mysql.cj.jdbc.Driver");
        	
            // Establecemos la conexión con la BD
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/empresa", "root", "");

            // Preparamos la consulta
            Statement sentencia = conexion.createStatement();
            String sql = "SELECT * FROM departamentos";
            ResultSet resul = sentencia.executeQuery(sql);

            // Recorremos el resultado para visualizar cada fila
            // Se hace un bucle mientras haya registros y se van visualizando
            while (resul.next()) {
                //System.out.println(resul.getInt(1)+", "+resul.getString(2)+", "+resul.getString(3));
            	emaitza.add(resul.getString(2));
            }
            
            resul.close(); // Cerrar ResultSet
            sentencia.close(); // Cerrar Statement
            conexion.close(); // Cerrar conexión
            return emaitza;
        } catch (ClassNotFoundException cn){
        	cn.printStackTrace();
        	return emaitza;
        } catch (SQLException e) {
            e.printStackTrace();
            emaitza.add("Errore bat egon da");
            return emaitza;
        }
    }
}
// fin de main
// fin de la clase