package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class rq8 extends g5b<a, g2b> {
    public final sta a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final ebb a;
        public final int b;
        public final c13 c;

        public a(ebb ebbVar, int i, c13 c13Var) {
            ebbVar.getClass();
            this.a = ebbVar;
            this.b = i;
            this.c = c13Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + os2.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "Params(valueType=" + this.a + ", id=" + this.b + ", direction=" + this.c + ")";
        }
    }

    public rq8(sta staVar) {
        staVar.getClass();
        this.a = staVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(a aVar, u02 u02Var) throws Throwable {
        sq8 sq8Var;
        if (u02Var instanceof sq8) {
            sq8Var = (sq8) u02Var;
            int i = sq8Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                sq8Var.v = i - Integer.MIN_VALUE;
            } else {
                sq8Var = new sq8(this, u02Var);
            }
        } else {
            sq8Var = new sq8(this, u02Var);
        }
        Object obj = sq8Var.t;
        int i2 = sq8Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            ebb ebbVar = aVar.a;
            int i3 = aVar.b;
            c13 c13Var = aVar.c;
            sq8Var.v = 1;
            Object objE = this.a.e(ebbVar, i3, c13Var, sq8Var);
            v72 v72Var = v72.t;
            if (objE == v72Var) {
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
