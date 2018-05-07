package pattern.wrapper_proxy.sweets;

public interface Sweet {
    SweetType madeOf();

    int howSweet();

    public static enum SweetType {
        CHOCOLATE, JELLY, MARMALADE, ICE_CREAM
    }
}
