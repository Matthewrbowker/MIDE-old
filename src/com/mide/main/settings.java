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
public class settings {
    // [[WP:MIDE/Global_Settings]]
    // [[User:USERNAME/mide.js]]
    netInterface ni = new netInterface();
    String username;
    SettingNode adt;
    
    private void bootstrapSettings(String tempUsername) {
        
    }
    
    private void bootstrapSettings() {
        bootstrapSettings("");
    }
    
    public settings() {
        username = "";
        adt = null;
        bootstrapSettings();
    }
    
    public settings(String tempUsername) {
        username = tempUsername;
        adt = null;
        bootstrapSettings(tempUsername);
    }
    
    public void reloadSettings() {
        bootstrapSettings(username);
    }
    
}
