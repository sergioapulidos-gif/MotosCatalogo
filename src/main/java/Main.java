import dao.MotocicletaDAO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner =
                new Scanner(System.in);

        MotocicletaDAO dao =
                new MotocicletaDAO();

        int opcion = -1;

        while(opcion != 0) {

            System.out.println("\n===== MENÚ =====");

            System.out.println(
                    "1. Consultar todas"
            );

            System.out.println(
                    "2. Consultar por ID"
            );

            System.out.println(
                    "3. Agregar motocicleta"
            );

            System.out.println(
                    "4. Eliminar motocicleta"
            );

            System.out.println(
                    "5. Actualizar motocicleta"
            );

            System.out.println(
                    "6. Filtrar por cilindraje"
            );

            System.out.println(
                    "0. Salir"
            );

            System.out.print(
                    "Seleccione opción: "
            );

            opcion =
                    scanner.nextInt();

            switch(opcion) {

                case 1:

                    dao.consultarTodas();

                    break;

                case 2:

                    System.out.print(
                            "Ingrese ID: "
                    );

                    int idBuscar =
                            scanner.nextInt();

                    dao.consultarPorId(idBuscar);

                    break;

                case 3:

                    scanner.nextLine();

                    System.out.print(
                            "Modelo: "
                    );

                    String modelo =
                            scanner.nextLine();

                    System.out.print(
                            "Cilindraje: "
                    );

                    int cilindraje =
                            scanner.nextInt();

                    System.out.print(
                            "Precio: "
                    );

                    double precio =
                            scanner.nextDouble();

                    System.out.print(
                            "Marca ID: "
                    );

                    int marcaId =
                            scanner.nextInt();

                    dao.agregarMotocicleta(
                            modelo,
                            cilindraje,
                            precio,
                            marcaId
                    );

                    break;

                case 4:

                    System.out.print(
                            "ID a eliminar: "
                    );

                    int idEliminar =
                            scanner.nextInt();

                    dao.eliminarMotocicleta(
                            idEliminar
                    );

                    break;

                case 5:

                    System.out.print(
                            "ID actualizar: "
                    );

                    int idActualizar =
                            scanner.nextInt();

                    scanner.nextLine();

                    System.out.print(
                            "Nuevo modelo: "
                    );

                    String nuevoModelo =
                            scanner.nextLine();

                    System.out.print(
                            "Nuevo cilindraje: "
                    );

                    int nuevoCilindraje =
                            scanner.nextInt();

                    System.out.print(
                            "Nuevo precio: "
                    );

                    double nuevoPrecio =
                            scanner.nextDouble();

                    dao.actualizarMotocicleta(
                            idActualizar,
                            nuevoModelo,
                            nuevoCilindraje,
                            nuevoPrecio
                    );

                    break;

                case 6:

                    System.out.print(
                            "Cilindraje mínimo: "
                    );

                    int minimo =
                            scanner.nextInt();

                    dao.filtrarPorCilindraje(
                            minimo
                    );

                    break;

                case 0:

                    System.out.println(
                            "Saliendo del sistema..."
                    );

                    break;

                default:

                    System.out.println(
                            "Opción inválida"
                    );
            }
        }
    }
}