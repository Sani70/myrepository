package com.Mypackage;



public class SwapNumbers {
	int xp, yp;
	 void swap()
    {
        if (xp == yp) 
         return;
        xp = xp + yp;
        yp = xp - yp;
        xp = xp - yp;
    }		
};