package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u87 implements kw5 {
    public final s27 a;
    public final Object[] b;
    public final int c;

    public u87(fg5 fg5Var, rv5<?> rv5Var) {
        j27 j27VarG = rv5Var.g();
        final int i = fg5Var.t;
        if (i < 0) {
            xc5.c("negative nearestRange.first");
        }
        final int iMin = Math.min(fg5Var.u, j27VarG.b - 1);
        if (iMin < i) {
            s27<Object> s27Var = je7.a;
            s27Var.getClass();
            this.a = s27Var;
            this.b = new Object[0];
            this.c = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.b = new Object[i2];
        this.c = i;
        final s27 s27Var2 = new s27(i2);
        oh4 oh4Var = new oh4() { // from class: t87
            /* JADX WARN: Code duplicated, block: B:7:0x002b  */
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                Object yr2Var;
                lj5 lj5Var = (lj5) obj;
                oh4<Integer, Object> key = lj5Var.c.getKey();
                int i3 = lj5Var.a;
                int iMax = Math.max(i, i3);
                int iMin2 = Math.min(iMin, (lj5Var.b + i3) - 1);
                if (iMax <= iMin2) {
                    while (true) {
                        if (key == null) {
                            yr2Var = new yr2(iMax);
                        } else {
                            yr2Var = key.invoke(Integer.valueOf(iMax - i3));
                            if (yr2Var == null) {
                                yr2Var = new yr2(iMax);
                            }
                        }
                        s27Var2.h(iMax, yr2Var);
                        u87 u87Var = this;
                        u87Var.b[iMax - u87Var.c] = yr2Var;
                        if (iMax == iMin2) {
                            break;
                        }
                        iMax++;
                    }
                }
                return g2b.a;
            }
        };
        k37<lj5<T>> k37Var = j27VarG.a;
        if (i < 0 || i >= j27VarG.b) {
            StringBuilder sbB = t43.b(i, "Index ", ", size ");
            sbB.append(j27VarG.b);
            xc5.e(sbB.toString());
        }
        if (iMin < 0 || iMin >= j27VarG.b) {
            StringBuilder sbB2 = t43.b(iMin, "Index ", ", size ");
            sbB2.append(j27VarG.b);
            xc5.e(sbB2.toString());
        }
        if (iMin < i) {
            xc5.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ')');
        }
        int iA = gw.a(i, k37Var);
        int i3 = ((lj5) k37Var.t[iA]).a;
        while (i3 <= iMin) {
            lj5 lj5Var = (lj5) k37Var.t[iA];
            oh4Var.invoke(lj5Var);
            i3 += lj5Var.b;
            iA++;
        }
        this.a = s27Var2;
    }

    public final Object a(int i) {
        int i2 = i - this.c;
        if (i2 < 0) {
            return null;
        }
        Object[] objArr = this.b;
        if (i2 < objArr.length) {
            return objArr[i2];
        }
        return null;
    }

    @Override // defpackage.kw5
    public final int d(Object obj) {
        s27 s27Var = this.a;
        int iD = s27Var.d(obj);
        if (iD >= 0) {
            return s27Var.c[iD];
        }
        return -1;
    }
}
