package com.javatunes.personnel;

import static org.junit.Assert.*;

import gov.irs.TaxPayer;
import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class SalariedEmployeeTest {

  private SalariedEmployee employee;

  @Before
  public void setUp() throws Exception {
    employee = new SalariedEmployee("John Smith", new Date(0), 1000.0);
  }

  @Test
  public void pay() {
    assertEquals(1000.0, employee.pay(), 0.005);
  }

  @Test
  public void TestPayTaxes() {
    assertEquals(1000 * TaxPayer.SALARIED_TAX_RATE, employee.payTaxes(), 0.005);
  }

  @Test
  public void TestEmployeeEuqals_same() {
    Employee employee2 = new SalariedEmployee("John Smith", new Date(0), 100.0);
    assertEquals(employee,employee2);
  }
  @Test
  public void TestEmployeeEuqals_different() {
    Employee employee2 = new SalariedEmployee("LAG", new Date(0), 1000.0);
    assertNotEquals(employee,employee2);

  }


  @Test
  public void hashCode_same() {
    Employee employee2 = new SalariedEmployee("John Smith", new Date(0), 1000.0);
    assertEquals(employee.hashCode(),employee2.hashCode());
  }

  @Test
  public void hashCode_different() {
    Employee employee2 = new SalariedEmployee("John Smith", new Date(0), 1000.0);
    assertNotEquals(employee.hashCode(),employee2.hashCode());
  }
}
