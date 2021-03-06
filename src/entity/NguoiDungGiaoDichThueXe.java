package entity;

/**
 * Project Ecobike System
 * User: Nhom 11
 * Create at 8:42 AM , 12/18/2020
 */

/*
    Doc va ghi
 */
public class NguoiDungGiaoDichThueXe {
    private int id;
    private NguoiDung nguoiDung;
    private GiaoDichThueXe giaoDichThueXe;
    public static String paramsName = "(id_nguoi_dung_giao_dich_thue_xe, id_nguoi_dung, id_giao_dich_thue_xe)";
    public static String name = "nguoi_dung_giao_dich_thue_xe";
//    public static NguoiDungGiaoDichThueXe nguoiDungGiaoDichThueXe = null;

    public NguoiDungGiaoDichThueXe() {
    }

    public NguoiDungGiaoDichThueXe(int id, NguoiDung nguoiDung, GiaoDichThueXe giaoDichThueXe) {
        this.id = id;
        this.nguoiDung = nguoiDung;
        this.giaoDichThueXe = giaoDichThueXe;
    }

    @Override
    public String toString() {
        return "NguoiDungGiaoDichThueXe{" +
                "id=" + id +
                ", nguoiDung=" + nguoiDung +
                ", giaoDichThueXe=" + giaoDichThueXe +
                '}';
    }

    public String toSQLString() {
        if (this.giaoDichThueXe != null)
            return "(" +
                    "" + id +
                    ", " + nguoiDung.getId() +
                    ", " + giaoDichThueXe.getId() +
                    ')';
        else
            return "(" +
                    "" + id +
                    ", " + nguoiDung.getId() +
                    ", null"  +
                    ')';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NguoiDung getNguoiDung() {
        return nguoiDung;
    }

    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
    }

    public GiaoDichThueXe getGiaoDichThueXe() {
        return giaoDichThueXe;
    }

    public void setGiaoDichThueXe(GiaoDichThueXe giaoDichThueXe) {
        this.giaoDichThueXe = giaoDichThueXe;
    }

//    public static NguoiDungGiaoDichThueXe getInstance(){
//        if (nguoiDungGiaoDichThueXe == null){
//            nguoiDungGiaoDichThueXe = new NguoiDungGiaoDichThueXe();
//        }
//        return nguoiDungGiaoDichThueXe;
//    }

}
