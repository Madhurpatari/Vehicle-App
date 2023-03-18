


public class Vehicle{
    private String name;
    private int currentSpeed;
    private int currentDirection;
    
    //A empty constructor
    public Vehicle(){

    }

    public Vehicle(String name){
        this.name = name;
        this.currentSpeed =0;
        this.currentDirection = 0;
    }

    public void steer(int direction){ //steering method
        this.currentDirection += direction;
        System.out.println("Steer method called "+currentDirection+" degrees");
    }

    public void move(int speed, int direction){ //method for moving the car
        currentSpeed = speed;
        currentDirection = direction;
        System.out.println("Move method called: Moving at "+currentSpeed + " in direction "+ currentDirection+ " degrees");
    }

    public void stop(){ //to stop the car
        this.currentSpeed = 0;
        System.out.println("The vehicle is stopped");
    }

    //Getters and Setters

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setCurrentSpeed(int currentSpeed){
        this.currentSpeed = currentSpeed;
    }
    public int getCurrentSpeed(){
        return currentSpeed;
    }

    public void setCurrentDirection(int currentDirection){
        this.currentDirection = currentDirection;
    }
    public int getCurrentDirection(){
        return currentDirection;
    }


}