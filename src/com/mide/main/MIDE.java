
package com.mide.main;
import com.mide.tests.*;
import com.mide.view.*;
import javax.swing.JFrame;

public class MIDE {
  public static void main(String... args) {
      if (args.length > 0 && args[0].toLowerCase().equals("test")) {
          Test_Bootstrapper boot = new Test_Bootstrapper();
          boot.execute();
          // boostrapper will exit the execution based on test results
      }
      
      /*
      netInterface ni = new netInterface();
      settings s = new settings("Matthewrbowker");
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
      s.setSetting("root.uri", "http://localhost");
      s.setSetting("test.String", "Testing");
      s.setSetting("test.String2", "Testing2");
      s.printAllSettings();
      */
      System.out.println("Execute main interface...");
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      frame.getContentPane().add(new MainView());
      frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
      frame.pack();
      frame.setVisible(true);
  }
}