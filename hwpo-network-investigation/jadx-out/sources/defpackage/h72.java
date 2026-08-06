package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface h72 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a extends h72 {

        /* JADX INFO: renamed from: h72$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0100a {
            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends a> E a(a aVar, b<E> bVar) {
                bVar.getClass();
                if (xj5.a(aVar.getKey(), bVar)) {
                    return aVar;
                }
                return null;
            }

            public static h72 b(a aVar, b<?> bVar) {
                bVar.getClass();
                return xj5.a(aVar.getKey(), bVar) ? ff3.t : aVar;
            }

            public static h72 c(a aVar, h72 h72Var) {
                h72Var.getClass();
                return h72Var == ff3.t ? aVar : (h72) h72Var.J(new g72(), aVar);
            }
        }

        b<?> getKey();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b<E extends a> {
    }

    Object J(ci4 ci4Var, Object obj);

    h72 N(b<?> bVar);

    h72 c0(h72 h72Var);

    <E extends a> E d0(b<E> bVar);
}
