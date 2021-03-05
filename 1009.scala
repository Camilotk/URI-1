object Main {

    def seller_comission(total_sales_value: Double): Double = {
        total_sales_value * 0.15
    }
    
    def seller_total_salary(salary: Double, total_sale_value: Double): Double = {
        salary + seller_comission(total_sale_value)
    }

    def formatOutput(value: (String, Double)): String = {
        // val name: String = value._1
        val salary: Double = value._2

        return f"TOTAL = R$$ $salary%.2f"
    }

    def main(args: Array[String]): Unit = {
        // --
        val seller_name: String = scala.io.StdIn.readLine()
        val seller_fixed_salary: Double = scala.io.StdIn.readDouble()
        val total_sale_value_in_dolars: Double = scala.io.StdIn.readDouble()

        // --
        val seller_salary: Double = seller_total_salary(seller_fixed_salary, total_sale_value_in_dolars)
        val message: String = formatOutput((seller_name, seller_salary))

        // --
        println(message)
    }

}