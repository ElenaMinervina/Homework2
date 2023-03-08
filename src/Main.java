public class Main {
    public static void main(String[] args) {
        Variables1_3();
        Variables4();
        Variables5();
        Variables6_7();
    }
    public static void Variables1_3() {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
        dog = dog - 3.5;
        cat = cat -1.6;
        paper = paper - 7639;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
    }
    public static void Variables4() {
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void Variables5() {
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void Variables6_7() {
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var summWeight = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес двух бойцов " + summWeight + " кг.");
        var differenceBetweenWeights = weightBoxer2 % weightBoxer1;
        System.out.println("Разница между весами бойцов " + differenceBetweenWeights +" кг.");

        var differenceBetweenWeightsSubtraction = weightBoxer2 - weightBoxer1;
        var differenceBetweenWeightsDivision = weightBoxer2 % weightBoxer1;
        System.out.println("Разница между весами бойцов вычитанием " + differenceBetweenWeightsSubtraction +" кг.");
        System.out.println("Разница между весами бойцов делением " + differenceBetweenWeightsDivision + " кг.");
    }
}