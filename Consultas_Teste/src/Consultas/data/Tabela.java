package Consultas.data;

import Consultas.Screen.Index;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tabela {
    private final String[] tableColumns = {"Paciente","CPF", "Telefone", "Data","Já era paciente?", "Consulta Realizada"};

    private static final List<Lista> lista = new ArrayList<>();
    DefaultTableModel model = new DefaultTableModel(tableColumns,0);
    JTable table = new JTable();
    
    public List<Lista> getLista(){
        return lista;
    }
    
    public void Adicionar(Lista aluno){
        lista.add(aluno);
    }

}
