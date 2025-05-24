public class ImpuestoVisitor implements Visitor {
    public void visitar(Alimento alimento) {
        double impuesto = alimento.getPrecio() * 0.05;
        System.out.println("Impuesto para alimento: $" + impuesto);
    }

    public void visitar(Tecnologia tecnologia) {
        double impuesto = tecnologia.getPrecio() * 0.18;
        System.out.println("Impuesto para tecnología: $" + impuesto);
    }

    public void visitar(Servicio servicio) {
        double impuesto = servicio.getPrecio() * 0.10;
        System.out.println("Impuesto para servicio: $" + impuesto);
    }
}