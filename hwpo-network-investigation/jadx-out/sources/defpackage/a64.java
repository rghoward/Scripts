package defpackage;

import io.ably.lib.transport.Defaults;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1", f = "FlowExt.kt", l = {Defaults.PORT}, m = "invokeSuspend", v = 1)
public final class a64 extends p6a implements ci4<np9<Object>, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ r54<Object> v;
    public final /* synthetic */ ei4<s54<Object>, Object, r02<? super g2b>, Object> w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1$1", f = "FlowExt.kt", l = {Defaults.PORT}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<Object, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ ei4<s54<Object>, Object, r02<? super g2b>, Object> v;
        public final /* synthetic */ w91<Object> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ei4<? super s54<Object>, Object, ? super r02<? super g2b>, ? extends Object> ei4Var, w91<Object> w91Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.v = ei4Var;
            this.w = w91Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.v, this.w, r02Var);
            aVar.u = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(Object obj, r02<? super g2b> r02Var) {
            return ((a) create(obj, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                Object obj2 = this.u;
                this.t = 1;
                Object objInvoke = this.v.invoke(this.w, obj2, this);
                v72 v72Var = v72.t;
                if (objInvoke == v72Var) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a64(r54<Object> r54Var, ei4<? super s54<Object>, Object, ? super r02<? super g2b>, ? extends Object> ei4Var, r02<? super a64> r02Var) {
        super(2, r02Var);
        this.v = r54Var;
        this.w = ei4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        a64 a64Var = new a64(this.v, this.w, r02Var);
        a64Var.u = obj;
        return a64Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(np9<Object> np9Var, r02<? super g2b> r02Var) {
        return ((a64) create(np9Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            a aVar = new a(this.w, new w91((np9) this.u), null);
            this.t = 1;
            Object objF = yk2.f(this.v, aVar, this);
            v72 v72Var = v72.t;
            if (objF == v72Var) {
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
