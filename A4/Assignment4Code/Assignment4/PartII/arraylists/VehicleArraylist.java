package arraylists;
import java.util.ArrayList;

import vehicles.*;

public class VehicleArraylist {

	public static void main(String[] args) {
		// this ArrayList MUST be parameterized
		//ArrayList vehiclesArrayList;
		ArrayList<Vehicle> vehiclesArrayList = new ArrayList<Vehicle>();
		
		// this is the variable you should retain to compare
		// to the other objects in the arraylist
		Car blueCar = new Car(4,20,"blue");
		
		//A
		
		Motorcycle moto1 = new Motorcycle("red");
		moto1.setAcc("grip warmers");
		moto1.setAcc("usb charger");
		//System.out.println(moto1.toString());
		
		Car car2 = new Car(4,20,"blue");
		Car car3 = new Car(4,20,"blue");
		//System.out.println(car2.toString());
		//System.out.println(car3.toString());
		
		Bicycle bike4 = new Bicycle("black",true);
		//System.out.println(bike4.toString());
		
		CargoCycle cycle5 = new CargoCycle("green",3,10,true);
		CargoCycle cycle6 = new CargoCycle("green",3,10,true);
		//System.out.println(cycle5.toString());
		//System.out.println(cycle6.toString());
		
		Car car7 = new Car(2,10,"gray");
		//System.out.println(car7.toString());
		
		Car car8 = new Car(4,25,"white");
		//System.out.println(car8.toString());
		
		vehiclesArrayList.add(moto1);
		vehiclesArrayList.add(car2);
		vehiclesArrayList.add(car3);
		vehiclesArrayList.add(bike4);
		vehiclesArrayList.add(cycle5);
		vehiclesArrayList.add(cycle6);
		vehiclesArrayList.add(car7);
		vehiclesArrayList.add(car8);
		
		//B
		double sum = 0;
		int count = 0;
		for(int i = 0; i < vehiclesArrayList.size(); i++) {
			if (vehiclesArrayList.get(i).getClass() == blueCar.getClass()) {
				count = count + 1;
				sum = sum + vehiclesArrayList.get(i).getSpace();
			}
		}
		System.out.println("Part B");
		System.out.println("Average Car Cargo Space: " + sum/count);
		
		//C
		System.out.println("Part C");
		for(int i = 0; i < vehiclesArrayList.size(); i++) {
			for(int j = i+1; j < vehiclesArrayList.size(); j++) {
				if(vehiclesArrayList.get(i).equals(vehiclesArrayList.get(j))) {
					System.out.println("These 2 objects are equal");
					System.out.println(vehiclesArrayList.get(i));
					System.out.println(vehiclesArrayList.get(j));
					vehiclesArrayList.remove(j);
				}
			}
		}
		
		//D
		System.out.println("Part D");
		for(int i = 0; i < vehiclesArrayList.size(); i++) {
			System.out.println(vehiclesArrayList.get(i));
		}
	}

}
