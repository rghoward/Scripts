package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d51 {
    public final float a;
    public final float b;
    public final float c;

    public d51(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    public final yz9 a(boolean z, h27 h27Var, jt1 jt1Var, int i) {
        qt qtVar;
        jt1Var.K(-1763481333);
        float f = this.a;
        Object obj = jt1.a.a;
        if (h27Var == null) {
            jt1Var.K(167751211);
            Object objF = jt1Var.f();
            if (objF == obj) {
                objF = bl7.i(new y43(f));
                jt1Var.C(objF);
            }
            h37 h37Var = (h37) objF;
            jt1Var.B();
            jt1Var.B();
            return h37Var;
        }
        jt1Var.K(167824247);
        jt1Var.B();
        Object objF2 = jt1Var.f();
        if (objF2 == obj) {
            objF2 = new fv9();
            jt1Var.C(objF2);
        }
        fv9 fv9Var = (fv9) objF2;
        boolean z2 = true;
        boolean z3 = (((i & 112) ^ 48) > 32 && jt1Var.J(h27Var)) || (i & 48) == 32;
        Object objF3 = jt1Var.f();
        if (z3 || objF3 == obj) {
            objF3 = new b51(h27Var, fv9Var, null);
            jt1Var.C(objF3);
        }
        wd3.d(jt1Var, (ci4) objF3, h27Var);
        qg5 qg5Var = (qg5) th1.H(fv9Var);
        if (!z || (qg5Var instanceof n88.b)) {
            f = 0.0f;
        } else if (qg5Var instanceof l35) {
            f = this.b;
        } else if (qg5Var instanceof v84) {
            f = 0.0f;
        } else if (qg5Var instanceof d63) {
            f = this.c;
        }
        Object objF4 = jt1Var.f();
        if (objF4 == obj) {
            objF4 = new qt(new y43(f), b0a.x, null, 12);
            jt1Var.C(objF4);
        }
        qt qtVar2 = (qt) objF4;
        y43 y43Var = new y43(f);
        boolean zJ = jt1Var.j(qtVar2) | jt1Var.g(f) | ((((i & 14) ^ 6) > 4 && jt1Var.c(z)) || (i & 6) == 4);
        if ((((i & 896) ^ 384) <= 256 || !jt1Var.J(this)) && (i & 384) != 256) {
            z2 = false;
        }
        boolean zJ2 = zJ | z2 | jt1Var.j(qg5Var);
        Object objF5 = jt1Var.f();
        if (zJ2 || objF5 == obj) {
            qtVar = qtVar2;
            Object c51Var = new c51(qtVar, f, z, this, qg5Var, null);
            jt1Var.C(c51Var);
            objF5 = c51Var;
        } else {
            qtVar = qtVar2;
        }
        wd3.d(jt1Var, (ci4) objF5, y43Var);
        yz9 yz9Var = qtVar.c;
        jt1Var.B();
        return yz9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d51)) {
            return false;
        }
        d51 d51Var = (d51) obj;
        return y43.e(this.a, d51Var.a) && y43.e(0.0f, 0.0f) && y43.e(0.0f, 0.0f) && y43.e(this.b, d51Var.b) && y43.e(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + h44.a(h44.a(h44.a(Float.hashCode(this.a) * 31, 0.0f, 31), 0.0f, 31), this.b, 31);
    }
}
