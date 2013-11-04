object Problem1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(246); 
  def sumOfAllMultiplesof3or5 (startRange: Int, endRange:Int): Int = {
    val numbers = startRange to endRange toList
	  val divisibleby3or5 = numbers.filter(x => x % 3 == 0 || x % 5 ==0)
    divisibleby3or5.reduceLeft(_+_)
  };System.out.println("""sumOfAllMultiplesof3or5: (startRange: Int, endRange: Int)Int""");$skip(36); val res$0 = 
  
  sumOfAllMultiplesof3or5(1,999);System.out.println("""res0: Int = """ + $show(res$0))}
}
