package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.intercom.twig.BuildConfig;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lm9 {
    public final SharedPreferences a;
    public final ScheduledThreadPoolExecutor e;
    public final ArrayDeque<String> d = new ArrayDeque<>();
    public final String b = "topic_operation_queue";
    public final String c = ",";

    public lm9(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.a = sharedPreferences;
        this.e = scheduledThreadPoolExecutor;
    }

    public static lm9 a(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        lm9 lm9Var = new lm9(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (lm9Var.d) {
            try {
                lm9Var.d.clear();
                String string = lm9Var.a.getString(lm9Var.b, BuildConfig.FLAVOR);
                if (!TextUtils.isEmpty(string) && string.contains(lm9Var.c)) {
                    String[] strArrSplit = string.split(lm9Var.c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            lm9Var.d.add(str);
                        }
                    }
                    return lm9Var;
                }
                return lm9Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
