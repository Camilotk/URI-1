object Main {
  def main(args: Array[String]): Unit = {
    val a = scala.io.StdIn.readInt()
    val b = scala.io.StdIn.readInt()

    val PROD = a * b
    println(f"PROD = $PROD")
  }
}
