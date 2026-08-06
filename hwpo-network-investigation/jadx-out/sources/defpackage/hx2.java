package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hx2 extends g5b<a, g2b> {
    public final pm1 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final long a;

        public a(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return "Params(commentId=" + this.a + ")";
        }
    }

    public hx2(pm1 pm1Var) {
        pm1Var.getClass();
        this.a = pm1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(a aVar, u02 u02Var) throws Throwable {
        ix2 ix2Var;
        if (u02Var instanceof ix2) {
            ix2Var = (ix2) u02Var;
            int i = ix2Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                ix2Var.v = i - Integer.MIN_VALUE;
            } else {
                ix2Var = new ix2(this, u02Var);
            }
        } else {
            ix2Var = new ix2(this, u02Var);
        }
        Object obj = ix2Var.t;
        int i2 = ix2Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            long j = aVar.a;
            ix2Var.v = 1;
            Object objH = this.a.h(j, ix2Var);
            v72 v72Var = v72.t;
            if (objH == v72Var) {
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
