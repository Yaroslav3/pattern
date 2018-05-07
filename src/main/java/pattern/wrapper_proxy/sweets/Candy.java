package pattern.wrapper_proxy.sweets;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Candy implements Sweet {

    private SweetType sweetType;
    private int howSweet;

    public SweetType madeOf() {
        return sweetType;
    }

    public int howSweet() {
        return howSweet;
    }

}
