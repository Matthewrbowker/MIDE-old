/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mide.main;

/**
 *
 * @author Matthew
 */
public class wikiInterface {
    private String title;
    private String wikiTitle;
    netInterface ni = new netInterface();
    
    private String parseTitle(String title) {
        title = title.replace(" ", "_");
        return title;
    }
    
    public wikiInterface() {
        title = "";
        wikiTitle = "";
    }
    public wikiInterface(String tempTitle){
        title = tempTitle;
        wikiTitle = parseTitle(tempTitle);
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getWikiTitle() {
        return wikiTitle;
    }
    
    public void setTitle(String tempTitle) {
        title = tempTitle;
        wikiTitle = parseTitle(tempTitle);
    }
    
    public String retrievePageContents() {
        try {
            return ni.urlopen(
                        "http://en.wikipedia.org/w/index.php?action=raw&title="
                                + wikiTitle);
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean doesTitleExist() {
        String page = ni.urlopen("http://en.wikipedia.org/w/index.php?action=raw&title="
                + wikiTitle);
        if (page == (null)) {
            return false;
        }
        else {
            return true;
        }
        
        // query = "http://en.wikipedia.org/w/api?action=query&titles=%s&format=xml" % "|".join(words)
        // pages = urllib.urlopen(query)
    }
    
    
}
