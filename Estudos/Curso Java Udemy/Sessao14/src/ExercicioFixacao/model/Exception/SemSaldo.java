package ExercicioFixacao.model.Exception;

public class SemSaldo extends RuntimeException {
    public SemSaldo(String msg) {
        super(msg);
    }
}
