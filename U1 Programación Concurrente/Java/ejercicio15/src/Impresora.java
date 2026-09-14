import java.util.concurrent.locks.ReentrantLock;

public class Impresora {
    private final ReentrantLock lock = new ReentrantLock();

    public void imprimirDocumento(String documento) {

        lock.lock();

        try {

            System.out.println("Imprimiendo: " + documento);

            // Simulación de un error durante la impresión
            if (documento == null) {
                throw new IllegalArgumentException("El documento no puede ser nulo");
            }

            Thread.sleep(1000);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        lock.unlock();
    }
}