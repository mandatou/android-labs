package edu.hzuapps.androidworks.homeworks.com1314080901134.Activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

import edu.hzuapps.androidworks.homeworks.com1314080901134.R;

/**
 * Created by Administrator on 2016/5/25.
 */
public class MusicActvity  extends AppCompatActivity {
    @ViewInject(R.id.navigation_view)
    private NavigationView mNavigationView;
    @ViewInject(R.id.tool_bar)
    private Toolbar toolbar;
    @ViewInject(R.id.drawerIcon)
    private ImageView drawerIcon;
    @ViewInject(R.id.drawer)
    private DrawerLayout mDrawerLayout;
    @ViewInject(R.id.bar_disco)
    private ImageView bar_disco;
    @ViewInject(R.id.bar_music)
    private ImageView bar_music;
    @ViewInject(R.id.bar_friends)
    private ImageView bar_friends;
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.music_layout);
        ViewUtils.inject(this);//视图注入
    }
}
