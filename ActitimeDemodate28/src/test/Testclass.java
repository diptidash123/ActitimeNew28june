package test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generics.Basetest;
import pom.Pomclass;

@Listeners(generics.utility.class)
public class Testclass extends Basetest
{
 @Test
 public void login() throws IOException
 {
	 Pomclass p=new Pomclass(driver);
	 p.logindetails();
 }
}
