public class Main {
    public static void main(String[] args) {
        CuentaBancaria cb1 = new CuentaBancaria();
        CuentaBancaria cb2 = new CuentaBancaria();

        new Thread (() -> CuentaBancaria.transferir(cb1,cb2,200.0)).start();
        new Thread (() -> CuentaBancaria.transferir(cb2,cb1,50.0)).start();
    }
}
