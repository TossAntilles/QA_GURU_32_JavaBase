public class Operations {

    public static void main(String[] args) {
        System.out.println("Operations");
        overflowDataValues();
        mathOperations();
        logicOperations();
        dataTypeCombinations();
    }

    //0) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой
    //  добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)
    static void overflowDataValues() {
        System.out.println("============================");
        int integerMax = Integer.MAX_VALUE;
        int integerMin = - Integer.MIN_VALUE;
        System.out.println(integerMax + " Max Int");
        System.out.println(integerMin + " Min Int");
        System.out.println("more and less then max class value");
        System.out.println(++integerMax + " Max Int ++");
        System.out.println(--integerMin + " Min int ++");

    }

    //1) поупражняться с математическими и логическими операторами
    static void mathOperations() {
        System.out.println("============================");
        int integerMax = 32767;
        System.out.println( ((integerMax*2) > (integerMax*1.5)) + " - correct compare");
        System.out.println( ((integerMax*2) % (integerMax*1.5) == 0) + " - incorrect compare");

    }

    static void logicOperations() {
        System.out.println("============================");
        int integerMax = 32767;
        int integerMid = 0;
        System.out.println( (integerMid < (integerMax-1) && integerMax < integerMax) + " - AND");
        System.out.println( (integerMid < (integerMax-1) && integerMax < integerMax) + " - OR");
    }

    //2) попробовать вычисления комбинаций типов данных (int и double)
    static void dataTypeCombinations(){
        System.out.println("============================");
        int integerMax = 32767;
        byte byteVar = 127;
        float floatVar = 3.5F;
        System.out.println((byte)byteVar*2 + " byte out of range");
        System.out.println((byte)byteVar*floatVar + " byte * float");
        System.out.println(integerMax/floatVar + " Integer /  float");
        System.out.println((int)(integerMax/floatVar) + " Integer /  float => type changed to int");
        System.out.println(integerMax*floatVar + " Integer *  float");
        System.out.println(floatVar*integerMax + " float * Integer");

    }


}

