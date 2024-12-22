package com.gonca.oop.orta;

public class Runner9 {
    //Bir protected özelliğin sadece alt sınıflardan erişilebilir olduğunu gösteren bir örnek yazın.
    protected int yas;

}


class B
{
    public void arttir()
    {
        Runner9 o=new Runner9();
        o.yas=10;
    }
}
