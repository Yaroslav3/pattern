package pattern.factoryAbstract.banking;

import pattern.factoryAbstract.service.Developer;

public class JavaDeveloper implements Developer {
    public void writeCode() {
        System.out.println("Java developer write java code...");
    }
}
