package Classes;

public abstract class Funcionarios {
    protected String nome;
    protected String codigo;
    protected int idade;
    protected TipoPessoa tipoPessoa;


    public String mensagem() {
        return "Funcionarios{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", idade=" + idade +
                ", tipoPessoa=" + tipoPessoa +
                ", salario=" + salario +
                '}';
    }

    protected double salario;

    public Funcionarios (String nome, String codigo, int idade, double salario, TipoPessoa tipoPessoa){
        this.nome = nome;
        this.codigo = codigo;
        this.idade = idade;
        this.salario = salario;
        this.tipoPessoa = tipoPessoa;
    }
    public  abstract void calculaSalario ();


    public void setNome (String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setCodigo (String codigo){
        this.codigo = codigo;
    }
    public String getCodigo(){
        return this.codigo;
    }
    public void setIdade (int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }

    public void setSalario (double salario){
        this.salario = salario;
    }
    public double getSalario (){
        return this.salario;
    }
}
