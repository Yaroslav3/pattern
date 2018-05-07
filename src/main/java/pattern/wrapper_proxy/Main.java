package pattern.wrapper_proxy;

import pattern.wrapper_proxy.consumer.Eater;
import pattern.wrapper_proxy.consumer.GreedyEater;
import pattern.wrapper_proxy.sweets.Candy;
import pattern.wrapper_proxy.sweets.Sweet;
import pattern.wrapper_proxy.sweets.SweetStopLickerProxy;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Eater eater = new GreedyEater();
        List<Candy> candies = Arrays.asList(new Candy(Sweet.SweetType.CHOCOLATE, 5),
                new Candy(Sweet.SweetType.MARMALADE, 5),
                new Candy(Sweet.SweetType.JELLY, 3));
        candies.forEach(eater::bite);
        candies.forEach(eater::lick);
        candies.forEach(eater::eat);

        List<SweetStopLickerProxy> collect = candies.stream().map(SweetStopLickerProxy::new).collect(Collectors.toList());
        collect.forEach(eater::bite);
        collect.forEach(eater::lick);
        collect.forEach(eater::eat
        );


//        Map<String, Boolean> map = new HashMap<>();
//       Set<String> set = Collections.newSetFromMap(map);
//
//        map.put("first", true);
//        map.put("second", true);
//        map.put("forth", true);
//        System.out.println(set);
//
//        set.add("ldmcv");
//
//        System.out.println(map);


//        Comparator<Sweet> objectComparator = Collections.reverseOrder();
//        System.out.println(objectComparator.compare(new Candy(Sweet.SweetType.CHOCOLATE,2),
//                new Candy(Sweet.SweetType.MARMALADE,4)));
    }
}
