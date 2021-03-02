object Main {
    
    def sum_numbers(A: Integer, B: Integer): Integer = {
        return A + B
    }
    
    def formatResponse(value: Integer): String = {
        return f"X = $value"
    }

    def main(args: Array[String]) {
        val a = scala.io.StdIn.readInt()
        val b = scala.io.StdIn.readInt()
        println(formatResponse(sum_numbers(a,b)))
    }

}
