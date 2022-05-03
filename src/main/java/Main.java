public class Main {
    public static void main(String[] args){
        //работа заданного класса "Calculator":
        System.out.println("Пример заданной работы класса Калькулятор");
        Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(32)
                        .addOperand(4)
                        .calculate(Calculator.Operation.DIV)
                        .result()
        );
        //Работа адаптера:
        System.out.println("Демонстрация работы адаптера");
        Ints intsCalc = new IntsCalculator();
        System.out.println("Сложение чисел 2 и 13:");
        System.out.println(intsCalc.sum(2, 13));
        System.out.println("Вычитание числа 17 из числа 23:");
        System.out.println(intsCalc.sub(23, 17));
        System.out.println("Умножение чисел 12 и 11:");
        System.out.println(intsCalc.mult(12, 11));
        System.out.println("Деление числа 80 на число 16");
        System.out.println(intsCalc.div(80, 16));
        System.out.println("Возведение числа 2 в степень 10");
        System.out.println(intsCalc.pow(2, 10));
    }
}
