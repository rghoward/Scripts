package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a91 extends g5b<a, g2b> {
    public final x81 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ru3.c(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return av.a(vb0.a("Params(currentPassword=", this.a, ", newPassword=", this.b, ", newConfirmedPassword="), this.c, ")");
        }
    }

    public a91(x81 x81Var) {
        x81Var.getClass();
        this.a = x81Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(a aVar, u02 u02Var) throws Throwable {
        b91 b91Var;
        if (u02Var instanceof b91) {
            b91Var = (b91) u02Var;
            int i = b91Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                b91Var.v = i - Integer.MIN_VALUE;
            } else {
                b91Var = new b91(this, u02Var);
            }
        } else {
            b91Var = new b91(this, u02Var);
        }
        Object obj = b91Var.t;
        int i2 = b91Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            String str = aVar.a;
            String str2 = aVar.b;
            String str3 = aVar.c;
            b91Var.v = 1;
            Object objA = this.a.a(str, str2, str3, b91Var);
            v72 v72Var = v72.t;
            if (objA == v72Var) {
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
