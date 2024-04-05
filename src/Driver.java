public class Driver {

    private String dName;
    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }


    void drive(Vehicle v, String dName){
        v.engine();
        v.breaks();
        System.out.println(v + " is driven by "+ dName);
    }


}
