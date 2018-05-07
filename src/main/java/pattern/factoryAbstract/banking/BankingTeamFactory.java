package pattern.factoryAbstract.banking;

import pattern.factoryAbstract.factoryTeam.ProjectTeamFactory;
import pattern.factoryAbstract.service.Developer;
import pattern.factoryAbstract.service.ProjectManagers;
import pattern.factoryAbstract.service.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {

    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    public Tester getTester() {
        return new QATester();
    }

    public ProjectManagers getProjectManager() {
        return new BankibgPM();
    }
}
