//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int perInt = 1000000000;
        byte perByte = 120;
        short perShort = 32000;
        long perLong = 123456789012345678L;
        float perFloat = 1.2345678f;
        double perDouble = -1.234567;
        System.out.println("Значение переменной perInt с типом int равно " + perInt);
        System.out.println("Значение переменной perByte с типом byte равно " + perByte);
        System.out.println("Значение переменной perShort с типом short равно " + perShort);
        System.out.println("Значение переменной perLong с типом long равно " + perLong);
        System.out.println("Значение переменной perFloat с типом float равно " + perFloat);
        System.out.println("Значение переменной perDouble с типом double равно " + perDouble);

        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        short list = 480;
        byte allUch = (byte) (lP + aS + eA);
        short listUch = (short) (list / allUch);
        System.out.println("На каждого ученика рассчиано " + listUch +" листов бумаги");

        byte proiz = 16;
        byte proizMin = (byte) (proiz / 2);
        short proiz20 = (short) (20 * proizMin);
        System.out.println("За 20 минут машина произвела " + proiz20 +" штук бутылок");
        short proizSut = (short) (proizMin * 24 * 60);
        System.out.println("За сутки машина произвела " + proizSut +" штук бутылок");
        int proiz3Sut = (int) (proizSut * 3);
        System.out.println("За 3 дня машина произвела " + proiz3Sut +" штук бутылок");
        // принимаем месяц равен 31 суткам
        int proizMes = (int) (proizSut * 31);
        System.out.println("За месяц машина произвела " + proizMes +" штук бутылок");

        int allBank = 120;
        int belBank = 2;
        int korBank = 4;
        int kolKlas = (int) (allBank / (belBank + korBank));
        int kolBel = (int) (belBank * kolKlas);
        int kolKor = (int) (korBank * kolKlas);
        System.out.println("В школе, где " + kolKlas + " классов, нужно " + kolBel + " банок белой краски и " + kolKor
                + " банок коричневой краски");

        int kolBan = 5;
        int vesBan = 80;
        int kolMol = 200;
        int vesMol100 = 105;
        int kolMor = 2;
        int vesMor = 100;
        int kolYac = 4;
        int vesYac = 70;
        short allVesGram = (short) (kolBan * vesBan + kolMol * vesMol100 / 100 + kolMor * vesMor + kolYac * vesYac);
        float allVesKG = (float) (allVesGram / 1000f);
        System.out.println("Вес спортзавтрака в граммах " + allVesGram);
        System.out.println("Вес спортзавтрака в килограммах " + allVesKG);

        int vesKG = 7;
        short vesGram = (short) (vesKG * 1000);
        short sbros250 = 250;
        short sbros500 = 500;
        short sbrosDay250 = (short) (vesGram / sbros250);
        short sbrosDay500 = (short) (vesGram / sbros500);
        System.out.println("Для сброса 7 кг по 250 грамм в день потребуется " + sbrosDay250 + " дней");
        System.out.println("Для сброса 7 кг по 500 грамм в день потребуется " + sbrosDay500 + " дней");

        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        int masha10 = (int) (masha / 10);
        int denis10 = (int) (denis / 10);
        int kris10 = (int) (kris / 10);
        System.out.println("Маша теперь получает " + (masha + masha10) + " рублей. Годовой доход вырос на " + (masha10 * 12) + " рублей");
        System.out.println("Денис теперь получает " + (denis + denis10) + " рублей. Годовой доход вырос на " + (denis10 * 12) + " рублей");
        System.out.println("Кристина теперь получает " + (kris + kris10) + " рублей. Годовой доход вырос на " + (kris10 * 12) + " рублей");

    }
}