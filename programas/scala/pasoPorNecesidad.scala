
val x = {
  println("computando valor")
  util.Random.nextInt(10)
}

def y = {
  println("computando valor 2")
  util.Random.nextInt(10)
}

lazy val z = {
  println("computando valor 3")
  util.Random.nextInt(10)
}
