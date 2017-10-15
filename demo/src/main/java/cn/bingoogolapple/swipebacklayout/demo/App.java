package cn.bingoogolapple.swipebacklayout.demo;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

import cn.bingoogolapple.swipebacklayout.BGASwipeBackHelper;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:16/12/28 下午11:55
 * 描述:「必须在 Application 的 onCreate 方法中执行 BGASwipeBackHelper.init(this) 来初始化滑动返回」
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // 必须在 Application 的 onCreate 方法中执行 BGASwipeBackHelper.init(this) 来初始化滑动返回
        BGASwipeBackHelper.init(this, null);

        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);
    }
}
