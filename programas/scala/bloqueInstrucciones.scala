def comp1(x: Int):Array[Int] = Array(x,x,x)

def comp2(x: => Int):Array[Int] = Array(x,x,x)

def comp3(x: => Int):Array[Int] = { lazy val y = x
				    Array(y,y,y)
				  }
