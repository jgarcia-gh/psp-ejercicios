import java.util.List;

public class Main {

    public static void main(String[] args) {

        Interseccion i1 = new Interseccion("Int. 1");
        Interseccion i2 = new Interseccion("Int. 2");

        List<Posicion> camino1 = List.of(
                new Recta("Rect. 1"),
                i1,
                new Recta("Rect. 2")
        );


        List<Posicion> camino2 = List.of(
                new Recta("Rect. 3"),
                i1,
                new Recta("Rect. 4")
        );



        new Thread(new Robot("R1", camino1)).start();
        new Thread(new Robot("R2", camino2)).start();

    }
}
