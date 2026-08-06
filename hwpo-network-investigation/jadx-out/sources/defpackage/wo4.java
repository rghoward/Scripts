package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface wo4 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements wo4 {
        @Override // defpackage.wo4
        public final ArrayList a(int i, int i2) {
            int i3 = i - (2 * i2);
            int i4 = i3 / 3;
            int i5 = i3 % 3;
            ArrayList arrayList = new ArrayList(3);
            int i6 = 0;
            while (i6 < 3) {
                arrayList.add(Integer.valueOf((i6 < i5 ? 1 : 0) + i4));
                i6++;
            }
            return arrayList;
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return -3;
        }
    }

    ArrayList a(int i, int i2);
}
