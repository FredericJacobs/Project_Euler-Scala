object Problem5 {

	val smallestDivisbleNumber = (20 to Int.MaxValue).find(n => Range(2, 21).forall(n % _ == 0)).get
                                                  //> smallestDivisbleNumber  : Int = 232792560
	
}