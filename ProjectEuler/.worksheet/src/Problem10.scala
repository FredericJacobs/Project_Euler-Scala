object Problem10 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(136); 
	lazy val primeN: Stream[Int] = 2 #:: Stream.from(3).filter(i => primeN.takeWhile(j => j * j <= i).forall(i % _ > 0));System.out.println("""primeN: => Stream[Int]""");$skip(66); 
	
	val r = primeN.view.takeWhile(_ < 2000000).foldLeft(0L)(_ + _);System.out.println("""r  : Long = """ + $show(r ))}
	
}
