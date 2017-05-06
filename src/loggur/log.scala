package com.loggur


/** Class to represent indivdual log entries
  *
  */
class Log(val title:String, val data:String) {
	val time: Long = System.currentTimeMillis / 1000;

	override def toString(): String = s"$time;$title;$data";

	def ==(arg: Log) = title == arg.title;
}

/** Factory and methods to deal with logs in a functional way
  *
  */
object Logs {

	/** @return new list of logs
      *
      */
	def newList():List[Log] = List();

	/** @return new list with additonal log appended to it
      *
      */
	def appendLog(lst:List[Log], title:String, data:String):List[Log] = new Log(title, data) :: lst;

	def printLogs(lst:List[Log]):Unit = {
		for(entry <- lst) println(entry);
	}
}