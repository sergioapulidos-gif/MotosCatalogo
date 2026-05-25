package dao;

import database.ConexionBD;
import model.Motocicleta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MotocicletaDAO {

    public void consultarTodas() {

        String sql =
                "SELECT * FROM motocicleta";

        try {

            Connection conexion =
                    ConexionBD.conectar();

            PreparedStatement ps =
                    conexion.prepareStatement(sql);

            ResultSet rs =
                    ps.executeQuery();

            while(rs.next()) {

                System.out.println(
                        rs.getInt("id")
                                + " - " +
                                rs.getString("modelo")
                                + " - " +
                                rs.getInt("cilindraje")
                );
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
    public void consultarPorId(int idBuscar) {

        String sql =
                "SELECT * FROM motocicleta WHERE id = ?";

        try {

            Connection conexion =
                    ConexionBD.conectar();

            PreparedStatement ps =
                    conexion.prepareStatement(sql);

            ps.setInt(1, idBuscar);

            ResultSet rs =
                    ps.executeQuery();

            if(rs.next()) {

                System.out.println("ID: "
                        + rs.getInt("id"));

                System.out.println("Modelo: "
                        + rs.getString("modelo"));

                System.out.println("Cilindraje: "
                        + rs.getInt("cilindraje"));

                System.out.println("Precio: "
                        + rs.getDouble("precio"));

            } else {

                System.out.println(
                        "Motocicleta no encontrada"
                );
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}