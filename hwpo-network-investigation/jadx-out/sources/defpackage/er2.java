package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {1079}, m = "invokeSuspend", v = 1)
public final class er2 extends p6a implements ci4<t72, r02<? super Float>, Object> {
    public dl8 t;
    public yv u;
    public int v;
    public final /* synthetic */ float w;
    public final /* synthetic */ fr2 x;
    public final /* synthetic */ v79.a y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er2(float f, fr2 fr2Var, v79.a aVar, r02 r02Var) {
        super(2, r02Var);
        this.w = f;
        this.x = fr2Var;
        this.y = aVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new er2(this.w, this.x, this.y, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super Float> r02Var) {
        return ((er2) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        float f;
        dl8 dl8Var;
        yv yvVar;
        int i = this.v;
        if (i == 0) {
            dv8.b(obj);
            f = this.w;
            if (Math.abs(f) > 1.0f) {
                final dl8 dl8Var2 = new dl8();
                dl8Var2.t = f;
                final dl8 dl8Var3 = new dl8();
                yv yvVarB = zv.b(0.0f, f, 28);
                try {
                    final fr2 fr2Var = this.x;
                    an2<Float> an2Var = fr2Var.a;
                    final v79.a aVar = this.y;
                    oh4 oh4Var = new oh4(aVar, dl8Var2, fr2Var) { // from class: dr2
                        public final /* synthetic */ v79.a u;
                        public final /* synthetic */ dl8 v;

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj2) {
                            vv vvVar = (vv) obj2;
                            float fFloatValue = ((Number) vvVar.e.getValue()).floatValue();
                            dl8 dl8Var4 = this.t;
                            float f2 = fFloatValue - dl8Var4.t;
                            float f3 = this.u.f(f2);
                            dl8Var4.t = ((Number) vvVar.e.getValue()).floatValue();
                            this.v.t = ((Number) vvVar.a.b().invoke(vvVar.f)).floatValue();
                            if (Math.abs(f2 - f3) > 0.5f) {
                                vvVar.a();
                            }
                            return g2b.a;
                        }
                    };
                    this.t = dl8Var2;
                    this.u = yvVarB;
                    this.v = 1;
                    Object objD = o6a.d(yvVarB, an2Var, false, oh4Var, this);
                    v72 v72Var = v72.t;
                    if (objD == v72Var) {
                        return v72Var;
                    }
                    dl8Var = dl8Var2;
                    f = dl8Var.t;
                } catch (CancellationException unused) {
                    dl8Var = dl8Var2;
                    yvVar = yvVarB;
                    dl8Var.t = ((Number) yvVar.d()).floatValue();
                }
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yvVar = this.u;
            dl8Var = this.t;
            try {
                dv8.b(obj);
            } catch (CancellationException unused2) {
                dl8Var.t = ((Number) yvVar.d()).floatValue();
            }
            f = dl8Var.t;
        }
        return new Float(f);
    }
}
