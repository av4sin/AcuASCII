package av4sin.acuascii;

public class Aquarium {
    
    private int width;
    private int height;
    private char[][] aquarium;

    public Aquarium(int width, int height){
        this.width = width;
        this.height = height;
        this.aquarium = new char[this.height][this.width];
        clear();
    }

    public boolean changeSize(int width, int height){
        this.width = width;
        this.height = height;
        this.aquarium = new char[this.height][this.width];
        return true;
    }

    public boolean clear(){
        for(int i=0; i<this.height; i++){
            for(int j=0; j<this.width; j++){
                this.aquarium[i][j] = ' ';
            }
        }
        return true;
    }

    public boolean addElement(int x, int y, String asciiString) throws AcuasciiException{
        if(x>=width || y>=height){
            throw new AcuasciiException("Los valores de la posición del elemento "+asciiString+" se encuentran fuera de los valores permitidos.");
        }
        String[] element = asciiString.split("\n");
        for(int i=0; i<element.length; i++){
            int posY = y+i;
            if(posY >=0 && posY <this.height){
                for(int j=0; j<element[i].length(); j++){
                    int posX = x+j;
                    if(posX>=0 && posX<this.width){
                        this.aquarium[posY][posX] = element[i].charAt(j);
                    } else{
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<this.width; i++){
            sb.append("-");
        }
        sb.append("\n");
        for(int i=0; i<this.height; i++){
            sb.append("|");
            for(int j=0; j<this.width; j++){
                sb.append(aquarium[i][j]);
            }
            sb.append("|\n");
        }
        for(int i=0; i<this.width; i++){
            sb.append("-");
        }
        return sb.toString();
    }
}