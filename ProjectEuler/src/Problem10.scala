object Problem10 {
	lazy val primeN: Stream[Int] = 2 #:: Stream.from(3).filter(i => primeN.takeWhile(j => j * j <= i).forall(i % _ > 0))
	
	val r = primeN.view.takeWhile(_ < 2000000).foldLeft(0L)(_ + _)

	type Histogram = Map[Int, Int]
  type Course = List[Quiz]
  type Result = (String, Int)
  type Quiz = List[Result]
  
  def quizMeans(course: Course): List[Float] = course map { quiz =>
val sum = quiz.foldLeft(0.f) {
(acc: Float, result: (String, Int)) => acc + result._2
}
sum / quiz.length
}

def studentMeans(course: Course): Map[String, Float] = course.flatten groupBy(_._1) map {
case (student, namegrades) =>
val sum = namegrades.foldLeft(0.f) {
(acc: Float, result: (String, Int)) => acc + result._2
}
(student, sum / namegrades.length)
}

 	def histogram(course: Course): Histogram = {
    val studentsPerGrade = studentMeans(course).groupBy{case (name, mean) => math.round(mean)}
  studentsPerGrade map {
  case (grade, students) => (grade, students.size)
   }
  }
	
}