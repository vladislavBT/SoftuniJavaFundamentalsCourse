package JavaFundamentals12;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class P06VehicleCatalogue {
    static class Cars{
        String type;
        String model;
        String color;
        int horsepower;

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHorsepower() {
            return horsepower;
        }

        Cars(String type, String model, String color, int horsepower){
            this.type=type;
            this.model=model;
            this.color=color;
            this.horsepower=horsepower;
        }
        @Override
        public String toString() {
            return this.type +" "+this.model + " " + this.color + " " + this.horsepower;
        }






    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Cars> vehicles=new ArrayList<>();



        String lineOfCars= scanner.nextLine();
        while(!lineOfCars.equals("End")){
             String []arr=lineOfCars.split(" ");
             Cars car=new Cars(arr[0],arr[1],arr[2],Integer.parseInt(arr[3]));
             vehicles.add(car);

            lineOfCars= scanner.nextLine();
        }
            lineOfCars=scanner.nextLine();
        while (!lineOfCars.equals("Close the Catalogue")){

            for (int i = 0; i < vehicles.size(); i++) {
               if(vehicles.get(i).getModel().equals(lineOfCars)){
                   if(vehicles.get(i).getType().equals("car")) {
                       System.out.printf("Type: Car%n" +
                               "Model: %s%n" +
                               "Color: %s%n" +
                               "Horsepower: %s%n", vehicles.get(i).getModel(), vehicles.get(i).getColor(), vehicles.get(i).getHorsepower());
                   }
                   else{
                       System.out.printf("Type: Truck%n" +
                               "Model: %s%n" +
                               "Color: %s%n" +
                               "Horsepower: %s%n", vehicles.get(i).getModel(), vehicles.get(i).getColor(), vehicles.get(i).getHorsepower());
                   }
               }
            }
            lineOfCars=scanner.nextLine();
        }
        double carsAverageSum=0.0;
        double truckAverageSum=0.0;
        int cars=0;
        int trucks=0;
        for (int i = 0; i < vehicles.size(); i++) {
            if(vehicles.get(i).getType().equals("car")) {
                carsAverageSum += vehicles.get(i).getHorsepower();
                cars++;
            }
            else if(vehicles.get(i).getType().equals("truck")){
               truckAverageSum += vehicles.get(i).getHorsepower();
               trucks++;
            }
        }
        double carsAverage=carsAverageSum/cars;
        double truckAverage=truckAverageSum/trucks;
        if(carsAverageSum==0){
            carsAverage=0;
        }
        if(truckAverageSum==0){
            truckAverage=0;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", carsAverage);
        System.out.printf("Trucks have average horsepower of: %.2f.",truckAverage);

    }
}
