package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hv0 implements fl6 {
    public final di a;
    public final boolean b;

    public hv0(di diVar, boolean z) {
        this.a = diVar;
        this.b = z;
    }

    @Override // defpackage.fl6
    public final gl6 d(final hl6 hl6Var, final List<? extends cl6> list, long j) {
        final jz7 jz7VarE;
        final int iMax;
        final int i;
        boolean zIsEmpty = list.isEmpty();
        if3 if3Var = if3.t;
        if (zIsEmpty) {
            return hl6Var.y0(xx1.j(j), xx1.i(j), if3Var, new ev0(0));
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final cl6 cl6Var = list.get(0);
            c37<di, fl6> c37Var = dv0.a;
            Object objG = cl6Var.g();
            av0 av0Var = objG instanceof av0 ? (av0) objG : null;
            if (av0Var != null ? av0Var.I : false) {
                int iJ = xx1.j(j);
                int i2 = xx1.i(j);
                int iJ2 = xx1.j(j);
                int i3 = xx1.i(j);
                if (!((i3 >= 0) & (iJ2 >= 0))) {
                    wc5.a("width and height must be >= 0");
                }
                jz7VarE = cl6Var.E(zx1.h(iJ2, iJ2, i3, i3));
                iMax = i2;
                i = iJ;
            } else {
                jz7 jz7VarE2 = cl6Var.E(j2);
                int iMax2 = Math.max(xx1.j(j), jz7VarE2.t);
                iMax = Math.max(xx1.i(j), jz7VarE2.u);
                i = iMax2;
                jz7VarE = jz7VarE2;
            }
            return hl6Var.y0(i, iMax, if3Var, new oh4() { // from class: fv0
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    dv0.b((jz7.a) obj, jz7VarE, cl6Var, hl6Var.getLayoutDirection(), i, iMax, this.a);
                    return g2b.a;
                }
            });
        }
        final jz7[] jz7VarArr = new jz7[list.size()];
        final el8 el8Var = new el8();
        el8Var.t = xx1.j(j);
        final el8 el8Var2 = new el8();
        el8Var2.t = xx1.i(j);
        int size = list.size();
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            cl6 cl6Var2 = list.get(i4);
            c37<di, fl6> c37Var2 = dv0.a;
            Object objG2 = cl6Var2.g();
            av0 av0Var2 = objG2 instanceof av0 ? (av0) objG2 : null;
            if (av0Var2 != null ? av0Var2.I : false) {
                z = true;
            } else {
                jz7 jz7VarE3 = cl6Var2.E(j2);
                jz7VarArr[i4] = jz7VarE3;
                el8Var.t = Math.max(el8Var.t, jz7VarE3.t);
                el8Var2.t = Math.max(el8Var2.t, jz7VarE3.u);
            }
        }
        if (z) {
            int i5 = el8Var.t;
            int i6 = i5 != Integer.MAX_VALUE ? i5 : 0;
            int i7 = el8Var2.t;
            long jA = zx1.a(i6, i5, i7 != Integer.MAX_VALUE ? i7 : 0, i7);
            int size2 = list.size();
            for (int i8 = 0; i8 < size2; i8++) {
                cl6 cl6Var3 = list.get(i8);
                c37<di, fl6> c37Var3 = dv0.a;
                Object objG3 = cl6Var3.g();
                av0 av0Var3 = objG3 instanceof av0 ? (av0) objG3 : null;
                if (av0Var3 != null ? av0Var3.I : false) {
                    jz7VarArr[i8] = cl6Var3.E(jA);
                }
            }
        }
        return hl6Var.y0(el8Var.t, el8Var2.t, if3Var, new oh4() { // from class: gv0
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                jz7.a aVar = (jz7.a) obj;
                jz7[] jz7VarArr2 = jz7VarArr;
                int length = jz7VarArr2.length;
                int i9 = 0;
                int i10 = 0;
                while (i10 < length) {
                    int i11 = i9;
                    jz7 jz7Var = jz7VarArr2[i10];
                    jz7Var.getClass();
                    dv0.b(aVar, jz7Var, (cl6) list.get(i11), hl6Var.getLayoutDirection(), el8Var.t, el8Var2.t, this.a);
                    i10++;
                    i9 = i11 + 1;
                }
                return g2b.a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv0)) {
            return false;
        }
        hv0 hv0Var = (hv0) obj;
        return xj5.a(this.a, hv0Var.a) && this.b == hv0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb.append(this.a);
        sb.append(", propagateMinConstraints=");
        return pi1.a(sb, this.b, ')');
    }
}
