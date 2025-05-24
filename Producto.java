import java.util.ArrayList;
import java.util.List;

public class Producto implements Subject {
    private String nombre;
    private double descuento;
    private List<Observer> observers;

    public Producto(String nombre) {
        this.nombre = nombre;
        this.descuento = 0.0;
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(nombre, descuento);
        }
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
        System.out.println("El producto " + nombre + " ahora tiene un descuento de " + descuento + "%");
        notifyObservers();
    }
}