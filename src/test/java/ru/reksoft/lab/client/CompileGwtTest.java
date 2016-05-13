package ru.reksoft.lab.client;

import com.google.gwt.junit.client.GWTTestCase;

public class CompileGwtTest extends GWTTestCase {
  
  @Override
  public String getModuleName() {
    return "ru.reksoft.lab.ContactBook";
  }

  public void testSandbox() {
    assertTrue(true);
  }
  
}
