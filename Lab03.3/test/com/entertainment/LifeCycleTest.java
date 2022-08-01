package com.entertainment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LifeCycleTest {

  @BeforeClass
  public static void beforeTestRun() throws Exception {
    System.out.println("before test run");

  }

  @Test
  public void testSomething() {
    System.out.println("test something");
  }

  @Test
  public void testSomethingElse() {
    System.out.println("test something else");
  }


  @AfterClass
  public static void afterTestRun() throws Exception {
    System.out.println("after test run");
  }

  @After
  public void afterTest() throws Exception {
    System.out.println("after test");

  }

  @Before
  public void beforeTest() throws Exception {
    System.out.println("before test");
  }
}
