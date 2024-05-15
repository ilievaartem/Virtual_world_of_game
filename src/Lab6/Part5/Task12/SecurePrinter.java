package Lab6.Part5.Task12;

public class SecurePrinter extends Printer {
    void printSecurely(String document) {
        System.out.println("Printing securely: " + document);
        super.print(document);
    }
}
