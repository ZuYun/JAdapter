package first.lunar.yun.adapter.helper;

import android.text.TextUtils;
import android.util.Log;
import first.lunar.yun.adapter.LApp;

import static first.lunar.yun.adapter.LConsistent.SPLIT_DOS;

/**
 * @author yun.
 * @date 2019/6/1 0001
 * @des [一句话描述]
 * @since [https://github.com/ZuYun]
 * <p><a href="https://github.com/ZuYun">github</a>
 */
public class LLog {
  public static void llog(Object... msgs) {
    if (LApp.isDebug()) {
      Log.d("JAdapter", TextUtils.join(SPLIT_DOS, msgs));
    }
  }

  public static void llogi(Object... msgs) {
    if (LApp.isDebug()) {
      Log.i("JAdapter", TextUtils.join(SPLIT_DOS, msgs));
    }
  }
  public static void lloge(Object... msgs) {
    if (LApp.isDebug()) {
      Log.e("JAdapter", TextUtils.join(SPLIT_DOS, msgs));
    }
  }
}
