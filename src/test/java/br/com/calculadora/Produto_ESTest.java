/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 19 22:21:35 GMT 2021
 */

package br.com.calculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Produto_ESTest extends Produto_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Produto produto0 = new Produto();
      produto0.setQuantidade(1873);
      int int0 = produto0.getQuantidade();
      assertEquals(1873, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Produto produto0 = new Produto();
      produto0.setQuantidade((-884));
      int int0 = produto0.getQuantidade();
      assertEquals((-884), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Produto produto0 = new Produto();
      produto0.setPreco(2526.576504875193);
      double double0 = produto0.getPreco();
      assertEquals(2526.576504875193, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Produto produto0 = new Produto();
      produto0.setPreco((-41.40399107579368));
      double double0 = produto0.getPreco();
      assertEquals((-41.40399107579368), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Produto produto0 = new Produto();
      produto0.setNome("gIT7]DK~Z4F=2");
      String string0 = produto0.getNome();
      assertEquals("gIT7]DK~Z4F=2", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Produto produto0 = new Produto();
      produto0.setNome("");
      String string0 = produto0.getNome();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Produto produto0 = new Produto();
      int int0 = produto0.getQuantidade();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Produto produto0 = new Produto();
      double double0 = produto0.getPreco();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Produto produto0 = new Produto();
      String string0 = produto0.getNome();
      assertNull(string0);
  }
}
