import java.util._

def loop(times:Int)(body: => Unit):Unit =
  if (times > 0) { body; loop(times - 1)(body) } else ()


def loopExample():Unit = {
  val scan = new Scanner(System.in)
  loop(5) {
    println("Entre dos valores")
    val a = scan.nextInt()
    val b = scan.nextInt()
    println("El resultado: " + (a + b))
  }
}
