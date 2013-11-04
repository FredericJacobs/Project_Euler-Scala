object Problem3 {
	def largestPrimeFactor(b : BigInt) = {
  	def loop(f:BigInt, n: BigInt): BigInt =
     	if (f == n) n else
     	if (n % f == 0) loop(f, n / f)
     	else loop(f + 1, n)
  	loop (BigInt(2), b)
	}                                         //> largestPrimeFactor: (b: BigInt)BigInt
	
	largestPrimeFactor(BigInt(600851475143L)) //> res0: BigInt = 6857
	
}