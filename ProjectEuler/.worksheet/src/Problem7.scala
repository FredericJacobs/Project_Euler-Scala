object Problem7 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(136); 
  lazy val primeN: Stream[Int] = 2 #:: Stream.from(3).filter(i => primeN.takeWhile(j => j * j <= i).forall(i % _ > 0));System.out.println("""primeN: => Stream[Int]""");$skip(25); 

  val r = primeN(10000);System.out.println("""r  : Int = """ + $show(r ))}
  
}
