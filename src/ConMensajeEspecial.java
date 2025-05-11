public class ConMensajeEspecial extends LogroDecorador {
    public ConMensajeEspecial(Logro logro) {
        super(logro);
    }
    @Override
    public void mostrar(){
        logro.mostrar();
        System.out.println("¡Has desbloqueado un logro especial!");
    }
}
