package defpackage;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vt7<T> implements yb6.d {
    public final of2 b;
    public final c1a d;
    public final a<? extends T> e;
    public volatile T f;
    public final int c = 4;
    public final long a = rb6.c.getAndIncrement();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a<T> {
        Object a(Uri uri, mf2 mf2Var);
    }

    public vt7(if2 if2Var, of2 of2Var, a aVar) {
        this.d = new c1a(if2Var);
        this.b = of2Var;
        this.e = aVar;
    }

    @Override // yb6.d
    public final void a() {
        this.d.b = 0L;
        mf2 mf2Var = new mf2(this.d, this.b);
        try {
            mf2Var.h();
            Uri uri = this.d.a.getUri();
            uri.getClass();
            this.f = (T) this.e.a(uri, mf2Var);
        } finally {
            String str = n6b.a;
            try {
                mf2Var.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // yb6.d
    public final void b() {
    }
}
