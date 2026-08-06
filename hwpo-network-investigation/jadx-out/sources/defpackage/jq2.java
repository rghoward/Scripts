package defpackage;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class jq2 extends q21.a {
    public final Executor a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements q21<Object, p21<?>> {
        public final /* synthetic */ Type a;
        public final /* synthetic */ Executor b;

        public a(Type type, Executor executor) {
            this.a = type;
            this.b = executor;
        }

        @Override // defpackage.q21
        public final p21<?> adapt(p21<Object> p21Var) {
            Executor executor = this.b;
            return executor == null ? p21Var : new b(executor, p21Var);
        }

        @Override // defpackage.q21
        public final Type responseType() {
            return this.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<T> implements p21<T> {
        public final Executor t;
        public final p21<T> u;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements u21<T> {
            public final /* synthetic */ u21 a;

            public a(u21 u21Var) {
                this.a = u21Var;
            }

            @Override // defpackage.u21
            public final void onFailure(p21<T> p21Var, final Throwable th) {
                Executor executor = b.this.t;
                final u21 u21Var = this.a;
                executor.execute(new Runnable() { // from class: lq2
                    @Override // java.lang.Runnable
                    public final void run() {
                        Throwable th2 = th;
                        u21Var.onFailure(jq2.b.this, th2);
                    }
                });
            }

            @Override // defpackage.u21
            public final void onResponse(p21<T> p21Var, final ru8<T> ru8Var) {
                Executor executor = b.this.t;
                final u21 u21Var = this.a;
                executor.execute(new Runnable() { // from class: kq2
                    @Override // java.lang.Runnable
                    public final void run() {
                        jq2.b bVar = jq2.b.this;
                        boolean zIsCanceled = bVar.u.isCanceled();
                        u21 u21Var2 = u21Var;
                        if (zIsCanceled) {
                            u21Var2.onFailure(bVar, new IOException("Canceled"));
                        } else {
                            u21Var2.onResponse(bVar, ru8Var);
                        }
                    }
                });
            }
        }

        public b(Executor executor, p21<T> p21Var) {
            this.t = executor;
            this.u = p21Var;
        }

        @Override // defpackage.p21
        public final void cancel() {
            this.u.cancel();
        }

        @Override // defpackage.p21
        /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] */
        public final p21<T> clone() {
            return new b(this.t, this.u.m18clone());
        }

        @Override // defpackage.p21
        public final void enqueue(u21<T> u21Var) {
            Objects.requireNonNull(u21Var, "callback == null");
            this.u.enqueue(new a(u21Var));
        }

        @Override // defpackage.p21
        public final boolean isCanceled() {
            return this.u.isCanceled();
        }

        @Override // defpackage.p21
        public final boolean isExecuted() {
            return this.u.isExecuted();
        }

        @Override // defpackage.p21
        public final jp8 request() {
            return this.u.request();
        }

        @Override // defpackage.p21
        public final voa timeout() {
            return this.u.timeout();
        }
    }

    public jq2(Executor executor) {
        this.a = executor;
    }

    @Override // q21.a
    public final q21<?, ?> get(Type type, Annotation[] annotationArr, mv8 mv8Var) {
        if (q21.a.getRawType(type) != p21.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(s6b.d(0, (ParameterizedType) type), s6b.h(annotationArr, pr9.class) ? null : this.a);
        }
        z90.a("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}
