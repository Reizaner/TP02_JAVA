/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Reserva {
    private Habitacion habi;
    private Cliente cli;
    private LocalDate checkin;
    private LocalDate checkout;

    public Habitacion getHabi() {
        return habi;
    }

    public void setHabi(Habitacion habi) {
        this.habi = habi;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }
    
    
    
}
