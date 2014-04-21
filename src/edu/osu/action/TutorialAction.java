package edu.osu.action;

import com.opensymphony.xwork2.ActionSupport;

import edu.osu.service.TutorialFinderService;

public class TutorialAction extends ActionSupport{
    
    private String bestTutorialSite;
    private String language;
    
    public String getTutorial(){
        //TutorialFinderService tutorialFinderService = new TutorialFinderService();
        //setBestTutorialSite(tutorialFinderService.getBestTutorialSite(getLanguage()));
        //System.out.println(getLanguage());
        System.out.println("getTutorial() method called");
        return SUCCESS;
    }

    public String addTutorial(){
        //TutorialFinderService tutorialFinderService = new TutorialFinderService();
        //setBestTutorialSite(tutorialFinderService.getBestTutorialSite(getLanguage()));
        //System.out.println(getLanguage());
        System.out.println("addTutorial() method called");
        return SUCCESS;
    }
    
    public String getBestTutorialSite() {
        return bestTutorialSite;
    }

    public void setBestTutorialSite(String bestTutorialSite) {
        this.bestTutorialSite = bestTutorialSite;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
