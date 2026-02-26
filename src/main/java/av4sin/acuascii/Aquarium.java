package av4sin.acuascii;

public class Aquarium {
    
    private int[] size;
    private char[][] aquarium;

    public Aquarium(int weight, int height){
        this.size[0] = weight;
        this.size[1] = height;
        this.aquarium = new char[this.size[0]][this.size[1]];
    }

    public boolean changeSize(int weight, int height){
        this.size[0] = weight;
        this.size[1] = height;
        return true;
    }

    public boolean clear(){
        for(int i=0; i<this.size[0]; i++){
            for(int j=0; j<this.size[1]; j++){
                this.aquarium[i][j] = ' ';
            }
        }
        return true;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        return sb.toString();
    }
}