package task1

object Task1 {
  def main(args: Array[String]): Unit = {
    print(59*23)
  }
}


object HelloWorld extends App{
  print(2+5)
}

object Types extends App{
  var var1: Int = 234
  val const1: Int = 343
  var1 = 54

  val const_long: Long = 34L
  val d1: Double = 1d

  //str
  val str = "abc"
  println(str)
  val c = 'c'

  val div = var1 / const1

  val msg_hello: Unit = println("Hello") // Unit eq void // method

  val b: Boolean = var1 == const1
  // можно использовать когда непонятно или не время реализовать сейчас, например
  //  val n: Nothing = ???
  //  val n1: Nothing = throw new Exception("")
  import java.lang.{Long => jLong}

  val java_long: Long = Long2long(jLong.getLong("12"))
  println(java_long) // 0 - ?? null

// custom types
  type Id = Long
  type Name = String
  type Email = String
  type Contacts = Map[Name, Email]
  //Haskel aaaaaaaaaaa
  val user: Map[Id,Contacts] = Map(1L -> Map("Bob" -> "wer@na.ni"))
  println(user)
}

object StringSmthng extends App {
  var x: Int  = 1
  val x1: Int = 2

  // java : "str " + x
  val str1 = s"$x + $x1 = ${x + x1}" // java 21 => STR.""
  println(str1)
  println("---------------------")
  val str2 =
    """
      |aaa
      |bbb

      Well, thats vertical lines are not important its just formatting
      Anyway there are multiline string""" //.stripMargin
  println(str2)
  println("---------------------")
  val str3 =
    """
      ccc
      |Ahh that vertical line is anti-TAB here...
      ddd
      |.stripMargin do something with that...""".stripMargin
  println(str3)
}

object TupleSmthng extends App {
  val t1: (Int, Int, String, Boolean) = (1, 2, "6", true)
  println(t1._3)
  val t2: (Int, String)            = 1 -> "1"
  val t3: ((Int, String), Boolean) = 1 -> "1" -> true
  println(t3._1._2)

  val (i, s) = t2
  println("-----.map-------")
    val m: Map[Int, Int] = Map(1 -> 2, 2 -> 3, 3 -> 4)
  //  java: map(x -> {x+x; x-x})
    m.map {
      case (k, v) =>
        println(k*v)
        k*v
    }
  var count: Int = 0
  val tuple_map: Map[Int, String] = Map(1 -> "Eli", 2 -> "Barney", 3 -> "Alyx")
  tuple_map.map {
    case (k, v) =>
      println(k + " - " + v)
      count += 1
      count

  }
  println(s"Count = $count")
}

object DefFun extends App {
  // void myPrint(String str) { sout(str) }
  //def - метод aka функция

  def myPrint(str: String): Unit = println(str)
  myPrint("s")
  def myPrint1(str: String, i: Int): Int = {
    println(i)
    println(str)
    //str
    i
  }
  myPrint1("s", 1)
  val x1: Int => Int = myPrint1("s", _)
  def myPrint2(str: String)(i: Int): Int = {
    println(i)
    println(str)
    //str
    i
  }
  val x: Int => Int = myPrint2("s")(_)
  x(1)
    // все ==
    //лямбда функции?
  val x2: Int => Int = (i: Int) => i * 2
  val x3: Int => Int = i => i * 2
  val x4: Int => Int = _ * 2

  x2.apply(1)
}

object DefaultDefParam extends App {
  def myPrint1(str: String, i: Int = 1, d: Double): Int = {
    println(i)
    println(str)
    //str
    i
  }
  myPrint1(
    d = 1d,
    str = "1",
    //i = 3
  )
}