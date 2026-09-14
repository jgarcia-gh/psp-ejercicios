public class Main {
    private static final Object pizarra = new Object();
    private static final Object rotulador = new Object();

    public static void main(String[] args) {
        new Thread(Main::ejecutarTrabajoProgramador1).start();
        new Thread(Main::ejecutarTrabajoProgramador2).start();
    }

    public static void ejecutarTrabajoProgramador1() {
        synchronized (pizarra) {
            System.out.println("Prog 1 tiene la pizarra. Esperando rotulador...");
            try { Thread.sleep(50); } catch (InterruptedException e) {}
            synchronized (rotulador) {
                System.out.println("Prog 1 está diseñando.");
            }
        }
    }

    public static void ejecutarTrabajoProgramador2() {
        synchronized (rotulador) {
            System.out.println("Prog 2 tiene el rotulador. Esperando pizarra...");
            try { Thread.sleep(50); } catch (InterruptedException e) {}
            synchronized (pizarra) {
                System.out.println("Prog 2 está diseñando.");
            }
        }
    }
}
