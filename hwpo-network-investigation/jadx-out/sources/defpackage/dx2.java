package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class dx2 extends g5b<a, g2b> {
    public final sta a;

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

    public dx2(sta staVar) {
        staVar.getClass();
        this.a = staVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(a aVar, u02 u02Var) throws Throwable {
        ex2 ex2Var;
        if (u02Var instanceof ex2) {
            ex2Var = (ex2) u02Var;
            int i = ex2Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                ex2Var.v = i - Integer.MIN_VALUE;
            } else {
                ex2Var = new ex2(this, u02Var);
            }
        } else {
            ex2Var = new ex2(this, u02Var);
        }
        Object obj = ex2Var.t;
        int i2 = ex2Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            ebb ebbVar = aVar.a;
            int i3 = aVar.b;
            ex2Var.v = 1;
            Object objL = this.a.l(ebbVar, i3, ex2Var);
            v72 v72Var = v72.t;
            if (objL == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
