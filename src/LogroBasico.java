// LogroBasico.java
public class LogroBasico implements Logro {
    private String mensaje;
    private static int contador = 0; // metodo static para contar los logros
    public LogroBasico(String mensaje) {
        this.mensaje = mensaje;
        contador++;
    }
    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    // Sobrecarga
    public void setMensaje() {
        this.mensaje = "Logro desbloqueado sin descripción.";
    }
    public static int getTotalLogros() {
        return contador;
    }
    @Override
    public void mostrar() {
        System.out.println("Logro Desbloqueado: " + mensaje);
    }
}
