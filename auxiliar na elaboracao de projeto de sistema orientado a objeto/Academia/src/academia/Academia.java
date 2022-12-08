package academia;

public class Academia {

    public static void main(String[] args) {
        Velocidade vel = new Velocidade();
        Resistencia res = new Resistencia();
        
        Intermediador i1 = new Intermediador(vel);
        i1.corrida();
        System.out.println(" ");
        Intermediador i2 = new Intermediador(res);
        i2.musculacao();
    }
    
}
