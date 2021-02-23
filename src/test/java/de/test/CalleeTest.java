package de.test;

import org.junit.Assert;
import org.junit.Test;

public class CalleeTest {
   @Test
   public void onlyCallMethod1() {
      final Callee callee = new Callee();
      callee.method1();
      Assert.assertNotNull(callee);
   }
   
   @Test
   public void onlyCallMethod2() {
      final Callee callee = new Callee();
      callee.method1();
      callee.method1();
      Assert.assertNotNull(callee);
   }
}
