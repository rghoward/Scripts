package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class dp1 extends q21.a {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<R> implements q21<R, CompletableFuture<R>> {
        public final Type a;

        /* JADX INFO: renamed from: dp1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class C0072a implements u21<R> {
            public final b a;

            public C0072a(b bVar) {
                this.a = bVar;
            }

            @Override // defpackage.u21
            public final void onFailure(p21<R> p21Var, Throwable th) {
                this.a.completeExceptionally(th);
            }

            @Override // defpackage.u21
            public final void onResponse(p21<R> p21Var, ru8<R> ru8Var) {
                boolean z = ru8Var.a.J;
                b bVar = this.a;
                if (z) {
                    bVar.complete(ru8Var.b);
                } else {
                    bVar.completeExceptionally(new q45(ru8Var));
                }
            }
        }

        public a(Type type) {
            this.a = type;
        }

        @Override // defpackage.q21
        public final Object adapt(p21 p21Var) {
            kg7 kg7Var = (kg7) p21Var;
            b bVar = new b(kg7Var);
            kg7Var.enqueue(new C0072a(bVar));
            return bVar;
        }

        @Override // defpackage.q21
        public final Type responseType() {
            return this.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<T> extends CompletableFuture<T> {
        public final kg7 t;

        public b(kg7 kg7Var) {
            this.t = kg7Var;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            if (z) {
                this.t.cancel();
            }
            return super.cancel(z);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c<R> implements q21<R, CompletableFuture<ru8<R>>> {
        public final Type a;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements u21<R> {
            public final b a;

            public a(b bVar) {
                this.a = bVar;
            }

            @Override // defpackage.u21
            public final void onFailure(p21<R> p21Var, Throwable th) {
                this.a.completeExceptionally(th);
            }

            @Override // defpackage.u21
            public final void onResponse(p21<R> p21Var, ru8<R> ru8Var) {
                this.a.complete(ru8Var);
            }
        }

        public c(Type type) {
            this.a = type;
        }

        @Override // defpackage.q21
        public final Object adapt(p21 p21Var) {
            kg7 kg7Var = (kg7) p21Var;
            b bVar = new b(kg7Var);
            kg7Var.enqueue(new a(bVar));
            return bVar;
        }

        @Override // defpackage.q21
        public final Type responseType() {
            return this.a;
        }
    }

    @Override // q21.a
    public final q21<?, ?> get(Type type, Annotation[] annotationArr, mv8 mv8Var) {
        if (q21.a.getRawType(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            aa0.c("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
            return null;
        }
        Type parameterUpperBound = q21.a.getParameterUpperBound(0, (ParameterizedType) type);
        if (q21.a.getRawType(parameterUpperBound) != ru8.class) {
            return new a(parameterUpperBound);
        }
        if (parameterUpperBound instanceof ParameterizedType) {
            return new c(q21.a.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound));
        }
        aa0.c("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        return null;
    }
}
