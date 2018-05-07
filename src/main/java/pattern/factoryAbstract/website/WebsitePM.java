package pattern.factoryAbstract.website;

import pattern.factoryAbstract.service.ProjectManagers;

public class WebsitePM implements ProjectManagers{
    public void manageProject() {
        System.out.println("Website PM manages Website project");
    }
}
