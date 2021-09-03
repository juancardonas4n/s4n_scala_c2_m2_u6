
def cuandoString(pred:Boolean, cuandoVerdadero:String, cuandoFalso:String):String = 
  pred match {
    case true => cuandoVerdadero
    case false => cuandoFalso
  }

def cuandoUnit(pred:Boolean, cuandoVerdadero:Unit, cuandoFalso:Unit):Unit = 
  pred match {
    case true => cuandoVerdadero
    case false => cuandoFalso
  }
