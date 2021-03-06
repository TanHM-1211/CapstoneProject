package test;

import controller.DieuKhienBaiXe;
import database.*;
import entity.BaiXe;
import entity.LoaiXe;
import entity.NguoiDung;
import entity.Xe;

import java.sql.ResultSet;
import java.util.List;

/**
 * Project Ecobike System
 * User: Nhom 11
 * Create at 9:55 AM , 12/18/2020
 */

public class testDAO {
    public static void main(String args[]){
        try{
            DAOManager daoManager= DAOManager.getInstance();

            BaiXeDAO baiXeDAO = BaiXeDAO.getInstance();
            LoaiXeDAO loaiXeDAO = LoaiXeDAO.getInstance();
            XeDAO xeDAO = XeDAO.getInstance();
//            BaiXeDAO baiXeDAO = BaiXeDAO.getInstance();

//            LoaiXeDAO loaiXeDAO = LoaiXeDAO.getInstance();
//            XeDAO xeDAO = XeDAO.getInstance();
//            listBaiXe.add(new BaiXe(1, "bai A", "dia chi 1", 10));
//            baiXeDAO.save(new BaiXe(4, "bai A", "dia chi 1", 10));
//            String query = Utils.getGetQuery(BaiXe.name, "*", null);
//            System.out.println(query);
//            ResultSet rs = daoManager.executeQuery(query);
//            rs.absolute(3);
//            System.out.println(rs.getInt(1) + "  " + rs.getString(2)
//                    + "  " + rs.getString(3));
//            rs.updateString(2, "bai B");
//            rs.updateRow();

//            for (BaiXe baiXe:
//                 baiXeDAO.getAll()) {
//                System.out.println(baiXe.toString());
//            }
//            for (LoaiXe loaiXe:
//                 loaiXeDAO.getAll()) {
//                System.out.println(loaiXe.toString());
//            }

//            List baiXeAll = new DieuKhienBaiXe().getAllBaiXe();
//            for (Object baiXe: baiXeAll) {
//                System.out.println(baiXe.toString());
//            }
//

//            for (Xe xe:
//                 BaiXe.getXeTrongBai(baiXeDAO.getAll().get(2))) {
//                System.out.println(xe.toString());
//            }


//            for (Xe xe:
//                    (baiXeDAO.getAll().get(0).getXeTrongBai())) {
//                System.out.println(xe.toString());
//            }

//            Thread.sleep(100000);
            
//            System.out.println(NguoiDungGiaoDichThueXeDAO.getInstance().getNguoiDungGiaoDichThueXeTuongUng(
//                    NguoiDungDAO.getInstance().getNguoiDungHienTai()).toString());





            for (Xe xe:
                    (baiXeDAO.getAll().get(0).getXeTrongBai())) {
                System.out.println(xe.toString());
            }
            System.out.println(NguoiDungDAO.getInstance().getNguoiDungHienTai().toString());
//            for (Xe xe:
//                    (baiXeDAO.getAll().get(0).getXeTrongBai())) {
//                System.out.println(xe.toString());
//            }



            daoManager.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
