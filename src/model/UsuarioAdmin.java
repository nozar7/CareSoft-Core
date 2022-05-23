package model;

import interfaces.AdminCompatibleConHIPAA;
import interfaces.UsuarioCompatibleConHIPAA;

import java.util.ArrayList;
import java.util.Date;

public class UsuarioAdmin extends Usuario implements UsuarioCompatibleConHIPAA, AdminCompatibleConHIPAA {

    //... importa definición de clase...

    // Dentro de la clase:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;

    public UsuarioAdmin(Integer id) {
        super(id);
    }

    // PARA HACER: Implementar un constructor que tome un ID y un rol
    public UsuarioAdmin(Integer employeeID, String role) {
        this.employeeID = employeeID;
        this.role = role;
    }

    // PARA HACER: ¡Implementar UsuarioCompatibleConHIPAA!
    public boolean assignPin(int pin) {
        String numeroPin = String.valueOf(pin);
        if(numeroPin.length() < 6) {
            return false;
        }
        this.pin = pin;
        return true;
    }

    public boolean accessAuthorized(Integer confirmedAuthID) {
        if (confirmedAuthID == this.id) {
            return true;
        }
        return false;
    }
    // PARA HACER: ¡Implementar AdminCompatibleConHIPAA
    public ArrayList<String> reportSecurityIncidents() {
        return this.securityIncidents;
    }

    public void newIncident(String notes) {
        String report = String.format(
                "Fecha y hora de envío: %s \n, Reportado por ID: %s\n Notas: %s \n",
                new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
                "Fecha y hora de envío: %s \n, ID: %s\n Notas: %s \n",
                new Date(), this.id, "FALLÓ EL INTENTO DE AUTORIZACIÓN PARA ESTE USUARIO"
        );
        securityIncidents.add(report);
    }


    // PARA HACER: Setters y Getters

}
