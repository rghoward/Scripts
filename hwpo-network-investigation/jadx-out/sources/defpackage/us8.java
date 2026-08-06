package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class us8 extends g5b<a, g2b> {
    public final ws8 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;
        public final String b;
        public final int c;

        public a(int i, int i2, String str) {
            this.a = i;
            this.b = str;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + ru3.c(Integer.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            return i34.b(this.c, ")", il.a("Params(planId=", ", date=", this.b, ", dayNumber=", this.a));
        }
    }

    public us8(ws8 ws8Var) {
        ws8Var.getClass();
        this.a = ws8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(a aVar, u02 u02Var) throws Throwable {
        vs8 vs8Var;
        if (u02Var instanceof vs8) {
            vs8Var = (vs8) u02Var;
            int i = vs8Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                vs8Var.v = i - Integer.MIN_VALUE;
            } else {
                vs8Var = new vs8(this, u02Var);
            }
        } else {
            vs8Var = new vs8(this, u02Var);
        }
        Object obj = vs8Var.t;
        int i2 = vs8Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            int i3 = aVar.a;
            String str = aVar.b;
            int i4 = aVar.c;
            vs8Var.v = 1;
            Object objB = this.a.b(i3, str, i4, vs8Var);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
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
