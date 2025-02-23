
abstract class Figura(val color: String) {
    abstract fun area(): Double
    abstract fun perimetro(): Double
}

class Circulo(color: String, val radio: Double) : Figura(color) {
    override fun area(): Double = Math.PI * radio * radio
    override fun perimetro(): Double = 2 * Math.PI * radio
}

class Rectangulo(color: String, val base: Double, val altura: Double) : Figura(color) {
    override fun area(): Double = base * altura
    override fun perimetro(): Double = 2 * (base + altura)
}

class Triangulo(color: String, val lado1: Double, val lado2: Double, val lado3: Double) : Figura(color) {
    override fun area(): Double {
        val s = (lado1 + lado2 + lado3) / 2
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3))
    }
    override fun perimetro(): Double = lado1 + lado2 + lado3
}

fun main() {
    val circulo = Circulo("Rojo", 5.0)
    println("Círculo - Color: ${circulo.color}, Área: ${circulo.area()}, Perímetro: ${circulo.perimetro()}")

    val rectangulo = Rectangulo("Azul", 4.0, 6.0)
    println("Rectángulo - Color: ${rectangulo.color}, Área: ${rectangulo.area()}, Perímetro: ${rectangulo.perimetro()}")

    val triangulo = Triangulo("Verde", 3.0, 4.0, 5.0)
    println("Triángulo - Color: ${triangulo.color}, Área: ${triangulo.area()}, Perímetro: ${triangulo.perimetro()}")
}
