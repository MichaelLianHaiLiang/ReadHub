package cn.com.woong.readhub.di.module.activitys;

import cn.com.woong.readhub.App;
import cn.com.woong.readhub.di.scope.PerActivity;
import cn.com.woong.readhub.ui.widget.newsview.NewsAdapter;
import dagger.Module;
import dagger.Provides;

/**
 * @author woong
 * Created by wong on 2018/4/22.
 */

@PerActivity
@Module
public class TopicDetailActivityModule {
    @Provides
    public NewsAdapter providerNewsAdapter() {
        return new NewsAdapter(App.getAppContext());
    }
}
