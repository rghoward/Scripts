package defpackage;

import android.net.Uri;
import android.view.InputEvent;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pl6 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends pl6 {
        public final ln4 a;

        /* JADX INFO: renamed from: pl6$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f = "MeasurementManagerFutures.kt", l = {190}, m = "invokeSuspend")
        public static final class C0220a extends p6a implements ci4<t72, r02<? super Integer>, Object> {
            public int t;

            public C0220a(r02<? super C0220a> r02Var) {
                super(2, r02Var);
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return a.this.new C0220a(r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super Integer> r02Var) {
                return ((C0220a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.t;
                if (i != 0) {
                    if (i == 1) {
                        dv8.b(obj);
                        return obj;
                    }
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                ln4 ln4Var = a.this.a;
                this.t = 1;
                Object objL0 = ln4Var.L0(this);
                v72 v72Var = v72.t;
                return objL0 == v72Var ? v72Var : objL0;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {143}, m = "invokeSuspend")
        public static final class b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            public int t;
            public final /* synthetic */ Uri v;
            public final /* synthetic */ InputEvent w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Uri uri, InputEvent inputEvent, r02<? super b> r02Var) {
                super(2, r02Var);
                this.v = uri;
                this.w = inputEvent;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return a.this.new b(this.v, this.w, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.t;
                if (i == 0) {
                    dv8.b(obj);
                    ln4 ln4Var = a.this.a;
                    this.t = 1;
                    Object objX0 = ln4Var.X0(this.v, this.w, this);
                    v72 v72Var = v72.t;
                    if (objX0 == v72Var) {
                        return v72Var;
                    }
                } else {
                    if (i != 1) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dv8.b(obj);
                }
                return g2b.a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$2", f = "MeasurementManagerFutures.kt", l = {154}, m = "invokeSuspend")
        public static final class c extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            public int t;

            public c(sw9 sw9Var, r02<? super c> r02Var) {
                super(2, r02Var);
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return a.this.new c(null, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((c) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.t;
                if (i == 0) {
                    dv8.b(obj);
                    ln4 ln4Var = a.this.a;
                    this.t = 1;
                    Object objW0 = ln4Var.W0(null, this);
                    v72 v72Var = v72.t;
                    if (objW0 == v72Var) {
                        return v72Var;
                    }
                } else {
                    if (i != 1) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dv8.b(obj);
                }
                return g2b.a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {162}, m = "invokeSuspend")
        public static final class d extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            public int t;
            public final /* synthetic */ Uri v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Uri uri, r02<? super d> r02Var) {
                super(2, r02Var);
                this.v = uri;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return a.this.new d(this.v, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((d) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.t;
                if (i == 0) {
                    dv8.b(obj);
                    ln4 ln4Var = a.this.a;
                    this.t = 1;
                    Object objY0 = ln4Var.Y0(this.v, this);
                    v72 v72Var = v72.t;
                    if (objY0 == v72Var) {
                        return v72Var;
                    }
                } else {
                    if (i != 1) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dv8.b(obj);
                }
                return g2b.a;
            }
        }

        public a(ln4 ln4Var) {
            this.a = ln4Var;
        }

        @Override // defpackage.pl6
        public ListenableFuture<Integer> a() {
            return nr1.a(oy0.b(u72.a(i23.a), null, new C0220a(null), 3));
        }

        @Override // defpackage.pl6
        public ListenableFuture<g2b> b(Uri uri) {
            uri.getClass();
            return nr1.a(oy0.b(u72.a(i23.a), null, new d(uri, null), 3));
        }

        public ListenableFuture<g2b> c(qx2 qx2Var) {
            throw null;
        }

        public ListenableFuture<g2b> d(sw9 sw9Var) {
            sw9Var.getClass();
            return nr1.a(oy0.b(u72.a(i23.a), null, new c(sw9Var, null), 3));
        }

        public ListenableFuture<g2b> e(Uri uri, InputEvent inputEvent) {
            uri.getClass();
            return nr1.a(oy0.b(u72.a(i23.a), null, new b(uri, inputEvent, null), 3));
        }

        public ListenableFuture<g2b> f(vkb vkbVar) {
            throw null;
        }

        public ListenableFuture<g2b> g(wkb wkbVar) {
            throw null;
        }
    }

    public abstract ListenableFuture<Integer> a();

    public abstract ListenableFuture<g2b> b(Uri uri);
}
