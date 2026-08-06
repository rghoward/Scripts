package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xj8 implements vj8 {
    public yj8 a;
    public int b;
    public vi4 c;
    public ci4<? super jt1, ? super Integer, g2b> d;
    public int e;
    public s27<Object> f;
    public c37<ny2<?>, Object> g;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static void a(cs9 cs9Var, List list, yj8 yj8Var) {
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                int iC = cs9Var.c((vi4) list.get(i));
                int iP = cs9Var.P(cs9Var.b, cs9Var.r(iC));
                Object obj = iP < cs9Var.g(cs9Var.b, cs9Var.r(iC + 1)) ? cs9Var.c[cs9Var.h(iP)] : jt1.a.a;
                xj8 xj8Var = obj instanceof xj8 ? (xj8) obj : null;
                if (xj8Var != null) {
                    xj8Var.a = yj8Var;
                }
            }
        }
    }

    public xj8(yj8 yj8Var) {
        this.a = yj8Var;
    }

    public final boolean a() {
        if (this.a != null) {
            vi4 vi4Var = this.c;
            if (vi4Var != null ? vi4Var.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final lk5 b(Object obj) {
        lk5 lk5VarR;
        yj8 yj8Var = this.a;
        return (yj8Var == null || (lk5VarR = yj8Var.r(this, obj)) == null) ? lk5.t : lk5VarR;
    }

    public final void c() {
        yj8 yj8Var = this.a;
        if (yj8Var != null) {
            yj8Var.h();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }

    public final void e(ci4<? super jt1, ? super Integer, g2b> ci4Var) {
        this.d = ci4Var;
    }

    @Override // defpackage.vj8
    public final void invalidate() {
        yj8 yj8Var = this.a;
        if (yj8Var != null) {
            yj8Var.r(this, null);
        }
    }
}
