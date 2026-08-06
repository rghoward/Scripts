package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface du9 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements du9 {
        public static final a a = new a();

        @Override // defpackage.du9
        public final int f(int i, int i2, int i3, int i4) {
            return (((i - i3) - i4) / 2) - (i2 / 2);
        }

        public final String toString() {
            return "Center";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements du9 {
        public static final b a = new b();

        @Override // defpackage.du9
        public final int f(int i, int i2, int i3, int i4) {
            return 0;
        }

        public final String toString() {
            return "Start";
        }
    }

    int f(int i, int i2, int i3, int i4);
}
