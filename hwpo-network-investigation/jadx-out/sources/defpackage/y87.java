package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class y87 extends g37 {
    public final g37 o;
    public boolean p;

    public y87(long j, ou9 ou9Var, oh4<Object, g2b> oh4Var, oh4<Object, g2b> oh4Var2, g37 g37Var) {
        super(j, ou9Var, oh4Var, oh4Var2);
        this.o = g37Var;
        g37Var.k();
    }

    @Override // defpackage.g37, defpackage.hu9
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.o.l();
    }

    @Override // defpackage.g37
    public final ju9 w() {
        y87 y87Var;
        g37 g37Var = this.o;
        if (g37Var.m || g37Var.c) {
            return new ju9.a(this);
        }
        d37<m0a> d37Var = this.h;
        long j = this.b;
        HashMap mapB = d37Var != null ? qu9.b(g37Var.g(), this, this.o.d()) : null;
        Object obj = qu9.c;
        synchronized (obj) {
            try {
                qu9.c(this);
                if (d37Var == null || d37Var.d == 0) {
                    y87Var = this;
                    y87Var.a();
                    g2b g2bVar = g2b.a;
                } else {
                    y87Var = this;
                    ju9 ju9VarZ = y87Var.z(this.o.g(), d37Var, mapB, this.o.d());
                    if (!xj5.a(ju9VarZ, ju9.b.a)) {
                        return ju9VarZ;
                    }
                    d37<m0a> d37VarX = y87Var.o.x();
                    if (d37VarX != null) {
                        d37VarX.j(d37Var);
                    } else {
                        y87Var.o.B(d37Var);
                        y87Var.h = null;
                    }
                }
                if (xj5.c(y87Var.o.g(), j) < 0) {
                    y87Var.o.v();
                }
                g37 g37Var2 = y87Var.o;
                g37Var2.r(g37Var2.d().e(j).d(y87Var.j));
                y87Var.o.A(j);
                g37 g37Var3 = y87Var.o;
                int i = y87Var.d;
                y87Var.d = -1;
                if (i >= 0) {
                    int[] iArr = g37Var3.k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    g37Var3.k = iArrCopyOf;
                } else {
                    g37Var3.getClass();
                }
                g37 g37Var4 = y87Var.o;
                ou9 ou9Var = y87Var.j;
                g37Var4.getClass();
                synchronized (obj) {
                    g37Var4.j = g37Var4.j.i(ou9Var);
                    g2b g2bVar2 = g2b.a;
                    g37 g37Var5 = y87Var.o;
                    int[] iArr2 = y87Var.k;
                    g37Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = g37Var5.k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        g37Var5.k = iArr2;
                    }
                }
                y87Var.m = true;
                if (!y87Var.p) {
                    y87Var.p = true;
                    y87Var.o.l();
                }
                return ju9.b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
