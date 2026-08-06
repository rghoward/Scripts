package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class py0 extends g52.a {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements g52<su8, su8> {
        public static final a a = new a();

        @Override // defpackage.g52
        public final su8 a(su8 su8Var) {
            su8 su8Var2 = su8Var;
            try {
                tx0 tx0Var = new tx0();
                su8Var2.p().M(tx0Var);
                return new tu8(su8Var2.m(), su8Var2.k(), tx0Var);
            } finally {
                su8Var2.close();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements g52<qp8, qp8> {
        public static final b a = new b();

        @Override // defpackage.g52
        public final qp8 a(qp8 qp8Var) {
            return qp8Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements g52<su8, su8> {
        public static final c a = new c();

        @Override // defpackage.g52
        public final su8 a(su8 su8Var) {
            return su8Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d implements g52<Object, String> {
        public static final d a = new d();

        @Override // defpackage.g52
        public final String a(Object obj) {
            return obj.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e implements g52<su8, g2b> {
        public static final e a = new e();

        @Override // defpackage.g52
        public final g2b a(su8 su8Var) {
            su8Var.close();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f implements g52<su8, Void> {
        public static final f a = new f();

        @Override // defpackage.g52
        public final Void a(su8 su8Var) {
            su8Var.close();
            return null;
        }
    }

    @Override // g52.a
    public final g52<?, qp8> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, mv8 mv8Var) {
        if (qp8.class.isAssignableFrom(s6b.e(type))) {
            return b.a;
        }
        return null;
    }

    @Override // g52.a
    public final g52<su8, ?> b(Type type, Annotation[] annotationArr, mv8 mv8Var) {
        if (type == su8.class) {
            return s6b.h(annotationArr, w1a.class) ? c.a : a.a;
        }
        if (type == Void.class) {
            return f.a;
        }
        if (s6b.b && type == g2b.class) {
            return e.a;
        }
        return null;
    }
}
