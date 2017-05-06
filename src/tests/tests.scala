package com.tests

import com.loggur.Log

object Main extends App {
	TestFuncs.assertEqual(new Log("f", "food").title, new Log("f", "sauce"), 1);
}

object TestFuncs {
	def assertEqual(a:String, b:String, number:Int):Unit = {
		if(a==b) println(s"Test $number passed!") else println(s"Test $number failed!");
	}
}