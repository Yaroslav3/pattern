package pattern.factoryAbstract.factoryTeam;

import pattern.factoryAbstract.service.Developer;
import pattern.factoryAbstract.service.ProjectManagers;
import pattern.factoryAbstract.service.Tester;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManagers getProjectManager();
}
