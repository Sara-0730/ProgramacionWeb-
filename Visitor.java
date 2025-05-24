public interface Visitor {
    void visitar(Alimento alimento);
    void visitar(Tecnologia tecnologia);
    void visitar(Servicio servicio);
}