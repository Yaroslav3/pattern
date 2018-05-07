package pattern.wraper;

/**
 *  Wrapper (Decorator) pattern
 */

public class Wrapper {
    public static void main(String[] args) {
//        PrinterInterface printerInterface = new Printer("Hello");
        PrinterInterface printerInterface = new QuoterDecorator(new RightBracketDecorator(new LeftBracketDecorator(new Printer("Hello"))));
        printerInterface.print();

    }
}

interface PrinterInterface {
    void print();
}


class Printer implements PrinterInterface {
    String value;

    public Printer(String value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.print(value);
    }
}


abstract class Decorator implements PrinterInterface {
    PrinterInterface component;

    public Decorator(PrinterInterface component) {
        this.component = component;
    }

    @Override
    public void print() {
        component.print();
    }
}

class QuoterDecorator extends Decorator {
    public QuoterDecorator(PrinterInterface component) {
        super(component);
    }
    @Override
    public void print() {
        System.out.print("\"");
        super.print();
        System.out.print("\"");
    }
}

class LeftBracketDecorator extends Decorator {
    public LeftBracketDecorator(PrinterInterface component) {
        super(component);
    }
    @Override
    public void print() {
        System.out.print("[");
        super.print();
    }
}

class RightBracketDecorator extends Decorator {
    public RightBracketDecorator(PrinterInterface component) {
        super(component);
    }
    @Override
    public void print() {
        super.print();
        System.out.print("]");
    }
}
