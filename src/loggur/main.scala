package com.loggur

/** Main class for loggur, activates repl.
  *
  *
  */
object main {
	def main(args: Array[String]): Unit = {
		var active:Boolean = true;
		var lst = Logs.newList();
		while(active){
			var line = readLine("log> ");
			line match {
				case "quit" => active = false;
				case "print" => Logs.printLogs(lst);
				case input:String => {
					val splits = input.split(" ");
					if(splits.length == 2) lst = Logs.appendLog(lst, splits(0), splits(1));
				}
			}
		}
	}
}