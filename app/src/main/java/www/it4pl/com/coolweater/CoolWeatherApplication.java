package www.it4pl.com.coolweater;

import android.app.Application;

import org.litepal.LitePal;

/**
 * Created by Administrator on 2017/11/1.
 */

public class CoolWeatherApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化数据库
        LitePal.initialize(this);
    }
}
