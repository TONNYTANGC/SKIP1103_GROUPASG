/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookingSystem;
/**
 *
 * @author User
 */
public class User {

    static String name, Career;
    static double discount;

    public User(String name, String Career, double discount) {
        this.name = name;
        this.Career = Career;
        this.discount = discount;
    }

    public double getDiscount(String Career) {
        if (Career.equalsIgnoreCase("Lecturer")) {
            discount = 5.0;
        } else if (Career.equalsIgnoreCase("Student")) {
            discount = 0.0;
        }

        return discount;
    }

}
