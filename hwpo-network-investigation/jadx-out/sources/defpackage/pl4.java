package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class pl4 extends g5b<a, xj3> {
    public final sta a;
    public final p43 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final ebb a;
        public final int b;

        public a(ebb ebbVar, int i) {
            ebbVar.getClass();
            this.a = ebbVar;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Params(valueType=" + this.a + ", id=" + this.b + ")";
        }
    }

    public pl4(sta staVar, p43 p43Var) {
        staVar.getClass();
        p43Var.getClass();
        this.a = staVar;
        this.b = p43Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(a aVar, u02 u02Var) throws Throwable {
        ql4 ql4Var;
        if (u02Var instanceof ql4) {
            ql4Var = (ql4) u02Var;
            int i = ql4Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                ql4Var.v = i - Integer.MIN_VALUE;
            } else {
                ql4Var = new ql4(this, u02Var);
            }
        } else {
            ql4Var = new ql4(this, u02Var);
        }
        Object objJ = ql4Var.t;
        int i2 = ql4Var.v;
        if (i2 == 0) {
            dv8.b(objJ);
            ebb ebbVar = aVar.a;
            int i3 = aVar.b;
            ql4Var.v = 1;
            objJ = this.a.j(ebbVar, i3, ql4Var);
            v72 v72Var = v72.t;
            if (objJ == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objJ);
        }
        xj3 xj3Var = (xj3) objJ;
        return xj3.a(xj3Var, ii6.a(xj3Var.h, this.b));
    }
}
