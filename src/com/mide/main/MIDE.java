
package com.mide.main;
import com.mide.tests.*;
import com.mide.view.*;

public class MIDE {
  public static void main(String... args) {
      netInterface ni = new netInterface();
      settings s = new settings("Matthewrbowker");
      if (args.length > 0 && args[0].toLowerCase().equals("test")) {
          Test_Bootstrapper boot = new Test_Bootstrapper();
          boot.execute();
         
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