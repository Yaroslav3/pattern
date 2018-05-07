package pattern.wrapper_proxy.consumer;

import pattern.wrapper_proxy.sweets.Sweet;

public interface Eater {

    void eat(Sweet sweet);

    void lick(Sweet sweet);

    Sweet bite(Sweet sweet);
}
