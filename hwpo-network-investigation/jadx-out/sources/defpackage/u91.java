package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u91<T> implements ri4<T> {
    public final h72 t;
    public final int u;
    public final xx0 v;

    public u91(h72 h72Var, int i, xx0 xx0Var) {
        this.t = h72Var;
        this.u = i;
        this.v = xx0Var;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // defpackage.ri4
    public final r54<T> b(h72 h72Var, int i, xx0 xx0Var) {
        h72 h72Var2 = this.t;
        h72 h72VarC0 = h72Var.c0(h72Var2);
        xx0 xx0Var2 = xx0.t;
        xx0 xx0Var3 = this.v;
        int i2 = this.u;
        if (xx0Var == xx0Var2) {
            if (i2 != -3) {
                if (i == -3) {
                    i = i2;
                } else if (i2 != -2) {
                    if (i == -2) {
                        i = i2;
                    } else {
                        i += i2;
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            xx0Var = xx0Var3;
        }
        return (xj5.a(h72VarC0, h72Var2) && i == i2 && xx0Var == xx0Var3) ? this : j(h72VarC0, i, xx0Var);
    }

    @Override // defpackage.r54
    public Object collect(s54<? super T> s54Var, r02<? super g2b> r02Var) {
        Object objD = u72.d(new s91(s54Var, this, null), r02Var);
        return objD == v72.t ? objD : g2b.a;
    }

    public String h() {
        return null;
    }

    public abstract Object i(ua8<? super T> ua8Var, r02<? super g2b> r02Var);

    public abstract u91<T> j(h72 h72Var, int i, xx0 xx0Var);

    public r54<T> k() {
        return null;
    }

    public tj8<T> l(t72 t72Var) {
        int i = this.u;
        if (i == -3) {
            i = -2;
        }
        ci4 t91Var = new t91(this, null);
        ta8 ta8Var = new ta8(l72.b(t72Var, this.t), da1.a(i, 4, this.v));
        ta8Var.D0(x72.v, ta8Var, t91Var);
        return ta8Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strH = h();
        if (strH != null) {
            arrayList.add(strH);
        }
        ff3 ff3Var = ff3.t;
        h72 h72Var = this.t;
        if (h72Var != ff3Var) {
            arrayList.add("context=" + h72Var);
        }
        int i = this.u;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        xx0 xx0Var = xx0.t;
        xx0 xx0Var2 = this.v;
        if (xx0Var2 != xx0Var) {
            arrayList.add("onBufferOverflow=" + xx0Var2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return wu0.a(sb, th1.F(arrayList, ", ", null, null, null, 62), ']');
    }
}
