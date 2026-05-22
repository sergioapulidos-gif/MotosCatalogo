package database;

import java.sql.Connection;
import java.sql.DriverManager;
// Gestiona la conexion entre Java y PostgreSQL
public class ConexionBD {

    private static final String URL =
            "jdbc:postgresql://ep-empty-meadow-apq57n8i-pooler.c-7.us-east-1.aws.neon.tech/neondb?sslmode=require";

    private static final String USER =
            "neondb_owner";

    private static final String PASSWORD =
            "npg_6muQGwhUtBS8";

    public static Connection conectar() {

        try {

            Connection conexion =
                    DriverManager.getConnection(
                            URL,
                            USER,
                            PASSWORD
                    );

            System.out.println("Conexión exitosa a Neon");

            return conexion;

        } catch (Exception e) {

            System.out.println("Error de conexión");

            e.printStackTrace();

            return null;
        }
    }
}
