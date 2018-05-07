package pattern.proxy2Dynamyc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Object o = new Object();
        o.notify();
        List<String> list = new ArrayList<>();
        list.add("00");
        list.add("0");
        list.add("1230");
        List<String> list1 = Collections.synchronizedList(list);
        System.out.println(list1);


        InvocationHandler handler = new MyProxy(new Integer(5));
        Class[] classes = new Class[]{Comparable.class, Cloneable.class};
        Object proxy = Proxy.newProxyInstance(null, classes, handler);
        proxy.getClass();
        proxy.toString();
        System.out.println(((Comparable) proxy).compareTo(3));
    }

    static class MyProxy implements InvocationHandler {
        Object target;

        public MyProxy(Object target) {
            this.target = target;
        }


        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println(args);
            return method.invoke(target, args);
        }
    }
}
