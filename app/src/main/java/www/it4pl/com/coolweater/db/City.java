package www.it4pl.com.coolweater.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/10/31.
 * 城市表
 */

public class City extends DataSupport{
    /**
     * cityNmae 城市名称
     *  cityCode 城市代号
     *  provinceId 省份id
     */
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
