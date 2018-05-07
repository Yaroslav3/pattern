package pattern.factoryAbstract.website;

import pattern.factoryAbstract.service.Developer;

public class PhPDeveloper implements Developer{
    public void writeCode() {
        System.out.println("PhP developer write php code...");
    }
}
