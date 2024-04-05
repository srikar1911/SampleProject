public class BusDrivers {
    public static void main(String[] args) {

        Driver d1 = new Driver();

        d1.setdName("driver1");

        Driver d2 = new Driver();
        d2.setdName("driver 2");

        Vehicle v1 = new VolvoBus();

        d1.drive(v1, d1.getdName());
        System.out.println("\n");

        Vehicle v2 = new RedBus();
        d1.drive(v2, d2.getdName());


    }
}
