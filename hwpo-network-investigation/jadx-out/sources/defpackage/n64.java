package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n64 {
    public static final void a(final boolean z, final ci4 ci4Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(-642000585);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.c(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(ci4Var) ? 32 : 16;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 19) != 18)) {
            Object objA = mc6.a(bj4VarO);
            if (objA == null) {
                bj4VarO.K(1512740606);
                objA = oc6.a(bj4VarO);
            } else {
                bj4VarO.K(1512737723);
            }
            bj4VarO.U(false);
            if (objA == null) {
                aa0.c("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zJ = bj4VarO.J(objA);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (zJ || objF == c0187a) {
                f87 f87Var = objA instanceof f87 ? (f87) objA : null;
                e87 navigationEventDispatcher = f87Var != null ? f87Var.getNavigationEventDispatcher() : null;
                bh7 bh7Var = objA instanceof bh7 ? (bh7) objA : null;
                objF = new ih0(navigationEventDispatcher, bh7Var != null ? bh7Var.getOnBackPressedDispatcher() : null);
                bj4VarO.C(objF);
            }
            final ih0 ih0Var = (ih0) objF;
            Object objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                c33 c33Var = wd3.a;
                objF2 = m78.a(bj4VarO.x(), bj4VarO);
            }
            t72 t72Var = (t72) objF2;
            long j = bj4VarO.T;
            boolean zJ2 = bj4VarO.J(ih0Var) | bj4VarO.i(j);
            Object objF3 = bj4VarO.f();
            if (zJ2 || objF3 == c0187a) {
                objF3 = new os1(t72Var, new i78(j, objA));
                bj4VarO.C(objF3);
            }
            final os1 os1Var = (os1) objF3;
            bj4VarO.K(-348514256);
            boolean zJ3 = bj4VarO.j(os1Var) | bj4VarO.j(ci4Var);
            Object objF4 = bj4VarO.f();
            if (zJ3 || objF4 == c0187a) {
                objF4 = new ix0(1, os1Var, ci4Var);
                bj4VarO.C(objF4);
            }
            c33 c33Var2 = wd3.a;
            bj4VarO.w((mh4) objF4);
            Boolean boolValueOf = Boolean.valueOf(z);
            int i3 = i2 & 14;
            boolean zJ4 = bj4VarO.j(os1Var) | (i3 == 4);
            Object objF5 = bj4VarO.f();
            if (zJ4 || objF5 == c0187a) {
                objF5 = new oh4() { // from class: j78
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        os1 os1Var2 = os1Var;
                        os1Var2.f(z);
                        return new n78((u76) obj, os1Var2);
                    }
                };
                bj4VarO.C(objF5);
            }
            f76.a(boolValueOf, os1Var, null, (oh4) objF5, bj4VarO, i3);
            boolean zJ5 = bj4VarO.j(ih0Var) | bj4VarO.j(os1Var);
            Object objF6 = bj4VarO.f();
            if (zJ5 || objF6 == c0187a) {
                objF6 = new oh4() { // from class: k78
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        ih0 ih0Var2 = ih0Var;
                        os1 os1Var2 = os1Var;
                        ih0Var2.a(os1Var2);
                        return new o78(ih0Var2, os1Var2);
                    }
                };
                bj4VarO.C(objF6);
            }
            wd3.b(ih0Var, os1Var, (oh4) objF6, bj4VarO);
            bj4VarO.U(false);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: l78
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i | 1);
                    n64.a(z, ci4Var, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(lla llaVar, ei4 ei4Var, Throwable th, u02 u02Var) throws Throwable {
        k64 k64Var;
        if (u02Var instanceof k64) {
            k64Var = (k64) u02Var;
            int i = k64Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                k64Var.v = i - Integer.MIN_VALUE;
            } else {
                k64Var = new k64(u02Var);
            }
        } else {
            k64Var = new k64(u02Var);
        }
        Object obj = k64Var.u;
        int i2 = k64Var.v;
        try {
            if (i2 == 0) {
                dv8.b(obj);
                k64Var.t = th;
                k64Var.v = 1;
                Object objInvoke = ei4Var.invoke(llaVar, th, k64Var);
                v72 v72Var = v72.t;
                if (objInvoke == v72Var) {
                    return v72Var;
                }
            } else {
                if (i2 != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = k64Var.t;
                dv8.b(obj);
            }
            return g2b.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                fn3.b(th2, th);
            }
            throw th2;
        }
    }
}
