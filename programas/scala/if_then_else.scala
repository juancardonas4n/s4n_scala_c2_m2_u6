
def  if_then_else(p:Boolean, thenAction: => Unit, elseAction: => Unit):Unit =  if (p) thenAction else elseAction

def noAction = { println("No action") }

def action = { println("Action") }

if_then_else(true,action,noAction) 

if_then_else(false,action,noAction)
