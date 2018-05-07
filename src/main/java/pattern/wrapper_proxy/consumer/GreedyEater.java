package pattern.wrapper_proxy.consumer;

import pattern.wrapper_proxy.sweets.Sweet;

public class GreedyEater implements Eater {


    public void eat(Sweet sweet) {
        System.out.println(" I like sweets, I'm going to aet " + sweet);
    }

    public void lick(Sweet sweet) {
        System.out.println(" I like sweets so much! So sweet " + sweet.howSweet());
        eat(sweet);
        System.out.println("On nom nom");
    }

    public Sweet bite(Sweet sweet) {
        System.out.println("Can't just bite. Oh, it's " + sweet.madeOf());
        eat(sweet);
        System.out.println("On nom nom");
        return null;
    }
}
