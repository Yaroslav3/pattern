package pattern.proxy;

import pattern.proxy.impl.ProxyImage;
import pattern.proxy.impl.RealImage;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("D:/image/my.jpg");
        image.display();
    }
}
