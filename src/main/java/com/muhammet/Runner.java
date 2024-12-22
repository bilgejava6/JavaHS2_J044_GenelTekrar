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
         * ** STRING 60Dk
         * Kolay
         * 	1.	Bir String oluşturun ve uzunluğunu konsola yazdırın.
         * 	2.	“Java Programlama” metnini büyük harflerle ekrana yazdıran bir kod yazın.
         * 	3.	Kullanıcıdan bir metin girmesini isteyin ve metnin ilk harfini konsola yazdırın.
         * 	4.	“Merhaba Dünya” ifadesinde “Dünya” kelimesinin başlangıç indeksini bulun.
         * 	5.	Bir String oluşturun ve ters çevirerek konsola yazdırın.
         * 	6.	İki String değişken tanımlayın ve bu değişkenlerin eşit olup olmadığını kontrol edin.
         * 	7.	Bir String oluşturun ve boş olup olmadığını kontrol eden bir kod yazın.
         * 	8.	“Java çok eğlenceli!” ifadesindeki tüm boşlukları kaldırarak yeni metni yazdırın.
         * 	9.	Kullanıcıdan bir kelime girmesini isteyin ve kelimenin içinde “a” harfinin olup olmadığını kontrol edin.
         * 	10.	“Hello” ve “World” metinlerini birleştirerek konsola yazdırın.
         *
         * Orta
         * 	1.	Bir metni tersine çeviren bir program yazın ve ters metni ekrana yazdırın.
         * 	2.	Kullanıcıdan bir cümle girmesini isteyin ve bu cümledeki kelime sayısını ekrana yazdırın.
         * 	3.	“Bugün hava çok güzel” cümlesindeki tüm “a” harflerini “e” ile değiştiren bir kod yazın.
         * 	4.	Bir metin oluşturun ve içindeki tüm rakamları kaldırarak yeni metni yazdırın.
         * 	5.	Kullanıcıdan bir cümle isteyin ve cümlenin palindrome olup olmadığını kontrol eden bir kod yazın.
         * 	6.	Kullanıcıdan bir kelime alın ve bu kelimenin her harfini alt alta yazdıran bir kod yazın.
         * 	7.	Bir String oluşturun ve ilk 3 karakterini tekrar eden bir metin oluşturun (örneğin: abc → abcabcabc).
         * 	8.	“programlama” kelimesindeki tüm sesli harfleri sayan bir program yazın.
         * 	10.	Kullanıcıdan bir cümle alın ve her kelimenin ilk harfini büyük yaparak yeni bir cümle oluşturun.
         *
         * Zor (ÖDEV OLARAK KALSIN)
         * 	1.	Kullanıcıdan bir String alın ve içindeki kelimelerin sırasını ters çevirerek konsola yazdırın.
         * 	2.	Kullanıcıdan bir cümle alarak her kelimenin karakterlerini ters çeviren bir program yazın.
         * 	3.	“Merhaba Dünya” metnindeki tüm harflerin ASCII değerlerini ekrana yazdıran bir kod yazın.
         * 	4.	Kullanıcıdan bir kelime alın ve içinde tekrarlanan karakterleri çıkararak yeni bir kelime oluşturun.
         * 	5.	Kullanıcıdan bir cümle alın ve cümledeki en uzun kelimeyi ekrana yazdırın.
         * 	6.	Kullanıcıdan bir String alın ve bu metni şifrelemek için her harfi alfabede 3 karakter öteye taşıyan bir program yazın.
         * 	7.	Bir String’in anagram olup olmadığını kontrol eden bir kod yazın.
         * 	8.	Kullanıcıdan bir kelime alın ve kelimenin tüm olası permütasyonlarını konsola yazdırın.
         * 	9.	Kullanıcıdan bir cümle alın ve bu cümledeki kelimelerin uzunluğuna göre sıralama yapan bir program yazın.
         * 	10.	Kullanıcıdan iki metin alın ve ilk metnin ikinci metnin içinde kaç kez geçtiğini bulan bir kod yazın.
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
         *Kolay
         * 	1.	Kullanıcıdan bir sayı alın ve pozitif mi negatif mi olduğunu kontrol edin.
         * 	2.	Kullanıcıdan bir sayı alın ve bu sayının çift mi tek mi olduğunu yazdıran bir program yazın.
         * 	3.	Kullanıcıdan bir yaş değeri alın ve bu yaşa göre “Çocuk”, “Genç”, veya “Yetişkin” yazdırın.
         * 	4.	Bir karakter alın ve bu karakterin sesli harf olup olmadığını kontrol eden bir kod yazın.
         * 	5.	Kullanıcıdan bir not girilmesini isteyin ve bu nota göre “Geçti” veya “Kaldı” yazdırın.
         * 	6.	Kullanıcıdan bir gün adı alın ve bu günün hafta içi mi hafta sonu mu olduğunu kontrol edin.
         * 	7.	Bir sayının 0, 1 veya diğer durumlarını kontrol eden bir if yapısı yazın.
         * 	8.	Kullanıcıdan bir rakam girilmesini isteyin ve bu rakamın İngilizce karşılığını yazdırın.
         * 	9.	Kullanıcıdan bir sayı alın ve bu sayının 3 ve 5 ile bölünebilirliğini kontrol edin.
         * 	10.	Kullanıcıdan bir ay numarası alın ve bu ayın kaç gün olduğunu yazdırın.
         *
         * Orta
         * 	1.	Kullanıcıdan iki sayı alın ve büyüğünü ekrana yazdıran bir kod yazın.
         * 	2.	Kullanıcıdan bir not alın ve bu nota göre harf notu (A, B, C, vb.) yazdırın.
         * 	3.	Kullanıcıdan bir yıl alın ve bu yılın artık yıl olup olmadığını kontrol edin.
         * 	4.	Bir karakter alın ve bu karakterin büyük harf, küçük harf veya sayı olup olmadığını kontrol eden bir program yazın.
         * 	5.	Kullanıcıdan üç sayı alın ve en büyüğünü bulan bir kod yazın.
         * 	6.	Kullanıcıdan bir sayı alın ve bu sayının hangi çeyreğe (0-25, 26-50, vb.) düştüğünü kontrol edin.
         * 	7.	Kullanıcıdan bir sayı alın ve bu sayının Fibonacci serisinde olup olmadığını kontrol edin.
         * 	8.	Kullanıcıdan bir gün adı alın ve bu güne göre bir öneri yazdırın (örneğin: “Pazartesi: Yeni haftaya başlıyoruz!”).
         * 	9.	Bir switch ifadesi kullanarak bir hesap makinesi yazın (toplama, çıkarma, çarpma, bölme).
         * 	10.	Kullanıcıdan bir kelime alın ve bu kelimenin uzunluğuna göre farklı mesajlar yazdırın.
         *
         * Zor
         * 	1.	Kullanıcıdan bir sayı alın ve bu sayının mükemmel kare olup olmadığını kontrol eden bir program yazın.
         * 	2.	Kullanıcıdan bir sıcaklık değeri alın ve bu sıcaklığa göre “Soğuk”, “Ilık”, veya “Sıcak” yazdırın.
         * 	3.	Kullanıcıdan bir tarih alın ve bu tarihin geçerli bir tarih olup olmadığını kontrol eden bir kod yazın.
         * 	4.	Kullanıcıdan bir sayı alın ve bu sayının asal olup olmadığını kontrol eden bir program yazın.
         * 	5.	Kullanıcıdan bir dizi sayı alın ve bu sayıların ortalamasını, medyanını ve modunu hesaplayan bir kod yazın.
         * 	6.	Kullanıcıdan bir sayı alın ve bu sayıyı 1’den 5’e kadar karşılaştırarak farklı mesajlar yazdırın.
         * 	7.	Bir kelimenin String içindeki en sık tekrar eden harfini bulan bir program yazın.
         * 	8.	Kullanıcıdan bir sayı alın ve bu sayının tam kare, tam küp veya başka bir duruma uygun olup olmadığını yazdırın.
         * 	9.	Bir yıl alın ve o yılın Çin Zodyak burcunu hesaplayan bir program yazın.
         * 	10.	Kullanıcıdan bir kelime alın ve bu kelimenin tüm karakterlerinin alfabetik sıraya uygun olup olmadığını kontrol edin.
         * ** OOP
         *
         OOP - Kolay
         1.	Bir class oluşturun ve bu sınıfta bir özellik (field) ve bir metot tanımlayın.
         2.	Bir sınıfta private bir özellik tanımlayın ve buna erişmek için bir getter ve setter metodu oluşturun.
         3.	Bir sınıfta static bir özellik tanımlayın ve bu özelliğe sınıf adıyla erişin.
         4.	Bir sınıfta final bir metot oluşturun ve bu metodun neden override edilemediğini açıklayın.
         5.	Bir sınıfın birden fazla constructor tanımlamasını (constructor overloading) gösteren bir örnek yazın.
         6.	Bir this anahtar kelimesini kullanarak bir sınıf içindeki özelliğe erişimi gösterin.
         7.	Bir sınıfta toString metodunu override ederek sınıfın verilerini anlamlı bir şekilde yazdırın.
         8.	Bir sınıf oluşturun ve bu sınıfın bir nesnesini new anahtar kelimesi ile oluşturun.
         9.	Bir sınıfta bir metodu aynı isimle farklı parametrelerle tanımlayarak metot overloading yapın.
         10.	Bir sınıfta default bir constructor tanımlayın ve bu constructor’ın kullanımını gösterin.

         OOP - Orta
         1.	Bir sınıf oluşturun ve bu sınıftan miras alan başka bir sınıf tanımlayın. super anahtar kelimesini kullanarak üst sınıfın constructor’ına erişimi gösterin.
         2.	Bir abstract sınıf ve ondan türeyen bir sınıf oluşturun. Abstract bir metodu override edin.
         3.	Bir arayüz (interface) oluşturun ve bu arayüzü uygulayan bir sınıf yazın.
         4.	Bir sınıfta static bir metot tanımlayın ve bunun nesne oluşturmadan nasıl çağrıldığını gösterin.
         5.	Bir sınıfta final bir özellik tanımlayın ve bu özelliğe sadece constructor içinde bir değer atanabileceğini gösterin.
         6.	Bir enum oluşturun ve bu enum türünde bir değişkeni sınıf içinde kullanın.
         7.	Bir sınıfta birden fazla arayüz (interface) uygulamanın nasıl yapıldığını gösteren bir örnek yazın.
         8.	Bir sınıfta polymorphism (çok biçimlilik) kullanarak aynı metot ismini farklı sınıflarda nasıl kullandığınızı gösterin.
         9.	Bir protected özelliğin sadece alt sınıflardan erişilebilir olduğunu gösteren bir örnek yazın.
         10.	İç içe sınıflar (nested classes) oluşturarak bir sınıf içinde başka bir sınıf tanımlayın ve kullanın.

         OOP - Zor
         1.	Bir sınıfın equals metodunu override ederek nesne karşılaştırması yapmayı gösterin.
         2.	ÖNEMLİ. (MUTABLE - IMMUTABLE) Bir sınıfta immutable bir yapı oluşturun. Tüm özellikler private final olsun ve bir constructor ile ilk değerleri atayın.
         3.	Bir sınıf oluşturun ve bu sınıfta bir factory metodu kullanarak nesne yaratımını kontrol edin.
         4.	Bir sınıf oluşturun ve bu sınıf için singleton tasarım deseni uygulayın.
         6.	Bir sınıfta birden fazla constructor tanımlayın ve bunların her birini farklı parametrelerle çağıran bir nesne oluşturun.
         7.	İç içe geçmiş static ve non-static sınıfların farklarını gösteren bir program yazın.
         8.	Bir sınıfta method chaining kullanarak ardışık metot çağrımlarını mümkün kılan bir yapı oluşturun.
         10.	Bir sınıfta generics kullanarak, farklı türlerde çalışan bir metot tanımlayın (örneğin, bir listeyi sıralayan metot).
         *
         * ** COLLECTIONS
         * Collections - Kolay
            * 	1.	Bir ArrayList oluşturun ve içine 5 adet sayı ekleyip konsola yazdırın.
            * 	2.	Bir HashSet oluşturun ve içine birkaç aynı değeri ekleyin. HashSet’in tekrar eden değerleri kabul edip etmediğini gözlemleyin.
            * 	3.	Bir LinkedList oluşturun ve bu listeye eleman ekleyip çıkararak listeyi yazdırın.
            * 	4.	Bir TreeSet kullanarak elemanların doğal sıralamasını kontrol edin.
            * 	5.	Bir HashMap oluşturun ve içine anahtar-değer çiftleri ekleyip yazdırın.
            * 	6.	Bir PriorityQueue oluşturun ve elemanları ekledikten sonra sırayla çıkartarak yazdırın.
            * 	7.	Bir ArrayList’in boyutunu öğrenmek için hangi metodu kullanacağınızı gösterin.
            * 	8.	Bir HashSet içinde bir elemanın var olup olmadığını kontrol eden bir program yazın.
            * 	9.	Bir HashMap’te bir anahtarın değeri nasıl güncellenir? Örnekle açıklayın.
            * 	10.	Bir LinkedList’te bir elemanın başa ve sona eklenmesini sağlayan metotları kullanarak bir örnek yazın.
            *
            * Collections - Orta
            * 	1.	Bir HashMap’te tüm anahtarları ve değerleri döngü ile yazdıran bir program yazın.
            * 	2.	Bir ArrayList’i sıralamak için Collections.sort() yöntemini kullanın.
            * 	3.	Bir TreeMap kullanarak anahtarların doğal sıralandığını gözlemleyin.
            * 	4.	Bir LinkedList’i bir kuyruk (queue) gibi kullanarak eleman ekleme ve çıkarma işlemleri yapın.
            * 	5.	Bir HashSet ile ArrayList arasındaki farkları örneklerle açıklayın.
            * 	6.	Bir PriorityQueue kullanarak elemanları öncelik sırasına göre yazdıran bir program yazın.
            * 	7.	Bir HashMap içinde belirli bir anahtarın veya değerin olup olmadığını kontrol eden bir kod yazın.
            * 	8.	Bir ArrayList içindeki tekrarlayan elemanları bir HashSet kullanarak kaldırın.
            * 	9.	Bir TreeSet kullanarak bir dizi sayıyı sıralayın ve sıralamanın nasıl çalıştığını açıklayın.
            * 	10.	Bir LinkedHashMap kullanarak ekleme sırasının korunduğunu gösteren bir program yazın.
            *
            * Collections - Zor
            * 	1.	Bir TreeMap oluşturun ve sıralama düzenini tersine çevirmek için bir Comparator kullanın.
            * 	2.	Bir HashMap’i değerlerine göre sıralayıp sonucu yazdıran bir program yazın.
            * 	3.	Bir LinkedList’i bir yığın (stack) gibi kullanarak eleman ekleme ve çıkarma işlemleri yapın.
            * 	4.	Bir ArrayList’i bir HashSet’e ve daha sonra tekrar bir ArrayList’e dönüştüren bir program yazın.
            * 	6.	Bir PriorityQueue oluşturun ve özelleştirilmiş bir sıralama düzeni için bir Comparator kullanın.
            * 	7.	Bir HashMap ve TreeMap arasındaki performans farklarını analiz etmek için bir zaman ölçüm programı yazın.
            * 	9.	Bir Deque (çift taraflı kuyruk) kullanarak elemanların hem baştan hem sondan eklenip çıkarılmasını sağlayan bir program yazın.
            * 	10.	Bir ArrayDeque kullanarak bir kelimeyi tersine çeviren bir program yazın.
         * ** STREAM API
            * Stream API - Kolay
            * 	1.	Bir List<Integer> oluşturun ve forEach kullanarak tüm elemanları yazdırın.
            * 	2.	Bir List<String>’i Stream API ile alfabetik olarak sıralayıp yazdırın.
            * 	3.	Bir List<Integer>’deki tüm elemanların karesini hesaplayan bir Stream işlemi yazın.
            * 	4.	Bir List<String> içinde belirli bir kelimenin (örneğin, “Java”) var olup olmadığını kontrol edin.
            * 	5.	Bir List<Integer>’deki yalnızca çift sayıları filtreleyip yazdıran bir kod yazın.
            * 	6.	Bir List<Integer>’deki elemanların toplamını Stream API kullanarak hesaplayın.
            * 	7.	Bir List<String> içindeki tüm elemanları büyük harfe çevirip yazdıran bir Stream işlemi yazın.
            * 	8.	Bir Stream kullanarak belirli bir aralıkta (örneğin, 1 ile 10 arasında) bir sayı listesi oluşturun.
            * 	9.	Bir List<String> içindeki boş olmayan elemanları filtreleyip yazdırın.
            * 	10.	Bir List<Integer> içindeki en küçük sayıyı Stream API kullanarak bulun.
            *
            * Stream API - Orta
            * 	1.	Bir List<String> içindeki elemanları Stream kullanarak uzunluklarına göre sıralayın ve yazdırın.
            * 	2.	Bir List<Integer>’deki benzersiz elemanları distinct kullanarak yazdırın.
            * 	3.	Bir List<String>’de belirli bir uzunluktan (örneğin, 5 karakter) uzun olan elemanları filtreleyin.
            * 	4.	Bir Stream’den Map oluşturmak için collect(Collectors.toMap()) kullanarak bir kod yazın.
            * 	5.	Bir List<Integer> içindeki elemanların ortalamasını Stream API ile hesaplayın.
            * 	6.	Bir List<String>’deki elemanları birleştirip (concatenate) tek bir String oluşturun (Collectors.joining kullanarak).
            * 	7.	Bir List<Integer> içindeki tüm elemanların çarpımını reduce kullanarak hesaplayın.
            * 	8.	Bir Map<String, Integer>’deki anahtarları Stream olarak elde edin ve yazdırın.
            * 	9.	Bir List<Integer>’deki elemanları önce filtreleyip (örneğin, çift sayılar), sonra sıralayın ve yazdırın.
            * 	10.	Bir List<String> içindeki elemanları gruplamak için Collectors.groupingBy kullanın (örneğin, eleman uzunluğuna göre).
            *
            * Stream API - Zor
            * 	1.	Bir List<Employee> oluşturun ve çalışanların maaşlarına göre sıralanmış bir liste döndürün.
            * 	2.	Bir List<Employee> içindeki tüm çalışanları departmanlarına göre gruplamak için Stream API kullanın.
            * 	3.	Bir Map<String, Integer>’deki tüm çift değerleri filtreleyip yeni bir Map döndürün.
            * 	4.	Bir List<String>’i alfabeye göre sıralayın ve sadece ilk 3 elemanı alın (limit kullanarak).
            * 	5.	Bir List<Integer> içindeki elemanları küçükten büyüğe sıralayın ve ardından 5’ten büyük olanları yazdırın.
            * 	6.	Bir Stream ile Fibonacci dizisi oluşturan bir kod yazın.
            * 	7.	Bir List<Integer> içindeki elemanların frekansını hesaplayarak bir Map oluşturun.
            * 	8.	Bir List<String> içinde uzunlukları aynı olan kelimeleri bir grupta toplayın.
            * 	9.	Bir Stream kullanarak belirli bir koşula göre (örneğin, belirli bir harf içeren kelimeler) bir listeyi iki alt listeye ayırın (partitioningBy kullanarak).
            * 	10.	Sonsuz bir Stream oluşturun (Stream.generate kullanarak) ve belirli bir koşula göre bu akışı sınırlandırıp elemanları yazdırın.
            *
            *
            *
         * ** THREAD
            *
            * KOLAY
            * --------
            * Soru 1: Thread Oluşturma
            * Bir sınıf oluşturun ve Thread sınıfını genişleterek basit bir iş parçacığı yazın.
            * Bu iş parçacığı 5 kez “Merhaba Dünya!” yazdırsın.
            * Soru 2: Runnable Kullanımı
            * Bir Runnable arabirimi uygulayan sınıf yazın. Bu sınıf, bir sayı listesindeki tüm elemanları ekrana yazdırsın.
            * Soru 3: Thread Adı Ayarlama
            * Bir iş parçacığının adını ayarlayın ve bu adı konsola yazdıran bir kod yazın.
            * Soru 4: Thread Uyutma/Bekletme (sleep)
            * Bir iş parçacığı oluşturun ve bu iş parçacığını her iterasyonda 1 saniye uyutun.
            * Soru 5: Çoklu Thread Başlatma
            * Aynı işlemi yapan 3 iş parçacığı oluşturun ve çalıştırın.
            *
            * ORTA SESVİYE
            * ---------------
            * Soru 6: Senkronizasyon
            * Birden fazla iş parçacığının aynı anda bir sayacı artırdığı bir program yazın.
            * İş parçacıkları arasında veri tutarlılığını sağlamak için senkronizasyon kullanın.
            * Soru 7: Thread Join Kullanımı
            * Bir iş parçacığını başka bir iş parçacığı bitene kadar bekletin (join kullanarak).
            * Soru 8: Deadlock Oluşumu
            * İki iş parçacığının deadlock oluşturduğu bir program yazın.
            * Soru 9: Thread Pool Kullanımı
            * Bir Thread Pool oluşturun ve 5 iş parçacığı çalıştırın.
            * ZOR SEVİYE
            * ---------------
            * Soru 10: Producer-Consumer Problemi
            * Bir üretici-tüketici problemini çözmek için wait ve notify kullanın.
            *
            *
            *
            *GERÇEK DÜNYA SENARYOLARI (ZOR)
            *
            * Soru 1: Posta Teslimatı (Thread Oluşturma)
            * Bir posta teslimat şirketi, mektupları dağıtmak için birden fazla posta görevlisi kullanır.
            * Her görevli farklı bir bölgeye hizmet eder. Java’da her bir posta görevlisini bir iş parçacığı olarak
            * modelleyin ve her iş parçacığının bir bölgedeki teslimatlarını temsil etmesini sağlayın.
            *
            * Soru 2: Banka İşlemleri (Runnable Kullanımı)
            * Bir banka, aynı anda birden fazla müşteriye hizmet verir. Bir müşteri para yatırırken başka
            * bir müşteri para çekiyor olabilir. Bu durumu birden fazla iş parçacığı ile modelleyin.
            *
            * Soru 3: Restoran Sipariş Sistemi (Thread Senkronizasyonu)
            * Bir restoranda bir müşteri sipariş verir ve şef bu siparişi hazırlar. Sipariş hazır olmadan
            * müşteri yemeği alamaz. Bu durumu bir iş parçacığı senkronizasyonuyla modelleyin.
            *
            * Soru 4: Otopark (Thread-safe Collection)
            * Bir otoparkta sınırlı sayıda park yeri vardır. Birden fazla araba park etmeye çalışabilir,
            * ancak otopark dolarsa beklemek zorundadır. Bu durumu thread-safe bir koleksiyon kullanarak modelleyin.
            *
            *
            *
            *
            * CEVAPLAR THREAD
            * -------------------------
            * DİKKAT!!!!!!
            * Lütfen soruları okuyup anlamaya çalışın sonra çözümlerine bakıp tek tek ayrı sınıflarda çözümlerini deneyin
            *
            * Soru 1: Thread Oluşturma
            *
            * Bir sınıf oluşturun ve Thread sınıfını genişleterek basit bir iş parçacığı yazın. Bu iş parçacığı 5 kez “Merhaba Dünya!” yazdırsın.
            *
            * Cevap:
            *
            * class MyThread extends Thread {
            *     @Override
            *     public void run() {
            *         for (int i = 0; i < 5; i++) {
            *             System.out.println("Merhaba Dünya!");
            *         }
            *     }
            * }
            *
            * public class Main {
            *     public static void main(String[] args) {
            *         MyThread thread = new MyThread();
            *         thread.start();
            *     }
            * }
            *
            * Soru 2: Runnable Kullanımı
            *
            * Bir Runnable arabirimi uygulayan sınıf yazın. Bu sınıf, bir sayı listesindeki tüm elemanları ekrana yazdırsın.
            *
            * Cevap:
            *
            * class MyRunnable implements Runnable {
            *     @Override
            *     public void run() {
            *         int[] numbers = {1, 2, 3, 4, 5};
            *         for (int num : numbers) {
            *             System.out.println(num);
            *         }
            *     }
            * }
            *
            * public class Main {
            *     public static void main(String[] args) {
            *         Thread thread = new Thread(new MyRunnable());
            *         thread.start();
            *     }
            * }
            *
            * Soru 3: Thread Adı Ayarlama
            *
            * Bir iş parçacığının adını ayarlayın ve bu adı konsola yazdıran bir kod yazın.
            *
            * Cevap:
            *
            * class NamedThread extends Thread {
            *     @Override
            *     public void run() {
            *         System.out.println("Thread adı: " + getName());
            *     }
            * }
            *
            * public class Main {
            *     public static void main(String[] args) {
            *         NamedThread thread = new NamedThread();
            *         thread.setName("TestThread");
            *         thread.start();
            *     }
            * }
            *
            * Soru 4: Thread Uyutma (sleep)
            *
            * Bir iş parçacığı oluşturun ve bu iş parçacığını her iterasyonda 1 saniye uyutun.
            *
            * Cevap:
            *
            * class SleepyThread extends Thread {
            *     @Override
            *     public void run() {
            *         for (int i = 1; i <= 5; i++) {
            *             System.out.println("Sayı: " + i);
            *             try {
            *                 Thread.sleep(1000);
            *             } catch (InterruptedException e) {
            *                 e.printStackTrace();
            *             }
            *         }
            *     }
            * }
            *
            * public class Main {
            *     public static void main(String[] args) {
            *         SleepyThread thread = new SleepyThread();
            *         thread.start();
            *     }
            * }
            *
            * Soru 5: Çoklu Thread Başlatma
            *
            * Aynı işlemi yapan 3 iş parçacığı oluşturun ve çalıştırın.
            *
            * Cevap:
            *
            * class PrintThread extends Thread {
            *     @Override
            *     public void run() {
            *         System.out.println(getName() + " çalışıyor.");
            *     }
            * }
            *
            * public class Main {
            *     public static void main(String[] args) {
            *         Thread t1 = new PrintThread();
            *         Thread t2 = new PrintThread();
            *         Thread t3 = new PrintThread();
            *
            *         t1.start();
            *         t2.start();
            *         t3.start();
            *     }
            * }
            *
            * Orta Seviyeli Sorular
            *
            * Soru 6: Senkronizasyon
            *
            * Birden fazla iş parçacığının aynı anda bir sayacı artırdığı bir program yazın. İş parçacıkları arasında veri tutarlılığını sağlamak için senkronizasyon kullanın.
            *
            * Cevap:
            *
            * class Counter {
            *     private int count = 0;
            *
            *     public synchronized void increment() {
            *         count++;
            *     }
            *
            *     public int getCount() {
            *         return count;
            *     }
            * }
            *
            * class CounterThread extends Thread {
            *     private Counter counter;
            *
            *     public CounterThread(Counter counter) {
            *         this.counter = counter;
            *     }
            *
            *     @Override
            *     public void run() {
            *         for (int i = 0; i < 100; i++) {
            *             counter.increment();
            *         }
            *     }
            * }
            *
            * public class Main {
            *     public static void main(String[] args) throws InterruptedException {
            *         Counter counter = new Counter();
            *         Thread t1 = new CounterThread(counter);
            *         Thread t2 = new CounterThread(counter);
            *
            *         t1.start();
            *         t2.start();
            *
            *         t1.join();
            *         t2.join();
            *
            *         System.out.println("Toplam: " + counter.getCount());
            *     }
            * }
            *
            * Soru 7: Thread Join Kullanımı
            *
            * Bir iş parçacığını başka bir iş parçacığı bitene kadar bekletin (join kullanarak).
            *
            * Cevap:
            *
            * class WorkerThread extends Thread {
            *     @Override
            *     public void run() {
            *         System.out.println(getName() + " çalışmaya başladı.");
            *         try {
            *             Thread.sleep(2000);
            *         } catch (InterruptedException e) {
            *             e.printStackTrace();
            *         }
            *         System.out.println(getName() + " tamamlandı.");
            *     }
            * }
            *
            * public class Main {
            *     public static void main(String[] args) throws InterruptedException {
            *         WorkerThread thread1 = new WorkerThread();
            *         WorkerThread thread2 = new WorkerThread();
            *
            *         thread1.start();
            *         thread1.join(); // thread2 bekler
            *
            *         thread2.start();
            *     }
            * }
            *
            * Soru 8: Deadlock Oluşumu
            *
            * İki iş parçacığının deadlock oluşturduğu bir program yazın.
            *
            * Cevap:
            *
            * class Resource {
            * }
            *
            * public class DeadlockDemo {
            *     public static void main(String[] args) {
            *         Resource resource1 = new Resource();
            *         Resource resource2 = new Resource();
            *
            *         Thread t1 = new Thread(() -> {
            *             synchronized (resource1) {
            *                 System.out.println("Thread 1: resource1 kilitlendi.");
            *                 synchronized (resource2) {
            *                     System.out.println("Thread 1: resource2 kilitlendi.");
            *                 }
            *             }
            *         });
            *
            *         Thread t2 = new Thread(() -> {
            *             synchronized (resource2) {
            *                 System.out.println("Thread 2: resource2 kilitlendi.");
            *                 synchronized (resource1) {
            *                     System.out.println("Thread 2: resource1 kilitlendi.");
            *                 }
            *             }
            *         });
            *
            *         t1.start();
            *         t2.start();
            *     }
            * }
            *
            * Soru 9: Thread Pool Kullanımı
            *
            * Bir Thread Pool oluşturun ve 5 iş parçacığı çalıştırın.
            *
            * Cevap:
            *
            * import java.util.concurrent.ExecutorService;
            * import java.util.concurrent.Executors;
            *
            * public class ThreadPoolDemo {
            *     public static void main(String[] args) {
            *         ExecutorService executor = Executors.newFixedThreadPool(3);
            *
            *         for (int i = 1; i <= 5; i++) {
            *             int taskId = i;
            *             executor.execute(() -> {
            *                 System.out.println("Görev " + taskId + " çalışıyor.");
            *             });
            *         }
            *
            *         executor.shutdown();
            *     }
            * }
            *
            * Soru 10: Producer-Consumer Problemi
            *
            * Bir üretici-tüketici problemini çözmek için wait ve notify kullanın.
            *
            * Cevap:
            *
            * import java.util.LinkedList;
            * import java.util.Queue;
            *
            * class SharedQueue {
            *     private final Queue<Integer> queue = new LinkedList<>();
            *     private final int capacity = 5;
            *
            *     public synchronized void produce(int value) throws InterruptedException {
            *         while (queue.size() == capacity) {
            *             wait();
            *         }
            *         queue.add(value);
            *         System.out.println("Üretildi: " + value);
            *         notify();
            *     }
            *
            *     public synchronized int consume() throws InterruptedException {
            *         while (queue.isEmpty()) {
            *             wait();
            *         }
            *         int value = queue.poll();
            *         System.out.println("Tüketildi: " + value);
            *         notify();
            *         return value;
            *     }
            * }
            *
            * public class ProducerConsumer {
            *     public static void main(String[] args) {
            *         SharedQueue sharedQueue = new SharedQueue();
            *
            *         Thread producer = new Thread(() -> {
            *             for (int i = 0; i < 10; i++) {
            *                 try {
            *                     sharedQueue.produce(i);
            *                 } catch (InterruptedException e) {
            *                     e.printStackTrace();
            *                 }
            *             }
            *         });
            *
            *         Thread consumer = new Thread(() -> {
            *             for (int i = 0; i < 10; i++) {
            *                 try {
            *                     sharedQueue.consume();
            *                 } catch (InterruptedException e) {
            *                     e.printStackTrace();
            *                 }
            *             }
            *         });
            *
            *         producer.start();
            *         consumer.start();
            *     }
            * }
            *
            * -------------------------
            * GERÇEK DÜNYA SRNARYOLARI
            *  Soru 1: Posta Teslimatı (Thread Oluşturma)
            *
            * Bir posta teslimat şirketi, mektupları dağıtmak için birden fazla posta görevlisi kullanır. Her görevli farklı bir bölgeye hizmet eder. Java’da her bir posta görevlisini bir iş parçacığı olarak modelleyin ve her iş parçacığının bir bölgedeki teslimatlarını temsil etmesini sağlayın.
            *
            * Cevap:
            *
            * class Postman extends Thread {
            *     private String region;
            *
            *     public Postman(String region) {
            *         this.region = region;
            *     }
            *
            *     @Override
            *     public void run() {
            *         System.out.println(region + " bölgesinde teslimat yapılıyor...");
            *         try {
            *             Thread.sleep(2000); // Teslimat süresi
            *         } catch (InterruptedException e) {
            *             System.out.println("Teslimat kesildi.");
            *         }
            *         System.out.println(region + " bölgesindeki teslimat tamamlandı.");
            *     }
            * }
            *
            * public class PostDelivery {
            *     public static void main(String[] args) {
            *         Postman postman1 = new Postman("Merkez");
            *         Postman postman2 = new Postman("Kuzey");
            *         Postman postman3 = new Postman("Güney");
            *
            *         postman1.start();
            *         postman2.start();
            *         postman3.start();
            *     }
            * }
            *
            * Soru 2: Banka İşlemleri (Runnable Kullanımı)
            *
            * Bir banka, aynı anda birden fazla müşteriye hizmet verir. Bir müşteri para yatırırken başka bir müşteri para çekiyor olabilir. Bu durumu birden fazla iş parçacığı ile modelleyin.
            *
            * Cevap:
            *
            * class BankAccount {
            *     private int balance = 1000;
            *
            *     public synchronized void deposit(int amount) {
            *         balance += amount;
            *         System.out.println("Para yatırıldı: " + amount + " | Güncel bakiye: " + balance);
            *     }
            *
            *     public synchronized void withdraw(int amount) {
            *         if (balance >= amount) {
            *             balance -= amount;
            *             System.out.println("Para çekildi: " + amount + " | Güncel bakiye: " + balance);
            *         } else {
            *             System.out.println("Yetersiz bakiye! Güncel bakiye: " + balance);
            *         }
            *     }
            * }
            *
            * class DepositTask implements Runnable {
            *     private BankAccount account;
            *
            *     public DepositTask(BankAccount account) {
            *         this.account = account;
            *     }
            *
            *     @Override
            *     public void run() {
            *         account.deposit(500);
            *     }
            * }
            *
            * class WithdrawTask implements Runnable {
            *     private BankAccount account;
            *
            *     public WithdrawTask(BankAccount account) {
            *         this.account = account;
            *     }
            *
            *     @Override
            *     public void run() {
            *         account.withdraw(700);
            *     }
            * }
            *
            * public class BankOperations {
            *     public static void main(String[] args) {
            *         BankAccount account = new BankAccount();
            *
            *         Thread t1 = new Thread(new DepositTask(account));
            *         Thread t2 = new Thread(new WithdrawTask(account));
            *
            *         t1.start();
            *         t2.start();
            *     }
            * }
            *
            * Soru 3: Restoran Sipariş Sistemi (Thread Senkronizasyonu)
            *
            * Bir restoranda bir müşteri sipariş verir ve şef bu siparişi hazırlar. Sipariş hazır olmadan müşteri yemeği alamaz. Bu durumu bir iş parçacığı senkronizasyonuyla modelleyin.
            *
            * Cevap:
            *
            * class Restaurant {
            *     private boolean orderReady = false;
            *
            *     public synchronized void placeOrder() {
            *         System.out.println("Müşteri: Sipariş verdim.");
            *         orderReady = false;
            *     }
            *
            *     public synchronized void prepareOrder() {
            *         System.out.println("Şef: Siparişi hazırlıyorum...");
            *         try {
            *             Thread.sleep(3000); // Sipariş hazırlama süresi
            *         } catch (InterruptedException e) {
            *             e.printStackTrace();
            *         }
            *         orderReady = true;
            *         System.out.println("Şef: Sipariş hazır!");
            *         notify();
            *     }
            *
            *     public synchronized void receiveOrder() {
            *         while (!orderReady) {
            *             try {
            *                 System.out.println("Müşteri: Siparişim hazır değil, bekliyorum.");
            *                 wait();
            *             } catch (InterruptedException e) {
            *                 e.printStackTrace();
            *             }
            *         }
            *         System.out.println("Müşteri: Siparişimi aldım.");
            *     }
            * }
            *
            * public class RestaurantSimulation {
            *     public static void main(String[] args) {
            *         Restaurant restaurant = new Restaurant();
            *
            *         Thread chef = new Thread(restaurant::prepareOrder);
            *         Thread customer = new Thread(() -> {
            *             restaurant.placeOrder();
            *             restaurant.receiveOrder();
            *         });
            *
            *         customer.start();
            *         chef.start();
            *     }
            * }
            *
            * Soru 4: Otopark (Thread-safe Collection)
            *
            * Bir otoparkta sınırlı sayıda park yeri vardır. Birden fazla araba park etmeye çalışabilir, ancak otopark dolarsa beklemek zorundadır. Bu durumu thread-safe bir koleksiyon kullanarak modelleyin.
            *
            * Cevap:
            *
            * import java.util.concurrent.ArrayBlockingQueue;
            *
            * class ParkingLot {
            *     private final ArrayBlockingQueue<String> parkingSpots;
            *
            *     public ParkingLot(int capacity) {
            *         parkingSpots = new ArrayBlockingQueue<>(capacity);
            *     }
            *
            *     public void park(String car) {
            *         try {
            *             parkingSpots.put(car);
            *             System.out.println(car + " park etti. Boş yer: " + (parkingSpots.remainingCapacity()));
            *         } catch (InterruptedException e) {
            *             e.printStackTrace();
            *         }
            *     }
            *
            *     public void leave(String car) {
            *         parkingSpots.remove(car);
            *         System.out.println(car + " ayrıldı. Boş yer: " + (parkingSpots.remainingCapacity()));
            *     }
            * }
            *
            * public class ParkingSimulation {
            *     public static void main(String[] args) {
            *         ParkingLot parkingLot = new ParkingLot(3);
            *
            *         Runnable car1 = () -> parkingLot.park("Araba 1");
            *         Runnable car2 = () -> parkingLot.park("Araba 2");
            *         Runnable car3 = () -> parkingLot.park("Araba 3");
            *         Runnable car4 = () -> parkingLot.park("Araba 4");
            *
            *         new Thread(car1).start();
            *         new Thread(car2).start();
            *         new Thread(car3).start();
            *         new Thread(car4).start();
            *     }
            * }
            *
         */
    }
}
