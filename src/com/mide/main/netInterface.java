

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

import java.net.*;
import java.io.*;

public class netInterface {
        public netInterface() {
            System.setProperty("http.agent", "MIDE - v.0.1devel1 - "
                + "[[WP:MIDE]] - [[User:Matthewrbowker]] - ");
        }
    	public static String urlopen(String url) {
            try {
                URL u = new URL(url);
                StringBuffer sb = new StringBuffer();
                BufferedReader in = new BufferedReader(
		new InputStreamReader(u.openStream()));
                String str = null;
                while((str = in.readLine())!=null) {
                    sb.append(str + "\r\n");
                }
                in.close();
                return sb.toString();
            } catch(Exception e) {
                //e.printStackTrace();
            }
            return null;
	}

}
