
val cuadratica = (a:Double) => (b:Double) => (c:Double) => {
  val b2 = b * b
  val ac = 4 * a  * c
  val a2 = 2 * a
  val mb = -b
  ((mb + math.sqrt(b2 - ac))/a2, (mb - math.sqrt(b2 - ac))/a2)
}

def raices(li:Int,ls:Int):List[(Double,Double)] = {
    val cuad_3_5 = cuadratica(3.0)(-5.0)
    def iter(limInf:Int,res:List[(Double,Double)]):List[(Double,Double)] = 
        if (limInf > ls) res else iter(limInf +1, res :+ (cuad_3_5(limInf)))
    iter(li,List())
}
