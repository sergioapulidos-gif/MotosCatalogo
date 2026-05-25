import dao.MotocicletaDAO;

public class Main {

    public static void main(String[] args) {

        MotocicletaDAO dao =
                new MotocicletaDAO();

        dao.agregarMotocicleta(
                "NKD 125",
                125,
                9500000,
                1
        );
    }
}