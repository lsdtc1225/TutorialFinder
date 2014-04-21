package edu.osu.service;

public class TutorialFinderService {
    public String getBestTutorialSite(String language){
        if (language.equals("java")){
            return "java brains";
        } else{
            return "Language not supported yet!";
        }
    }
}
