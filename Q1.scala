object TemperatureConverter extends App {
  def celsiusToFahrenheit(celsius: Double): Double = (celsius * 9/5) + 32

  def calculateAverageFahrenheit(temperaturesCelsius: List[Double]): Double = {
    val temperaturesFahrenheit = temperaturesCelsius.map(celsiusToFahrenheit)
    val sumFahrenheit = temperaturesFahrenheit.reduce(_+_)
    val averageFahrenheit = sumFahrenheit / temperaturesCelsius.length
    averageFahrenheit
  }

  val celsiusTemperatures = List(0.0, 10.0, 20.0, 30.0)
  val averageFahrenheit = calculateAverageFahrenheit(celsiusTemperatures)

  println(s"Average Fahrenheit temperature: $averageFahrenheit")
}
