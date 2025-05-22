public class WindowsFactory implements GUIFactory {
    @Override
    public Boton crearBoton() {
        return new BotonWindows();
    }
    @Override
    public Ventana crearVentana() {
        return new VentanaWindows();
    }
}