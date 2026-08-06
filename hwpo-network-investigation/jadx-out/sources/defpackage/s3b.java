package defpackage;

import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s3b extends g5b<a, g2b> {
    public final h6 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final ByteArrayOutputStream a;
        public final String b;
        public final String c;

        public a(ByteArrayOutputStream byteArrayOutputStream, String str, String str2) {
            this.a = byteArrayOutputStream;
            this.b = str;
            this.c = str2;
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
            StringBuilder sb = new StringBuilder("Params(bitmapStream=");
            sb.append(this.a);
            sb.append(", fileName=");
            sb.append(this.b);
            sb.append(", mimeType=");
            return av.a(sb, this.c, ")");
        }
    }

    public s3b(h6 h6Var) {
        h6Var.getClass();
        this.a = h6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(a aVar, u02 u02Var) throws Throwable {
        t3b t3bVar;
        if (u02Var instanceof t3b) {
            t3bVar = (t3b) u02Var;
            int i = t3bVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                t3bVar.v = i - Integer.MIN_VALUE;
            } else {
                t3bVar = new t3b(this, u02Var);
            }
        } else {
            t3bVar = new t3b(this, u02Var);
        }
        Object obj = t3bVar.t;
        int i2 = t3bVar.v;
        if (i2 == 0) {
            dv8.b(obj);
            ByteArrayOutputStream byteArrayOutputStream = aVar.a;
            String str = aVar.b;
            String str2 = aVar.c;
            t3bVar.v = 1;
            Object objB = this.a.b(byteArrayOutputStream, str, str2, t3bVar);
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
