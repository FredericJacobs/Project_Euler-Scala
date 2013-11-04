object Problem6 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(77); 
  def sumOfTheSquares (n: Int) = (1 to n).map(x => x*x).sum;System.out.println("""sumOfTheSquares: (n: Int)Int""");$skip(83); 
  def squareOfTheSum (n: Int) = {
  	val theSum = (1 to n).sum
  	theSum*theSum
	};System.out.println("""squareOfTheSum: (n: Int)Int""");$skip(79); 
	
	def difference(n: Int): Int = {
		squareOfTheSum(n) - sumOfTheSquares(n)
	};System.out.println("""difference: (n: Int)Int""");$skip(20); val res$0 = 
	
	difference (100);System.out.println("""res0: Int = """ + $show(res$0))}
	
}
