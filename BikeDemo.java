public class BikeDemo {
    public static void main(String[] args) {
        Bike mountainBike1 = new Bike();
        Bike mountainBike2 = new Bike();
        Bike mountainBike3 = new Bike();
        Bike mountainBike4 = new Bike();
        RoadBike roadBike1 = new RoadBike();
        RoadBike roadBike2 = new RoadBike();


        mountainBike1.setbrand("Track");
        mountainBike1.speedAcceleration(10);
        mountainBike1.gearChanges(2);
        mountainBike1.printInfo();

        mountainBike2.setbrand("Giant");
        mountainBike2.speedAcceleration(20);
        mountainBike2.gearChanges(3);
        mountainBike2.printInfo();

        mountainBike3.setbrand("fixie"); //modifikasi ketika kecepatan overspeed
        mountainBike3.speedAcceleration(65);
        mountainBike3.gearChanges(7);
        mountainBike3.printInfo();

        mountainBike4.setbrand("normal"); //modifikasi ketika speed dan gearchanges ditukar tempatnya
        mountainBike4.gearChanges(6);
        mountainBike4.speedAcceleration(40);
        mountainBike4.printInfo();


        roadBike1.setbrand("Specialized");
        roadBike1.setTireWidth(25);
        roadBike1.gearChanges(4);
        roadBike1.speedAcceleration(15);
        roadBike1.printInfo();

        roadBike2.setbrand("polygon");
        roadBike2.setTireWidth(15);
        roadBike2.gearChanges(5);
        roadBike2.speedAcceleration(15);
        roadBike2.printInfo();
    }
}
