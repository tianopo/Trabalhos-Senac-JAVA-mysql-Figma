package Consultas.data;

import Consultas.Screen.Index;
import java.util.ArrayList;
import java.util.List;

public class Tabela {
    private final String[] tableColumns = {"Paciente","CPF", "Telefone", "Data","Já era paciente?", "Consulta Realizada"};

    private static final List<Lista> lista = new ArrayList<>();

    public static List<Lista> getLista(){
        return lista;
    }
    
    public void Adicionar(Lista pac){
        lista.add(pac);
    }

}
