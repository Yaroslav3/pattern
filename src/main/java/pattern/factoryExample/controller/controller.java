package pattern.factoryExample.controller;

import pattern.factoryExample.developer.Developer;
import pattern.factoryExample.factory.DeveloperFactory;
import pattern.factoryExample.factory.impl.CppDeveloperFactoryImpl;
import pattern.factoryExample.factory.impl.JavaDeveloperFactoryImpl;
import pattern.factoryExample.factory.impl.PhPDeveloperFactoryImpl;

public class controller {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("Java");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    private static DeveloperFactory createDeveloperBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactoryImpl();
        } else if (speciality.equalsIgnoreCase("PhP")) {
            return new PhPDeveloperFactoryImpl();
        } else if (speciality.equalsIgnoreCase("C++")) {
            return new CppDeveloperFactoryImpl();
        } else
            throw new RuntimeException(speciality + " is unknown speciality...");
    }
}
