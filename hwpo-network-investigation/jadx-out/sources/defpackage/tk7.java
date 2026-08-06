package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class tk7 extends g52.a {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements g52<su8, Optional<T>> {
        public final g52<su8, T> a;

        public a(g52<su8, T> g52Var) {
            this.a = g52Var;
        }

        @Override // defpackage.g52
        public final Object a(su8 su8Var) {
            return Optional.ofNullable(this.a.a(su8Var));
        }
    }

    @Override // g52.a
    public final g52<su8, ?> b(Type type, Annotation[] annotationArr, mv8 mv8Var) {
        if (s6b.e(type) != Optional.class) {
            return null;
        }
        return new a(mv8Var.d(s6b.d(0, (ParameterizedType) type), annotationArr));
    }
}
