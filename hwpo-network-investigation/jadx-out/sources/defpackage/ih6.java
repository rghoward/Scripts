package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ih6 {
    public static final a b = new a();
    public final b a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements yt6 {
        @Override // defpackage.yt6
        public final wt6 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // defpackage.yt6
        public final boolean b(Class<?> cls) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b implements yt6 {
        public yt6[] a;

        @Override // defpackage.yt6
        public final wt6 a(Class<?> cls) {
            for (yt6 yt6Var : this.a) {
                if (yt6Var.b(cls)) {
                    return yt6Var.a(cls);
                }
            }
            ru3.f("No factory is available for message type: ".concat(cls.getName()));
            return null;
        }

        @Override // defpackage.yt6
        public final boolean b(Class<?> cls) {
            for (yt6 yt6Var : this.a) {
                if (yt6Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public ih6() {
        yt6 yt6Var;
        ye8 ye8Var = ye8.c;
        try {
            yt6Var = (yt6) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            yt6Var = b;
        }
        yt6[] yt6VarArr = {dk4.a, yt6Var};
        b bVar = new b();
        bVar.a = yt6VarArr;
        Charset charset = xi5.a;
        this.a = bVar;
    }
}
