package av4sin.acuascii;

public class Algae {

    private int height;
    
    public Algae(int height){
        this.height = height;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<height; i++){
            if(i%2==0){
                sb.append("(");
            } else{
                sb.append(")");
            }
        }
        return sb.toString();
    }
}