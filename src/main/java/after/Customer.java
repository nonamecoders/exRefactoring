package after;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String htmlStatement() {
        Enumeration rentals = this._rentals.elements();
        String result = "<H1>Rental Record for <EM>" + this.getName() + "</EM></H1>\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental)rentals.nextElement();

            // 이 대여에 대한 요금 계산 결과 표시
            result += each.getMovie().getTitle() + ": " +
                    String.valueOf(each.getCharge()) + "<BR>\n";

        }

        // 풋터(footer) 추가
        result += "<P>Amount owed is <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
        result += "You earned <EM>" + String.valueOf(getTotalRenterPoints()) +
                "</EM> frequent renter points<P>";
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        Enumeration retals = this._rentals.elements();
        while(retals.hasMoreElements()) {
            Rental each = (Rental) retals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    private double getTotalRenterPoints() {
        double result = 0;
        Enumeration rentals = this._rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }
}