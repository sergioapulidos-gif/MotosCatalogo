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
}