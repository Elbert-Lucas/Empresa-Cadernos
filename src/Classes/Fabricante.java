package Classes;

public class Fabricante extends Funcionarios {

    private int cadernosFabricados;
    public Fabricante (String nome, String codigo, int idade, double salario, int cadernosFabricados, TipoPessoa tipoPessoa){
        super(nome, codigo, idade,salario, tipoPessoa);
        this.cadernosFabricados = cadernosFabricados;
    }

    @Override
    public String toString() {
        return "Fabricante{" +
                "cadernosFabricados=" + cadernosFabricados +
                ", nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", idade=" + idade +
                ", tipoPessoa=" + tipoPessoa +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void calculaSalario() {
        salario = salario + cadernosFabricados * 0.15;
    }
}
