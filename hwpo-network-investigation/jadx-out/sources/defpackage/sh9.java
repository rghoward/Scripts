package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class sh9 {
    public final a a;
    public final a b;
    public final a c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final xi9 a;
        public final String b;
        public final qi9 c;
        public final boolean d;

        public a(xi9 xi9Var, String str, qi9 qi9Var, boolean z) {
            this.a = xi9Var;
            this.b = str;
            this.c = qi9Var;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + ru3.c(this.a.hashCode() * 31, 31, this.b)) * 31);
        }

        public final String toString() {
            return "Day(source=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", canReschedule=" + this.d + ")";
        }
    }

    public sh9(a aVar, a aVar2, a aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh9)) {
            return false;
        }
        sh9 sh9Var = (sh9) obj;
        return xj5.a(this.a, sh9Var.a) && this.b.equals(sh9Var.b) && xj5.a(this.c, sh9Var.c);
    }

    public final int hashCode() {
        a aVar = this.a;
        int iHashCode = (this.b.hashCode() + ((aVar == null ? 0 : aVar.hashCode()) * 31)) * 31;
        a aVar2 = this.c;
        return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public final String toString() {
        return "SessionsDays(previousDay=" + this.a + ", currentDay=" + this.b + ", nextDay=" + this.c + ")";
    }
}
