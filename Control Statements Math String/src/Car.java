public class Car {
    int noOfWheels;
    int noOfDoors;
    int speed;
    String name;
    String manuufactrure;
    String model;

    public Car(int noOfWheels, int noOfDoors, int speed, String name, String manuufactrure, String model) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.speed = speed;
        this.name = name;
        this.manuufactrure = manuufactrure;
        this.model = model;
    }

//    @Override
//    public String toString() {
//        return "My car name is: " + name;
//    }


//    @Override
//    public String toString() {
//        return "Car{" +
//                "noOfWheels=" + noOfWheels +
//                ", noOfDoors=" + noOfDoors +
//                ", speed=" + speed +
//                ", name='" + name + '\'' +
//                ", manuufactrure='" + manuufactrure + '\'' +
//                ", model='" + model + '\'' +
//                '}' ;
//    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("noOfWheels=").append(noOfWheels);
        sb.append(", noOfDoors=").append(noOfDoors);
        sb.append(", speed=").append(speed);
        sb.append(", name='").append(name).append('\'');
        sb.append(", manuufactrure='").append(manuufactrure).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Car swifr = new Car(4,4,180, "maruti", "india", "hgv2736476");
        System.out.println(swifr);
        // System.out.println(swifr.toString());
    }
}
