/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mide.tests;

import org.junit.*;
import static org.junit.Assert.assertEquals;
import com.mide.main.SettingNode;


/**
 *
 * @author Matthew
 */

public class SettingNode_Test {
    SettingNode sn = new SettingNode();
    @Test
    public void beforeAllTests() {
        assertEquals("Testing","Testing");
    }
    
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
}
