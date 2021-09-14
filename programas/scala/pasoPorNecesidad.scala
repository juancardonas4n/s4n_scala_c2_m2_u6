
val valor = {
  println("computando valor")
  util.Random.nextInt(10)
}

def valor2 = {
  println("computando valor 2")
  util.Random.nextInt(10)
}

lazy val valor3 = {
  println("computando valor 3")
  util.Random.nextInt(10)
}
