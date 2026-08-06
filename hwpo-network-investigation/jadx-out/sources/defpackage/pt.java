package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {308}, m = "invokeSuspend", v = 1)
public final class pt extends p6a implements oh4<r02<? super uv<Object, fw>>, Object> {
    public final /* synthetic */ oh4<qt<Object, fw>, g2b> A;
    public yv t;
    public cl8 u;
    public int v;
    public final /* synthetic */ qt<Object, fw> w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ l9a y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt(qt qtVar, Object obj, l9a l9aVar, long j, oh4 oh4Var, r02 r02Var) {
        super(1, r02Var);
        this.w = qtVar;
        this.x = obj;
        this.y = l9aVar;
        this.z = j;
        this.A = oh4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(r02<?> r02Var) {
        return new pt(this.w, this.x, this.y, this.z, this.A, r02Var);
    }

    @Override // defpackage.oh4
    public final Object invoke(r02<? super uv<Object, fw>> r02Var) {
        return ((pt) create(r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        yv yvVar;
        cl8 cl8Var;
        l9a l9aVar = this.y;
        int i = this.v;
        final qt<Object, fw> qtVar = this.w;
        try {
            if (i == 0) {
                dv8.b(obj);
                qtVar.c.v = (V) qtVar.a.a().invoke(this.x);
                qtVar.e.setValue(l9aVar.c);
                qtVar.d.setValue(Boolean.TRUE);
                yv<Object, V> yvVar2 = qtVar.c;
                final yv yvVar3 = new yv(yvVar2.t, yvVar2.u.getValue(), gw.b(yvVar2.v), yvVar2.w, Long.MIN_VALUE, yvVar2.y);
                final cl8 cl8Var2 = new cl8();
                long j = this.z;
                final oh4<qt<Object, fw>, g2b> oh4Var = this.A;
                oh4 oh4Var2 = new oh4() { // from class: ot
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        vv vvVar = (vv) obj2;
                        qt qtVar2 = qtVar;
                        o6a.i(vvVar, qtVar2.c);
                        dt7 dt7Var = vvVar.e;
                        Object objA = qt.a(qtVar2, dt7Var.getValue());
                        boolean zA = xj5.a(objA, dt7Var.getValue());
                        oh4 oh4Var3 = oh4Var;
                        if (!zA) {
                            qtVar2.c.u.setValue(objA);
                            yvVar3.u.setValue(objA);
                            if (oh4Var3 != null) {
                                oh4Var3.invoke(qtVar2);
                            }
                            vvVar.a();
                            cl8Var2.t = true;
                        } else if (oh4Var3 != null) {
                            oh4Var3.invoke(qtVar2);
                        }
                        return g2b.a;
                    }
                };
                this.t = yvVar3;
                this.u = cl8Var2;
                this.v = 1;
                Object objB = o6a.b(yvVar3, l9aVar, j, oh4Var2, this);
                v72 v72Var = v72.t;
                if (objB == v72Var) {
                    return v72Var;
                }
                yvVar = yvVar3;
                cl8Var = cl8Var2;
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cl8Var = this.u;
                yvVar = this.t;
                dv8.b(obj);
            }
            mv mvVar = cl8Var.t ? mv.t : mv.u;
            qt.b(qtVar);
            return new uv(yvVar, mvVar);
        } catch (CancellationException e) {
            qt.b(qtVar);
            throw e;
        }
    }
}
