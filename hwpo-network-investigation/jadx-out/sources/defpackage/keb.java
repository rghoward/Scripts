package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class keb implements ir5 {
    public final gga t;
    public final int u;
    public final mva v;
    public final mh4<sia> w;

    public keb(gga ggaVar, int i, mva mvaVar, mh4<sia> mh4Var) {
        this.t = ggaVar;
        this.u = i;
        this.v = mvaVar;
        this.w = mh4Var;
    }

    @Override // defpackage.ir5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        final jz7 jz7VarE = cl6Var.E(xx1.a(0, 0, 0, Integer.MAX_VALUE, 7, j));
        final int iMin = Math.min(jz7VarE.u, xx1.g(j));
        return hl6Var.y0(jz7VarE.t, iMin, if3.t, new oh4() { // from class: jeb
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                jz7.a aVar = (jz7.a) obj;
                keb kebVar = this.t;
                int i = kebVar.u;
                gga ggaVar = kebVar.t;
                mva mvaVar = kebVar.v;
                sia siaVarInvoke = kebVar.w.invoke();
                ria riaVar = siaVarInvoke != null ? siaVarInvoke.a : null;
                jz7 jz7Var = jz7VarE;
                ggaVar.a(fl7.t, dga.a(aVar, i, mvaVar, riaVar, false, jz7Var.t), iMin, jz7Var.u);
                jz7.a.t(aVar, jz7Var, 0, Math.round(-ggaVar.a.h()));
                return g2b.a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof keb) {
            keb kebVar = (keb) obj;
            if (this.t == kebVar.t && this.u == kebVar.u && this.v.equals(kebVar.v) && xj5.a(this.w, kebVar.w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.w.hashCode() + ((this.v.hashCode() + os2.a(this.u, this.t.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.t + ", cursorOffset=" + this.u + ", transformedText=" + this.v + ", textLayoutResultProvider=" + this.w + ')';
    }
}
