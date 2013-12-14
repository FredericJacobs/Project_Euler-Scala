object Problem6 {
  def sumOfTheSquares (n: Int) = (1 to n).map(x => x*x).sum

  def squareOfTheSum (n: Int) = {
  		val theSum = (1 to n).sum
  		theSum*theSum
	}
	
	def difference(n: Int): Int = {
		squareOfTheSum(n) - sumOfTheSquares(n)
	}
	
	difference (100)
	
}