public class NomeInvalidoException extends RuntimeException{
    @Override
    public String getMessage() {
        return "Nome inválido";
    }
}
