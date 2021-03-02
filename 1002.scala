object Main {
    val p = 3.14159 
    
    def areaCircle(R: Double): Double = {
        return p * scala.math.pow(R, 2)
    }
    
    def formatResponse(value: Double): String = {
        return f"A=$value%.4f"
    }

    def main(args: Array[String]): Unit = {
        val a = scala.io.StdIn.readDouble()
        println(formatResponse(areaCircle(a)))
    }

}
