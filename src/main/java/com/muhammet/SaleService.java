package com.muhammet;

public class SaleService {
    private IUserService userServis;
    public  SaleService(IUserService userServis){
        this.userServis = userServis;
    }
    /**
     * Kullanıcı sorgulanır ve bilgileri use servisten çekilerek satış yapılır.
     */
    public void yeniSatis(Long userId, Long productID){
        System.out.println("Satış İşlemi");
        userServis.findByUserId(userId);
    }
}
