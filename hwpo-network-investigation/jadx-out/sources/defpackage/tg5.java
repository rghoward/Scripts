package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tg5 {
    public static final e15 a = new e15(b.t);
    public static final deb b = new deb(a.t);
    public static final y0a c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class a extends pi4 implements ci4<Integer, Integer, Integer> {
        public static final a t = new a(2, wk6.class, "min", "min(II)I", 1);

        @Override // defpackage.ci4
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class b extends pi4 implements ci4<Integer, Integer, Integer> {
        public static final b t = new b(2, wk6.class, "min", "min(II)I", 1);

        @Override // defpackage.ci4
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
        }
    }

    static {
        hv5.d(new rg5());
        c = new y0a(new sg5());
    }
}
