package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cn3 implements zs3<ce0> {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final cn3 a = new cn3();
    }

    @Override // defpackage.nf8
    public final Object get() {
        ce0 ce0Var = ce0.f;
        if (ce0Var != null) {
            return ce0Var;
        }
        ac4.c("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }
}
