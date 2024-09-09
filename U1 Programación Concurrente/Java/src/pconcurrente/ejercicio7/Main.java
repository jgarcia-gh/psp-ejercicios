package pconcurrente.ejercicio7;

public class Main {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo();

        Thread fm = new Thread(new FabricarMotor(v));
        Thread fb = new Thread(new FabricarBateria(v));
        Thread fc = new Thread(new FabricarCarroceria(v));

        fm.start();
        fb.start();
        fc.start();

    }
}
