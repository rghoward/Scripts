package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", l = {89}, m = "invokeSuspend", v = 1)
public final class us1 extends p6a implements ci4<Float, r02<? super Float>, Object> {
    public int t;
    public /* synthetic */ float u;
    public final /* synthetic */ rs1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us1(rs1 rs1Var, r02<? super us1> r02Var) {
        super(2, r02Var);
        this.v = rs1Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        us1 us1Var = new us1(this.v, r02Var);
        us1Var.u = ((Number) obj).floatValue();
        return us1Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(Float f, r02<? super Float> r02Var) {
        return ((us1) create(Float.valueOf(f.floatValue()), r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            float f = this.u;
            rs1 rs1Var = this.v;
            Object objD = rs1Var.a.d.t.d(kb9.e);
            ci4 ci4Var = (ci4) (objD != null ? objD : null);
            if (ci4Var == null) {
                throw ik.a("Required value was null.");
            }
            vf7 vf7Var = new vf7((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            this.t = 1;
            obj = ci4Var.invoke(vf7Var, this);
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
        return new Float(Float.intBitsToFloat((int) (((vf7) obj).a & 4294967295L)));
    }
}
