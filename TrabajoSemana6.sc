//Metodo de Integracion Numerica Simpson 1/3.
def Simpson (f:(Double)=> Double, a: Double, b: Double): Double ={
  val x = (a + b) / 2
  (b - a)*( f(a) + (4 * f(x) ) + f(b) ) / 6
}
//Metodo para calcular el error que representa cada aproximacion
val CalcularError = (valorEsperado:Double, valorObtenido:Double)=> Math.abs((valorEsperado - valorObtenido))

//Defino la Funcion que toma como parametro X y devuelve la expresion
val funcion1 = (x: Double)=> -Math.pow(x,2) + (8 * x)  - 12
Simpson(funcion1,3,5)
CalcularError(7.33,Simpson(funcion1,3,5))

val funcion2 = (x: Double)=> 3 * Math.pow(x,2)
Simpson(funcion2,0,2)
CalcularError(8,Simpson(funcion2,0,2))

val funcion3 = (x: Double)=> x + (2 * Math.pow(x,2)) - Math.pow(x,3) + (5 * Math.pow(x,4))
Simpson(funcion3,-1,1)
CalcularError(3.333,Simpson(funcion3,-1,1))

val funcion4 = (x: Double)=> (2*x +1)/(Math.pow(x,2)+x)
Simpson(funcion4,1,2)
CalcularError(1.09861,Simpson(funcion4,1,2))

val funcion5 = (x: Double)=> Math.pow(Math.E,x)
Simpson(funcion5,0,1)
CalcularError(1.71828,Simpson(funcion5,0,1))

val funcion6 = (x: Double)=> 1/(Math.sqrt(x-1))
Simpson(funcion6,2,3)
CalcularError(0.828427,Simpson(funcion6,2,3))

val funcion7 = (x: Double)=> 1/(1+Math.pow(x,2))
Simpson(funcion7,0,1)
CalcularError(0.785398,Simpson(funcion7,0,1))