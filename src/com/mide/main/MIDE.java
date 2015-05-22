
package com.mide.main;
import com.mide.tests.*;
import com.mide.view.*;

import org.junit.runner.JUnitCore;


public class MIDE {
  public static void main(String[] arg) {
      netInterface ni = new netInterface();
      settings s = new settings("Matthewrbowker");
      if (true) {
          MIDE_Test mt = new MIDE_Test();
          mt.execute();
      }
      /*
      wikiInterface wi = new wikiInterface("List of Space Shuttle missions");
      System.out.println(wi.doesTitleExist());
      System.out.println(wi.getTitle());
      System.out.println(wi.getWikiTitle());
      System.out.println(wi.retrievePageContents());
      wikiInterface wi2 = new wikiInterface("WP:MIDE");
      System.out.println(wi2.doesTitleExist());
      System.out.println(wi2.getTitle());
      System.out.println(wi2.getWikiTitle());
      System.out.println(wi2.retrievePageContents());
      System.out.println(ni.urlopen("http://localhost/~checkua"));
              */
      s.setSetting("root.uri", "http://localhost");
      s.setSetting("test.String", "Testing");
      s.setSetting("test.String2", "Testing2");
      s.printAllSettings();
  }
}