package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface df5 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements df5 {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // defpackage.df5
        public final xe5 toInstant() {
            throw new ze5(this.a + " when parsing an Instant from \"" + cf5.e(64, this.b) + '\"');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements df5 {
        public final long a;
        public final int b;

        public b(int i, long j) {
            this.a = j;
            this.b = i;
        }

        @Override // defpackage.df5
        public final xe5 toInstant() {
            xe5 xe5Var = xe5.v;
            xe5 xe5Var2 = xe5.v;
            long j = xe5Var2.t;
            long j2 = this.a;
            if (j2 >= j) {
                xe5 xe5Var3 = xe5.w;
                if (j2 <= xe5Var3.t) {
                    long j3 = this.b;
                    long j4 = j3 / 1000000000;
                    if ((j3 ^ 1000000000) < 0 && j4 * 1000000000 != j3) {
                        j4--;
                    }
                    long j5 = j2 + j4;
                    if ((j2 ^ j5) < 0 && (j4 ^ j2) >= 0) {
                        return j2 > 0 ? xe5Var3 : xe5Var2;
                    }
                    if (j5 >= -31557014167219200L) {
                        if (j5 <= 31556889864403199L) {
                            long j6 = j3 % 1000000000;
                            return new xe5((int) (j6 + ((((j6 ^ 1000000000) & ((-j6) | j6)) >> 63) & 1000000000)), j5);
                        }
                    }
                }
            }
            throw new ze5("The parsed date is outside the range representable by Instant (Unix epoch second " + j2 + ')');
        }
    }

    xe5 toInstant();
}
