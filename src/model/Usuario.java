package model;

public class Usuario {
    protected Integer id;
    protected int pin;

    // PARA HACER: Getters y Setters
    // Implementar un constructor que tome un ID

    public Usuario(Integer id) {
        this.id = id;
    }

    public Usuario() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
