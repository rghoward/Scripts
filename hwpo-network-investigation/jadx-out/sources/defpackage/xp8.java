package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xp8 extends g5b<a, g2b> {
    public final eq4 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return cq2.a("Params(loadFromStart=", ")", this.a);
        }
    }

    public xp8(eq4 eq4Var) {
        eq4Var.getClass();
        this.a = eq4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(a aVar, u02 u02Var) throws Throwable {
        yp8 yp8Var;
        if (u02Var instanceof yp8) {
            yp8Var = (yp8) u02Var;
            int i = yp8Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                yp8Var.v = i - Integer.MIN_VALUE;
            } else {
                yp8Var = new yp8(this, u02Var);
            }
        } else {
            yp8Var = new yp8(this, u02Var);
        }
        Object obj = yp8Var.t;
        int i2 = yp8Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            boolean z = aVar.a;
            yp8Var.v = 1;
            Object objB = this.a.b(z, yp8Var);
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
