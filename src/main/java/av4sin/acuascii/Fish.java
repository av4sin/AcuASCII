package av4sin.acuascii;

import java.util.Random;

public class Fish {

    protected String[] silueteRight;
    protected String[] silueteLeft;
    private String[] skin;
    private Direction direction;
    private Random rand;
    
    public Fish(int seed){
        this.direction = Direction.RIGHT;
        rand = new Random(seed);
        if(rand.nextInt(2) == 0){
            changeDirection();
        }
    }

    private boolean changeDirection(){
        this.direction = (this.direction == Direction.LEFT) ? Direction.RIGHT : Direction.LEFT;
        return true;
    }

    public Fish getRandom() throws AcuasciiException{
        int selection = rand.nextInt(3);
        switch (selection) {
            case 0: 
                return new ClownFish();
            case 1: 
                return new WhaleFish();
            case 2: 
                return new JellyFish();
            
            default:
                throw new AcuasciiException("The random number generated has been wrong: " + selection);
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        skin = (this.direction == Direction.RIGHT) ? silueteRight : silueteLeft;
        for(String line : skin){
            sb.append(line).append("\n");
        }
        return sb.toString();
    }

}
