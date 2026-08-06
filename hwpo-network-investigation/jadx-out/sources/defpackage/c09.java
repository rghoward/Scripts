package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c09 extends g5b<a, g2b> {
    public final sr8 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;
        public final String b;
        public final m2b c;

        public a(int i, String str, m2b m2bVar) {
            str.getClass();
            m2bVar.getClass();
            this.a = i;
            this.b = str;
            this.c = m2bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && xj5.a(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + ru3.c(Integer.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbA = il.a("Params(benchmarkId=", ", value=", this.b, ", units=", this.a);
            sbA.append(this.c);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public c09(sr8 sr8Var) {
        sr8Var.getClass();
        this.a = sr8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(a aVar, u02 u02Var) throws Throwable {
        d09 d09Var;
        if (u02Var instanceof d09) {
            d09Var = (d09) u02Var;
            int i = d09Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                d09Var.v = i - Integer.MIN_VALUE;
            } else {
                d09Var = new d09(this, u02Var);
            }
        } else {
            d09Var = new d09(this, u02Var);
        }
        Object obj = d09Var.t;
        int i2 = d09Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            int i3 = aVar.a;
            String str = aVar.b;
            String lowerCase = aVar.c.name().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            d09Var.v = 1;
            Object objE = this.a.e(i3, str, lowerCase, d09Var);
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
