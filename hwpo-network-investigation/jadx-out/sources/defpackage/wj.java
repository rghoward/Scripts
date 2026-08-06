package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wj<T> {
    public final wo0 a;
    public final mh4<Float> b;
    public final rj c;
    public final oh4<T, Boolean> d;
    public final dt7 g;
    public final my2 i;
    public final at7 k;
    public final dt7 l;
    public final dt7 m;
    public final tj n;
    public final gj5 e = new gj5();
    public final vj f = new vj(this);
    public final my2 h = bl7.f(new mh4() { // from class: kj
        @Override // defpackage.mh4
        public final Object invoke() {
            wj wjVar = this.t;
            T value = wjVar.l.getValue();
            if (value != 0) {
                return value;
            }
            float fH = wjVar.j.h();
            boolean zIsNaN = Float.isNaN(fH);
            dt7 dt7Var = wjVar.g;
            return !zIsNaN ? wjVar.c(fH, 0.0f, dt7Var.getValue()) : dt7Var.getValue();
        }
    });
    public final at7 j = new at7(Float.NaN);

    public wj(in9 in9Var, wo0 wo0Var, mh4 mh4Var, rj rjVar, oh4 oh4Var) {
        this.a = wo0Var;
        this.b = mh4Var;
        this.c = rjVar;
        this.d = oh4Var;
        this.g = bl7.i(in9Var);
        int i = 0;
        this.i = bl7.f(new lj(i, this));
        bl7.g(new mj(i, this), d3a.u);
        this.k = new at7(0.0f);
        this.l = bl7.i(null);
        this.m = bl7.i(new oh6(if3.t));
        this.n = new tj(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(o37 o37Var, uj ujVar, u02 u02Var) throws Throwable {
        nj njVar;
        if (u02Var instanceof nj) {
            njVar = (nj) u02Var;
            int i = njVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                njVar.v = i - Integer.MIN_VALUE;
            } else {
                njVar = new nj(this, u02Var);
            }
        } else {
            njVar = new nj(this, u02Var);
        }
        Object obj = njVar.t;
        int i2 = njVar.v;
        oh4<T, Boolean> oh4Var = this.d;
        at7 at7Var = this.j;
        try {
            if (i2 == 0) {
                dv8.b(obj);
                gj5 gj5Var = this.e;
                pj pjVar = new pj(this, null, ujVar);
                njVar.v = 1;
                gj5Var.getClass();
                Object objD = u72.d(new hj5(o37Var, gj5Var, pjVar, null), njVar);
                v72 v72Var = v72.t;
                if (objD == v72Var) {
                    return v72Var;
                }
            } else {
                if (i2 != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            T tC = e().c(at7Var.h());
            if (tC != null && Math.abs(at7Var.h() - e().d(tC)) <= 0.5f && oh4Var.invoke(tC).booleanValue()) {
                h(tC);
            }
            return g2b.a;
        } catch (Throwable th) {
            T tC2 = e().c(at7Var.h());
            if (tC2 != null && Math.abs(at7Var.h() - e().d(tC2)) <= 0.5f && oh4Var.invoke(tC2).booleanValue()) {
                h(tC2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(Object obj, o37 o37Var, fi4 fi4Var, u02 u02Var) throws Throwable {
        qj qjVar;
        if (u02Var instanceof qj) {
            qjVar = (qj) u02Var;
            int i = qjVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                qjVar.v = i - Integer.MIN_VALUE;
            } else {
                qjVar = new qj(this, u02Var);
            }
        } else {
            qjVar = new qj(this, u02Var);
        }
        Object obj2 = qjVar.t;
        int i2 = qjVar.v;
        oh4<T, Boolean> oh4Var = this.d;
        at7 at7Var = this.j;
        try {
            if (i2 == 0) {
                dv8.b(obj2);
                if (e().e(obj)) {
                    gj5 gj5Var = this.e;
                    sj sjVar = new sj(this, obj, fi4Var, null);
                    qjVar.v = 1;
                    gj5Var.getClass();
                    Object objD = u72.d(new hj5(o37Var, gj5Var, sjVar, null), qjVar);
                    v72 v72Var = v72.t;
                    if (objD == v72Var) {
                        return v72Var;
                    }
                } else {
                    h(obj);
                }
                return g2b.a;
            }
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj2);
            i(null);
            T tC = e().c(at7Var.h());
            if (tC != null && Math.abs(at7Var.h() - e().d(tC)) <= 0.5f && oh4Var.invoke(tC).booleanValue()) {
                h(tC);
            }
            return g2b.a;
        } catch (Throwable th) {
            i(null);
            T tC2 = e().c(at7Var.h());
            if (tC2 != null && Math.abs(at7Var.h() - e().d(tC2)) <= 0.5f && oh4Var.invoke(tC2).booleanValue()) {
                h(tC2);
            }
            throw th;
        }
    }

    public final Object c(float f, float f2, Object obj) {
        g63<T> g63VarE = e();
        float fD = g63VarE.d(obj);
        float fFloatValue = this.b.invoke().floatValue();
        if (fD != f && !Float.isNaN(fD)) {
            wo0 wo0Var = this.a;
            if (fD < f) {
                if (f2 >= fFloatValue) {
                    Object objA = g63VarE.a(true, f);
                    objA.getClass();
                    return objA;
                }
                Object objA2 = g63VarE.a(true, f);
                objA2.getClass();
                if (f >= Math.abs(Math.abs(((Number) wo0Var.invoke(Float.valueOf(Math.abs(g63VarE.d(objA2) - fD)))).floatValue()) + fD)) {
                    return objA2;
                }
            } else {
                if (f2 <= (-fFloatValue)) {
                    Object objA3 = g63VarE.a(false, f);
                    objA3.getClass();
                    return objA3;
                }
                Object objA4 = g63VarE.a(false, f);
                objA4.getClass();
                float fAbs = Math.abs(fD - Math.abs(((Number) wo0Var.invoke(Float.valueOf(Math.abs(fD - g63VarE.d(objA4))))).floatValue()));
                if (f >= 0.0f ? f <= fAbs : Math.abs(f) >= fAbs) {
                    return objA4;
                }
            }
        }
        return obj;
    }

    public final float d(float f) {
        float f2 = f(f);
        at7 at7Var = this.j;
        float fH = Float.isNaN(at7Var.h()) ? 0.0f : at7Var.h();
        at7Var.g(f2);
        return f2 - fH;
    }

    public final g63<T> e() {
        return (g63) this.m.getValue();
    }

    public final float f(float f) {
        at7 at7Var = this.j;
        return uh8.f((Float.isNaN(at7Var.h()) ? 0.0f : at7Var.h()) + f, e().b(), e().f());
    }

    public final float g() {
        at7 at7Var = this.j;
        if (!Float.isNaN(at7Var.h())) {
            return at7Var.h();
        }
        aa0.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        return 0.0f;
    }

    public final void h(T t) {
        this.g.setValue(t);
    }

    public final void i(T t) {
        this.l.setValue(t);
    }
}
