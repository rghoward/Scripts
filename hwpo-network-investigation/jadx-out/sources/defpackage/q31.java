package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q31 implements k94 {
    public static final q31 a = new q31();
    public static Boolean b;

    @Override // defpackage.k94
    public final boolean a() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw ik.a("canFocus is read before it is written");
    }

    @Override // defpackage.k94
    public final void c(boolean z) {
        b = Boolean.valueOf(z);
    }
}
