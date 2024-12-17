package Q9.Entidades;

public class PessoaQ9 {
    String nome;
    int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public PessoaQ9(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
