package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o14 implements f20.a {
    public static final dp a = dp.d();

    @Override // f20.a
    public final void a() {
        try {
            dp dpVar = n14.e;
        } catch (IllegalStateException e) {
            a.g("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e);
        }
    }
}
