package Q11.Entidades;

public class PessoaQ11 {

    public PessoaQ11(String sexo, double altura) {
        this.sexo = sexo;
        this.altura = altura;
    }

    public String sexo;

    public double altura;



    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
