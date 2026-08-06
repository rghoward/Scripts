package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jh6 {
    public static final a b = new a();
    public final b a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements xt6 {
        @Override // defpackage.xt6
        public final vt6 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // defpackage.xt6
        public final boolean b(Class<?> cls) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b implements xt6 {
        public xt6[] a;

        @Override // defpackage.xt6
        public final vt6 a(Class<?> cls) {
            for (xt6 xt6Var : this.a) {
                if (xt6Var.b(cls)) {
                    return xt6Var.a(cls);
                }
            }
            ru3.f("No factory is available for message type: ".concat(cls.getName()));
            return null;
        }

        @Override // defpackage.xt6
        public final boolean b(Class<?> cls) {
            for (xt6 xt6Var : this.a) {
                if (xt6Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public jh6() {
        xt6 xt6Var;
        try {
            xt6Var = (xt6) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            xt6Var = b;
        }
        xt6[] xt6VarArr = {ck4.a, xt6Var};
        b bVar = new b();
        bVar.a = xt6VarArr;
        Charset charset = zi5.a;
        this.a = bVar;
    }
}
