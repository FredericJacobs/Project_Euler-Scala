object Problem10 {
	lazy val primeN: Stream[Int] = 2 #:: Stream.from(3).filter(i => primeN.takeWhile(j => j * j <= i).forall(i % _ > 0))
                                                  //> primeN: => Stream[Int]\
	
	val r = primeN.view.takeWhile(_ < 2000000).foldLeft(0L)(_ + _)
	
}