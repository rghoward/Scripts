package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cv4 {
    public static final void a(int i, int i2) {
        if (!(i > 0 && i2 > 0)) {
            xc5.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        xc5.a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }
}
