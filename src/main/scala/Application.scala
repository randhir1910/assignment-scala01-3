import org.apache.log4j.Logger

object Application {
  def main(args: Array[String]) {
    val log = Logger.getLogger(this.getClass)
    val num1 = 12
    val num2 = 2
    val num3 = 6
    val num4 = 5
    val num5 = 10
    val operation = new Operation
    log.info(operation.mergeAddValue(List(num1, num2, num3, num5), List(num1, num2, num3)) + "\n")
    operation.fibonacciSeries(num5)
    val doubleElement = operation.doubleListElement(List(num1, num2, num3, num4))
    log.info("\n" + doubleElement + "\n")

    val shape = "rectangle"
    val rhombus = (a: Int, b: Int) => a * b
    log.info(operation.area(shape, num4, num5, rhombus) + "\n")
    log.info(operation.nthListElement(num2, List(num1, num2, num3, num4, num5)) + "\n")
    log.info(operation.listCount(List(num1, num2, num3, num4, num5)) + "\n")
    log.info(operation.reverseList(List(num1, num2, num3, num4, num5), List()))
  }

}
