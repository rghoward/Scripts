package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iq8 extends g5b<a, g2b> {
    public final ls4 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final String a;
        public final boolean b;
        public final String c;
        public final String d;

        public a(String str, boolean z, String str2, String str3) {
            str.getClass();
            this.a = str;
            this.b = z;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return xj5.a(this.a, aVar.a) && this.b == aVar.b && xj5.a(this.c, aVar.c) && xj5.a(this.d, aVar.d);
        }

        public final int hashCode() {
            int iA = uo2.a(this.a.hashCode() * 31, this.b, 31);
            String str = this.c;
            int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(query=");
            sb.append(this.a);
            sb.append(", loadFromStart=");
            sb.append(this.b);
            sb.append(", country=");
            return ao2.a(sb, this.c, ", city=", this.d, ")");
        }
    }

    public iq8(ls4 ls4Var) {
        ls4Var.getClass();
        this.a = ls4Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(a aVar, u02 u02Var) throws Throwable {
        jq8 jq8Var;
        if (u02Var instanceof jq8) {
            jq8Var = (jq8) u02Var;
            int i = jq8Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                jq8Var.v = i - Integer.MIN_VALUE;
            } else {
                jq8Var = new jq8(this, u02Var);
            }
        } else {
            jq8Var = new jq8(this, u02Var);
        }
        jq8 jq8Var2 = jq8Var;
        Object obj = jq8Var2.t;
        int i2 = jq8Var2.v;
        if (i2 == 0) {
            dv8.b(obj);
            String str = aVar.a;
            boolean z = aVar.b;
            String str2 = aVar.c;
            String str3 = aVar.d;
            jq8Var2.v = 1;
            Object objB = this.a.b(str, z, str2, str3, jq8Var2);
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
