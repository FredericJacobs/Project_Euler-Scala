object Problem9 {
	val limit = (1 to 1000).find(n => n + math.sqrt(n) >= 1000).getOrElse(0)
                                                  //> limit  : Int = 969

	val rs = (for(b <- 2 until limit; a <- 1 until b; c = 1000 - a - b
             if a * a + b * b  == c * c) yield a * b * c)
                                                  //> rs  : scala.collection.immutable.IndexedSeq[Int] = Vector(31875000)
	rs(0)                                     //> res0: Int = 31875000
}