package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class vq8 extends g5b<a, g2b> {
    public final sta a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final ebb a;
        public final boolean b;
        public final String c;

        public a(ebb ebbVar, boolean z, String str) {
            ebbVar.getClass();
            str.getClass();
            this.a = ebbVar;
            this.b = z;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && xj5.a(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + uo2.a(this.a.hashCode() * 31, this.b, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(valueType=");
            sb.append(this.a);
            sb.append(", loadFromStart=");
            sb.append(this.b);
            sb.append(", query=");
            return av.a(sb, this.c, ")");
        }
    }

    public vq8(sta staVar) {
        staVar.getClass();
        this.a = staVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(a aVar, u02 u02Var) throws Throwable {
        wq8 wq8Var;
        if (u02Var instanceof wq8) {
            wq8Var = (wq8) u02Var;
            int i = wq8Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                wq8Var.v = i - Integer.MIN_VALUE;
            } else {
                wq8Var = new wq8(this, u02Var);
            }
        } else {
            wq8Var = new wq8(this, u02Var);
        }
        Object obj = wq8Var.t;
        int i2 = wq8Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            ebb ebbVar = aVar.a;
            boolean z = aVar.b;
            String str = aVar.c;
            wq8Var.v = 1;
            Object objK = this.a.k(ebbVar, z, str, wq8Var);
            v72 v72Var = v72.t;
            if (objK == v72Var) {
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
