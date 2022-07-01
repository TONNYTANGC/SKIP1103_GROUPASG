/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookingSystem;

/**
 *
 * @author User
 */
public class BookingList {

    private static Booking[] bookinglist;
    private static int count;

    public BookingList(int n) {
        bookinglist = new Booking[n];
        count = 0;
    }

    public void add(String room, String user, String date, String start, String end, int duration, double cost) {
        bookinglist[count] = new Booking(room, user, date, start, end, duration, cost);
        count++;
    }

    public void delete(int row) {
        bookinglist[row + 1] = bookinglist[count - 1];//row got probelm array out of bounds
        count--;

    }

    public void update(int row, String room, String user, String date, String start, String end, int duration, double cost) {
        bookinglist[row] = new Booking(room, user, date, start, end, duration, cost);
    }

    public int search(String user) {

        int loc = 0;

        for (int i = 0; i < count; i++) {
            if (bookinglist[i].getUser().equalsIgnoreCase(user)) {
                loc = i;
            }
        }

        return loc;
    }

}
