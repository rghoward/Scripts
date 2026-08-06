package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", l = {672}, m = "invokeSuspend", v = 1)
public final class zq7 extends p6a implements ci4<t69, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ dr7 v;
    public final /* synthetic */ int w;
    public final /* synthetic */ float x;
    public final /* synthetic */ wv<Float> y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq7(dr7 dr7Var, int i, float f, wv<Float> wvVar, r02<? super zq7> r02Var) {
        super(2, r02Var);
        this.v = dr7Var;
        this.w = i;
        this.x = f;
        this.y = wvVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        zq7 zq7Var = new zq7(this.v, this.w, this.x, this.y, r02Var);
        zq7Var.u = obj;
        return zq7Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t69 t69Var, r02<? super g2b> r02Var) {
        return ((zq7) create(t69Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        int i2 = this.t;
        if (i2 == 0) {
            dv8.b(obj);
            t69 t69Var = (t69) this.u;
            dr7 dr7Var = this.v;
            final tq7 tq7Var = new tq7(t69Var, dr7Var);
            this.t = 1;
            hr7.b bVar = hr7.a;
            int i3 = this.w;
            dr7Var.q.j(dr7Var.j(new Integer(i3).intValue()));
            g2b g2bVar = g2b.a;
            boolean z = i3 > dr7Var.e;
            int iA = (tq7Var.a() - dr7Var.e) + 1;
            if (((z && i3 > tq7Var.a()) || (!z && i3 < dr7Var.e)) && Math.abs(i3 - dr7Var.e) >= 3) {
                if (z) {
                    i = i3 - iA;
                    int i4 = dr7Var.e;
                    if (i < i4) {
                        i = i4;
                    }
                } else {
                    int i5 = iA + i3;
                    i = dr7Var.e;
                    if (i5 <= i) {
                        i = i5;
                    }
                }
                tq7Var.c(i, 0);
            }
            float fE = tq7Var.e(i3) + this.x;
            final dl8 dl8Var = new dl8();
            Object objC = o6a.c(0.0f, fE, this.y, new ci4() { // from class: gr7
                @Override // defpackage.ci4
                public final Object invoke(Object obj2, Object obj3) {
                    float fFloatValue = ((Float) obj2).floatValue();
                    ((Float) obj3).getClass();
                    dl8 dl8Var2 = dl8Var;
                    dl8Var2.t += tq7Var.a.f(fFloatValue - dl8Var2.t);
                    return g2b.a;
                }
            }, this, 4);
            Object obj2 = v72.t;
            if (objC != obj2) {
                objC = g2b.a;
            }
            if (objC == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
