/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mide.tests;

import org.junit.*;
import static org.junit.Assert.*;
import com.mide.main.netInterface;

/**
 *
 * @author Matthew
 */
public class netInterface_Test {
    netInterface ni;
    
    @Before
    public void runBefore() {
        ni = new netInterface();
    }
    
    @Test
    public void settingUserAgent() {
        assertEquals(System.getProperty("http.agent"), "MIDE - v.0.1devel1 - "
                + "[[WP:MIDE]] - [[User:Matthewrbowker]] - ");
    }
    
    @Test
    public void gettingURL() {
        assertTrue(ni.urlopen("http://localhost") instanceof String);
    }
    
    @After
    public void runAfter() {
        ni = null;
    }
}
