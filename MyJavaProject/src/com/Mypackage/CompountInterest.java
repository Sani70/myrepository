package com.Mypackage;

public class CompountInterest {
	double CalCompInterest(double p,double n,double r)
	{
	double CI = (p*(Math.pow((1 + r / 100), n)))-p;
	return CI;
}};