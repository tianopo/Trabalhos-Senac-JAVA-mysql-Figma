package academia;

public class Intermediador {
    private Categorias intermediador;
    
    public Intermediador(Categorias intermediador){
        super();
        this.intermediador = intermediador;
    }
    
    public Categorias getInt(){
        return intermediador;
    }
    
    public void setInt1(Categorias inte){
        this.intermediador = inte;
    }
    
    public void corrida(){
        intermediador.corrida();
    }
    
    public void musculacao(){
        intermediador.musculacao();
    }
}
