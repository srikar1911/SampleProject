
public class VolvoBus extends Bus{

    @Override
    public void engine() {
        System.out.println("Volvo bus engine capacity is 1500 CC");
    }

    @Override
    public void breaks(){
        System.out.println("volvo needs powerful breaks");
    }

    @Override
    public String toString() {
        return "VolvoBus";
    }
}
