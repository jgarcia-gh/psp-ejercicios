public class Main {
    public static void main(String[] args) {
        Recurso r1 = new Recurso(1);
        Recurso r2 = new Recurso(2);

        (new Thread(() -> {Coordinador.utilizarRecursos(r1, r2);})).start();
        (new Thread(() -> {Coordinador.utilizarRecursos(r2, r1);})).start();

    }
}
