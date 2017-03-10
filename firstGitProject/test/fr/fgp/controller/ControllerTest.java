package fr.fgp.controller;

import org.junit.Assert;
import org.junit.Test;

public class ControllerTest {
	@Test
	public void test1() {
		Assert.assertEquals(9, new Controller().somme(4, 5));
	}
}
