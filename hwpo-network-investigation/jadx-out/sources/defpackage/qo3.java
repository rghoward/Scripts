package defpackage;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qo3 implements l5a {
    public final /* synthetic */ Context t;

    @Override // defpackage.l5a
    public final Object get() {
        hq2 hq2Var;
        Context context = this.t;
        ul8 ul8Var = hq2.p;
        synchronized (hq2.class) {
            try {
                if (hq2.v == null) {
                    Context applicationContext = context == null ? null : context.getApplicationContext();
                    HashMap map = new HashMap(8);
                    map.put(0, 1000000L);
                    map.put(2, -9223372036854775807L);
                    map.put(3, -9223372036854775807L);
                    map.put(4, -9223372036854775807L);
                    map.put(5, -9223372036854775807L);
                    map.put(10, -9223372036854775807L);
                    map.put(9, -9223372036854775807L);
                    map.put(7, -9223372036854775807L);
                    hq2.v = new hq2(applicationContext, map);
                }
                hq2Var = hq2.v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hq2Var;
    }
}
