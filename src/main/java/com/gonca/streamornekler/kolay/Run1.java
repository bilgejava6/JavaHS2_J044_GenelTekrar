package com.gonca.streamornekler.kolay;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Run1 {
    public static void main(String[] args) {
       // Bir List<Integer> oluşturun ve forEach kullanarak tüm elemanları yazdırın.
        List<Integer> list= List.of(1,8,7,9,6,4,1);
        list.forEach(System.out::println);


        //	2.	Bir List<String>’i Stream API ile alfabetik olarak sıralayıp yazdırın.
        List<String> list2=List.of("Elma","Armut","Ayva","Kiraz");
        list2.stream().sorted().forEach(System.out::println);


        // 	3.	Bir List<Integer>’deki tüm elemanların karesini hesaplayan bir Stream işlemi yazın.
        List<Integer> list3= List.of(1,8,7,9,6,4,1);
        list3.stream().map(x-> x*x).forEach(System.out::println);


        // 	4.	Bir List<String> içinde belirli bir kelimenin (örneğin, “Java”) var olup olmadığını kontrol edin.

        List<String> list4=List.of("C++","JAVA ","Phyton ","C");
        for(String d:list4)
        {
            if(d.equalsIgnoreCase("Java"))
            {
                System.out.println("Listede  bulunmaktadır ");
            }
            else
            {
                System.out.println("Listede bulunmamaktadır ");
            }
        }


        // 	5.	Bir List<Integer>’deki yalnızca çift sayıları filtreleyip yazdıran bir kod yazın.

        List<Integer> list5= List.of(1,8,7,10,6,4,1);
        list3.stream().filter(x-> x%2==0).forEach(System.out::println);


        //	6.	Bir List<Integer>’deki elemanların toplamını Stream API kullanarak hesaplayın.

        List<Integer> list6= List.of(1,8,7,10,6,4,1);
       double toplam= list5.stream().mapToInt(Integer::intValue).sum();

        // 	7.	Bir List<String> içindeki tüm elemanları büyük harfe çevirip yazdıran bir Stream işlemi yazın.

        List<String> list7=List.of("Elma","Armut","Ayva","Kiraz");
        list7.stream().map(x->x.toUpperCase()).forEach(System.out::println);


        // 	8.	Bir Stream kullanarak belirli bir aralıkta (örneğin, 1 ile 10 arasında) bir sayı listesi oluşturun.

        List<Integer> list8 = Stream.iterate(1, n -> n + 1) // 1'den başlayarak her seferinde 1 artır
                .limit(10) // İlk 10 elemanı al
                .collect(Collectors.toList()); // Listeye dönüştür

        System.out.println(list8);

        // 	9.	Bir List<String> içindeki boş olmayan elemanları filtreleyip yazdırın.

        List<String> list9 = List.of("Elma", "", "Kiraz", "   ", "Ayva", "Armut", "");


        list9.stream()
                .filter(str -> !str.trim().isEmpty()) // Boş olmayan elemanları filtrele
                .forEach(System.out::println);

        // 	10.	Bir List<Integer> içindeki en küçük sayıyı Stream API kullanarak bulun.
        List<Integer> list10= List.of(1,8,7,10,6,4,1);
        list10.stream().mapToInt(Integer::intValue).min().ifPresent(System.out::println);



    }
}
