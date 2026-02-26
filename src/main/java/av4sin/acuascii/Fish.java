package av4sin.acuascii;

import java.util.Random;

public class Fish {

    String siluete;
    
    public Fish(){

    }

    public String reverse(){
        return siluete;
    }

    public Fish getRandom(int seed) throws AcuasciiException{
        Random rand = new Random(seed);
        int selection = rand.nextInt(3);
        Fish fish;
        switch (selection) {
            case 0:
                fish = new ClownFish();
                break;
            
            case 1:
                fish = new WhaleFish();
                break;

            case 2:
                fish = new JellyFish();
                break;
            default:
                throw new AcuasciiException("The random number generated has been wrong: " + selection);
        }
        return fish;
    }

    public String toString(){
        return siluete;
    }

}
