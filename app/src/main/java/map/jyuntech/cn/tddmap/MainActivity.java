package map.jyuntech.cn.tddmap;

import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import cn.droidlover.xdroidmvp.mvp.XActivity;
import map.jyuntech.cn.tddmap.Model.TextModel;

public class MainActivity extends XActivity {

    // Used to load the 'native-lib' library on application startup.


    @BindView(R.id.sample_text)
    TextView tv;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public Object newP() {
        return null;
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        tv.setText(TextModel.stringFromJNI());
    }


    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
//    public native String stringFromJNI();
}
