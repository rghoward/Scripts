package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class mr0 {
    public final ArrayList a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;
        public final int b;
        public final jl3 c;

        public a(int i, int i2, jl3 jl3Var) {
            this.a = i;
            this.b = i2;
            this.c = jl3Var;
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
            int iA = os2.a(this.b, Integer.hashCode(this.a) * 31, 31);
            jl3 jl3Var = this.c;
            return iA + (jl3Var == null ? 0 : jl3Var.hashCode());
        }

        public final String toString() {
            StringBuilder sbB = u43.b("PressureItem(systolic=", ", diastolic=", ", metadata=", this.a, this.b);
            sbB.append(this.c);
            sbB.append(")");
            return sbB.toString();
        }
    }

    public mr0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mr0) && this.a.equals(((mr0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ml.a("BloodPressureDataModel(values=", this.a, ")");
    }
}
