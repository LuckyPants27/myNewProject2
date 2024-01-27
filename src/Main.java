public class Main {
    public static void main(String[] args) {

        int firstMeasure = 152;
        byte averageValue = 127;
        short cellNumber = 565;
        long theLength = 10L;
        float secondMeasure = 1.44f;
        double thirdMeasure = 5.33;

        System.out.println("Значение переменной firstMeasure с типом int равно " + firstMeasure);
        System.out.println("Значение переменной averageValue с типом byte равно " + averageValue);
        System.out.println("Значение переменной cellNumber с типом short равно " + cellNumber);
        System.out.println("Значение переменной theLength с типом long равно " + theLength);
        System.out.println("Значение переменной secondMeasure с типом float равно " + secondMeasure);
        System.out.println("Значение переменной thirdMeasure с типом double равно " + thirdMeasure);


        float firstValue = 27.12f;
        long secondValue = 987678965549L;
        double thirdValue = 2.768;
        short forthValue = 569;
        short fifthValue = -159;
        int sixthValue = 27897;
        byte seventhValue = 67;


        byte numberOfStudentsInFirstClass = 23;
        byte numberOfStudentsInSecondClass = 27;
        byte numberOfStudentsInThirdClass = 30;
        short numberOfPaperSheets = 480;
        int eachStudentNumberOfSheets = numberOfPaperSheets/(numberOfStudentsInFirstClass + numberOfStudentsInSecondClass + numberOfStudentsInThirdClass);

        System.out.println("На каждого ученика рассчитано " + eachStudentNumberOfSheets + " листов бумаги");


        byte bottleMakingMachineProductivityIn1Min = 8;
        int bottleMakingMachineProductivityIn20Mins = bottleMakingMachineProductivityIn1Min * 20;
        int bottleMakingMachineProductivityInDay = 24 * 60 * bottleMakingMachineProductivityIn1Min;
        int bottleMakingMachineProductivityIn3Days = bottleMakingMachineProductivityInDay * 3;
        int bottleMakingMachineProductivityInMonth = bottleMakingMachineProductivityIn3Days * 10;

        System.out.println("За 20 минут машина произвела " + bottleMakingMachineProductivityIn20Mins + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottleMakingMachineProductivityInDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottleMakingMachineProductivityIn3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottleMakingMachineProductivityInMonth + " штук бутылок");

        byte numberOfPaintCansForSchoolRepair = 120;
        byte numberOfWhitePaintCansForEachClass = 2;
        byte numberOfBrownPaintCansForEachClass = 4;
        int numberOfClassesInSchool = numberOfPaintCansForSchoolRepair/(numberOfWhitePaintCansForEachClass + numberOfBrownPaintCansForEachClass);
        int numberOfWhitePaintCans = numberOfClassesInSchool * numberOfWhitePaintCansForEachClass;
        int numberOfBrownPaintCans = numberOfClassesInSchool * numberOfBrownPaintCansForEachClass;

        System.out.println("В школе, где " + numberOfClassesInSchool + " классов, нужно " + numberOfWhitePaintCans + " банок белой краски и " + numberOfBrownPaintCans + " банок коричневой краски");


        byte grammsInBanana = 80;
        byte grammsInMilk = 105;
        byte grammsInIceCream = 100;
        byte grammsInRawEgg = 70;
        short grammsPerKilo = 1000;
        int breakfastWeightInGramms = (grammsInBanana * 5) + (grammsInMilk * 2) + (grammsInIceCream * 2) + (grammsInRawEgg * 4);
        float breakfastWeightInKilos = breakfastWeightInGramms / (float) grammsPerKilo;

        System.out.println("Вес спортзавтрака в граммах " + breakfastWeightInGramms);
        System.out.println("Вес спортзавтрака в килограммах " + breakfastWeightInKilos);


        byte numberOfKilosToLose = 7;
        short numberOfGrammsFirstOption = 250;
        short numberOfGrammsSecondOption = 500;
        short grPerKg = 1000;
        int daysToLoseWeightInFirstOption = (numberOfKilosToLose * grPerKg) / numberOfGrammsFirstOption;
        int daysToLoseWeightInSecondOption = (numberOfKilosToLose * grPerKg) / numberOfGrammsSecondOption;

        System.out.println("Если спортсмен будет худет на " + numberOfGrammsFirstOption + " каждый день, то потребуется " + daysToLoseWeightInFirstOption + " дней");
        System.out.println("Если спортсмен будет худет на " + numberOfGrammsSecondOption + " каждый день, то потребуется " + daysToLoseWeightInSecondOption + " дней");


        int firstEmployeeSalaryInMonth = 67760;
        int secondEmployeeSalaryInMonth = 83690;
        int thirdEmployeeSalaryInMonth = 76230;

        int onePercentOfSalaryFirstEmployee = (firstEmployeeSalaryInMonth/100);
        int onePercentOfSalarySecondEmployee = (secondEmployeeSalaryInMonth/100);
        int onePercentOfSalaryThirdEmployee = (thirdEmployeeSalaryInMonth/100);

        byte monthsInAYear = 12;

        int firstEmployeeAnnualIncome = firstEmployeeSalaryInMonth * monthsInAYear;
        int secondEmployeeAnnualIncome = secondEmployeeSalaryInMonth * monthsInAYear;
        int thirdEmployeeAnnualIncome = thirdEmployeeSalaryInMonth * monthsInAYear;

        int firstEmployeeIncreasedSalaryInMonth = firstEmployeeSalaryInMonth + onePercentOfSalaryFirstEmployee * 10;
        int secondEmployeeIncreasedSalaryInMonth = secondEmployeeSalaryInMonth + onePercentOfSalarySecondEmployee * 10;
        int thirdEmployeeIncreasedSalaryInMonth = thirdEmployeeSalaryInMonth + onePercentOfSalaryThirdEmployee * 10;

        int firstEmployeeIncreasedAnnualIncome = firstEmployeeIncreasedSalaryInMonth * monthsInAYear;
        int secondEmployeeIncreasedAnnualIncome = secondEmployeeIncreasedSalaryInMonth * monthsInAYear;
        int thirdEmployeeIncreasedAnnualIncome = thirdEmployeeIncreasedSalaryInMonth * monthsInAYear;

        int diffBetweenSalaryFirstEmployee = firstEmployeeIncreasedAnnualIncome - firstEmployeeAnnualIncome;
        int diffBetweenSalarySecondEmployee = secondEmployeeIncreasedAnnualIncome - secondEmployeeAnnualIncome;
        int diffBetweenSalaryThirdEmployee = thirdEmployeeIncreasedAnnualIncome - thirdEmployeeAnnualIncome;

        System.out.println("Маша теперь получает " + firstEmployeeIncreasedSalaryInMonth + " рублей. Годовой доход вырос на " + diffBetweenSalaryFirstEmployee + " рублей");
        System.out.println("Денис теперь получает " + secondEmployeeIncreasedSalaryInMonth + " рублей. Годовой доход вырос на " + diffBetweenSalarySecondEmployee + " рублей");
        System.out.println("Кристина теперь получает " + thirdEmployeeIncreasedSalaryInMonth + " рублей. Годовой доход вырос на " + diffBetweenSalaryThirdEmployee + " рублей");

    }
}