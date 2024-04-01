public class Main {
    public static void main(String[] args) {
        //Task 01
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершенолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершенолетия, нужно немного подождать");
        }

        //Task 02
        int outsideTemperature = 18;
        if (outsideTemperature <= 5) {
            System.out.println("На улице " + outsideTemperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + outsideTemperature + " градусов, можно идти без шапки");
        }

        //Task 03
        int speed = 90;
        if (speed > 60) {
            System.out.println("Если скороть " + speed + "км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скороть " + speed + "км/ч, можно ездить спокойно");
        }

        //Task 04
        int entranceAge = 16;
        if (entranceAge >= 2 && entranceAge <= 6) {
            System.out.println("Если возраст человека равен " + entranceAge + ", то ему нужно ходить в детский сад");
        } else if (entranceAge >= 7 && entranceAge <= 17) {
            System.out.println("Если возраст человека равен " + entranceAge + ", то ему нужно ходить в школу");
        } else if (entranceAge >= 18 && entranceAge <= 24) {
            System.out.println("Если возраст человека равен " + entranceAge + ", то ему нужно ходить в университет");
        } else if (entranceAge > 24) {
            System.out.println("Если возраст человека равен " + entranceAge + ", то ему пора ходить на работу");
        }

        //Task 05
        int ageRestrictionForAmusementPark = 11;
        if (ageRestrictionForAmusementPark < 5) {
            System.out.println("Если возраст ребенка равен " + ageRestrictionForAmusementPark + ", то он не может кататься на аттракционе");
        } else if (ageRestrictionForAmusementPark >= 5 && ageRestrictionForAmusementPark < 14) {
            System.out.println("Если возраст ребенка равен " + ageRestrictionForAmusementPark + ", то он может кататься на аттракционе только в сопровождении взрослого. Если взрослого нет, то кататья нельзя");
        } else {
            System.out.println("Если возраст ребенка равен " + ageRestrictionForAmusementPark + ", то он может кататься на аттракционе без сопровождения взрослого");
        }

        //Task 06
        int carCapacity = 102;
        int entranceNumber = 99;
        if (carCapacity - entranceNumber >= 42) {
            System.out.println("В вагоне есть свободные сидячие и стоячие места");
        } else if (carCapacity - entranceNumber < 0) {
            System.out.println("Вагон забит, мест не осталось");
        } else System.out.println("В вагоне есть сводобные стоячие места");

        //Task 07
        int one = 57;
        int two = 246;
        int three = 12;
        if (one > two && one > three) {
            System.out.println("Число one большее и равно " + one);
        } else if (two > one && two > three) {
            System.out.println("Число two большее и равно " + two);
        } else if (three > one && three > two) {
            System.out.println("Число three большее и равно " + three);
        }
    }
}