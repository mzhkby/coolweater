package www.it4pl.com.coolweater.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/10/31.
 * 省份表
 */
public class Province extends DataSupport {
    /**
     * provinceName 省份名称
     * provinceCode 省份代号
     */
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
