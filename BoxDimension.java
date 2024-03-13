import java.util.Scanner;

public class BoxDimension {

    double width ;
    double length;
    double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        BoxDimension box = new BoxDimension();
        box.setWidth(sc.nextDouble());
        box.setHeight(sc.nextDouble());
        box.setLength(sc.nextDouble());

        double volume = box.height * box.length * box.width;

        System.out.println(volume+" ," +box.width+ ", " +box.length+ " ," +box.height);


    }

}
