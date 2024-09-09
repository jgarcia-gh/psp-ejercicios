package pconcurrente.ejercicio7;

public class FabricarMotor implements Runnable {

    private Vehiculo vehiculo;

    public FabricarMotor(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }

    @Override
    public void run() {
        System.out.println("FM: Fabricando motor");
        try {
            Thread.sleep((long)((Math.random()*9000)+1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Motor m = new Motor();
        System.out.println("FM: Motor fabricado");

        synchronized (vehiculo){
            System.out.println("FM: Ensamblando motor");
            vehiculo.ensamblarMotor(m);
        }
    }
}
