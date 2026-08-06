package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fb extends g5b<a, g2b> {
    public final pm1 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final pk1 a;
        public final db b;

        public a(pk1 pk1Var, db dbVar) {
            pk1Var.getClass();
            this.a = pk1Var;
            this.b = dbVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return xj5.a(this.a, aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Params(commentType=" + this.a + ", addCommentModel=" + this.b + ")";
        }
    }

    public fb(pm1 pm1Var) {
        pm1Var.getClass();
        this.a = pm1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(a aVar, u02 u02Var) throws Throwable {
        gb gbVar;
        if (u02Var instanceof gb) {
            gbVar = (gb) u02Var;
            int i = gbVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                gbVar.v = i - Integer.MIN_VALUE;
            } else {
                gbVar = new gb(this, u02Var);
            }
        } else {
            gbVar = new gb(this, u02Var);
        }
        Object obj = gbVar.t;
        int i2 = gbVar.v;
        if (i2 == 0) {
            dv8.b(obj);
            pk1 pk1Var = aVar.a;
            db dbVar = aVar.b;
            gbVar.v = 1;
            Object objI = this.a.i(pk1Var, dbVar, gbVar);
            v72 v72Var = v72.t;
            if (objI == v72Var) {
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
