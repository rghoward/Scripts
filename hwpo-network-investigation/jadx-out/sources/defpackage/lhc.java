package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lhc {
    public static lhc d;
    public final tkc a;
    public final zwb b;
    public final AtomicLong c = new AtomicLong(-1);

    public lhc(Context context, tkc tkcVar) {
        this.b = new zwb(context, zwb.k, new paa("measurement:api"), vn4.a.c);
        this.a = tkcVar;
    }

    public final synchronized void a(int i, int i2, long j, long j2) {
        this.a.k.getClass();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = this.c;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        this.b.c(new oaa(0, Arrays.asList(new cv6(36301, i, 0, j, j2, null, null, 0, i2)))).d(new lh7() { // from class: jhc
            @Override // defpackage.lh7
            public final /* synthetic */ void d(Exception exc) {
                this.t.c.set(jElapsedRealtime);
            }
        });
    }
}
