package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sn2 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends sn2 {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pk.d(this.a, "OpenLeaderboardCommentsScreen(leaderboardId=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends sn2 {
        public final int a;
        public final int b;
        public final String c;
        public final String d;
        public final int e;

        public b(int i, int i2, int i3, String str, String str2) {
            str.getClass();
            this.a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
            this.e = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && xj5.a(this.c, bVar.c) && xj5.a(this.d, bVar.d) && this.e == bVar.e;
        }

        public final int hashCode() {
            int iC = ru3.c(os2.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
            String str = this.d;
            return Integer.hashCode(this.e) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbB = u43.b("OpenLeaderboardValueCommentsScreen(leaderboardId=", ", valueId=", ", resultText=", this.a, this.b);
            ux1.b(sbB, this.c, ", description=", this.d, ", attachmentsCount=");
            return i34.b(this.e, ")", sbB);
        }
    }
}
