/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mide.tests;

import org.junit.*;
import static org.junit.Assert.*;
import com.mide.main.wikiInterface;
/**
 *
 * @author Matthew
 */
public class wikiInterface_Test {
    @Test
    public void defaultConstructor() {
        wikiInterface wi = new wikiInterface();
        assertEquals(wi.getTitle(), "");
    }
    @Test
    public void arguementContructor() {
        wikiInterface wi = new wikiInterface("WP:MIDE");
        assertEquals(wi.getTitle(), "WP:MIDE");
    }
    
    @Test
    public void setting() {
        wikiInterface wi = new wikiInterface();
        assertEquals(wi.getTitle(), "");
        wi.setTitle("WP:MIDE");
        assertEquals(wi.getTitle(), "WP:MIDE");
    }
    
    @Test
    public void exists() {
        wikiInterface wi = new wikiInterface("Main Page");
        wikiInterface wi2 = new wikiInterface("aphiut anafuasdfinou adsfiouaf");
        assertEquals(wi.doesTitleExist(), true);
        assertEquals(wi2.doesTitleExist(), false);
    }
    
    @Test
    public void gettingContents() {
        wikiInterface wi = new wikiInterface("Main Page");
        wikiInterface wi2 = new wikiInterface("aphiut anafuasdfinou adsfiouaf");
        assertTrue(wi.retrievePageContents() instanceof String);
        assertEquals(wi2.retrievePageContents(), null);
    }
}
