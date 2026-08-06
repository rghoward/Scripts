package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kr7 implements g44 {
    public final n9a a;
    public final dr7 b;

    public kr7(n9a n9aVar, dr7 dr7Var) {
        this.a = n9aVar;
        this.b = dr7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g44
    public final Object a(final v79.a aVar, float f, r02 r02Var) throws Throwable {
        jr7 jr7Var;
        if (r02Var instanceof jr7) {
            jr7Var = (jr7) r02Var;
            int i = jr7Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                jr7Var.v = i - Integer.MIN_VALUE;
            } else {
                jr7Var = new jr7(this, (u02) r02Var);
            }
        } else {
            jr7Var = new jr7(this, (u02) r02Var);
        }
        Object objB = jr7Var.t;
        int i2 = jr7Var.v;
        if (i2 == 0) {
            dv8.b(objB);
            oh4 oh4Var = new oh4() { // from class: ir7
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    float fFloatValue = ((Float) obj).floatValue();
                    dr7 dr7Var = this.t.b;
                    dr7Var.q.j(dr7Var.j(dr7Var.k() + wk6.b(dr7Var.q() != 0 ? fFloatValue / dr7Var.q() : 0.0f)));
                    return g2b.a;
                }
            };
            jr7Var.v = 1;
            objB = this.a.b(aVar, f, oh4Var, jr7Var);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objB);
        }
        float fFloatValue = ((Number) objB).floatValue();
        dr7 dr7Var = this.b;
        if (dr7Var.l() != 0.0f && Math.abs(dr7Var.l()) < 0.001d) {
            int iK = dr7Var.k();
            if (dr7Var.k.a()) {
                oy0.d(((pq7) dr7Var.m.getValue()).s, null, null, new cr7(dr7Var, null), 3);
            }
            dr7Var.u(0.0f, iK, false);
        } else {
            new Float(dr7Var.l());
        }
        return new Float(fFloatValue);
    }
}
