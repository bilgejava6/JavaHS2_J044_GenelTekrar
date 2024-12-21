package com.muhammet;

public class Runner {
    public static void main(String[] args) {
        /**
         * Muhammet HOCA
         *
         * ** DEĞİŞKENLER
         * -- Kolay
         * 	1.	Bir tamsayı değişkeni oluşturun ve ona 10 değerini atayın. Bu değişkeni ekrana yazdırın.
         * 	2.	Bir double türünde değişken tanımlayın ve 3.14 değerini atayın. Değeri konsola yazdırın.
         * 	3.	Bir String değişken oluşturup adınızı atayın. Bu değişkeni kullanarak “Merhaba, [adınız]!” çıktısını alın.
         * 	4.	boolean türünde bir değişken tanımlayın ve ona true değeri verin. Değeri konsolda yazdırın.
         * 	5.	Bir char türünde değişken oluşturun ve ilk harfinizi atayın. Değeri ekrana yazdırın.
         * 	6.	İki tamsayı değişkeni oluşturun (x=5 ve y=7). Bu iki sayının toplamını ekrana yazdırın.
         * 	7.	Bir değişken tanımlayın ve ona null atayın. Sonra değerini 100 olarak değiştirin.
         * 	8.	Bir değişken tanımlayın ve değer atamadan önce bir çıktı almaya çalışın. Hata mesajını yorumlayın.
         * 	9.	Bir float değişken oluşturun ve 2.5 değerini atayın. Bu değeri ekrana yazdırın.
         * 	10.	byte türünde bir değişken tanımlayıp 127 değeri verin. Daha büyük bir değer atarsanız ne olur?
         * 	-- ORTA
         * 	1.	Kullanıcıdan yaşını isteyin ve bunu bir değişkende saklayarak konsola yazdırın.
         * 	2.	Bir final değişken oluşturun ve ona bir sabit değer atayın. Daha sonra bu değeri değiştirmeye çalışın ve ne olduğunu açıklayın.
         * 	3.	İki String değişkeni tanımlayın, birine adınızı, diğerine soyadınızı atayın. Bu değişkenleri birleştirerek tam adınızı konsola yazdırın.
         * 	4.	Bir double ve bir int değişken oluşturup bunları topladığınızda çıkan sonucun türü nedir? Test ederek gösterin.
         * 	5.	Bir String değişkenine bir sayısal değer ("123") atayın ve bunu bir int değişkenine dönüştürerek toplama işlemi yapın.
         * 	6.	long türünde bir değişken tanımlayın ve 1 milyar gibi büyük bir sayı atayın. Sonuçta bir hata alır mısınız?
         * 	7.	Bir değişken tanımlayın ve önce int, sonra float, ardından String türüne dönüştürerek konsola yazdırın.
         * 	8.	Kullanıcıdan bir kelime girmesini isteyin ve bu kelimenin uzunluğunu hesaplayan bir program yazın.
         * 	9.	Bir short değişken oluşturup bir int değişkenine atayın. Bu işlem sırasında bir hata alır mısınız?
         * 	-- ZOR
         * 	1.	Kullanıcıdan bir String girişi alın ve bunun bir tamsayı olup olmadığını kontrol edin. Eğer tamsayıysa ekrana dönüştürülmüş değerini yazdırın.
         * 	2.	int, float, double, ve char türlerini kapsayacak şekilde bir sınıf oluşturun. Her türde değişkenler için setter ve getter metotları yazın.
         * 	3.	Bir final değişken oluşturun ve bu değişkenin sadece bir kez atanabileceğini göstermek için bir örnek yapın.
         * 	4.	int türünden bir değişken tanımlayın ve buna negatif bir değer atayın. Ardından bu değeri pozitif bir değere dönüştürmek için bir kod yazın.
         * 	5.	byte, short, int, ve long türlerini kapsayacak şekilde bir karşılaştırma yaparak her birinin maksimum değerlerini ekrana yazdıran bir program yazın.
         * 	6.	Kullanıcıdan iki sayı alarak bu sayıların değişken türlerinin eşleşip eşleşmediğini kontrol edin. Eşleşiyorsa toplamlarını yazdırın.
         * 	7.	Bir tamsayı değişkeni tanımlayın ve bu değişkeni bir String değişkene dönüştürün. Bu işlemi iki farklı yöntemle yapın.
         * 	8.	static ve non-static değişkenlerin farkını göstermek için bir sınıf yazın.
         * 	9.	Bir değişken tanımlayın ve bu değişkene += gibi bir işlem uygulayın. İşlemin sonucunu konsola yazdırın.
         * 	10.	Kullanıcıdan bir String ve bir sayı isteyin. Bu ikisini birleştirerek bir cümle oluşturun ve ekrana yazdırın.
         * ** STRING
         *
         * ** DÖNGÜLER
         *Kolay
         * 	1.	for döngüsü kullanarak 1’den 10’a kadar olan sayıları ekrana yazdırın.
         * 	2.	Kullanıcıdan bir sayı alın ve bu sayının faktöriyelini hesaplayan bir program yazın.
         * 	3.	while döngüsü kullanarak 1’den 100’e kadar olan çift sayıları ekrana yazdırın.
         * 	4.	1 ile 50 arasındaki sayılardan 5’in katlarını yazdıran bir döngü yazın.
         * 	5.	Kullanıcıdan bir kelime alın ve bu kelimeyi 5 kez ekrana yazdıran bir kod yazın.
         * 	6.	do-while döngüsü kullanarak 1’den 20’ye kadar olan sayıları yazdırın.
         * 	7.	Bir döngü içinde “Java” kelimesini 3 kez ekrana yazdırın.
         * 	8.	Kullanıcıdan bir sayı alın ve 1’den bu sayıya kadar olan sayıların toplamını hesaplayan bir kod yazın.
         * 	9.	Bir for döngüsüyle 10’dan geriye doğru sayan bir program yazın.
         * 	10.	Bir döngü ile 0’dan 10’a kadar olan sayıların karesini ekrana yazdırın.
         *
         * Orta
         * 	1.	Kullanıcıdan bir sayı alın ve bu sayıya kadar olan tüm asal sayıları ekrana yazdırın.
         * 	2.	Kullanıcıdan bir sayı alın ve bu sayının Fibonacci serisini konsola yazdıran bir program yazın.
         * 	3.	İç içe döngüler kullanarak bir çarpım tablosu oluşturun.
         * 	4.	Kullanıcıdan bir sayı alın ve bu sayıyı tersten yazdıran bir program yazın.
         * 	5.	Kullanıcıdan bir kelime alın ve kelimenin her karakterini bir satıra yazdıran bir kod yazın.
         * 	6.	Bir for döngüsüyle 1’den 100’e kadar olan sayıların toplamını hesaplayın.
         * 	7.	Bir sayı dizisindeki en büyük ve en küçük sayıyı bulan bir döngü yazın.
         * 	8.	Bir while döngüsüyle bir sayının basamaklarının toplamını hesaplayan bir program yazın.
         * 	9.	İç içe döngülerle bir yıldız desen çizdirin (örneğin, piramit).
         * 	10.	1 ile 100 arasındaki sayıları kontrol ederek sadece 3 ve 5’e tam bölünebilenleri ekrana yazdırın.
         *
         * Zor
         * 	1.	Kullanıcıdan bir sayı alın ve bu sayıyı asal çarpanlarına ayıran bir program yazın.
         * 	2.	Bir sayı dizisindeki tüm çift ve tek sayıların toplamını ayrı ayrı bulan bir döngü yazın.
         * 	3.	Kullanıcıdan bir sayı alın ve bu sayının mükemmel sayı olup olmadığını kontrol eden bir program yazın.
         * 	4.	Kullanıcıdan bir kelime alın ve kelimenin permütasyonlarını iç içe döngüler kullanarak yazdırın.
         * 	5.	Kullanıcıdan bir sayı alın ve bu sayıyı binary formatına dönüştüren bir döngü yazın.
         * 	6.	Bir dizi içindeki tekrarlayan öğeleri bulan bir döngü yazın.
         * 	7.	İç içe döngülerle bir elmas deseni çizen bir program yazın.
         * 	8.	Kullanıcıdan bir sayı alın ve bu sayının tersine çevrilmiş halini yazdıran bir döngü yazın.
         * 	9.	Bir for döngüsü kullanarak Pascal üçgenini ekrana yazdıran bir program yazın.
         *
         * ** KARAR YAPILARI
         *
         * ** OOP
         *
         * ** COLLECTIONS
         *
         * ** STREAM API
         *
         * ** THREAD
         *
         */
    }
}
