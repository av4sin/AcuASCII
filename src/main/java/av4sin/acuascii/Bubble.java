package av4sin.acuascii;

public class Bubble {

    private String bb;
    
    public Bubble(int type) throws AcuasciiException{
        if(type == 0){
            bb = "o";
        } else if(type == 1){
            bb = "O";
        } else{
            throw new AcuasciiException("The type of bubble is not correct, must be 0/1");
        }
    }

    public String toString(){
        return bb;
    }
}
