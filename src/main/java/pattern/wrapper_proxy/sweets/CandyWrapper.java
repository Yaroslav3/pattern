package pattern.wrapper_proxy.sweets;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.awt.*;

@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class CandyWrapper implements Sweet {
    private Candy candy;
    private Color color;


    public SweetType madeOf() {
        return candy.madeOf();
    }

    public int howSweet() {
        return candy.howSweet();
    }

    public Color getColor() {
        return color;
    }
}
