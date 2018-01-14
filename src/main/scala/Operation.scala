class Operation {
  def mergeAddValue(list1: List[Int], list2: List[Int]): List[Int] = {
    list1.zipAll(list2, 0, 0) map {
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

  def area(shape: String, first: Int, second: Int, function: (Int, Int) => Int): Any = {
    def innerArea(first: Int, second: Int, f: (Int, Int) => Int): Int = {
      f(first, second)
    }

    shape match {
      case "rectangle" => innerArea(first, second, function)
      case "rhombus" => innerArea(first, second, function)
      case "parallelogram" => innerArea(first, second, function)
      case _ => s"Not defined yet for $shape"
    }
  }

  def listCount(list: List[Int], countList: Int = 0): Int = {
    list match {
      case Nil => countList
      case head :: tail => listCount(tail, countList + 1)
    }
  }

  def nthListElement(index: Int, list: List[Int], result: Int = 0): Int = {
    list match {
      case x if (index == -1) => result
      case head :: tail => nthListElement(index - 1, tail, head)
    }
  }

  def doubleListElement(list: List[Int]): List[Int] = {
    list.map(x => 2 * x)
  }

  def reverseList(list: List[Int], result: List[Int]): List[Int] = {
    list match {
      case Nil => result
      case head :: tail => reverseList(tail, head :: result)
    }
  }
}
