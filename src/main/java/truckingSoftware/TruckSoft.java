package truckingSoftware;

import java.util.concurrent.atomic.LongAccumulator;

public class TruckSoft {

    public static void main(String[] args) {
        Driver driver1 = new Driver(); //rule

        driver1.fullName = "Messi";
        driver1.age = 37;
        driver1.isDrugTest = true;

        driver1.printInfo();

       driver1.reportAccident("LA");
       driver1.drive();

       driver1.sendLocation();

       // catching thE data

        String location = driver1.sendLocation();
        System.out.println(location);

        driver1.sendTotalLoads();
        // catch the data

        int loads = driver1.sendTotalLoads();
        System.out.println(loads);


    }




    }



