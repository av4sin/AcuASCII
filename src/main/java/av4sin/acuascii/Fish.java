package av4sin.acuascii;

import java.util.Random;

public class Fish {

    protected String[] silueteRight;
    protected String[] silueteLeft;
    private String[] skin;
    private Direction direction;
    
    public Fish(int seed){
        this.direction = Direction.RIGHT;
        skin = silueteRight;
        Random rand = new Random(seed);
        if(rand.nextInt(2) == 0){
            changeDirection();
        }
    }

    private boolean changeDirection(){
        if(this.direction == Direction.LEFT){
            this.direction = Direction.RIGHT;
            skin = silueteRight;
            return true;
        } else if(this.direction == Direction.RIGHT){
            this.direction = Direction.LEFT;
            skin = silueteLeft;
            return true;
        } else{
            return false;
        }
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

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(String line : skin){
            sb.append(line).append("\n");
        }
        return sb.toString();
    }

}
