package av4sin.acuascii;

public class WhaleFish extends Fish{

    public WhaleFish(int seed){
        super(seed); //TODO: change the magic number in order to solve errors
        silueteLeft = new String[]{" __v_   ", "(____\\/{"};
        silueteRight = new String[]{"   _v__ ", "}\\/____)"};
    }

}
