public class ConAnimacion extends LogroDecorador{
    public ConAnimacion(Logro logro) {
        super(logro);
    }
    @Override
    public void mostrar(){
        logro.mostrar();
        System.out.println("Se procude una animación al desbloquear el logro.");
    }
}
