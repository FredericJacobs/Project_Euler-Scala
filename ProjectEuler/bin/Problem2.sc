object Problem2 {
  def fib(x: Long, y: Long): Stream[Long] = x #:: fib(y, x + y)
                                                  //> fib: (x: Long, y: Long)Stream[Long]
	def sumOfFibEvenMembersSmallerThan (n : Int) = {
		fib(1,2).takeWhile(x => x <= n).filter(_ % 2 == 0).sum
	}                                         //> sumOfFibEvenMembersSmallerThan: (n: Int)Long
	
	sumOfFibEvenMembersSmallerThan(4000000)   //> res0: Long = 4613732
	
}