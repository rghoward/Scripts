package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ov8 extends g5b<a, g2b> {
    public final oy3 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final String a;

        public a(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && xj5.a(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return sk0.c("Params(uri=", this.a, ")");
        }
    }

    public ov8(oy3 oy3Var) {
        oy3Var.getClass();
        this.a = oy3Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(a aVar, u02 u02Var) throws Throwable {
        pv8 pv8Var;
        if (u02Var instanceof pv8) {
            pv8Var = (pv8) u02Var;
            int i = pv8Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                pv8Var.v = i - Integer.MIN_VALUE;
            } else {
                pv8Var = new pv8(this, u02Var);
            }
        } else {
            pv8Var = new pv8(this, u02Var);
        }
        Object obj = pv8Var.t;
        int i2 = pv8Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            String str = aVar.a;
            pv8Var.v = 1;
            oy3 oy3Var = this.a;
            LinkedHashMap linkedHashMap = oy3Var.e;
            k4b k4bVar = (k4b) linkedHashMap.get(str);
            if (k4bVar != null) {
                k4bVar.b.k(null);
            }
            linkedHashMap.remove(str);
            Object objB = oy3Var.b(str, pv8Var);
            v72 v72Var = v72.t;
            if (objB != v72Var) {
                objB = g2b.a;
            }
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
