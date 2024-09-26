public class main {

    private String make;
    private String model;


    public main(String make, String model) {
        this.make = make;
        this.model = model;
    }


    public String getMake() {
        return make;
    }


    public void setMake(String make) {
        this.make = make;
    }


    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }
}
public class main{

    public static void main(String[] args) {

        Vehicle myCar = new Vehicle("Ford", "Fusion");


        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());


        myCar.setMake("Chevy");
        myCar.setModel("Malibu");


        System.out.println("Updated Make: " + myCar.getMake());
        System.out.println("Updated Model: " + myCar.getModel());
    }
}
