package av4sin.acuascii;

public class Main {
    public static void main(String[] args) throws AcuasciiException{
        Aquarium aquarium = new Aquarium(60, 15);
        aquarium.createLife(33);
        System.out.println(aquarium.toString());
    }
}
