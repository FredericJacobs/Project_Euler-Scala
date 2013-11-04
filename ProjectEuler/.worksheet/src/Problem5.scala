object Problem5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(116); 

	val smallestDivisbleNumber = (20 to Int.MaxValue).find(n => Range(2, 21).forall(n % _ == 0)).get;System.out.println("""smallestDivisbleNumber  : Int = """ + $show(smallestDivisbleNumber ))}
	
}
