package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class eo8 extends g5b<a, g2b> {
    public final zo8 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final long a;
        public final int b;
        public final Integer c;
        public final String d;

        public a(long j, int i, Integer num, String str) {
            this.a = j;
            this.b = i;
            this.c = num;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && xj5.a(this.c, aVar.c) && this.d.equals(aVar.d);
        }

        public final int hashCode() {
            int iA = os2.a(this.b, Long.hashCode(this.a) * 31, 31);
            Integer num = this.c;
            return this.d.hashCode() + ((iA + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            return "Params(commentId=" + this.a + ", scoreId=" + this.b + ", scoreValueId=" + this.c + ", text=" + this.d + ")";
        }
    }

    public eo8(zo8 zo8Var) {
        zo8Var.getClass();
        this.a = zo8Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(a aVar, u02 u02Var) throws Throwable {
        fo8 fo8Var;
        if (u02Var instanceof fo8) {
            fo8Var = (fo8) u02Var;
            int i = fo8Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                fo8Var.v = i - Integer.MIN_VALUE;
            } else {
                fo8Var = new fo8(this, u02Var);
            }
        } else {
            fo8Var = new fo8(this, u02Var);
        }
        fo8 fo8Var2 = fo8Var;
        Object obj = fo8Var2.t;
        int i2 = fo8Var2.v;
        if (i2 == 0) {
            dv8.b(obj);
            long j = aVar.a;
            int i3 = aVar.b;
            Integer num = aVar.c;
            String str = aVar.d;
            fo8Var2.v = 1;
            Object objC = this.a.c(j, i3, num, str, fo8Var2);
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
