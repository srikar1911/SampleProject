import javax.crypto.spec.PSource;

abstract public class Bus implements Vehicle {


    @Override
    public void breaks() {
        System.out.println("This Bus has normal breaks");
    }

        //added new line

}
