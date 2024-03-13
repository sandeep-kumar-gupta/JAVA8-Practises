package MultiThreading.Synchonization.withoutSynchrnoization;

public class MovieBookApp extends Thread {

    static BookTheaterSeat bookTheaterSeat;
    int seats;



    @Override
    public void run() {

        bookTheaterSeat.bookSeat(seats);

    }



    public static void main(String[] args) {
        bookTheaterSeat = new BookTheaterSeat();

        MovieBookApp deepak = new MovieBookApp();
        deepak.seats = 7;
        deepak.start();

        MovieBookApp amit = new MovieBookApp();
        amit.seats=7;
        amit.start();

    }


}



