package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ia {
    public static final boolean a(ba4 ba4Var, boolean z) {
        int iOrdinal = ba4Var.a0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ba4 ba4VarC = fa4.c(ba4Var);
                if (!(ba4VarC != null ? a(ba4VarC, z) : true)) {
                    return false;
                }
                ba4Var.d2(w94.u, w94.w);
                return true;
            }
            if (iOrdinal == 2) {
                return z;
            }
            if (iOrdinal != 3) {
                u.b();
                return false;
            }
        }
        return true;
    }

    public static final gd2 b(ba4 ba4Var, int i) {
        int iOrdinal = ba4Var.a0().ordinal();
        gd2 gd2Var = gd2.t;
        if (iOrdinal != 0) {
            gd2 gd2Var2 = gd2.u;
            if (iOrdinal == 1) {
                ba4 ba4VarC = fa4.c(ba4Var);
                if (ba4VarC == null) {
                    z90.a("ActiveParent with no focused child");
                    return null;
                }
                gd2 gd2VarB = b(ba4VarC, i);
                gd2 gd2Var3 = gd2VarB != gd2Var ? gd2VarB : null;
                if (gd2Var3 != null) {
                    return gd2Var3;
                }
                if (ba4Var.J) {
                    return gd2Var;
                }
                ba4Var.J = true;
                try {
                    n94 n94VarE2 = ba4Var.e2();
                    w31 w31Var = new w31(i);
                    g94 focusOwner = ew2.g(ba4Var).getFocusOwner();
                    ba4 ba4VarV = focusOwner.v();
                    n94VarE2.k.invoke(w31Var);
                    ba4 ba4VarV2 = focusOwner.v();
                    if (w31Var.b) {
                        p94 p94Var = p94.b;
                        return gd2Var2;
                    }
                    if (ba4VarV == ba4VarV2 || ba4VarV2 == null) {
                        return gd2Var;
                    }
                    return p94.d == p94.c ? gd2Var2 : gd2.v;
                } finally {
                    ba4Var.J = false;
                }
            }
            if (iOrdinal == 2) {
                return gd2Var2;
            }
            if (iOrdinal != 3) {
                u.b();
                return null;
            }
        }
        return gd2Var;
    }

    public static final gd2 c(ba4 ba4Var, int i) {
        if (!ba4Var.K) {
            ba4Var.K = true;
            try {
                n94 n94VarE2 = ba4Var.e2();
                w31 w31Var = new w31(i);
                g94 focusOwner = ew2.g(ba4Var).getFocusOwner();
                ba4 ba4VarV = focusOwner.v();
                n94VarE2.j.invoke(w31Var);
                ba4 ba4VarV2 = focusOwner.v();
                boolean z = w31Var.b;
                gd2 gd2Var = gd2.u;
                if (z) {
                    p94 p94Var = p94.b;
                    return gd2Var;
                }
                if (ba4VarV != ba4VarV2 && ba4VarV2 != null) {
                    return p94.d == p94.c ? gd2Var : gd2.v;
                }
            } finally {
                ba4Var.K = false;
            }
        }
        return gd2.t;
    }

    public static final gd2 d(ba4 ba4Var, int i) {
        ox6.c cVarB;
        kb7 kb7Var;
        int iOrdinal = ba4Var.a0().ordinal();
        gd2 gd2Var = gd2.t;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ba4 ba4VarC = fa4.c(ba4Var);
                if (ba4VarC != null) {
                    return b(ba4VarC, i);
                }
                z90.a("ActiveParent with no focused child");
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    u.b();
                    return null;
                }
                if (!ba4Var.t.G) {
                    uc5.b("visitAncestors called on an unattached node");
                }
                ox6.c cVar = ba4Var.t.x;
                qr5 qr5VarF = ew2.f(ba4Var);
                loop0: while (true) {
                    if (qr5VarF == null) {
                        cVarB = null;
                        break;
                    }
                    if ((qr5VarF.Y.f.w & 1024) != 0) {
                        while (cVar != null) {
                            if ((cVar.v & 1024) != 0) {
                                cVarB = cVar;
                                k37 k37Var = null;
                                while (cVarB != null) {
                                    if (cVarB instanceof ba4) {
                                        break loop0;
                                    }
                                    if ((cVarB.v & 1024) != 0 && (cVarB instanceof gw2)) {
                                        int i2 = 0;
                                        for (ox6.c cVar2 = ((gw2) cVarB).I; cVar2 != null; cVar2 = cVar2.y) {
                                            if ((cVar2.v & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    cVarB = cVar2;
                                                } else {
                                                    if (k37Var == null) {
                                                        k37Var = new k37(new ox6.c[16]);
                                                    }
                                                    if (cVarB != null) {
                                                        k37Var.d(cVarB);
                                                        cVarB = null;
                                                    }
                                                    k37Var.d(cVar2);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    cVarB = ew2.b(k37Var);
                                }
                            }
                            cVar = cVar.x;
                        }
                    }
                    qr5VarF = qr5VarF.I();
                    cVar = (qr5VarF == null || (kb7Var = qr5VarF.Y) == null) ? null : kb7Var.e;
                }
                ba4 ba4Var2 = (ba4) cVarB;
                if (ba4Var2 == null) {
                    return gd2Var;
                }
                int iOrdinal2 = ba4Var2.a0().ordinal();
                if (iOrdinal2 == 0) {
                    return c(ba4Var2, i);
                }
                if (iOrdinal2 == 1) {
                    return d(ba4Var2, i);
                }
                if (iOrdinal2 == 2) {
                    return gd2.u;
                }
                if (iOrdinal2 != 3) {
                    u.b();
                    return null;
                }
                gd2 gd2VarD = d(ba4Var2, i);
                gd2 gd2Var2 = gd2VarD != gd2Var ? gd2VarD : null;
                return gd2Var2 == null ? c(ba4Var2, i) : gd2Var2;
            }
        }
        return gd2Var;
    }

    public static final boolean e(ba4 ba4Var) {
        k37 k37Var;
        kb7 kb7Var;
        boolean z;
        kb7 kb7Var2;
        g94 focusOwner = ew2.g(ba4Var).getFocusOwner();
        ba4 ba4VarV = focusOwner.v();
        w94 w94VarA0 = ba4Var.a0();
        if (ba4VarV == ba4Var) {
            ba4Var.d2(w94VarA0, w94VarA0);
            return true;
        }
        if ((ba4VarV == null || ba4VarV.H) && !ba4Var.H && !ew2.g(ba4Var).getFocusOwner().i()) {
            return false;
        }
        if (ba4VarV != null) {
            k37Var = new k37(new ba4[16]);
            if (!ba4VarV.t.G) {
                uc5.b("visitAncestors called on an unattached node");
            }
            ox6.c cVar = ba4VarV.t.x;
            qr5 qr5VarF = ew2.f(ba4VarV);
            while (qr5VarF != null) {
                if ((qr5VarF.Y.f.w & 1024) != 0) {
                    while (cVar != null) {
                        if ((cVar.v & 1024) != 0) {
                            ox6.c cVarB = cVar;
                            k37 k37Var2 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof ba4) {
                                    k37Var.d((ba4) cVarB);
                                } else if ((cVarB.v & 1024) != 0 && (cVarB instanceof gw2)) {
                                    int i = 0;
                                    for (ox6.c cVar2 = ((gw2) cVarB).I; cVar2 != null; cVar2 = cVar2.y) {
                                        if ((cVar2.v & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                g2b g2bVar = g2b.a;
                                                cVarB = cVar2;
                                            } else {
                                                if (k37Var2 == null) {
                                                    k37Var2 = new k37(new ox6.c[16]);
                                                }
                                                if (cVarB != null) {
                                                    k37Var2.d(cVarB);
                                                    cVarB = null;
                                                }
                                                k37Var2.d(cVar2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                cVarB = ew2.b(k37Var2);
                            }
                        }
                        cVar = cVar.x;
                    }
                }
                qr5VarF = qr5VarF.I();
                cVar = (qr5VarF == null || (kb7Var2 = qr5VarF.Y) == null) ? null : kb7Var2.e;
            }
        } else {
            k37Var = null;
        }
        Object[] objArr = new ba4[16];
        Object[] objArr2 = new ba4[16];
        if (!ba4Var.t.G) {
            uc5.b("visitAncestors called on an unattached node");
        }
        ox6.c cVar3 = ba4Var.t.x;
        qr5 qr5VarF2 = ew2.f(ba4Var);
        boolean z2 = true;
        int i2 = 0;
        int i3 = 0;
        while (qr5VarF2 != null) {
            if ((qr5VarF2.Y.f.w & 1024) != 0) {
                while (cVar3 != null) {
                    if ((cVar3.v & 1024) != 0) {
                        ox6.c cVarB2 = cVar3;
                        k37 k37Var3 = null;
                        while (cVarB2 != null) {
                            if (cVarB2 instanceof ba4) {
                                ba4 ba4Var2 = (ba4) cVarB2;
                                if (xj5.a(k37Var != null ? Boolean.valueOf(k37Var.n(ba4Var2)) : null, Boolean.TRUE)) {
                                    int i4 = i2 + 1;
                                    if (objArr.length < i4) {
                                        int length = objArr.length;
                                        Object[] objArr3 = new Object[Math.max(i4, length * 2)];
                                        System.arraycopy(objArr, 0, objArr3, 0, length);
                                        objArr = objArr3;
                                    }
                                    objArr[i2] = ba4Var2;
                                    i2 = i4;
                                } else {
                                    focusOwner = focusOwner;
                                    int i5 = i3 + 1;
                                    if (objArr2.length < i5) {
                                        int length2 = objArr2.length;
                                        Object[] objArr4 = new Object[Math.max(i5, length2 * 2)];
                                        System.arraycopy(objArr2, 0, objArr4, 0, length2);
                                        objArr2 = objArr4;
                                    }
                                    objArr2[i3] = ba4Var2;
                                    i3 = i5;
                                }
                                if (ba4Var2 == ba4VarV) {
                                    z2 = false;
                                }
                                z = false;
                            } else {
                                focusOwner = focusOwner;
                                z = true;
                            }
                            if (z && (cVarB2.v & 1024) != 0 && (cVarB2 instanceof gw2)) {
                                int i6 = 0;
                                for (ox6.c cVar4 = ((gw2) cVarB2).I; cVar4 != null; cVar4 = cVar4.y) {
                                    if ((cVar4.v & 1024) != 0) {
                                        int i7 = i6 + 1;
                                        if (i7 == 1) {
                                            g2b g2bVar2 = g2b.a;
                                            cVarB2 = cVar4;
                                            i7 = i7;
                                        } else {
                                            k37 k37Var4 = k37Var3 == null ? new k37(new ox6.c[16]) : k37Var3;
                                            if (cVarB2 != null) {
                                                k37Var4.d(cVarB2);
                                                cVarB2 = null;
                                            }
                                            k37Var4.d(cVar4);
                                            k37Var3 = k37Var4;
                                        }
                                        i6 = i7;
                                    }
                                }
                                if (i6 != 1) {
                                    cVarB2 = ew2.b(k37Var3);
                                }
                            } else {
                                cVarB2 = ew2.b(k37Var3);
                            }
                        }
                    }
                    cVar3 = cVar3.x;
                    focusOwner = focusOwner;
                }
            }
            g94 g94Var = focusOwner;
            qr5VarF2 = qr5VarF2.I();
            cVar3 = (qr5VarF2 == null || (kb7Var = qr5VarF2.Y) == null) ? null : kb7Var.e;
            focusOwner = g94Var;
        }
        g94 g94Var2 = focusOwner;
        if (z2 && ba4VarV != null && !a(ba4VarV, false)) {
            return false;
        }
        sf7.a(ba4Var, new ea4(ba4Var));
        int iOrdinal = ba4Var.a0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ew2.g(ba4Var).getFocusOwner().h(ba4Var);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    u.b();
                    return false;
                }
                ew2.g(ba4Var).getFocusOwner().h(ba4Var);
            }
        }
        w94 w94Var = w94.w;
        w94 w94Var2 = w94.t;
        if (z2 && ba4VarV != null) {
            ba4VarV.d2(w94Var2, w94Var);
            g2b g2bVar3 = g2b.a;
        }
        w94 w94Var3 = w94.u;
        if (k37Var != null) {
            int i8 = k37Var.v - 1;
            Object[] objArr5 = k37Var.t;
            if (i8 < objArr5.length) {
                while (i8 >= 0) {
                    ba4 ba4Var3 = (ba4) objArr5[i8];
                    if (g94Var2.v() != ba4Var) {
                        return false;
                    }
                    ba4Var3.d2(w94Var3, w94Var);
                    i8--;
                }
            }
            g2b g2bVar4 = g2b.a;
        }
        int i9 = i3 - 1;
        if (i9 < objArr2.length) {
            while (i9 >= 0) {
                ba4 ba4Var4 = (ba4) objArr2[i9];
                if (g94Var2.v() != ba4Var) {
                    return false;
                }
                ba4Var4.d2(ba4Var4 == ba4VarV ? w94Var2 : w94Var, w94Var3);
                i9--;
            }
        }
        if (g94Var2.v() != ba4Var) {
            return false;
        }
        ba4Var.d2(w94VarA0, w94Var2);
        return g94Var2.v() == ba4Var;
    }

    public static final eh6 f(o9 o9Var, oh4 oh4Var, jt1 jt1Var) {
        final o9 o9Var2;
        h37 h37VarJ = bl7.j(o9Var, jt1Var);
        final h37 h37VarJ2 = bl7.j(oh4Var, jt1Var);
        Object[] objArr = new Object[0];
        Object objF = jt1Var.f();
        Object obj = jt1.a.a;
        if (objF == obj) {
            objF = new ea();
            jt1Var.C(objF);
        }
        final String str = (String) mm8.d(objArr, (mh4) objF, jt1Var, 48);
        ja jaVar = (ja) jt1Var.F(gc6.a);
        if (jaVar == null) {
            jt1Var.K(1213380307);
            Object baseContext = (Context) jt1Var.F(AndroidCompositionLocals_androidKt.b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof ja) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            jaVar = (ja) baseContext;
        } else {
            jt1Var.K(1213379439);
        }
        jt1Var.B();
        if (jaVar == null) {
            aa0.c("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        final ba activityResultRegistry = jaVar.getActivityResultRegistry();
        Object objF2 = jt1Var.f();
        if (objF2 == obj) {
            objF2 = new x9();
            jt1Var.C(objF2);
        }
        final x9 x9Var = (x9) objF2;
        Object objF3 = jt1Var.f();
        if (objF3 == obj) {
            objF3 = new eh6(x9Var, h37VarJ);
            jt1Var.C(objF3);
        }
        eh6 eh6Var = (eh6) objF3;
        boolean zJ = jt1Var.j(x9Var) | jt1Var.j(activityResultRegistry) | jt1Var.J(str) | jt1Var.j(o9Var) | jt1Var.J(h37VarJ2);
        Object objF4 = jt1Var.f();
        if (zJ || objF4 == obj) {
            o9Var2 = o9Var;
            objF4 = new oh4() { // from class: fa
                @Override // defpackage.oh4
                public final Object invoke(Object obj2) {
                    final h37 h37Var = h37VarJ2;
                    da daVarD = activityResultRegistry.d(str, o9Var2, new n9() { // from class: ga
                        @Override // defpackage.n9
                        public final void a(Object obj3) {
                            ((oh4) h37Var.getValue()).invoke(obj3);
                        }
                    });
                    x9 x9Var2 = x9Var;
                    x9Var2.a = daVarD;
                    return new ha(x9Var2);
                }
            };
            jt1Var.C(objF4);
        } else {
            o9Var2 = o9Var;
        }
        oh4 oh4Var2 = (oh4) objF4;
        c33 c33Var = wd3.a;
        boolean zJ2 = jt1Var.J(activityResultRegistry) | jt1Var.J(str) | jt1Var.J(o9Var2);
        Object objF5 = jt1Var.f();
        if (zJ2 || objF5 == obj) {
            objF5 = new a33(oh4Var2);
            jt1Var.C(objF5);
        }
        return eh6Var;
    }
}
