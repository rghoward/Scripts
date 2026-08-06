package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o6a {
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object a(float f, float f2, float f3, wv wvVar, ci4 ci4Var, p6a p6aVar) throws Throwable {
        dza dzaVar = b0a.v;
        Object f4 = new Float(f);
        Float f5 = new Float(f2);
        Object f6 = new Float(f3);
        oh4<T, V> oh4Var = dzaVar.a;
        fw fwVarC = (fw) oh4Var.invoke((T) f6);
        if (fwVarC == null) {
            fwVarC = ((fw) oh4Var.invoke((T) f4)).c();
        }
        fw fwVar = fwVarC;
        Object objB = b(new yv(dzaVar, f4, fwVar, 56), new l9a(wvVar, dzaVar, f4, f5, fwVar), Long.MIN_VALUE, new z00(2, ci4Var), p6aVar);
        v72 v72Var = v72.t;
        if (objB != v72Var) {
            objB = g2b.a;
        }
        return objB == v72Var ? objB : g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x015a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0167  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, vv] */
    public static final Object b(yv yvVar, lv lvVar, long j, final oh4 oh4Var, u02 u02Var) throws Throwable {
        n6a n6aVar;
        final gl8 gl8Var;
        final yv yvVar2;
        yv yvVar3;
        gl8 gl8Var2;
        Object objU;
        oh4 oh4Var2;
        vv vvVar;
        vv vvVar2;
        Object objU2;
        final lv lvVar2 = lvVar;
        if (u02Var instanceof n6a) {
            n6aVar = (n6a) u02Var;
            int i = n6aVar.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                n6aVar.y = i - Integer.MIN_VALUE;
            } else {
                n6aVar = new n6a(u02Var);
            }
        } else {
            n6aVar = new n6a(u02Var);
        }
        n6a n6aVar2 = n6aVar;
        Object obj = n6aVar2.x;
        int i2 = n6aVar2.y;
        int i3 = 2;
        v72 v72Var = v72.t;
        if (i2 == 0) {
            dv8.b(obj);
            final Object objG = lvVar2.g(0L);
            final fw fwVarE = lvVar2.e(0L);
            gl8Var = new gl8();
            if (j == Long.MIN_VALUE) {
                try {
                    final float fH = h(n6aVar2.getContext());
                    yvVar2 = yvVar;
                    try {
                        oh4 oh4Var3 = new oh4() { // from class: l6a
                            /* JADX WARN: Type inference failed for: r0v0, types: [T, vv] */
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                long jLongValue = ((Long) obj2).longValue();
                                lv lvVar3 = lvVar2;
                                cza czaVarD = lvVar3.d();
                                Object objH = lvVar3.h();
                                yv yvVar4 = yvVar2;
                                ?? vvVar3 = new vv(objG, czaVarD, fwVarE, jLongValue, objH, jLongValue, new e10(3, yvVar4));
                                o6a.g(vvVar3, jLongValue, fH, lvVar3, yvVar4, oh4Var);
                                gl8Var.t = vvVar3;
                                return g2b.a;
                            }
                        };
                        gl8Var2 = gl8Var;
                        try {
                            n6aVar2.t = yvVar2;
                            n6aVar2.u = lvVar2;
                            n6aVar2.v = oh4Var;
                            n6aVar2.w = gl8Var2;
                            n6aVar2.y = 1;
                            if (lvVar2.b()) {
                                objU = tb5.a(oh4Var3, n6aVar2);
                            } else {
                                objU = zx6.a(n6aVar2.getContext()).u(new in0(i3, oh4Var3), n6aVar2);
                            }
                            if (objU != v72Var) {
                                yvVar3 = yvVar2;
                                oh4Var2 = oh4Var;
                                gl8Var = gl8Var2;
                            }
                            return v72Var;
                        } catch (CancellationException e) {
                            e = e;
                            yvVar3 = yvVar2;
                            gl8Var = gl8Var2;
                            vvVar = (vv) gl8Var.t;
                            if (vvVar != null) {
                                vvVar.i.setValue(Boolean.FALSE);
                            }
                            vvVar2 = (vv) gl8Var.t;
                            if (vvVar2 != null) {
                                yvVar3.y = false;
                            }
                            throw e;
                        }
                    } catch (CancellationException e2) {
                        e = e2;
                        yvVar3 = yvVar2;
                        vvVar = (vv) gl8Var.t;
                        if (vvVar != null) {
                            vvVar.i.setValue(Boolean.FALSE);
                        }
                        vvVar2 = (vv) gl8Var.t;
                        if (vvVar2 != null) {
                            yvVar3.y = false;
                        }
                        throw e;
                    }
                } catch (CancellationException e3) {
                    e = e3;
                    yvVar2 = yvVar;
                }
            } else {
                gl8Var2 = gl8Var;
                try {
                    ?? vvVar3 = new vv(objG, lvVar2.d(), fwVarE, j, lvVar2.h(), j, new b10(4, yvVar));
                    g(vvVar3, j, h(n6aVar2.getContext()), lvVar2, yvVar, oh4Var);
                    gl8Var2.t = vvVar3;
                    yvVar3 = yvVar;
                    lvVar2 = lvVar;
                    oh4Var2 = oh4Var;
                    gl8Var = gl8Var2;
                } catch (CancellationException e4) {
                    e = e4;
                    yvVar3 = yvVar;
                    gl8Var = gl8Var2;
                    vvVar = (vv) gl8Var.t;
                    if (vvVar != null) {
                        vvVar.i.setValue(Boolean.FALSE);
                    }
                    vvVar2 = (vv) gl8Var.t;
                    if (vvVar2 != null && vvVar2.g == yvVar3.w) {
                        yvVar3.y = false;
                    }
                    throw e;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gl8Var = n6aVar2.w;
            oh4Var2 = n6aVar2.v;
            lvVar2 = n6aVar2.u;
            yvVar3 = n6aVar2.t;
            try {
                dv8.b(obj);
            } catch (CancellationException e5) {
                e = e5;
                vvVar = (vv) gl8Var.t;
                if (vvVar != null) {
                    vvVar.i.setValue(Boolean.FALSE);
                }
                vvVar2 = (vv) gl8Var.t;
                if (vvVar2 != null) {
                    yvVar3.y = false;
                }
                throw e;
            }
        }
        do {
            T t = gl8Var.t;
            t.getClass();
            if (!((Boolean) ((vv) t).i.getValue()).booleanValue()) {
                return g2b.a;
            }
            final float fH2 = h(n6aVar2.getContext());
            final gl8 gl8Var3 = gl8Var;
            final oh4 oh4Var4 = oh4Var2;
            final lv lvVar3 = lvVar2;
            final yv yvVar4 = yvVar3;
            try {
                oh4 oh4Var5 = new oh4() { // from class: m6a
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        long jLongValue = ((Long) obj2).longValue();
                        T t2 = gl8Var3.t;
                        t2.getClass();
                        o6a.g((vv) t2, jLongValue, fH2, lvVar3, yvVar4, oh4Var4);
                        return g2b.a;
                    }
                };
                gl8Var = gl8Var3;
                lvVar2 = lvVar3;
                yvVar3 = yvVar4;
                oh4Var2 = oh4Var4;
                n6aVar2.t = yvVar3;
                n6aVar2.u = lvVar2;
                n6aVar2.v = oh4Var2;
                n6aVar2.w = gl8Var;
                n6aVar2.y = 2;
                if (lvVar2.b()) {
                    objU2 = tb5.a(oh4Var5, n6aVar2);
                } else {
                    objU2 = zx6.a(n6aVar2.getContext()).u(new in0(i3, oh4Var5), n6aVar2);
                }
            } catch (CancellationException e6) {
                e = e6;
                gl8Var = gl8Var3;
                yvVar3 = yvVar4;
                vvVar = (vv) gl8Var.t;
                if (vvVar != null) {
                    vvVar.i.setValue(Boolean.FALSE);
                }
                vvVar2 = (vv) gl8Var.t;
                if (vvVar2 != null) {
                    yvVar3.y = false;
                }
                throw e;
            }
        } while (objU2 != v72Var);
        return v72Var;
    }

    public static /* synthetic */ Object c(float f, float f2, wv wvVar, ci4 ci4Var, p6a p6aVar, int i) {
        if ((i & 8) != 0) {
            wvVar = xv.b(0.0f, 0.0f, null, 7);
        }
        return a(f, f2, 0.0f, wvVar, ci4Var, p6aVar);
    }

    public static final Object d(yv yvVar, an2 an2Var, boolean z, oh4 oh4Var, u02 u02Var) {
        Object objB = b(yvVar, new zm2(an2Var, yvVar.t, yvVar.u.getValue(), yvVar.v), z ? yvVar.w : Long.MIN_VALUE, oh4Var, u02Var);
        return objB == v72.t ? objB : g2b.a;
    }

    public static final Object e(yv yvVar, Float f, wv wvVar, boolean z, oh4 oh4Var, u02 u02Var) {
        Object objB = b(yvVar, new l9a(wvVar, yvVar.t, yvVar.u.getValue(), f, yvVar.v), z ? yvVar.w : Long.MIN_VALUE, oh4Var, u02Var);
        return objB == v72.t ? objB : g2b.a;
    }

    public static /* synthetic */ Object f(yv yvVar, Float f, wv wvVar, boolean z, oh4 oh4Var, u02 u02Var, int i) {
        if ((i & 2) != 0) {
            wvVar = xv.b(0.0f, 0.0f, null, 7);
        }
        wv wvVar2 = wvVar;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            oh4Var = new cg8(2);
        }
        return e(yvVar, f, wvVar2, z2, oh4Var, u02Var);
    }

    public static final <T, V extends fw> void g(vv<T, V> vvVar, long j, float f, lv<T, V> lvVar, yv<T, V> yvVar, oh4<? super vv<T, V>, g2b> oh4Var) {
        long jC = f == 0.0f ? lvVar.c() : (long) ((j - vvVar.c) / f);
        vvVar.g = j;
        vvVar.e.setValue(lvVar.g(jC));
        vvVar.f = (V) lvVar.e(jC);
        if (lvVar.f(jC)) {
            vvVar.h = vvVar.g;
            vvVar.i.setValue(Boolean.FALSE);
        }
        i(vvVar, yvVar);
        oh4Var.invoke(vvVar);
    }

    public static final float h(h72 h72Var) {
        jy6 jy6Var = (jy6) h72Var.d0(jy6.a.t);
        float fP = jy6Var != null ? jy6Var.P() : 1.0f;
        if (fP >= 0.0f) {
            return fP;
        }
        e78.b("negative scale factor");
        return fP;
    }

    public static final <T, V extends fw> void i(vv<T, V> vvVar, yv<T, V> yvVar) {
        yvVar.u.setValue(vvVar.e.getValue());
        V v = yvVar.v;
        V v2 = vvVar.f;
        int iB = v.b();
        for (int i = 0; i < iB; i++) {
            v.e(v2.a(i), i);
        }
        yvVar.x = vvVar.h;
        yvVar.w = vvVar.g;
        yvVar.y = ((Boolean) vvVar.i.getValue()).booleanValue();
    }
}
