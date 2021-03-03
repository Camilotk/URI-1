object Main {
    def total_salary(hours: Int, value: Double): Double = {
        return hours * value
    }

    def formatOutput(value: (Int, Double)): List[String] = {
        val number: Int = value._1
        val salary: Double = value._2
        return List(f"NUMBER = $number", f"SALARY = U$$ $salary%.2f")
    }

    def main(args: Array[String]): Unit = {
        val employee_number = scala.io.StdIn.readInt()
        val hours = scala.io.StdIn.readInt()
        val hour_value = scala.io.StdIn.readDouble()

        val outputStrings = formatOutput((employee_number, total_salary(hours, hour_value)))
        outputStrings.map(println)
    }
}