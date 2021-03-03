object Main {

    def difference(a: Int, b: Int, c: Int, d: Int): Int = a * b - c * d 
    def formatOutput(value: Int): String = f"DIFERENCA = $value"

    def main(args: Array[String]): Unit = {
        val a = scala.io.StdIn.readInt()
        val b = scala.io.StdIn.readInt()
        val c = scala.io.StdIn.readInt()
        val d = scala.io.StdIn.readInt()

        println(formatOutput(difference(a, b, c, d)))
    }
}