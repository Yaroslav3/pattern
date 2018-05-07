package pattern;

public class FactoryExample {

    interface Returnable {
    }

    static class A implements Returnable {

        @Override
        public String toString() {
            return "A";
        }
    }

    static class B implements Returnable {

        @Override
        public String toString() {
            return "B";
        }
    }


    public static Returnable getInstance(String name) {
        Returnable toRetbrun;

        if ("a".equalsIgnoreCase(name)) {
            toRetbrun = new A();

        } else if ("b".equalsIgnoreCase(name)) {
            toRetbrun = new B();
        } else {
            throw new IllegalArgumentException("idhv" + name);
        }
        return toRetbrun;
    }

    public static void main(String[] args) {
        System.out.println(FactoryExample.getInstance("a"));
        System.out.println(FactoryExample.getInstance("B"));
        System.out.println(FactoryExample.getInstance("C"));
    }
}
