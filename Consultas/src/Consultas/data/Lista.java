package Consultas.data;

import javax.swing.table.DefaultTableModel;

public class Lista {

    public static Lista getLista() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
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

    public DefaultTableModel getConsulta(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
