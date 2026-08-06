package defpackage;

import android.os.Handler;
import android.os.Looper;
import defpackage.wfb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class yfb<R, T extends wfb> implements fi8<R, T> {
    private static final b Companion = new b();
    public static final Handler e = new Handler(Looper.getMainLooper());
    public final oh4<R, T> a;
    public T b;
    public final yfb<R, T>.a c = new a();
    public R d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a implements as2 {
        public a() {
        }

        @Override // defpackage.as2
        public final void onDestroy(m76 m76Var) {
            yfb<R, T> yfbVar = yfb.this;
            R r = yfbVar.d;
            if (r == null) {
                return;
            }
            yfbVar.d = null;
            yfbVar.b(r).getLifecycle().c(yfbVar.c);
            yfb.e.post(new x15(1, yfbVar));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yfb(oh4<? super R, ? extends T> oh4Var) {
        this.a = oh4Var;
    }

    public abstract m76 b(R r);

    @Override // defpackage.fi8
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final T a(R r, ho5<?> ho5Var) {
        r.getClass();
        ho5Var.getClass();
        T t = this.b;
        if (t != null) {
            return t;
        }
        this.d = r;
        s66 lifecycle = b(r).getLifecycle();
        if (lifecycle.b() == s66.b.t) {
            e.post(new y15(1, this));
        } else {
            lifecycle.a(this.c);
        }
        T tInvoke = this.a.invoke(r);
        this.b = tInvoke;
        return tInvoke;
    }
}
