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
public class SettingNode {
    private String key;
    private String value;
    private SettingNode next;
    
    public SettingNode() {
        key = "";
        value = "";
        next = null;
    }
    
    public SettingNode(String tempKey) {
        key = tempKey;
        value = "";
        next = null;
    }
    
    public SettingNode(String tempKey, String tempValue) {
        key = tempKey;
        value = tempValue;
        next = null;
    }
    
    public String getKey() {
        return key;
    }
    
    public void setKey(String tempKey) {
        key = tempKey;
    }
    
    public String getValue() {
        return value;
    }
    
    public void setValue(String tempValue) {
        value = tempValue;
    }
    
    public SettingNode getNext() {
        return next;
    }
    
    public void setNext(SettingNode tempNext) {
        next = tempNext;
    }
    
}
