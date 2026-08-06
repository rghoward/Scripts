package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pra {
    public static WeakReference<pra> b;
    public lm9 a;

    public final synchronized ora a() {
        String strPeek;
        ora oraVar;
        lm9 lm9Var = this.a;
        synchronized (lm9Var.d) {
            strPeek = lm9Var.d.peek();
        }
        Pattern pattern = ora.d;
        oraVar = null;
        if (!TextUtils.isEmpty(strPeek)) {
            String[] strArrSplit = strPeek.split("!", -1);
            if (strArrSplit.length == 2) {
                oraVar = new ora(strArrSplit[0], strArrSplit[1]);
            }
        }
        return oraVar;
    }
}
