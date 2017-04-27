package map.jyuntech.cn.tddmap.Model;

/**
 * Created by navi on 2017/4/19.
 */

public class TextModel {

    static {
        System.loadLibrary("native-lib");
    }


    public static native String stringFromJNI();

}
