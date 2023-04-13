package Consultas.data;

public class Lista {
    String nome;
    String telefone;
    String cpf;
    String data;
    String anterior;
    String consulta;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }  
    
    public String getData(){
        return data;
    }
    
    public void setData(String data){
        this.data = data;
    }
    
    public String getAnterior(){
        return anterior;
    }
    
    public void setAnterior(String anterior){
        this.anterior = anterior;
    }
    
    public String getConsulta(){
        return consulta;
    }
    
    public void setConsulta(String consulta){
        this.consulta = consulta;
    }
}
