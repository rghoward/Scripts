package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tp8 extends g5b<a, g2b> {
    public final eq4 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final String a;
        public final boolean b;

        public a(String str, boolean z) {
            str.getClass();
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return xj5.a(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Params(country=" + this.a + ", loadFromStart=" + this.b + ")";
        }
    }

    public tp8(eq4 eq4Var) {
        eq4Var.getClass();
        this.a = eq4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(a aVar, u02 u02Var) throws Throwable {
        up8 up8Var;
        if (u02Var instanceof up8) {
            up8Var = (up8) u02Var;
            int i = up8Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                up8Var.v = i - Integer.MIN_VALUE;
            } else {
                up8Var = new up8(this, u02Var);
            }
        } else {
            up8Var = new up8(this, u02Var);
        }
        Object obj = up8Var.t;
        int i2 = up8Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            String str = aVar.a;
            boolean z = aVar.b;
            up8Var.v = 1;
            Object objD = this.a.d(str, z, up8Var);
            v72 v72Var = v72.t;
            if (objD == v72Var) {
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
