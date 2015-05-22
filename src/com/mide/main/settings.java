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
        String globalSettings = ni.urlopen("http://en.wikipedia.org/w/index.php"
                + "?action=raw&title=Wikipedia:MIDE/Global_Settings");
        String localSettings;
        if (username.equals("")) {
            localSettings = null;
        }
        else {
            localSettings = ni.urlopen("http://en.wikipedia.org/w/index.php"
                    + "?action=raw&title=User:" + username + "/mide.js");
        }
    }
    
    private void bootstrapSettings() {
        bootstrapSettings("");
    }
    
    private SettingNode findNode(String key) {
        SettingNode retVal = null;
        SettingNode node = adt;
        while ((node != null)) {
            if (node.getKey().equals(key)) {
                retVal = node;
            }
            node = node.getNext();
        }
        return retVal;
    }
    
    private SettingNode findLastNode() {
        SettingNode node = adt;
        while (node != null) {
            node = node.getNext();
        }
        
        return node;
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
    
    public void printAllSettings() {
        SettingNode node = adt;
        while ((node != null)) {
            System.out.println(node.getKey() + ": " + node.getValue());
            node = node.getNext();
        }
    }
    
    public void setSetting(String key, String value) {
        //System.out.println(key + ": " + value);
        SettingNode node = findNode(key);
        if (node == null) {
            node = findLastNode();
            if (node==null) {
                adt = new SettingNode(key, value);
            } else {
                node.setNext(new SettingNode(key, value));
            }
        }
        else {
            node.setValue(value);
        }
    }
    
    public void setSetting(String key) {
        setSetting(key, null);
    }
    
}
