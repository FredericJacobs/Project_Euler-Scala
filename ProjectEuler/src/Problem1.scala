object Problem1 {
  def sumOfAllMultiplesof3or5 (startRange: Int, endRange:Int): Int = {
    val numbers = startRange to endRange toList
	  val divisibleby3or5 = numbers.filter(x => x % 3 == 0 || x % 5 ==0)
    divisibleby3or5.reduceLeft(_+_)
  }
  sumOfAllMultiplesof3or5(1,999)
	val map = Map(1 -> "hello world", 1 -> "Lulz")
	map(1)
}