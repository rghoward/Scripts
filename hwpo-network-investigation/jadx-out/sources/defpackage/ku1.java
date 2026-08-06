package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ku1 {
    public static final <T> T a(ju1 ju1Var, hf8 hf8Var) {
        if (!ju1Var.q().G) {
            uc5.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return (T) ew2.f(ju1Var).U.a(hf8Var);
    }
}
