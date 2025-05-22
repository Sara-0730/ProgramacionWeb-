public class MacFactory implements GUIFactory {
    public Boton crearBoton() {
        return new BotonMac();
    }
    public Ventana crearVentana() {
        return new VentanaMac();
    }
}