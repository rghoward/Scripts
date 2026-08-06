package defpackage;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t9 extends o9<String, Boolean> {
    @Override // defpackage.o9
    public final Intent createIntent(Context context, String str) {
        String str2 = str;
        context.getClass();
        str2.getClass();
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str2});
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // defpackage.o9
    public final o9.a<Boolean> getSynchronousResult(Context context, String str) {
        String str2 = str;
        context.getClass();
        str2.getClass();
        if (vz1.a(context, str2) == 0) {
            return new o9.a<>(Boolean.TRUE);
        }
        return null;
    }

    @Override // defpackage.o9
    public final Boolean parseResult(int i, Intent intent) {
        if (intent == null || i != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z = false;
        if (intArrayExtra != null) {
            for (int i2 : intArrayExtra) {
                if (i2 == 0) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
