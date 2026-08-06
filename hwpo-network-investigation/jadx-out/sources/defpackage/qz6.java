package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qz6 implements su6.a {
    public final float a;
    public final a b;
    public final a c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;
        public final int b;
        public final float c;

        public a(int i, int i2, float f) {
            this.a = i;
            this.b = i2;
            this.c = f;
        }

        public static a a(int i) {
            int i2 = (i >> 13) & 7;
            if (i2 == 0) {
                return null;
            }
            return new a(i2, (i >> 10) & 7, ((i & 511) * ((i & 512) != 0 ? -1 : 1)) / 10.0f);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && Float.compare(this.c, aVar.c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c) + (((this.a * 31) + this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GainField{name=");
            sb.append(this.a);
            sb.append(", originator=");
            sb.append(this.b);
            sb.append(", gain=");
            return ho.a(sb, this.c, '}');
        }
    }

    public qz6(float f, a aVar, a aVar2) {
        this.a = f;
        this.b = aVar;
        this.c = aVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qz6)) {
            return false;
        }
        qz6 qz6Var = (qz6) obj;
        return Float.compare(this.a, qz6Var.a) == 0 && Objects.equals(this.b, qz6Var.b) && Objects.equals(this.c, qz6Var.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        a aVar = this.b;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        a aVar2 = this.c;
        return iHashCode2 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.a + ", field 1=" + this.b + ", field 2=" + this.c;
    }
}
