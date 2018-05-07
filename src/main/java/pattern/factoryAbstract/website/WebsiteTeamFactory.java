package pattern.factoryAbstract.website;

import pattern.factoryAbstract.banking.QATester;
import pattern.factoryAbstract.factoryTeam.ProjectTeamFactory;
import pattern.factoryAbstract.service.Developer;
import pattern.factoryAbstract.service.ProjectManagers;
import pattern.factoryAbstract.service.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory{

    public Developer getDeveloper() {
        return new PhPDeveloper();
    }

    public Tester getTester() {
        return new QATester();
    }

    public ProjectManagers getProjectManager() {
        return new WebsitePM();
    }
}
