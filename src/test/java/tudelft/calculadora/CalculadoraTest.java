package tudelft.calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    @Test
    void testSuma() {
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(15, 8);
        Assertions.assertEquals(23, resultado);
    }
}
