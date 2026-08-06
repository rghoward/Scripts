package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface az9 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements az9 {
        @Override // defpackage.az9
        public final int[] a(int i, int i2) {
            int i3;
            int i4 = i - (2 * i2);
            int i5 = i4 / 3;
            int i6 = i4 % 3;
            int[] iArr = new int[3];
            int i7 = 0;
            while (i7 < 3) {
                if (i5 < 0) {
                    i3 = 0;
                } else {
                    i3 = (i7 < i6 ? 1 : 0) + i5;
                }
                iArr[i7] = i3;
                i7++;
            }
            return iArr;
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return -3;
        }
    }

    int[] a(int i, int i2);
}
