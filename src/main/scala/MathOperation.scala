class MathOperation {
  def mergeAddValue(list1: List[Int], list2: List[Int]): List[Int] = {
    list1 zip list2 map {
      case (firstListValue, secondListValue) => firstListValue + secondListValue
    }
  }

  def fibonacciSeries(index: Int) {
    def fiboKth(index: Int, preElement: Int = 0, nextElement: Int = 1): Int = {
      if (index == 1) {
        0
      }
      else if (index == 2) {
        nextElement
      }
      else {
        fiboKth(index - 1, nextElement, nextElement + preElement)
      }
    }

    for (number <- 1 until index) {
      print(fiboKth(number) + ",")
    }
    print(fiboKth(index))
  }

  def area(shape: String, first: Int, second: Int): String = {
    def rectArea(length: Int, breadth: Int): Int = {
      length * breadth
    }

    def rhombusArea(length: Int, breadth: Double): Double = {
      (length * breadth) / 2.0
    }

    shape match {
      case "rectangle" => rectArea(first, second).toString
      case "rhombus" => rhombusArea(first, second).toString
      case "parallelogram" => rectArea(first, second).toString
      case _ => s"Not defined yet for $shape"
    }
  }

  def listCount(list: List[Int], countList: Int = 0): Int = {
    if (list.isEmpty) {
      countList
    }
    else {
      listCount(list.tail, countList + 1)
    }
  }

  def nthListElement(index: Int, list: List[Int]): Int = {
    index match {
      case 0 => list.head
      case _ => nthListElement(index - 1, list.tail)
    }

  }

  def doubleListElement(list: List[Int]): List[Int] = {
    list.map(x => 2 * x)
  }

  def reverseList(list: List[Int]): List[Int] = list match {
    case list :: tail => reverseList(tail) ::: List(list)
    case Nil => Nil
  }
}
