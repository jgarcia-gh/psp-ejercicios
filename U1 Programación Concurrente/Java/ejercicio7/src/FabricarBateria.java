import java.util.Random;

public class FabricarBateria implements Runnable {

    private Vehiculo vehiculo;

    public FabricarBateria(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }

    @Override
    public void run() {
        Random r = new Random();
        System.out.println("FB: Fabricando batería");
        try {
            Thread.sleep(r.nextInt(1000,2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Bateria b = new Bateria();
        System.out.println("FB: Batería fabricada");

        synchronized (vehiculo){
            System.out.println("FB: Ensamblando batería");
            vehiculo.ensamblarBateria(b);
        }
    }
}
