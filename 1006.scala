object Main {
    def average(grade_1: Double, 
                grade_2: Double, 
                grade_3: Double,
                weights: List[Double] = List(2,3,5)): Double = {

        val grades: List[Double] = List(grade_1, grade_2, grade_3)
        val total_score: Double = grades.zip(weights).map(a => a._1 * a._2).reduce((x, y) => x + y)
        val total_weight: Double = weights.reduce((x, y) => x + y)

        return total_score / total_weight
    } 

    def formatOutput(value: Double): String = f"MEDIA = $value%.1f"

    def main(args: Array[String]): Unit = {
        val a = scala.io.StdIn.readDouble()
        val b = scala.io.StdIn.readDouble()
        val c = scala.io.StdIn.readDouble()

        println(formatOutput(average(a, b, c)))
    }
}