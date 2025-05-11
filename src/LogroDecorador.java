public abstract class LogroDecorador implements Logro{
    protected Logro logro;
    public LogroDecorador(Logro logro) {
        this.logro = logro;
    }
}
