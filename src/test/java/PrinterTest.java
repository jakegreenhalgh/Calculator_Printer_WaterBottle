import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(150, 100);
    }

    @Test
    public void canCheckPaper() {
        assertEquals(150, printer.getPaper());
    }

    @Test
    public void canPrint() {
        printer.print(5, 10);
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void wontPrintIfLow() {
        Printer lowPrinter = new Printer (40, 100);
        lowPrinter.print(5, 10);
        assertEquals(40, lowPrinter.getPaper());
    }

    @Test
    public void canCheckToner() {
        assertEquals(100, printer.getToner());
    }

    @Test
    public void canUseToner() {
        printer.print(5, 10);
        assertEquals(50, printer.getToner());
    }

}
