/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mide.tests;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.io.File;
import java.nio.file.Paths;

/**
 *
 * @author Matthew
 */
public class Test_Bootstrapper {
    
   @Test
   public void execute() {
      File[] files = new File("./src/com/mide/tests").listFiles();
      int failures = 0;
      
      for (File file : files) {
        if (file.isDirectory()) {
            // Do nothing
        } else if(file.getName().equals("Test_Bootstrapper.java")) {
            // Do nothing
        } else if (!file.getName().contains(".java")) {
            // Do nothing
        }else {
            String fileName = file.getName().replace(".java","");
            System.out.println("Testing: " + fileName);
            try {
                System.out.println((Class) Class.forName("com.mide.tests." + fileName));
                Result result = JUnitCore.runClasses((Class) Class.forName("com.mide.tests." + fileName));
                System.out.println(result.getFailureCount());
                for (Failure failure : result.getFailures()) {
                    System.out.println("FAIL: " + failure.toString());
                    failures++;
                }
                System.out.println("Final Result: " + result.wasSuccessful());
            } catch(Exception e) {
                System.out.println("FAIL: An Error occured when executing the class: "
                + e.getMessage());
                failures++;
            } finally {
                System.out.println("--------------------");
                System.out.println();
                System.out.println();
            }
            
        }
    }
        
    System.out.println("Number of failures: " + failures);
    if (failures > 0 ) {
        Runtime.getRuntime().exit(1);
    } else {
        Runtime.getRuntime().exit(0);
    }
      
   }
}
