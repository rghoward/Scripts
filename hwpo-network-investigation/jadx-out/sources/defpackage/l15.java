package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l15 implements ir5 {
    public final gga t;
    public final int u;
    public final mva v;
    public final mh4<sia> w;

    public l15(gga ggaVar, int i, mva mvaVar, mh4<sia> mh4Var) {
        this.t = ggaVar;
        this.u = i;
        this.v = mvaVar;
        this.w = mh4Var;
    }

    @Override // defpackage.ir5
    public final gl6 e(final hl6 hl6Var, cl6 cl6Var, long j) {
        long j2;
        if (cl6Var.C(xx1.g(j)) < xx1.h(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = xx1.a(0, Integer.MAX_VALUE, 0, 0, 13, j2);
        }
        final jz7 jz7VarE = cl6Var.E(j);
        final int iMin = Math.min(jz7VarE.t, xx1.h(j2));
        return hl6Var.y0(iMin, jz7VarE.u, if3.t, new oh4() { // from class: k15
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                jz7.a aVar = (jz7.a) obj;
                l15 l15Var = this.t;
                int i = l15Var.u;
                gga ggaVar = l15Var.t;
                mva mvaVar = l15Var.v;
                sia siaVarInvoke = l15Var.w.invoke();
                ria riaVar = siaVarInvoke != null ? siaVarInvoke.a : null;
                boolean z = hl6Var.getLayoutDirection() == tq5.u;
                jz7 jz7Var = jz7VarE;
                ggaVar.a(fl7.u, dga.a(aVar, i, mvaVar, riaVar, z, jz7Var.t), iMin, jz7Var.t);
                jz7.a.t(aVar, jz7Var, Math.round(-ggaVar.a.h()), 0);
                return g2b.a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l15) {
            l15 l15Var = (l15) obj;
            if (this.t == l15Var.t && this.u == l15Var.u && this.v.equals(l15Var.v) && xj5.a(this.w, l15Var.w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.w.hashCode() + ((this.v.hashCode() + os2.a(this.u, this.t.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.t + ", cursorOffset=" + this.u + ", transformedText=" + this.v + ", textLayoutResultProvider=" + this.w + ')';
    }
}
