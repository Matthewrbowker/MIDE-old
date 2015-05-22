/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mide.tests;

import org.junit.*;
import static org.junit.Assert.*;
import com.mide.main.SettingNode;


/**
 *
 * @author Matthew
 */

public class SettingNode_Test {
    
    @Test
    public void testCreation() {
        SettingNode sn1 = new SettingNode();
        SettingNode sn2 = new SettingNode("sn2");
        SettingNode sn3 = new SettingNode("sn3","testvalue");
        assertEquals("", sn1.getKey());
        assertEquals("", sn1.getValue());
        assertEquals("sn2", sn2.getKey());
        assertEquals("", sn2.getValue());
        assertEquals("sn3", sn3.getKey());
        assertEquals("testvalue", sn3.getValue());
    }
    
    @Test
    public void setGetKeys() {
        SettingNode sn = new SettingNode("key");
        assertEquals(sn.getKey(), "key");
        sn.setKey("key2");
        assertEquals(sn.getKey(), "key2");
    }
    
    @Test
    public void setGetValues() {
        SettingNode sn = new SettingNode("key","value");
        assertEquals(sn.getValue(), "value");
        sn.setValue("value 2");
        assertEquals(sn.getValue(), "value 2");
    }
    
    @Test
    public void setGetNext() {
        SettingNode sn = new SettingNode("key","value");
        assertEquals(sn.getNext(), null);
        sn.setNext(new SettingNode("keyNext", "Value.Next"));
        assertTrue(sn.getNext() instanceof SettingNode);
        assertEquals(sn.getNext().getKey(), "keyNext");
        assertEquals(sn.getNext().getValue(), "Value.Next");
    }
}
