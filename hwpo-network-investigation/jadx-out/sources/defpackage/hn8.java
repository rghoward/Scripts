package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hn8 extends g5b<a, g2b> {
    public final pm1 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final pk1 a;
        public final long b;
        public final long c;

        public a(pk1 pk1Var, long j, long j2) {
            pk1Var.getClass();
            this.a = pk1Var;
            this.b = j;
            this.c = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return xj5.a(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + al.c(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "Params(commentType=" + this.a + ", commentId=" + this.b + ", attachmentId=" + this.c + ")";
        }
    }

    public hn8(pm1 pm1Var) {
        pm1Var.getClass();
        this.a = pm1Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(a aVar, u02 u02Var) throws Throwable {
        in8 in8Var;
        if (u02Var instanceof in8) {
            in8Var = (in8) u02Var;
            int i = in8Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                in8Var.v = i - Integer.MIN_VALUE;
            } else {
                in8Var = new in8(this, u02Var);
            }
        } else {
            in8Var = new in8(this, u02Var);
        }
        in8 in8Var2 = in8Var;
        Object obj = in8Var2.t;
        int i2 = in8Var2.v;
        if (i2 == 0) {
            dv8.b(obj);
            pk1 pk1Var = aVar.a;
            long j = aVar.b;
            long j2 = aVar.c;
            in8Var2.v = 1;
            Object objC = this.a.c(pk1Var, j, j2, in8Var2);
            v72 v72Var = v72.t;
            if (objC == v72Var) {
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
