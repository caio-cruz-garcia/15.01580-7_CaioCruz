import javax.sound.sampled.SourceDataLine;
import javax.xml.transform.SourceLocator;

import org.omg.CORBA.portable.ValueOutputStream;

public class Main {
    public static void main(String[] args) {
        conta c1 = new conta();
        c1.depositar(1000);
        System.out.println("Saldo Atual:" + c1.consultaSaldo());
        c1.sacar(200);
        System.out.println("Saldo Atual:" + c1.consultaSaldo());
        c1.depositar(1200);
        System.out.println("Saldo Atual:" + c1.consultaSaldo());
    }
}