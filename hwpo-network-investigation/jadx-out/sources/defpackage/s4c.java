package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s4c implements yh4 {
    public static final /* synthetic */ s4c t = new s4c();

    @Override // defpackage.yh4
    public final Object apply(Object obj) {
        String strB;
        Context context = (Context) obj;
        String str = t4c.b;
        if (str != null) {
            return str;
        }
        synchronized (t4c.class) {
            try {
                strB = t4c.b;
                if (strB == null) {
                    strB = crc.b(context, "com.google.android.gms.measurement");
                    t4c.b = strB;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return strB;
    }
}
