object Problem7 {
  lazy val primeN: Stream[Int] = 2 #:: Stream.from(3).filter(i => primeN.takeWhile(j => j * j <= i).forall(i % _ > 0))
  val r = primeN(10000)
  
}