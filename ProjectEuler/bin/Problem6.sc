object Problem6 {
  def sumOfTheSquares (n: Int) = (1 to n).map(x => x*x).sum
                                                  //> sumOfTheSquares: (n: Int)Int
  def squareOfTheSum (n: Int) = {
  	val theSum = (1 to n).sum
  	theSum*theSum
	}                                         //> squareOfTheSum: (n: Int)Int
	
	def difference(n: Int): Int = {
		squareOfTheSum(n) - sumOfTheSquares(n)
	}                                         //> difference: (n: Int)Int
	
	difference (100)                          //> res0: Int = 25164150
	
}