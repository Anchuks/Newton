 

  def abs(x: Double) = if (x < 0) -x else x
  
  def sqrtIter(rand: Double, x: Double): Double = 
  	if (isGoodEnough(rand, x)) rand
  	else sqrtIter(improve(rand, x), x)
  
  def isGoodEnough(rand: Double, x: Double) = 
  	abs(rand * rand - x) < 0.001
  
  def improve(rand: Double, x: Double) = 
  	(rand + x / rand) / 2
  
  def sqrt(x: Double) = sqrtIter(1.0, x)
  
	sqrt(2)
	sqrt(4)
