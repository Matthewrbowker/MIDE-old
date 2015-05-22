/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mide.tests;

import com.mide.main.*;
import org.junit.*;

/**
 *
 * @author Matthew
 */
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MIDE_Test {
   @Test
   public void execute() {
      Result result = JUnitCore.runClasses(SettingNode_Test.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println(result.wasSuccessful());
   }
}  	
