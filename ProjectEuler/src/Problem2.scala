object Problem2 {
  def fib(x: Long, y: Long): Stream[Long] = x #:: fib(y, x + y)
  
	def sumOfFibEvenMembersSmallerThan (n : Int) = {
		fib(1,2).takeWhile(x => x <= n).filter(_ % 2 == 0).sum
	}
	
	sumOfFibEvenMembersSmallerThan(4000000)
	
}