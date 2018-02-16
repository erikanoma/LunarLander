//author@ Erika Noma, 2017-04-04, CS201
//simulation of lunar lander spaceship that lands on the moon.


public class LunarLander{
  private int altitude;
  private int velocity;
  private int fuel;
  private final int ADD_GRAVITY = 2;
  private final int FUEL_LOSS = 1; //fuel decreases as thrust() is called
  private final int VELOCITY_DECREASE = 4;

  public LunarLander(int altitude, int velocity, int fuel){
    this.altitude = altitude;
    this.velocity = velocity;
    this.fuel = fuel;
  }

  public LunarLander(){
    this(1000, 40, 25);
  }
  //returns the altitude of your lander
  public int getAltitude(){
    return altitude;
  }
  //returns the velocity of your lander
  public int getVelocity(){
    return velocity;
  }
  //returns the units of fuel left in your lander
  public int getFuel(){
    return fuel;
  }
  //Applies one unit of fuel to give thrust to the ship,
  //and decreases the velocity by 4 meters/sec
  public void thrust(){
    fuel -= FUEL_LOSS;
    velocity -= VELOCITY_DECREASE;
  }
  //simulate one complete second of activity,
  //where the astronaut has requested to burn fuelUnits units of fuel.
  public void doOneSecond(int fuelUnits){
    velocity += ADD_GRAVITY;

    if (fuelUnits > 0){
      if (fuelUnits > this.getFuel()){
        fuelUnits = this.getFuel();
      }
      for (int i = 0; i < fuelUnits; i++){
        this.thrust();
      }
    }
      altitude -= velocity;
    }

  public void printNumbers(){
    System.out.println("Alt = " + this.getAltitude() + " Vel = " + this.getVelocity() + " Fuel = " + this.getFuel());
  }
  //Set altitude to zero so it will not print out the negative altitude at the end
  public void setAltitude(int a){
    altitude = a;
  }


  }
