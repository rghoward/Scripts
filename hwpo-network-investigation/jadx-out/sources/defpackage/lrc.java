package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lrc {
    public static final Object j = new Object();
    public static final AtomicReference k = new AtomicReference();
    public static volatile lrc l = null;
    public static final l5a m = m5a.a(vrc.t);
    public final txc a = new txc();
    public final Context b;
    public final l5a c;
    public final l5a d;
    public final l5a e;
    public final l5a f;
    public final z1d g;
    public final l5a h;
    public final u0d i;

    public lrc(Context context, l5a l5aVar, l5a l5aVar2, final l5a l5aVar3, l5a l5aVar4, l5a l5aVar5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        l5aVar.getClass();
        l5aVar2.getClass();
        l5aVar3.getClass();
        l5aVar4.getClass();
        l5aVar5.getClass();
        l5a l5aVarA = m5a.a(l5aVar);
        l5a l5aVarA2 = m5a.a(l5aVar2);
        l5a l5aVarA3 = m5a.a(new l5a() { // from class: xrc
            @Override // defpackage.l5a
            public final /* synthetic */ Object get() {
                Object obj = lrc.j;
                return (z0d) ((sk7) l5aVar3.get()).d();
            }
        });
        l5a l5aVarA4 = m5a.a(l5aVar4);
        l5a l5aVarA5 = m5a.a(l5aVar5);
        this.b = applicationContext;
        this.c = l5aVarA;
        this.d = l5aVarA2;
        this.e = l5aVarA3;
        this.f = l5aVarA4;
        this.g = new z1d(applicationContext, l5aVarA, l5aVarA4, l5aVarA2);
        this.h = l5aVarA5;
        this.i = new u0d(applicationContext, l5aVarA, l5aVarA3, l5aVarA2);
    }

    public static void b() {
        synchronized (bsc.t) {
        }
        if (k.get() == null && bsc.u == null) {
            bsc.u = new zrc();
        }
    }

    public final ib6 a() {
        return (ib6) this.c.get();
    }
}
