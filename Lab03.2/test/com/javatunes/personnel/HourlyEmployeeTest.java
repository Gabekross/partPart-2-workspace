package com.javatunes.personnel;

import static org.junit.Assert.*;

import gov.irs.TaxPayer;
import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class HourlyEmployeeTest {
  private HourlyEmployee employee1;

  @Before
  public void setUp() throws Exception {
   employee1= new HourlyEmployee("Gabriel", new Date(20220606),25.0,1.0);
  }

  @Test
  public void pay() {
    assertEquals(25.0,employee1.pay(),0.001);
  }

  @Test
  public void payTaxes() {
    assertEquals(1* TaxPayer.SALARIED_TAX_RATE, employee1.payTaxes(), 0.005);


  }
}