package model;
import interfaces.UsuarioCompatibleConHIPAA;

import java.util.ArrayList;

public class Physician extends Usuario implements UsuarioCompatibleConHIPAA {
    public Physician(Integer id) {
        super(id);
    }

    @Override
    public boolean assignPin(int pin) {
        String numeroPin = String.valueOf(pin);
        if(numeroPin.length() < 6) {
            return false;
        }
        this.pin = pin;
        return true;
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        if (confirmedAuthID == this.id) {
            return true;
        }
        return false;
    }

}
