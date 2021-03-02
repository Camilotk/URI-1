object Main {
 
  def average(grade1: Double, grade2: Double): Double = {
    return ( grade1 * 3.5 + grade2 * 7.5 ) / 11
  }

  def formatOutput(value: Double): String = {
    return f"MEDIA = $value%.5f"
  }

  def main(args: Array[String]): Unit = {
    val a = scala.io.StdIn.readDouble()
    val b = scala.io.StdIn.readDouble()

    println(formatOutput(average(a, b)))
  }
}
