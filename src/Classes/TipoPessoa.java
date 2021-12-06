package Classes;

public enum TipoPessoa {
    PESSOA_FISICA(1, "Pessoa Fisica"), PESSOA_JURIDICA(2, "Pessoa Juridica")
            {public String getPessoa () {return "Pessoa Juridica";}};
    int codigo;
    String pessoa;

    private TipoPessoa(int codigo, String pessoa){
        this.codigo = codigo;
        this.pessoa = pessoa;
    }

    public String getPessoa () {return "Pessoa Fisica";};
}
