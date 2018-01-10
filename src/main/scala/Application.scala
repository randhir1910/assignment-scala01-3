object Application {
  def main(args: Array[String]) {
    val num1 = 12
    val num2 = 3
    val num3 = 6
    val num4 = 5
    val num5 = 10
    val operation = new MathOperation
    print(operation.mergeAddValue(List(num1, num2, num3, num5), List(num1, num2, num3, num4)) + "\n")
    operation.fibonacciSeries(num5)
    val doubleElement = operation.doubleListElement(List(num1, num2, num3, num4))
    print("\n" + doubleElement + "\n")
    val shape = "rhombus"
    print(operation.area(shape.toLowerCase(), num3, num4) + "\n")
    print(operation.nthListElement(num2, List(num1, num2, num3, num4, num5)) + "\n")
    print(operation.listCount(List(num1, num2, num3, num4, num5)) + "\n")
    print(operation.reverseList(List(num1, num2, num3, num4, num5)))

  }

}
