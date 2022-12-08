
package atividade3;

public class Funcionario implements IFuncionario{
    protected String nome;
    protected String cpf;
    protected String endereco;
    protected String telefone;
    protected String setor;
    protected double salario;
    protected boolean horista;
    protected double horasTrabalhadas;

    public Funcionario(double salario){
        this.salario = salario;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public String getSetor(){
        return this.setor;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public double setHorasTrabalhadas(double horas){
        this.horasTrabalhadas = horas;
        return this.horasTrabalhadas;
    }
    
    public double getHorasTrabalhadas(){
        return this.horasTrabalhadas;
    }
    
    @Override
    public void mostrarTudo(){
        System.out.println(getNome());
        System.out.println(getCpf());
        System.out.println(getEndereco());
        System.out.println(getTelefone());
        System.out.println(getSetor());
        System.out.println(getSalario());
    }
    
    @Override
    public void aumento(double porcentagem){
        salario += (salario*(porcentagem/100));
        System.out.println("Voce aumentou "+porcentagem+"% do seu salário");
    }
}
