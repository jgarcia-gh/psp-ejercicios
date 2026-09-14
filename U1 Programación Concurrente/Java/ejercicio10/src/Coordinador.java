public class Coordinador {

    public static void utilizarRecursos(Recurso r1, Recurso r2) {
        Recurso primero = /* RELLENAR */;
        Recurso segundo = /* RELLENAR */;

        synchronized (/* RELLENAR */) {
            System.out.println(Thread.currentThread().getName() + " adquirió el primero.");
            try { Thread.sleep(50); } catch (InterruptedException e) {}

            synchronized (/* RELLENAR */) {
                System.out.println(Thread.currentThread().getName() + " adquirió ambos. Trabajando...");
            }
        }
    }
}
