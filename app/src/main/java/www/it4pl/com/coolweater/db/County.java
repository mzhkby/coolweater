package www.it4pl.com.coolweater.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/10/31.
 * 区域表
 */

public class County extends DataSupport {
    /**
     * coundName 区域名称
     * weaterId 天气标识
     * cityId 城市标识
     */
    private int id;
    private String countyName;
    private int weaterId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getWeaterId() {
        return weaterId;
    }

    public void setWeaterId(int weaterId) {
        this.weaterId = weaterId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
