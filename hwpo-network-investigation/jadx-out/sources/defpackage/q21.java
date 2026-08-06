package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface q21<R, T> {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a {
        public static Type getParameterUpperBound(int i, ParameterizedType parameterizedType) {
            return s6b.d(i, parameterizedType);
        }

        public static Class<?> getRawType(Type type) {
            return s6b.e(type);
        }

        public abstract q21<?, ?> get(Type type, Annotation[] annotationArr, mv8 mv8Var);
    }

    T adapt(p21<R> p21Var);

    Type responseType();
}
