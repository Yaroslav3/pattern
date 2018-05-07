package pattern.wrapper_proxy.sweets;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class SweetStopLickerProxy implements Sweet {
    private Sweet sweet;

    public SweetType madeOf() {
        System.out.println("Attention, someone is trying to bite the sweet " + sweet);
        return sweet.madeOf();
    }

    public int howSweet() {
        System.out.println("Attention, someone is trying to lick the sweet " + sweet);
        return sweet.howSweet();
    }
}
D:\spring\work