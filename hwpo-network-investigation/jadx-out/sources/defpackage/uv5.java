package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", f = "LazyLayoutItemAnimation.kt", l = {204}, m = "invokeSuspend", v = 1)
public final class uv5 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ sv5 u;
    public final /* synthetic */ a04<Float> v;
    public final /* synthetic */ ko4 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv5(sv5 sv5Var, a04<Float> a04Var, ko4 ko4Var, r02<? super uv5> r02Var) {
        super(2, r02Var);
        this.u = sv5Var;
        this.v = a04Var;
        this.w = ko4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new uv5(this.u, this.v, this.w, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((uv5) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        final sv5 sv5Var = this.u;
        try {
            if (i == 0) {
                dv8.b(obj);
                qt<Float, bw> qtVar = sv5Var.o;
                Float f = new Float(0.0f);
                a04<Float> a04Var = this.v;
                final ko4 ko4Var = this.w;
                oh4 oh4Var = new oh4() { // from class: tv5
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        ko4Var.e(((Number) ((qt) obj2).d()).floatValue());
                        sv5Var.c.invoke();
                        return g2b.a;
                    }
                };
                this.t = 1;
                Object objC = qt.c(qtVar, f, a04Var, oh4Var, this, 4);
                v72 v72Var = v72.t;
                if (objC == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            sv5Var.j.setValue(Boolean.TRUE);
            sv5Var.f(false);
            return g2b.a;
        } catch (Throwable th) {
            sv5Var.f(false);
            throw th;
        }
    }
}
