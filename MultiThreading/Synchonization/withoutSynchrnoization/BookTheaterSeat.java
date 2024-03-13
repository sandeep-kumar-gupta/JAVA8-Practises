package MultiThreading.Synchonization.withoutSynchrnoization;

public class BookTheaterSeat {
    int total = 10;
    public synchronized void bookSeat(int seat){
        if (seat <= total){
            System.out.println("succesfully booked");
            total = total -seat;
            System.out.println("remaining seats"+total);
        }else {
            System.out.println("seats cannot be books "+total+" only available" );
        }

    }
}
