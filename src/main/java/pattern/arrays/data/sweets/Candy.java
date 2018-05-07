package pattern.arrays.data.sweets;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import pattern.arrays.data.sweets.Sweet;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Candy implements Sweet, Comparable<Candy> {

    private SweetType sweetType;
    private int howSweet;

    public SweetType madeOf() {
        return sweetType;
    }

    public int howSweet() {
        return howSweet;
    }

    @Override
    public int compareTo(Candy o) {
//         this.howSweet > this.howSweet ? 1 : this.howSweet == this.howSweet ? 0 : -1;
        return Integer.compare(this.howSweet, this.howSweet);
    }
}
