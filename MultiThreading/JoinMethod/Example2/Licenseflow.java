package MultiThreading.JoinMethod.Example2;

public class Licenseflow {
    public static void main(String[] args) throws InterruptedException {
        MedicalTest medicalTest = new MedicalTest();
        medicalTest.start();
        medicalTest.join();

        TestDrive testDrive = new TestDrive();
        testDrive.start();
        testDrive.join();

        OficcersSign oficcersSign = new OficcersSign();
        oficcersSign.start();
        oficcersSign.join();

        System.out.println("license has been approved");



    }
}
