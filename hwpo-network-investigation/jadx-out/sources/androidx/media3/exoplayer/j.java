package androidx.media3.exoplayer;

import android.os.Looper;
import defpackage.md6;
import defpackage.toa;
import defpackage.xl7;
import defpackage.z7a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final b a;
    public final a b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        void y(int i, Object obj);
    }

    public j(a aVar, b bVar, toa toaVar, int i, z7a z7aVar, Looper looper) {
        this.b = aVar;
        this.a = bVar;
        this.e = looper;
    }

    public final synchronized void a(boolean z) {
        notifyAll();
    }

    public final void b() {
        xl7.r(!this.f);
        this.f = true;
        e eVar = (e) this.b;
        if (!eVar.d0 && eVar.C.getThread().isAlive()) {
            eVar.A.m(14, this).b();
        } else {
            md6.g("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
