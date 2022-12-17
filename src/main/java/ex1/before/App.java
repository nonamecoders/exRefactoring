package ex1;

public class App {

    public static void main(String[] args) {
        Customer c1 = new Customer("ym1");
        c1.addRental(new Rental(new Movie("movie1", Movie.CHILDREN),1));
        c1.addRental(new Rental(new Movie("movie2", Movie.CHILDREN),4));

        System.out.println(c1.statement());
        System.out.println("-----------------");

        Customer c2 = new Customer("ym2");
        c2.addRental(new Rental(new Movie("movie3", Movie.REGULAR),1));
        c2.addRental(new Rental(new Movie("movie4", Movie.CHILDREN),5));

        System.out.println(c2.statement());
        System.out.println("-----------------");

        Customer c3 = new Customer("ym3");
        c3.addRental(new Rental(new Movie("movie5", Movie.NEW_RELEASE),2));
        c3.addRental(new Rental(new Movie("movie6", Movie.NEW_RELEASE),6));

        System.out.println(c3.statement());
        System.out.println("-----------------");
    }
}
