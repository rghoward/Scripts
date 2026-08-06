package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mx6 {
    public final i07 a;
    public final a b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public final HashMap a = new HashMap();

        /* JADX INFO: renamed from: mx6$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static class C0204a<Model> {
            public final List<kx6<Model, ?>> a;

            public C0204a(List<kx6<Model, ?>> list) {
                this.a = list;
            }
        }
    }

    public mx6(at3.c cVar) {
        i07 i07Var = new i07(cVar);
        this.b = new a();
        this.a = i07Var;
    }
}
