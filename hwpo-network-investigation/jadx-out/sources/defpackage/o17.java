package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o17 {
    public static final void a(n17.a aVar, int i, int i2) {
        boolean z = i != -1;
        if (z) {
            aVar.a("score_value[score_sub_values_attributes][][id]", String.valueOf(i));
        } else if (z) {
            u.b();
        } else {
            aVar.a("score_value[score_sub_values_attributes][][position]", String.valueOf(i2));
        }
    }

    public static final void b(n17.a aVar, boolean z) {
        if (z) {
            aVar.a("score_value[_destroy]", "true");
        } else if (z) {
            u.b();
        }
    }
}
