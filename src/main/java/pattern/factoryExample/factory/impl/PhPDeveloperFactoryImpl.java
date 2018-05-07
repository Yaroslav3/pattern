package pattern.factoryExample.factory.impl;

import pattern.factoryExample.developer.Developer;
import pattern.factoryExample.factory.DeveloperFactory;
import pattern.factoryExample.model.PhPDeveloper;

public class PhPDeveloperFactoryImpl implements DeveloperFactory {
    public Developer createDeveloper() {
        return new PhPDeveloper();
    }
}
