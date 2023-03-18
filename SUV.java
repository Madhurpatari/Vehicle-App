public class SUV extends Car{

    public SUV() {
    }

    public SUV(String name, boolean isManual) {
        super(name, 4, "SUV", 5, 6, isManual);
    }

    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed()+rate;
        /*
         * if speed is 0-10 gear is 1
         * if speed is 10-20 gear is 2
         * if speed is 20-30 gear is 3
         * if speed is 30-50 gear is 4
         * if speed is 50-70 gear is 5
         * 6
         */
        if(newSpeed == 0){
            stop();
            changeGear(1);
        }
        else if(newSpeed >0 && newSpeed <= 10){
            changeGear(1);
        }
        else if(newSpeed >10 && newSpeed <= 20){
            changeGear(2);
        }
        else if(newSpeed >20 && newSpeed <= 30){
            changeGear(3);
        }
        else if(newSpeed >30 && newSpeed <= 50){
            changeGear(4);
        }
        else if(newSpeed >50 && newSpeed <= 70){
            changeGear(5);
        }else{
            changeGear(6);
        }

        if(newSpeed > 0){
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
