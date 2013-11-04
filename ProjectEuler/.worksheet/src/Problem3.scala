object Problem3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(214); 
	def largestPrimeFactor(b : BigInt) = {
  	def loop(f:BigInt, n: BigInt): BigInt =
     	if (f == n) n else
     	if (n % f == 0) loop(f, n / f)
     	else loop(f + 1, n)
  	loop (BigInt(2), b)
	};System.out.println("""largestPrimeFactor: (b: BigInt)BigInt""");$skip(45); val res$0 = 
	
	largestPrimeFactor(BigInt(600851475143L));System.out.println("""res0: BigInt = """ + $show(res$0))}
	
}
