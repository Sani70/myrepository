package com.Mypackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyClassTest {

	@Test
			void testRect() {
				ClassRect r= new ClassRect();
				assertEquals(30,r.perimeter(10,5));
			}
			@Test
			void testSimpleInterest() {
				SimpleInterest SI= new SimpleInterest();
				assertEquals(5850,SI.CalSimInterest(18000, 5, 6.5));
				
			}
			@Test
			void testCompountInerest() {
				CompountInterest CI= new CompountInterest();
				assertEquals(3780.0000000000036,CI.CalCompInterest(18000, 2, 10));
			}
			void testSwapNumbers() {
				SwapNumbers samp= new SwapNumbers();
				
			}
	}
