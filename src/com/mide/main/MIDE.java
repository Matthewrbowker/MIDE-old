
package com.mide.main;

public class MIDE {
  public static void main(String[] arg) {
      netInterface ni = new netInterface();
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
  }
}