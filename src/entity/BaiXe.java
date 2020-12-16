package entity;

/**
 * Project Ecobike System
 * User: Nhom 11
 * Create at 9:49 AM , 12/16/2020
 */

public class BaiXe {
    private int id ;
    private String tenBaiXe;
    private String diaChi;
    private int dienTich;

    public BaiXe() {
    }

    public BaiXe(int id, String tenBaiXe, String diaChi, int dienTich) {
        this.id = id;
        this.tenBaiXe = tenBaiXe;
        this.diaChi = diaChi;
        this.dienTich = dienTich;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenBaiXe() {
        return tenBaiXe;
    }

    public void setTenBaiXe(String tenBaiXe) {
        this.tenBaiXe = tenBaiXe;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }
}

/*
INSERT INTO BaiXe
 (id,tenBaiXe,diaChi,dienTich)
 VALUES
 (001,N'Eco B�ch Khoa',N'1 Hai B� Tr?ng H� N?i',300),
 (002,N'Eco Meo',N'1 Ho�ng Th�i H� N?i',300),
 (003,N'Eco Thai',N'12 Th�i Th?nh H� N?i',300)
 ;
 */
