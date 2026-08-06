package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ea1<T> extends u91<T> {
    public final Iterable<r54<T>> w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", l = {92}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ r54<T> u;
        public final /* synthetic */ wc9<T> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(r54<? extends T> r54Var, wc9<T> wc9Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = r54Var;
            this.v = wc9Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.u, this.v, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                this.t = 1;
                Object objCollect = this.u.collect(this.v, this);
                v72 v72Var = v72.t;
                if (objCollect == v72Var) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public ea1(Iterable<? extends r54<? extends T>> iterable, h72 h72Var, int i, xx0 xx0Var) {
        super(h72Var, i, xx0Var);
        this.w = iterable;
    }

    @Override // defpackage.u91
    public final Object i(ua8<? super T> ua8Var, r02<? super g2b> r02Var) {
        wc9 wc9Var = new wc9(ua8Var);
        Iterator<r54<T>> it = this.w.iterator();
        while (it.hasNext()) {
            oy0.d(ua8Var, null, null, new a(it.next(), wc9Var, null), 3);
        }
        return g2b.a;
    }

    @Override // defpackage.u91
    public final u91<T> j(h72 h72Var, int i, xx0 xx0Var) {
        return new ea1(this.w, h72Var, i, xx0Var);
    }

    @Override // defpackage.u91
    public final tj8<T> l(t72 t72Var) {
        ci4 t91Var = new t91(this, null);
        ta8 ta8Var = new ta8(l72.b(t72Var, this.t), da1.a(this.u, 4, xx0.t));
        ta8Var.D0(x72.t, ta8Var, t91Var);
        return ta8Var;
    }
}
