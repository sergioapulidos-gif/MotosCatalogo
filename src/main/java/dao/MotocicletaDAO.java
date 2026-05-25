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
    public void agregarMotocicleta(
            String modelo,
            int cilindraje,
            double precio,
            int marcaId
    ) {

        String sql =
                "INSERT INTO motocicleta(modelo, cilindraje, precio, marca_id) " +
                        "VALUES (?, ?, ?, ?)";

        try {

            Connection conexion =
                    ConexionBD.conectar();

            PreparedStatement ps =
                    conexion.prepareStatement(sql);

            ps.setString(1, modelo);

            ps.setInt(2, cilindraje);

            ps.setDouble(3, precio);

            ps.setInt(4, marcaId);

            ps.executeUpdate();

            System.out.println(
                    "Motocicleta agregada correctamente"
            );

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
    public void eliminarMotocicleta(int idEliminar) {

        String sql =
                "DELETE FROM motocicleta WHERE id = ?";

        try {

            Connection conexion =
                    ConexionBD.conectar();

            PreparedStatement ps =
                    conexion.prepareStatement(sql);

            ps.setInt(1, idEliminar);

            int filas =
                    ps.executeUpdate();

            if(filas > 0) {

                System.out.println(
                        "Motocicleta eliminada"
                );

            } else {

                System.out.println(
                        "No existe motocicleta con ese ID"
                );
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
    public void actualizarMotocicleta(
            int idActualizar,
            String nuevoModelo,
            int nuevoCilindraje,
            double nuevoPrecio
    ) {

        String sql =
                "UPDATE motocicleta " +
                        "SET modelo = ?, cilindraje = ?, precio = ? " +
                        "WHERE id = ?";

        try {

            Connection conexion =
                    ConexionBD.conectar();

            PreparedStatement ps =
                    conexion.prepareStatement(sql);

            ps.setString(1, nuevoModelo);

            ps.setInt(2, nuevoCilindraje);

            ps.setDouble(3, nuevoPrecio);

            ps.setInt(4, idActualizar);

            int filas =
                    ps.executeUpdate();

            if(filas > 0) {

                System.out.println(
                        "Motocicleta actualizada"
                );

            } else {

                System.out.println(
                        "No existe motocicleta con ese ID"
                );
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}