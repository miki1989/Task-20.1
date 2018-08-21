package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class AnnouncementRepository {
    private List<Vehicle> vehicles;
    public AnnouncementRepository(){

        vehicles = new ArrayList<>();

        vehicles.add(new Vehicle("Yamaha", TypeOfVehicle.MOTORCYCLE,
                "2007 Yamaha Royal Star Tour Deluxe 17000 miles. Fully loaded with bat wing fairing fm CD player cruise control. Good tires and new brakes. Baron exhaust sounds like a Ferrari.",
                "https://images.craigslist.org/00L0L_jF3iBR8fWQw_600x450.jpg", 6000));

        vehicles.add(new Vehicle("Suzuki", TypeOfVehicle.MOTORCYCLE,
                "Bike is ready to ride. Has a Key with Push Button Electric Start, Front Headlight & Rear Tail Light, New Handle Bars, Grips, Front Fender, and Gripper Seat. I have the original front fender, handle bars, and seat cover. The carb. has been serviced and cleaned. Cash Only. Don't need help selling. Call or Text",
                "https://images.craigslist.org/00y0y_3WFGTjZoP1r_600x450.jpg", 1250));

        vehicles.add(new Vehicle("Toyota", TypeOfVehicle.CAR,
                "1999 Toyota Solara for sale, runs and drive. Car has 200k Miles. I'm selling the car AS IS. Needs a tune up",
                "https://images.craigslist.org/00V0V_3vRlPSXymd_600x450.jpg", 1300));
        vehicles.add(new Vehicle("Honda", TypeOfVehicle.CAR, "I am selling a Nice 2005 Honda Pilot EX with Only 132K miles. This Vehicle runs and drive great. Good tires and cold AC. This Vehicle is very dependable and reliable transportation to anywhere you need to go. 3rd Rear Seat, 4WD/AWD, ABS Brakes, Air Conditioning, Alloy Wheels, AM/FM Stereo, Automatic Transmission.",
                "https://images.craigslist.org/00u0u_8b6zq04ay8e_600x450.jpg", 1500));

        vehicles.add(new Vehicle("Corvette", TypeOfVehicle.CAR, "16 ZO6 Corvette Convertible/w LZ 3 package, front and rear cameras, track recorder, heated and cooled seats, 1 of 123 made with these options which includes Twilight Blue package, blue top, blue leather interior, power everything, rack stored, dry Southwest climate, senior owned.",
                "https://images.craigslist.org/00B0B_gsJTLdBgzhM_600x450.jpg", 9000));

        vehicles.add(new Vehicle("Boston Whaler", TypeOfVehicle.BOAT, "1981 boston whaler 13.8 ft, sat for 8 years, so to make her right again here is a list , that now makes her turn key for water anytime.gutted to bear hull, all wood redone with 5 coats marine urethane, all new wiring , except controls they are in like new condition, new fuse box,bilge pump, orig lights rewired and work, all new steering , helm /cable, needs new cushion kit.",
                "https://images.craigslist.org/00H0H_11A7vW7sRQP_600x450.jpg", 560));
    }

    public List<Vehicle>getVehicles(){
        return vehicles;
    }

    public Vehicle findByName(String name){
        for (Vehicle vehicle: vehicles) {
            if(vehicle.getName().equals(name)){
                return vehicle;
            }
        }
        return null;
    }

    public void add(Vehicle vehicle){
        vehicles.add(vehicle);
    }
}
