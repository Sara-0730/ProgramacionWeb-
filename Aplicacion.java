public class Aplicacion {
    private Boton boton;
    private Ventana ventana;

    public Aplicacion(GUIFactory factory) {
        boton = factory.crearBoton();
        ventana = factory.crearVentana();
    }

    public void pintar() {
        boton.pintar();
        ventana.abrir();
    }
}