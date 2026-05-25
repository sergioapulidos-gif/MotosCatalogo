import dao.MotocicletaDAO;

public class Main {

    public static void main(String[] args) {

        MotocicletaDAO dao =
                new MotocicletaDAO();

        dao.actualizarMotocicleta(
                99,
                "Moto X",
                500,
                20000000
        );
    }
}