
def if_then_else(p:Boolean, thenAction:Unit, elseAction:Unit):Unit = if (p) thenAction else elseAction

val noAction = println("No action")

val action = println("Action")

if_then_else(true,noAction,action) 

if_then_else(false,noAction,action)
