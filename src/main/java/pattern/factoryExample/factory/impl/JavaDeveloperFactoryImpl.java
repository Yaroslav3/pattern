package pattern.factoryExample.factory.impl;

import pattern.factoryExample.developer.Developer;
import pattern.factoryExample.factory.DeveloperFactory;
import pattern.factoryExample.model.JavaDeveloper;

public class JavaDeveloperFactoryImpl implements DeveloperFactory {
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
