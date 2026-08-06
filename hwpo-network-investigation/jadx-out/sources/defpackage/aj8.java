package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class aj8 implements vg5.a {
    public final oi8 a;
    public final ArrayList b;
    public final int c;
    public final gn3 d;
    public final jp8 e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public aj8(oi8 oi8Var, ArrayList arrayList, int i, gn3 gn3Var, jp8 jp8Var, int i2, int i3, int i4) {
        jp8Var.getClass();
        this.a = oi8Var;
        this.b = arrayList;
        this.c = i;
        this.d = gn3Var;
        this.e = jp8Var;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static aj8 b(aj8 aj8Var, int i, gn3 gn3Var, jp8 jp8Var, int i2) {
        if ((i2 & 1) != 0) {
            i = aj8Var.c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            gn3Var = aj8Var.d;
        }
        gn3 gn3Var2 = gn3Var;
        if ((i2 & 4) != 0) {
            jp8Var = aj8Var.e;
        }
        jp8 jp8Var2 = jp8Var;
        int i4 = aj8Var.f;
        int i5 = aj8Var.g;
        int i6 = aj8Var.h;
        jp8Var2.getClass();
        return new aj8(aj8Var.a, aj8Var.b, i3, gn3Var2, jp8Var2, i4, i5, i6);
    }

    @Override // vg5.a
    public final qu8 a(jp8 jp8Var) {
        jp8Var.getClass();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            aa0.c("Check failed.");
            return null;
        }
        this.i++;
        gn3 gn3Var = this.d;
        if (gn3Var != null) {
            if (!gn3Var.c.b().a(jp8Var.a)) {
                qz1.a(arrayList.get(i - 1), " must retain the same host and port", "network interceptor ");
                return null;
            }
            if (this.i != 1) {
                qz1.a(arrayList.get(i - 1), " must call proceed() exactly once", "network interceptor ");
                return null;
            }
        }
        int i2 = i + 1;
        aj8 aj8VarB = b(this, i2, null, jp8Var, 58);
        vg5 vg5Var = (vg5) arrayList.get(i);
        qu8 qu8VarIntercept = vg5Var.intercept(aj8VarB);
        if (qu8VarIntercept == null) {
            throw new NullPointerException("interceptor " + vg5Var + " returned null");
        }
        if (gn3Var == null || i2 >= arrayList.size() || aj8VarB.i == 1) {
            return qu8VarIntercept;
        }
        qz1.a(vg5Var, " must call proceed() exactly once", "network interceptor ");
        return null;
    }

    @Override // vg5.a
    public final jp8 request() {
        return this.e;
    }
}
