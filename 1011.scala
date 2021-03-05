object Main {

    def volume_sphere(r: Double): Double = (4/3.0) * 3.14159 * math.pow(r, 3)

    def main(args: Array[String]): Unit = {
        val radius: Double = scala.io.StdIn.readDouble()
        val volume = volume_sphere(radius)
        println(f"VOLUME = $volume%.3f")
    }
}