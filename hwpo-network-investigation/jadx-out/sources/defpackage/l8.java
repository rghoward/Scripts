package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.account.presentation.AccountViewModel$onTakePhotoOptionPicked$1", f = "AccountViewModel.kt", l = {124}, m = "invokeSuspend", v = 2)
public final class l8 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ e8 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends pi4 implements oh4<Exception, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(Exception exc) {
            Exception exc2 = exc;
            exc2.getClass();
            e8.g((e8) this.receiver, exc2);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(e8 e8Var, r02<? super l8> r02Var) {
        super(2, r02Var);
        this.u = e8Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new l8(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((l8) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        e8 e8Var = this.u;
        if (i == 0) {
            dv8.b(obj);
            xj4 xj4Var = e8Var.A;
            g2b g2bVar = g2b.a;
            this.t = 1;
            xj4Var.getClass();
            obj = g5b.b(xj4Var, g2bVar, this);
            v72 v72Var = v72.t;
            if (obj == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        xd3 xd3Var = (xd3) obj;
        a aVar = new a(1, e8Var, e8.class, "onError", "onError(Ljava/lang/Exception;)V", 0);
        xd3Var.getClass();
        if (xd3Var instanceof xd3.a) {
            aVar.invoke(((xd3.a) xd3Var).a);
        } else {
            if (!(xd3Var instanceof xd3.b)) {
                u.b();
                return null;
            }
            xj4.a aVar2 = (xj4.a) ((xd3.b) xd3Var).a;
            e8Var.H = aVar2.a;
            Uri uri = aVar2.b;
            e8Var.I = uri;
            e8Var.f(new i5.n(uri));
            g2b g2bVar2 = g2b.a;
        }
        return g2b.a;
    }
}
