object Problem4 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(152); 
	val biggest3numbersPalindrome = (100 to 999).view.flatMap(i => (i to 999).map(i *)).filter(n => n.toString == n.toString.reverse).max;System.out.println("""biggest3numbersPalindrome  : Int = """ + $show(biggest3numbersPalindrome ))}
}
