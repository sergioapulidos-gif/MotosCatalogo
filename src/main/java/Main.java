import dao.MotocicletaDAO;

public class Main {

    public static void main(String[] args) {

        MotocicletaDAO dao =
                new MotocicletaDAO();

        dao.consultarTodas();
    }
}