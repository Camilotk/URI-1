object Main {
    
    def sum(first_number: Integer, 
            second_number: Integer): Integer = {
        return first_number + second_number            
    }
    
    def formatResult(result: Integer): String = {
        return f"SOMA = $result"
    }

    def main(args: Array[String]): Unit = {
        val a = scala.io.StdIn.readInt()
        val b = scala.io.StdIn.readInt()
        
        println(formatResult(sum(a, b)))
    }

}
