package Classes;

public class Gerente extends Funcionarios {


    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", idade=" + idade +
                ", tipoPessoa=" + tipoPessoa +
                ", salario=" + salario +
                '}';
    }

    public Gerente(String nome, String codigo, int idade, double salario, TipoPessoa tipoPessoa) {
        super(nome, codigo, idade, salario, tipoPessoa);
    }

    @Override
    public void calculaSalario (){}
}
