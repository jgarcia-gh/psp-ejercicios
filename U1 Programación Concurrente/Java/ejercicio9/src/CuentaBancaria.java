public class CuentaBancaria {
    private double saldo = 1000;

    public synchronized void depositar(double cantidad) {
        this.saldo += cantidad;
    }

    public synchronized void retirar(double cantidad) {
        this.saldo -= cantidad;
    }

    public static void transferir(CuentaBancaria origen,
                                  CuentaBancaria destino,
                                  double cantidad) {
        synchronized (origen) {
            // Simulamos un pequeño retraso que aumenta la probabilidad del fallo
            try { Thread.sleep(50); } catch (InterruptedException e) {}

            synchronized (destino) {
                if (origen.saldo >= cantidad) {
                    origen.retirar(cantidad);
                    destino.depositar(cantidad);
                    System.out.println("Transferencia realizada con éxito.");
                }
            }
        }
    }
}
