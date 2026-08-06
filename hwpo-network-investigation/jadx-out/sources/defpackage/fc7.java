package defpackage;

import io.ably.lib.transport.Defaults;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2", f = "NonTouchScrollingLogic.kt", l = {Defaults.PORT}, m = "invokeSuspend", v = 1)
public final class fc7 extends p6a implements ci4<t72, r02<Object>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ p91<Object> v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2$job$1", f = "NonTouchScrollingLogic.kt", l = {76}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(2, r02Var);
            aVar.u = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            t72 t72Var;
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                t72Var = (t72) this.u;
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                t72Var = (t72) this.u;
                dv8.b(obj);
            }
            while (sd.h(t72Var.getCoroutineContext())) {
                q00 q00Var = new q00(4);
                this.u = t72Var;
                this.t = 1;
                Object objU = zx6.a(getContext()).u(q00Var, this);
                v72 v72Var = v72.t;
                if (objU == v72Var) {
                    return v72Var;
                }
            }
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc7(p91<Object> p91Var, r02<? super fc7> r02Var) {
        super(2, r02Var);
        this.v = p91Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        fc7 fc7Var = new fc7(this.v, r02Var);
        fc7Var.u = obj;
        return fc7Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<Object> r02Var) {
        return ((fc7) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        el5 el5Var;
        int i = this.t;
        if (i != 0) {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            el5Var = (el5) this.u;
            try {
                dv8.b(obj);
                el5Var.k(null);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                el5Var.k(null);
                throw th;
            }
        }
        dv8.b(obj);
        dz9 dz9VarD = oy0.d((t72) this.u, null, null, new a(2, null), 3);
        try {
            p91<Object> p91Var = this.v;
            this.u = dz9VarD;
            this.t = 1;
            Object objI = p91Var.i(this);
            v72 v72Var = v72.t;
            if (objI == v72Var) {
                return v72Var;
            }
            obj = objI;
            el5Var = dz9VarD;
            el5Var.k(null);
            return obj;
        } catch (Throwable th3) {
            th = th3;
            el5Var = dz9VarD;
            el5Var.k(null);
            throw th;
        }
    }
}
