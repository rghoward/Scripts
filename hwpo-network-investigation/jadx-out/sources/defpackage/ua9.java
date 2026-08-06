package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1", f = "SelectionGestures.kt", l = {195}, m = "invokeSuspend", v = 1)
public final class ua9 extends zu8 implements ci4<yg0, r02<? super o43>, Object> {
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ long w;
    public final /* synthetic */ fl8 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua9(long j, fl8 fl8Var, r02<? super ua9> r02Var) {
        super(2, r02Var);
        this.w = j;
        this.x = fl8Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        ua9 ua9Var = new ua9(this.w, this.x, r02Var);
        ua9Var.v = obj;
        return ua9Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(yg0 yg0Var, r02<? super o43> r02Var) {
        return ((ua9) create(yg0Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ta9] */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        yg0 yg0Var;
        int i = this.u;
        final fl8 fl8Var = this.x;
        if (i == 0) {
            dv8.b(obj);
            yg0 yg0Var2 = (yg0) this.v;
            ?? r0 = new ci4() { // from class: ta9
                @Override // defpackage.ci4
                public final Object invoke(Object obj2, Object obj3) {
                    ((a58) obj2).a();
                    fl8Var.t = ((vf7) obj3).a;
                    return g2b.a;
                }
            };
            this.v = yg0Var2;
            this.u = 1;
            Object objC = x53.c(yg0Var2, this.w, r0, this);
            v72 v72Var = v72.t;
            if (objC == v72Var) {
                return v72Var;
            }
            obj = objC;
            yg0Var = yg0Var2;
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yg0Var = (yg0) this.v;
            dv8.b(obj);
        }
        if (((a58) obj) != null && (fl8Var.t & 9223372034707292159L) != 9205357640488583168L) {
            return o43.u;
        }
        a58 a58Var = (a58) th1.y(yg0Var.I().a);
        if (!z69.g(a58Var)) {
            return o43.w;
        }
        a58Var.a();
        return o43.t;
    }
}
