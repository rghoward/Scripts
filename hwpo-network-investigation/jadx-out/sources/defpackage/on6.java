package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.exoplayer.k;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class on6 implements sfb.a {
    public final /* synthetic */ pn6 b;

    public on6(pn6 pn6Var) {
        this.b = pn6Var;
    }

    @Override // sfb.a
    public final void a() {
        k.a aVar = this.b.b0;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // sfb.a
    public final void e() {
        pn6 pn6Var = this.b;
        Surface surface = pn6Var.t1;
        if (surface != null) {
            rfb.a aVar = pn6Var.d1;
            Handler handler = aVar.a;
            if (handler != null) {
                handler.post(new jfb(aVar, surface, SystemClock.elapsedRealtime()));
            }
            pn6Var.w1 = true;
        }
    }

    @Override // sfb.a
    public final void f() {
        pn6 pn6Var = this.b;
        if (pn6Var.t1 != null) {
            pn6Var.d1(0, 1);
        }
    }

    @Override // sfb.a
    public final void b(tfb tfbVar) {
    }
}
