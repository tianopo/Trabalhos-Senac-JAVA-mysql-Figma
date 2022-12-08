package academia;
public class Resistencia implements Categorias{
    
    @Override
    public void corrida(){
        System.out.println("10 km velocidade leve");
    }
            
    @Override
    public void musculacao(){
    System.out.println("5 minutos subindo escada");
    }
}
