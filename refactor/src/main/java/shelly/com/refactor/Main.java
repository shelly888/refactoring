package shelly.com.refactor;

import shelly.com.refactor.original.Customer;
import shelly.com.refactor.original.Movie;
import shelly.com.refactor.original.Rental;
import shelly.com.refactor.v1.Customer_v1;
import shelly.com.refactor.v10.Customer_v10;
import shelly.com.refactor.v10.Movie_v10;
import shelly.com.refactor.v10.Rental_v10;
import shelly.com.refactor.v11.Customer_v11;
import shelly.com.refactor.v11.Movie_v11;
import shelly.com.refactor.v11.Rental_v11;
import shelly.com.refactor.v2.Customer_v2;
import shelly.com.refactor.v3.Customer_v3;
import shelly.com.refactor.v3.Rental_v3;
import shelly.com.refactor.v4.Customer_v4;
import shelly.com.refactor.v5.Customer_v5;
import shelly.com.refactor.v6.Customer_v6;
import shelly.com.refactor.v6.Rental_v6;
import shelly.com.refactor.v7.Customer_v7;
import shelly.com.refactor.v8.Customer_v8;
import shelly.com.refactor.v8.Movie_v8;
import shelly.com.refactor.v8.Rental_v8;
import shelly.com.refactor.v9.Customer_v9;
import shelly.com.refactor.v9.Movie_v9;
import shelly.com.refactor.v9.Rental_v9;

public class Main {


    public static void main(String[] args) {
//        run();
        System.out.println("---------- original result ---------- ");
        test();
//        System.out.println("\n ------------- v1 result ------------- ");
//        test_v1();
//        System.out.println("\n------------- v2 result ------------- ");
//        test_v2();

//        System.out.println("\n------------- v3 result ------------- ");
//        test_v3();

//        System.out.println("\n------------- v7 result ------------- ");
//        test_v7();

//        System.out.println("\n------------- v8 result ------------- ");
//        test_v8();

//        System.out.println("\n------------- v9 result ------------- ");
//        test_v9();

//        System.out.println("\n------------- v10 result ------------- ");
//        test_v10();

        System.out.println("\n------------- v11 result ------------- ");
        test_v11();
    }

    private static void  run() {
        Customer customer = new Customer("Shelly");
        Movie movie = new Movie("手机", 2);
        Rental rental = new Rental(movie, 5);
        customer.addRental(rental);
        System.out.println(customer.statement());
    }

    private static void test() {
        Customer customer = new Customer("小胖");
        Movie movie1 = new Movie("红海行动", Movie.REGULAR);
        Movie movie2 = new Movie("九层妖塔", Movie.NEW_RELEASE);
        Movie movie3 = new Movie("飞屋环游记", Movie.CHILDRENS);
        customer.addRental(new Rental(movie1, 4));
        customer.addRental(new Rental(movie2, 6));
        customer.addRental(new Rental(movie3, 10));
        System.out.println(customer.statement());
    }

    private static void test_v1() {
        Customer_v1 customer = new Customer_v1("小胖");
        Movie movie1 = new Movie("红海行动", Movie.REGULAR);
        Movie movie2 = new Movie("九层妖塔", Movie.NEW_RELEASE);
        Movie movie3 = new Movie("飞屋环游记", Movie.CHILDRENS);
        customer.addRental(new Rental(movie1, 4));
        customer.addRental(new Rental(movie2, 6));
        customer.addRental(new Rental(movie3, 10));
        System.out.println(customer.statement());
    }

    private static void test_v2() {
        Customer_v2 customer = new Customer_v2("小胖");
        Movie movie1 = new Movie("红海行动", Movie.REGULAR);
        Movie movie2 = new Movie("九层妖塔", Movie.NEW_RELEASE);
        Movie movie3 = new Movie("飞屋环游记", Movie.CHILDRENS);
        customer.addRental(new Rental(movie1, 4));
        customer.addRental(new Rental(movie2, 6));
        customer.addRental(new Rental(movie3, 10));
        System.out.println(customer.statement());
    }

    private static void test_v3() {
        Customer_v3 customer = new Customer_v3("小胖");
        Movie movie1 = new Movie("红海行动", Movie.REGULAR);
        Movie movie2 = new Movie("九层妖塔", Movie.NEW_RELEASE);
        Movie movie3 = new Movie("飞屋环游记", Movie.CHILDRENS);
        customer.addRental(new Rental_v3(movie1, 4));
        customer.addRental(new Rental_v3(movie2, 6));
        customer.addRental(new Rental_v3(movie3, 10));
        System.out.println(customer.statement());
    }
    private static void test_v4() {
        Customer_v4 customer = new Customer_v4("小胖");
        Movie movie1 = new Movie("红海行动", Movie.REGULAR);
        Movie movie2 = new Movie("九层妖塔", Movie.NEW_RELEASE);
        Movie movie3 = new Movie("飞屋环游记", Movie.CHILDRENS);
        customer.addRental(new Rental_v3(movie1, 4));
        customer.addRental(new Rental_v3(movie2, 6));
        customer.addRental(new Rental_v3(movie3, 10));
        System.out.println(customer.statement());
    }
    private static void test_v5() {
        Customer_v5 customer = new Customer_v5("小胖");
        Movie movie1 = new Movie("红海行动", Movie.REGULAR);
        Movie movie2 = new Movie("九层妖塔", Movie.NEW_RELEASE);
        Movie movie3 = new Movie("飞屋环游记", Movie.CHILDRENS);
        customer.addRental(new Rental_v3(movie1, 4));
        customer.addRental(new Rental_v3(movie2, 6));
        customer.addRental(new Rental_v3(movie3, 10));
        System.out.println(customer.statement());
    }
    private static void test_v6() {
        Customer_v6 customer = new Customer_v6("小胖");
        Movie movie1 = new Movie("红海行动", Movie.REGULAR);
        Movie movie2 = new Movie("九层妖塔", Movie.NEW_RELEASE);
        Movie movie3 = new Movie("飞屋环游记", Movie.CHILDRENS);
        customer.addRental(new Rental_v6(movie1, 4));
        customer.addRental(new Rental_v6(movie2, 6));
        customer.addRental(new Rental_v6(movie3, 10));
        System.out.println(customer.statement());
    }

    private static void test_v7() {
        Customer_v7 customer = new Customer_v7("小胖");
        Movie movie1 = new Movie("红海行动", Movie.REGULAR);
        Movie movie2 = new Movie("九层妖塔", Movie.NEW_RELEASE);
        Movie movie3 = new Movie("飞屋环游记", Movie.CHILDRENS);
        customer.addRental(new Rental_v6(movie1, 4));
        customer.addRental(new Rental_v6(movie2, 6));
        customer.addRental(new Rental_v6(movie3, 10));
        System.out.println(customer.statement());
    }

    private static void test_v8() {
        Customer_v8 customer = new Customer_v8("小胖");
        Movie_v8 movie1 = new Movie_v8("红海行动", Movie.REGULAR);
        Movie_v8 movie2 = new Movie_v8("九层妖塔", Movie.NEW_RELEASE);
        Movie_v8 movie3 = new Movie_v8("飞屋环游记", Movie.CHILDRENS);
        customer.addRental(new Rental_v8(movie1, 4));
        customer.addRental(new Rental_v8(movie2, 6));
        customer.addRental(new Rental_v8(movie3, 10));
        System.out.println(customer.statement());
    }

    private static void test_v9() {
        Customer_v9 customer = new Customer_v9("小胖");
        Movie_v9 movie1 = new Movie_v9("红海行动", Movie.REGULAR);
        Movie_v9 movie2 = new Movie_v9("九层妖塔", Movie.NEW_RELEASE);
        Movie_v9 movie3 = new Movie_v9("飞屋环游记", Movie.CHILDRENS);
        customer.addRental(new Rental_v9(movie1, 4));
        customer.addRental(new Rental_v9(movie2, 6));
        customer.addRental(new Rental_v9(movie3, 10));
        System.out.println(customer.statement());
    }

    private static void test_v10() {
        Customer_v10 customer = new Customer_v10("小胖");
        Movie_v10 movie1 = new Movie_v10("红海行动", Movie.REGULAR);
        Movie_v10 movie2 = new Movie_v10("九层妖塔", Movie.NEW_RELEASE);
        Movie_v10 movie3 = new Movie_v10("飞屋环游记", Movie.CHILDRENS);
        customer.addRental(new Rental_v10(movie1, 4));
        customer.addRental(new Rental_v10(movie2, 6));
        customer.addRental(new Rental_v10(movie3, 10));
        System.out.println(customer.statement());
    }

    private static void test_v11() {
        Customer_v11 customer = new Customer_v11("小胖");
        Movie_v11 movie1 = new Movie_v11("红海行动", Movie.REGULAR);
        Movie_v11 movie2 = new Movie_v11("九层妖塔", Movie.NEW_RELEASE);
        Movie_v11 movie3 = new Movie_v11("飞屋环游记", Movie.CHILDRENS);
        customer.addRental(new Rental_v11(movie1, 4));
        customer.addRental(new Rental_v11(movie2, 6));
        customer.addRental(new Rental_v11(movie3, 10));
        System.out.println(customer.statement());
    }
}
