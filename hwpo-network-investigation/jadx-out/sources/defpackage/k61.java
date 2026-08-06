package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2", f = "PlatformTextInputModifierNode.kt", l = {248}, m = "invokeSuspend", v = 1)
public final class k61 extends p6a implements ci4<a28, r02<?>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ ci4<a28, r02<?>, Object> v;
    public final /* synthetic */ l61 w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements a28 {
        public final /* synthetic */ a28 t;
        public final /* synthetic */ a28 u;
        public final /* synthetic */ AtomicReference<bh9<g2b>> v;
        public final /* synthetic */ l61 w;

        public a(a28 a28Var, AtomicReference<bh9<g2b>> atomicReference, l61 l61Var) {
            this.u = a28Var;
            this.v = atomicReference;
            this.w = l61Var;
            this.t = a28Var;
        }

        @Override // defpackage.z18
        public final View a() {
            return this.t.a();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.z18
        public final void b(x56 x56Var, u02 u02Var) throws Throwable {
            h61 h61Var;
            if (u02Var instanceof h61) {
                h61Var = (h61) u02Var;
                int i = h61Var.v;
                if ((i & Integer.MIN_VALUE) != 0) {
                    h61Var.v = i - Integer.MIN_VALUE;
                } else {
                    h61Var = new h61(this, u02Var);
                }
            } else {
                h61Var = new h61(this, u02Var);
            }
            Object obj = h61Var.t;
            int i2 = h61Var.v;
            if (i2 == 0) {
                dv8.b(obj);
                j61 j61Var = new j61(this.w, x56Var, this.u, null);
                h61Var.v = 1;
                if (u72.d(new ch9(i61.u, this.v, j61Var, null), h61Var) == v72.t) {
                    return;
                }
            } else {
                if (i2 != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
                dv8.b(obj);
            }
            fl.a();
        }

        @Override // defpackage.t72
        public final h72 getCoroutineContext() {
            return this.t.getCoroutineContext();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k61(ci4<? super a28, ? super r02<?>, ? extends Object> ci4Var, l61 l61Var, r02<? super k61> r02Var) {
        super(2, r02Var);
        this.v = ci4Var;
        this.w = l61Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        k61 k61Var = new k61(this.v, this.w, r02Var);
        k61Var.u = obj;
        return k61Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(a28 a28Var, r02<?> r02Var) throws Throwable {
        ((k61) create(a28Var, r02Var)).invokeSuspend(g2b.a);
        return v72.t;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            a aVar = new a((a28) this.u, new AtomicReference(null), this.w);
            this.t = 1;
            Object objInvoke = this.v.invoke(aVar, this);
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
        fl.a();
        return null;
    }
}
