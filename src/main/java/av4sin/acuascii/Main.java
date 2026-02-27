package av4sin.acuascii;

public class Main {
    public static void main(String[] args) throws AcuasciiException{
        Aquarium aquarium = new Aquarium(60, 15);
        aquarium.createLife((int)System.currentTimeMillis());
        System.out.println(aquarium.toString());
    }
}
