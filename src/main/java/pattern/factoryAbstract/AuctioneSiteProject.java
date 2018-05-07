package pattern.factoryAbstract;

import pattern.factoryAbstract.factoryTeam.ProjectTeamFactory;
import pattern.factoryAbstract.service.Developer;
import pattern.factoryAbstract.service.ProjectManagers;
import pattern.factoryAbstract.service.Tester;
import pattern.factoryAbstract.website.WebsiteTeamFactory;

/**
 *  AbstractFactory pattern
 */

public class AuctioneSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManagers projectManagers = projectTeamFactory.getProjectManager();

        System.out.println("Creating auction website");
        developer.writeCode();
        tester.testCode();
        projectManagers.manageProject();
    }
}
