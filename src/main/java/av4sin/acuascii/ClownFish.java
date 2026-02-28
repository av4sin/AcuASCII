package av4sin.acuascii;

public class ClownFish extends Fish{

    public ClownFish(int seed){
        super(seed); //TODO: change the magic number in order to solve errors
        silueteRight = new String[]{"  _ ", "><_>"};
        silueteLeft = new String[]{" _  ", "<_><"};
    }

}
