public class ConSonido extends LogroDecorador{
    public ConSonido(Logro logro) {
        super(logro);
    }
    @Override
    public void mostrar(){
        logro.mostrar();
        System.out.println("Se reproduce un sonido al desbloquear el logro.");
    }
}
