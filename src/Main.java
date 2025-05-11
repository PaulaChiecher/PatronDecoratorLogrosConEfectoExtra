public class Main {
    public static void main(String[] args) {
        LogroBasico logro1 = new LogroBasico("Primer logro");
        Logro logroDecorado = new ConAnimacion(
            new ConSonido(
                    new ConMensajeEspecial(logro1)
            )
        );
        logroDecorado.mostrar();
        System.out.println("Logros totales creados: " + LogroBasico.getTotalLogros());
    }
}
