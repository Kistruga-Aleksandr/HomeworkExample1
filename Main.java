public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        byte Byte = 20;
        short Short = 200;
        int Int = 1000;
        long Long = 10000L;
        float Float = 10.5F;
        double Double = 15.6;
        boolean Boolean = true;
        char Char = 'C';
    }

    public static void task2() {
        double Boxer1 = 78.2;
        double Boxer2 = 82.7;
        double weightOfBoxers = Boxer1 + Boxer2;
        System.out.println("��� �������� " + weightOfBoxers + " ��");
        double theDifferenceInTheWeightOfBoxers = Boxer2 - Boxer1;
        System.out.println(" ������� � ���� �������� " + theDifferenceInTheWeightOfBoxers + " ��");
    }

    public static void task3() {
        var quantityBananasPieces = 5;
        var quantityMilkMilliliters = 200;
        var quantityIceCreamSundaeBriquettes = 2;
        var quantityRawEggsPieces = 4;
        var weight1BananasGrams = 80;
        var weight100MillilitersMilkGrams = 105;
        var weight1IceCreamSundaeBriquettes = 100;
        var weight1RawEggsGrams = 70;
        var weightBananasGrams = quantityBananasPieces * weight1BananasGrams;
        var weightMillilitersMilkGrams = weight100MillilitersMilkGrams * quantityMilkMilliliters / 100;
        var weightIceCreamSundaeBriquettesGrams = weight1IceCreamSundaeBriquettes * quantityIceCreamSundaeBriquettes;
        var weightRawEggsGrams = weight1RawEggsGrams * quantityRawEggsPieces;
        double sportsBreakfastGrams = weightBananasGrams + weightMillilitersMilkGrams + weightIceCreamSundaeBriquettesGrams + weightRawEggsGrams;
        var sportsBreakfastKilogram = sportsBreakfastGrams / 1000;
        System.out.println("��� �������� ���������� ����� ����������� = " + sportsBreakfastKilogram + " ��!");
    }

    public static void task4() {
        int needToResetGrams = 7 * 1000;// ������� ���������� � ������.
        int WeightLossPerDay250Grams = 250;
        int WeightLossPerDay500Grams = 500;
        int daysToLoseWeight250Grams = needToResetGrams / WeightLossPerDay250Grams;
        System.out.println("�������� ������� �� " + daysToLoseWeight250Grams + " ���� ��� ���������� ������ �� 250 �����");
        int daysToLoseWeight500Grams = needToResetGrams / WeightLossPerDay500Grams;
        System.out.println("�������� ������� �� " + daysToLoseWeight500Grams + " ���� ��� ���������� ������ �� 500 �����");
        int averageNumberDays = (daysToLoseWeight250Grams + daysToLoseWeight500Grams) / 2;
        System.out.println("������� ���������� ��� ������������� ��� ��������� " + averageNumberDays);
    }

    public static void task5() {
        float salaryIncreasePercent = 1.1F; // ��������� �� 10%.
        int month = 12;
        int Masha = 67671;
        int Denis = 83690;
        int Kristina = 76230;
        float SalaryMashaAfterPromotion = Masha * salaryIncreasePercent;
        float SalaryDenisAfterPromotion = Denis * salaryIncreasePercent;
        float SalaryKristinaAfterPromotion = Kristina * salaryIncreasePercent;
        double SalaryMashaPerYearAfterPromotion = SalaryMashaAfterPromotion * month;
        double SalaryDenisPerYearAfterPromotion = SalaryDenisAfterPromotion * month;
        double SalaryKristinaPerYearAfterPromotion = SalaryKristinaAfterPromotion * month;
        double SalaryMashaPerYear = Masha * month;
        double SalaryDenisPerYear = Denis * month;
        double SalaryKristinaPerYear = Kristina * month;
        double MashaAnnualIncomeHasGrown = SalaryMashaPerYearAfterPromotion - SalaryMashaPerYear;
        double DenisAnnualIncomeHasGrown = SalaryDenisPerYearAfterPromotion - SalaryDenisPerYear;
        double KristinaAnnualIncomeHasGrown = SalaryKristinaPerYearAfterPromotion - SalaryKristinaPerYear;
        System.out.println("���� ������ �������� " + SalaryMashaAfterPromotion + " ������. ������� ����� ����� �� " + MashaAnnualIncomeHasGrown + " ������");
        System.out.println("����� ������ �������� " + SalaryDenisAfterPromotion + " ������. ������� ����� ����� �� " + DenisAnnualIncomeHasGrown + " ������");
        System.out.println("�������� ������ �������� " + SalaryKristinaAfterPromotion + " ������. ������� ����� ����� �� " + KristinaAnnualIncomeHasGrown + " ������");
    }
    public static void task6(){
      int a = 12;
      int b = 27;
      int c = 44;
      int d = 15;
      int e = 9;
      var result = a * (b + (c - d * e));
        result = Math.abs(result);
        System.out.println(result);
        result = -1 * (result);
        System.out.println(result);
    }
    public static void task7(){
        int a = 5;
        int b = 7;
         a = Math.abs(a - b);
         b = b - a;
         a = b + a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void task8(){
        int a = 474;
        int b = a / 10 % 10 ;
        System.out.println(b);

    }

}

