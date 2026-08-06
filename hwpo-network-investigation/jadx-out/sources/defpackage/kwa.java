package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$2$1", f = "Transition.kt", l = {2194}, m = "invokeSuspend", v = 1)
public final class kwa extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public a47 t;
    public l4c u;
    public int v;
    public final /* synthetic */ l4c w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kwa(l4c l4cVar, r02<? super kwa> r02Var) {
        super(2, r02Var);
        this.w = l4cVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new kwa(this.w, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((kwa) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [S, java.lang.Object] */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        l4c l4cVar;
        a47 a47Var;
        int i = this.v;
        if (i == 0) {
            dv8.b(obj);
            l4cVar = this.w;
            w89 w89Var = (w89) l4cVar;
            jv9 jv9Var = w89Var.h;
            if (jv9Var != null) {
                jv9Var.d(w89Var, owa.a, w89Var.g);
            }
            a47 a47Var2 = w89Var.k;
            this.t = a47Var2;
            this.u = l4cVar;
            this.v = 1;
            Object objB = a47Var2.b(this);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
            a47Var = a47Var2;
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l4cVar = this.u;
            a47Var = this.t;
            dv8.b(obj);
        }
        try {
            ((w89) l4cVar).d = ((w89) l4cVar).b.getValue();
            e41 e41Var = ((w89) l4cVar).j;
            if (e41Var != null) {
                e41Var.resumeWith(((w89) l4cVar).b.getValue());
            }
            ((w89) l4cVar).j = null;
            g2b g2bVar = g2b.a;
            return g2b.a;
        } finally {
            a47Var.c(null);
        }
    }
}
