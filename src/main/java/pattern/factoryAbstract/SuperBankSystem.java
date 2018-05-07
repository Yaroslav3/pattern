package pattern.factoryAbstract;

import pattern.factoryAbstract.banking.BankingTeamFactory;
import pattern.factoryAbstract.factoryTeam.ProjectTeamFactory;
import pattern.factoryAbstract.service.Developer;
import pattern.factoryAbstract.service.ProjectManagers;
import pattern.factoryAbstract.service.Tester;

/**
 * AbstractFactory pattern
 */

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManagers projectManagers = projectTeamFactory.getProjectManager();

        System.out.println("Create bunk system...");
        developer.writeCode();
        tester.testCode();
        projectManagers.manageProject();
    }
}
