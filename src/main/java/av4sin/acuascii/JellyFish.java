package av4sin.acuascii;

public class JellyFish extends Fish {

    public JellyFish(int seed){
        super(seed); //TODO: change the magic number in order to solve errors
        silueteRight = new String[]{" (___) ", "  | |  "};
        silueteLeft = new String[]{" (___) ", "  / \\  "};
    }

}
