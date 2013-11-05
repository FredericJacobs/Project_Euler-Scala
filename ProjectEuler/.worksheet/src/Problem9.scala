object Problem9 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(91); 
	val limit = (1 to 1000).find(n => n + math.sqrt(n) >= 1000).getOrElse(0);System.out.println("""limit  : Int = """ + $show(limit ));$skip(127); 

	val rs = (for(b <- 2 until limit; a <- 1 until b; c = 1000 - a - b
             if a * a + b * b  == c * c) yield a * b * c);System.out.println("""rs  : scala.collection.immutable.IndexedSeq[Int] = """ + $show(rs ));$skip(7); val res$0 = 
	rs(0);System.out.println("""res0: Int = """ + $show(res$0))}
}
