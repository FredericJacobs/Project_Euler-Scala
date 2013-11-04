object Problem2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(81); 
  def fib(x: Long, y: Long): Stream[Long] = x #:: fib(y, x + y);System.out.println("""fib: (x: Long, y: Long)Stream[Long]""");$skip(110); 
	def sumOfFibEvenMembersSmallerThan (n : Int) = {
		fib(1,2).takeWhile(x => x <= n).filter(_ % 2 == 0).sum
	};System.out.println("""sumOfFibEvenMembersSmallerThan: (n: Int)Long""");$skip(43); val res$0 = 
	
	sumOfFibEvenMembersSmallerThan(4000000);System.out.println("""res0: Long = """ + $show(res$0))}
	
}
