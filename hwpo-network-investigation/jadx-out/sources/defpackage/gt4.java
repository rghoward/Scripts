package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gt4 extends ht4 {
    public final Handler v;
    public final String w;
    public final boolean x;
    public final gt4 y;

    public gt4(Handler handler, String str, boolean z) {
        this.v = handler;
        this.w = str;
        this.x = z;
        this.y = z ? this : new gt4(handler, str, true);
    }

    @Override // defpackage.zv2
    public final e33 K(long j, final Runnable runnable, h72 h72Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.v.postDelayed(runnable, j)) {
            return new e33() { // from class: dt4
                @Override // defpackage.e33
                public final void dispose() {
                    this.t.v.removeCallbacks(runnable);
                }
            };
        }
        y0(h72Var, runnable);
        return yb7.t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [et4, java.lang.Runnable] */
    @Override // defpackage.zv2
    public final void Y(long j, final e41 e41Var) {
        final ?? r0 = new Runnable() { // from class: et4
            @Override // java.lang.Runnable
            public final void run() {
                e41Var.E(this, g2b.a);
            }
        };
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.v.postDelayed(r0, j)) {
            e41Var.v(new oh4() { // from class: ft4
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    this.t.v.removeCallbacks(r0);
                    return g2b.a;
                }
            });
        } else {
            y0(e41Var.x, r0);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gt4)) {
            return false;
        }
        gt4 gt4Var = (gt4) obj;
        return gt4Var.v == this.v && gt4Var.x == this.x;
    }

    public final int hashCode() {
        return (this.x ? 1231 : 1237) ^ System.identityHashCode(this.v);
    }

    @Override // defpackage.n72
    public final void t0(h72 h72Var, Runnable runnable) {
        if (this.v.post(runnable)) {
            return;
        }
        y0(h72Var, runnable);
    }

    @Override // defpackage.ht4, defpackage.n72
    public final String toString() {
        gt4 gt4VarX0;
        String string;
        et2 et2Var = i23.a;
        ht4 ht4Var = ag6.a;
        if (this == ht4Var) {
            string = "Dispatchers.Main";
        } else {
            try {
                gt4VarX0 = ht4Var.x0();
            } catch (UnsupportedOperationException unused) {
                gt4VarX0 = null;
            }
            string = this == gt4VarX0 ? "Dispatchers.Main.immediate" : null;
        }
        if (string == null) {
            string = this.w;
            if (string == null) {
                string = this.v.toString();
            }
            if (this.x) {
                return al.d(string, ".immediate");
            }
        }
        return string;
    }

    @Override // defpackage.n72
    public final boolean v0(h72 h72Var) {
        return (this.x && xj5.a(Looper.myLooper(), this.v.getLooper())) ? false : true;
    }

    @Override // defpackage.ht4
    public final gt4 x0() {
        return this.y;
    }

    public final void y0(h72 h72Var, Runnable runnable) {
        sd.c(h72Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        et2 et2Var = i23.a;
        wr2.v.t0(h72Var, runnable);
    }

    public gt4(Handler handler) {
        this(handler, null, false);
    }
}
