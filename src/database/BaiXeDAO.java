package database;

import entity.BaiXe;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Project Ecobike System
 * BaiXe: Nhom 11
 * Create at 4:26 PM , 12/17/2020
 */

public class BaiXeDAO implements DAO<BaiXe> {
    private List<BaiXe> listBaiXe = new ArrayList<>();
    private DAOManager daoManager = DAOManager.getInstance();

    public BaiXeDAO() {
        daoManager.open();
        ResultSet resultSet = daoManager.executeQuery("SELECT * FROM " + BaiXe.name + ";");
        try {
            while (resultSet.next()){
                listBaiXe.add(new BaiXe(resultSet.getInt(1), resultSet.getString(2),
                        resultSet.getString(3), resultSet.getInt(4)));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public BaiXe get(int id) {
        for (BaiXe baiXe:
             this.listBaiXe) {
            if (baiXe.getId() == id) return baiXe;
        }
        return null;
    }

    @Override
    public List<BaiXe> getAll() {
        return listBaiXe;
    }

    @Override
    public void save(BaiXe baiXe) {
//        listBaiXe.add(baiXe);
    }

    @Override
    public void update(BaiXe baiXe, String[] params) {
    }

    @Override
    public void delete(BaiXe baiXe) {
    }

    @Override
    public String getInsertQuery(List<BaiXe> list) {
        return null;
    }

}
