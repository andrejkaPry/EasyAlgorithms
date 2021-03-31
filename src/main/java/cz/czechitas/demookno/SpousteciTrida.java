package cz.czechitas.demookno;

import java.io.*;
import java.lang.*;
import java.lang.String;
import java.util.*;

public class SpousteciTrida {

    public static void main(String[] args) throws IOException {

        //Napište program, který ze zadané hodnoty průměru vypočítá objem kulového zásobníku na vodu.
        // Výslednou hodnotu nechte vypsat na obrazovku jak v metrech krychlových, tak v litrech. Dále předpokládejme,
        // že tento zásobník je umístěn v pouštní základně, kterou obývá n osadníků, kde n je proměná, jejíž hodnotu budeme
        // zadávat. Program rovněž vypíše, na kolik dní vystačí voda v zásobníku při spotřebě 10 litrů na osobu a den, kde
        // spotreba bude konstanta.
        //Poznámka: k výpočtu objemu budete potřebovat „pi“. Použijte tedy buď vlastní konstantu, nebo použijte funkci Pi.

        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej prumer v centimetrech: ");
        double r = (sc.nextDouble())/2;

        System.out.println("Zadej pocet lidi na pousti: ");
        int n = (sc.nextInt())*10;

        double volumeCM = 1.3333 * Math.PI * Math.pow(r, 3);
        double volumeL = volumeCM / 1000;
        double volumeM = volumeL / 1000;
        double numDays = volumeL/n;

        System.out.println("Objem kuloveho zasobniku na vodu je " + volumeL + " litru, coz je " + volumeM + " metru kubickych.");
        System.out.println("Tento objem vody by " + n + " lidem na pousti vydrzel " + numDays + " dnu.");

        // Napiš program, který po zadání známky vypíše známku ve formě textu (např. 2 – chvalitebně).

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Zadej znamku");
//        int znamka = sc.nextInt();
//
//        if (znamka == 1) {
//            System.out.println("Zadal jsi " + znamka + " co znamena vyborny.");
//        } else if (znamka == 2) {
//            System.out.println("Zadal jsi " + znamka + " co znamena chvalitebny.");
//        } else if (znamka == 3) {
//            System.out.println("Zadal jsi " + znamka + " co znamena dobry.");
//        } else if (znamka == 4) {
//            System.out.println("Zadal jsi " + znamka + " co znamena dostatecny.");
//        } else if (znamka == 5) {
//            System.out.println("Zadal jsi " + znamka + " co znamena nedostatecny.");
//        }

        // Napište program, který zjistí, zda dvě celá čísla zadaná na vstupu splňují
        //nerovnost 4x + 3 < 5y – 2.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Zadej prvni cislo: ");
//        int x = sc.nextInt();
//        System.out.println("Zadej druhe ciso: ");
//        int y = sc.nextInt();
//        int vysledekX = 4*x + 3;
//        int vysledekY = 5*y - 2;
//
//        if (vysledekX < vysledekY) {
//            System.out.println("Splnuje");
//        } else {
//            System.out.println("Nesplnuje");
//        }



        //Zjistěte, zda zadané číslo a patří nebo nepatří do intervalu <0,100>.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Zadej jakekoliv cislo: ");
//        int a = sc.nextInt();
//
//        if (a > 0 && a < 100){
//            System.out.println("Zadane cislo " + a + " je v intervalu");
//        } else {
//            System.out.println("Zadane cislo neni v intervalu.");
//        }


        //Na vstupu je zadané číslo. Sestavte program, který zjistí, zda je číslo kladné, záporné nebo nula a vypíše o tom zprávu.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Zadej jakekoliv cislo: ");
//        int input = sc.nextInt();
//
//        if (input > 0) {
//            System.out.println("Cislo " + input + " je kladne");
//        } else if (input < 0) {
//            System.out.println("Cislo " + input + " je zaporne");
//        } else {
//            System.out.println("Cislo je rovne 0");
//        }

        

        //  Na vstupu jsou zadány velikosti drah v km a časů v h dvou automobilů. Sestavte program, který spočítá
        //  jejich průměrnou rychlost a zjistí, které auto je rychlejší a o kolik.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Zadej drahu prvniho automobilu v km: ");
//        double s1 = sc.nextDouble();
//        System.out.println("Zadej cas prvniho automobilu v hodinach: ");
//        double t1 = sc.nextDouble();
//        System.out.println("Zadej drahu druheho automobilu v km: ");
//        double s2 = sc.nextDouble();
//        System.out.println("Zadej cas druheho automobilu v hodinach: ");
//        double t2 = sc.nextDouble();
//
//        double v1 = s1 / t1;
//        double v2 = s2 / t2;
//        double vysledek;
//
//        if (v1 > v2){
//           vysledek = v1 - v2;
//            System.out.println("Vyhrava prvni automobil s prumernou rychlosti " + v1 + " km/h coz je o " + vysledek + " km/h rychlejsi nez druhy automobil.");
//        } else {
//            vysledek = v2 - v1;
//            System.out.println("Vyhrava druhy automobil s prumernou rychlosti " + v2 + " km/h coz je o " + vysledek + " km/h rychlejsi nez prvni2 automobil.");
//        }


        //  Na vstupu jsou dána dvě čísla.  Sestavte program, který zjistí, které číslo je větší a o kolik.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Zadej prvni cislo: ");
//        int a = sc.nextInt();
//        System.out.println("Zadej druhe cislo: ");
//        int b = sc.nextInt();
//        int vysledek;
//
//        if (a>b) {
//            vysledek = a -b;
//            System.out.println("Cislo " + a + " je vetsi od " + b + " o " + vysledek);
//        } else {
//            vysledek = b - a;
//            System.out.println("Cislo " + b + " je vetsi od " + a + " o " + vysledek);
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Napis nekolikaciferne cislo: ");
//        int suma = 0;
//        int pom;
//        int a;
//        int x = sc.nextInt();
//        LinkedList<Integer> priklad = new LinkedList<Integer>();
//
//        while (x >= 10) {
//            pom = x / 10;
//            a = x % 10;
//            suma = suma + a;
//            x = pom;
//        }
//        System.out.println(suma+x);

//        int vysledek = priklad.get(0) + priklad.get(1);
//        System.out.println(vysledek);

//        String ab = sc.nextLine();
//        String[] arr = ab.split("");
//        int AB = ab.


//        int vysledek = a + b;
//        System.out.println(vysledek);

//        int a = 54;
//        int b = 27;
//
//
//        while (a != b) {
//            if (a > b) {
//                a = a - b;
//            } else {
//                b = b - a;
//            }
//        } System.out.println(a);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Zadejte svoji vysku v metrech: ");
//        double v = sc.nextDouble();
//        System.out.println("Zadejte svoji vahu v kilogramech");
//        double m = sc.nextDouble();
//        double BMI = m / (v*v);
//
//        if (BMI < 19){
//            System.out.println("Vase BMI je : " + BMI + " Tento stav je spojen s hrozícími zdravotními riziky, měli byste alespoň mírně přibrat.");
//        } else if (BMI > 19 && BMI < 25) {
//            System.out.println("Vase BMI je : " + BMI + " Máte ideální váhu.");
//        } else if (BMI > 25 && BMI < 30) {
//            System.out.println("Vase BMI je : " + BMI + " Zdravotní rizika spojená s tělesnou hmotností jsou mírně zvýšená.");
//        } else if (BMI > 30 && BMI < 35) {
//            System.out.println("Vase BMI je : " + BMI + " Hrozí vám velká zdravotní rizika, začněte s dietním programem.");
//        } else if (BMI > 35 && BMI < 40) {
//            System.out.println("Vase BMI je : " + BMI + " Hrozí vám velmi vysoká zdravotní rizika, jděte k lékaři.");
//        } else if (BMI > 40) {
//            System.out.println("Vase BMI je : " + BMI + " Urychleně se svou hmotností něco dělejte, jste v ohrožení života.");
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Vloz znak: ");
//       // String input = sc.nextLine();
//       // char z = input.charAt(0);
//        int a = sc.nextInt();
//
//        if(a == 1){
//            System.out.println("Vyborny");
//        } else if (a == 2) {
//            System.out.println("Chvalitebny");
//        } else if (a == 3) {
//            System.out.println("Dobry");
//        } else if (a == 4) {
//            System.out.println("Dostatecny");
//        } else if (a == 5) {
//            System.out.println("Nedostatecny");
//        } else {
//            System.out.println("Takova znamka neni.");
//        }

//        if (z >= 'a' && z <= 'z') {
//            System.out.println("Znak je male pismeno.");
//        } else if (z >= 'A' && z <= 'Z') {
//            System.out.println("Znak je velke pismeno.");
//        } else if (z >= '1' && z <= '9') {
//            System.out.println("Znak je cislo.");
//        } else {
//            System.out.println("Jiny znak.");
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Zadej polomer kruhu: ");
//        double r = sc.nextDouble();
//        double obvodKruhu = (2*3.14) * r;
//        System.out.println(obvodKruhu);

//        Scanner znak = new Scanner(System.in);
//        String pismeno = znak.nextLine();
//        int cislo = znak.nextInt();

//        System.out.println(pismeno);
//        System.out.println(cislo);

//        if(znak == pismeno){
//            System.out.println("Vlozeny znak " + pismeno + " je pismeno");
//        } if else (znak == cislo) {
//            System.out.println("Vlozeny znak " + cislo + " je cislo");
//        }

//        int c, pocet, suma;
//        pocet = 0;
//        suma = 0;
//
//        while (c==0){
//           pocet = pocet + 1;
//           suma = suma + c;
//        }

//        int[] seznamCisel = {1, 2, 5, 8, 1, 1,};
//        int pocetJednicek = 0;
//
//        if (seznamCisel[0] == 1) {
//            pocetJednicek++;
//        }
//        if (seznamCisel[1] == 1) {
//            pocetJednicek++;
//        }
//        if (seznamCisel[2] == 1) {
//            pocetJednicek++;
//        }
//        if (seznamCisel[3] == 1) {
//            pocetJednicek++;
//        }
//        if (seznamCisel[4] == 1) {
//            pocetJednicek++;
//        }
//        if (seznamCisel[5] == 1) {
//            pocetJednicek++;
//        }
//
//        System.out.println(pocetJednicek);

//        int a = 1;
//        int b = 1;
//        int c = 1;
//
//        if(a==b && a==c){
//            System.out.println("Hura mame trojuhelnik");
//        }
//         else if(a==b && b==c){
//            System.out.println("Hura mame trojuhelnik");
//        } else {
//            System.out.println("Bohuzel nemame trojuhelnik");
//        }

//        int a = 0;
//        int b = - 2;
//        int c = - 4;
//        int zaporneCislo = 0;
//
//        List<Integer> seznamZapornychCisel = new ArrayList<>();
//
//        if(a<0){
//            zaporneCislo ++;
//        }
//        if(b<0){
//            zaporneCislo ++;
//        }
//        if(c<0){
//            zaporneCislo ++;
//        }
//
//        System.out.println(zaporneCislo);
//
//
//        if (a<0) {
//            seznamZapornychCisel.add(a);
//        }
//
//        if(b<0){
//            seznamZapornychCisel.add(b);
//        }
//
//        if (c<0){
//            seznamZapornychCisel.add(c);
//        }
//
//        boolean emptyList = seznamZapornychCisel.isEmpty();
//
//        if (emptyList == true){
//            System.out.println("Zadne z cisel neni zaporny");
//        } else {
//            System.out.println(seznamZapornychCisel);
//        }

//        int a = -8;
//        if (a>0){
//            System.out.println("A je kladne cislo.");
//        } else if(a<0){
//            System.out.println("A je zaporne cislo");
//        } else {
//            System.out.println("A je rovna 0.");
//        }

//        int a = 1;
//        int b = 3;
//        int max = Math.max(a, b);
//        int rozdil = a - b;
//
//        if (rozdil<0){
//            int vysledek =  - rozdil;
//            System.out.println("Maximalni cislo je: " + max + " a rozdil je: " + vysledek);
//        } else {
//            System.out.println("Maximalni cislo je: " + max + " a rozdil je: " + rozdil);
//        }

//        int a=1;
//        int b=2;
//        int c=3;
//        int d=4;
//        System.out.println(a*b*c*d);
//        int r = -3;
//        double obsahKruhu = 3.14 * Math.sqrt(r);
//
//
//        if (r>0){
//            double obvodKruhu = (2*3.14) * r;
//            System.out.println(obvodKruhu);
//        }  else {
//            System.out.println("Polomer musi byt kladne cislo");
//        }

//        int[] n = {5, 4, 10, 8, 12, 16};
//        Arrays.sort(n);
//        int maximum;
//        int a = Math.max(n[0], n[1]);
//        int b = Math.max(n[2], n[3]);
//        int c = Math.max(n[4], n[5]);
//
//        if(a>b){
//           maximum = a;
//        } else {
//            maximum = b;
//        }
//        if (c>maximum){
//            maximum = c;
//        }
//        System.out.println(maximum);

//        int a=10;
//        int b=15;
//        int c=13;
//        int max;
//
//        if(a>b){
//            max = a;
//        } else {
//            max = b;
//        }
//        if(c>max){
//            max = c;
//        }
//        System.out.println(max);

//        char[] seznamPismen = {'a', 'a', 'a', 'a', 'b', 'b', 'a',};
//
//        Arrays.sort(seznamPismen);
//
//        System.out.println(Arrays.toString(seznamPismen));
//
//        int pocetA = 0;
//
//        if(seznamPismen[0] == 'a'){
//                pocetA ++;
//            }
//        if(seznamPismen[1] == 'a'){
//            pocetA ++;
//        }
//        if(seznamPismen[2] == 'a'){
//            pocetA ++;
//        }
//        if(seznamPismen[3] == 'a'){
//            pocetA ++;
//        }
//        if(seznamPismen[4] == 'a'){
//            pocetA ++;
//        }
//        if(seznamPismen[5] == 'a'){
//            pocetA ++;
//        }
//        if(seznamPismen[6] == 'a'){
//            pocetA ++;
//        }
//
//        System.out.println(pocetA);
    }
}




