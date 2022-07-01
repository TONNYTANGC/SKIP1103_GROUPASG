/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookingSystem;

/**
 *
 * @author User
 */
public class Rooms extends User {

    private String room;
    private double price;

    public Rooms(String room, double price) {
        super(name, Career, discount);
        this.room = room;
        this.price = price;
    }

    public double getPrice(String name) {
        if (name.equals("DKG 4/1")) {
            price = 0.2;
        } else if (name.equals("DKG 4/2")) {
            price = 0.3;
        } else if (name.equals("DKG 4/3")) {
            price = 0.25;
        } else if (name.equals("DKG 4/4")) {
            price = 0.35;
        } else if (name.equals("DKG 4/5")) {
            price = 0.3;
        } else if (name.equals("DKG 4/6")) {
            price = 0.1;
        }
        return price;
    }

}
