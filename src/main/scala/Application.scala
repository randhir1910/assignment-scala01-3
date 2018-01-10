object Application {
  def main(args: Array[String]) {
    val num1 = 12
    val num2 = 1
    val num3 = 12
    val num4 = 13
    val num5 = 10
    val operation=new MathOperation
    println(operation.mergeAddValue(List(num1,num2,num3,num4,num5),List(num1,num2,num3,num4,num5)))
     operation.fibonacciSeries(10)
     val doubleElement = operation.doubleListElement(List(num1,num2,num3,num4))
     print("\n" + doubleElement + "\n")
    val shape="rectangle"
    print(operation.area(shape.toLowerCase(),6,5) +"\n")
    print(operation.nthListElement(3,List(num1,num2,num3,num4,num5)) + "\n")
    print(operation.listCount(List(num1,num2,num3,num4,num5)) + "\n")
    print(operation.reverseList(List(num1,num2,num3,num4,num5)))

  }

}
