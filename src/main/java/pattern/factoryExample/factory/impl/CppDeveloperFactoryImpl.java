package pattern.factoryExample.factory.impl;

import pattern.factoryExample.developer.Developer;
import pattern.factoryExample.factory.DeveloperFactory;
import pattern.factoryExample.model.CppDeveloper;

public class CppDeveloperFactoryImpl implements DeveloperFactory {
    public Developer createDeveloper() {
        return new CppDeveloper();
    }

}
