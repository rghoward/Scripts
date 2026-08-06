package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a08 {
    public final Integer a;
    public final String b;
    public final a c;
    public final String d;
    public final List<c08> e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final /* synthetic */ a[] A;
        public static final a t;
        public static final a u;
        public static final a v;
        public static final a w;
        public static final a x;
        public static final a y;
        public static final a z;

        static {
            a aVar = new a("FIXED", 0);
            t = aVar;
            a aVar2 = new a("MEMBERSHIP", 1);
            u = aVar2;
            a aVar3 = new a("PERSONAL", 2);
            v = aVar3;
            a aVar4 = new a("INDIVIDUAL", 3);
            w = aVar4;
            a aVar5 = new a("ONE_MANY", 4);
            x = aVar5;
            a aVar6 = new a("FIXED_EXAMPLE_WEEK", 5);
            y = aVar6;
            a aVar7 = new a("MEMBERSHIP_EXAMPLE_WEEK", 6);
            z = aVar7;
            A = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) A.clone();
        }
    }

    public a08(Integer num, String str, a aVar, String str2, List<c08> list) {
        str.getClass();
        aVar.getClass();
        this.a = num;
        this.b = str;
        this.c = aVar;
        this.d = str2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a08)) {
            return false;
        }
        a08 a08Var = (a08) obj;
        return xj5.a(this.a, a08Var.a) && xj5.a(this.b, a08Var.b) && this.c == a08Var.c && xj5.a(this.d, a08Var.d) && this.e.equals(a08Var.e);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (this.c.hashCode() + ru3.c((num == null ? 0 : num.hashCode()) * 31, 31, this.b)) * 31;
        String str = this.d;
        return this.e.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PlanModel(id=" + this.a + ", title=" + this.b + ", type=" + this.c + ", cover=" + this.d + ", planOptions=" + this.e + ")";
    }
}
