//author@ Erika Noma, 2017-04-04, CS201
//controls how the simulation works


import java.util.Scanner;

public class Simulation{

  public static void main(String[] args){

  LunarLander ufo = new LunarLander();

  Scanner kb = new Scanner(System.in);

  System.out.println("Welcome to Lunar Lander!");
  //while the updated altitude is above zero, print out current state of Alt, Vel,and Fuel
  while (ufo.getAltitude() > 0){
    ufo.printNumbers();
    System.out.print("How much thrust this round? ");
    int fuelUnits = kb.nextInt();
    ufo.doOneSecond(fuelUnits);
    //automatically exits the program if the user types in -1
    if (fuelUnits == -1){
      System.exit(0);
    }
  }
 //when the altitude goes below 0, it sets it to 0
  ufo.setAltitude(0);
  ufo.printNumbers();
  //if it lands with the velocity of 0 to 4, it lands successfully. IF not, it crushes.
  if (ufo.getVelocity() <= 4){
    System.out.println("Spaceship landed successfully!");
  }
  else if (ufo.getVelocity() > 5){
    System.out.println("Spaceship crushed...");
  }

  }
}
