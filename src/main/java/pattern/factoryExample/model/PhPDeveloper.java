package pattern.factoryExample.model;

import pattern.factoryExample.developer.Developer;

public class PhPDeveloper implements Developer {
    public void writeCode() {
        System.out.println("I'm programing PhP");
    }
}
