
// main Class
class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Вызов различных версий методов и вывод результатов на экран
        System.out.println("Для целых чисел (int): " + calculator.add(5, 3));
        System.out.println("Для чисел с плавающей запятой (double): " + calculator.add(5.5, 3.3));
        System.out.println("Для вычитания целых чисел (int): " + calculator.subtract(5, 3));
        System.out.println("Для вычитания чисел с плавающей запятой (double): " + calculator.subtract(5.5, 3.3));
        System.out.println("Для умножения чисел с плавающей запятой (int): " + calculator.multiply(5, 3));
        System.out.println("Для умножения чисел с плавающей запятой (double): " + calculator.multiply(5.5, 3.3));
        System.out.println("Для деления целых чисел (int): " + calculator.divide(6, 3));
        System.out.println("Для деления чисел с плавающей запятой (double): " + calculator.divide(6.6, 3.3));
    }

}