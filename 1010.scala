object Main {
    def main(args: Array[String]): Unit = {
        val line_1: String = scala.io.StdIn.readLine()
        val line_2: String = scala.io.StdIn.readLine()

        val values = line_1.split(" ") ++ line_2.split(" ")

        val total: Double = values(1).toDouble * values(2).toDouble + values(4).toDouble * values(5).toDouble

        println(f"VALOR A PAGAR: R$$ $total%.2f")
    }
}