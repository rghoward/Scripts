package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ck7 {
    /* JADX WARN: Code duplicated, block: B:38:0x0076 A[RETURN] */
    public static final boolean a(ba4 ba4Var, h94.a aVar) {
        int iOrdinal = ba4Var.a0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ba4 ba4VarC = fa4.c(ba4Var);
                if (ba4VarC == null) {
                    aa0.c("ActiveParent must have a focusedChild");
                    return false;
                }
                int iOrdinal2 = ba4VarC.a0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (a(ba4VarC, aVar) || c(ba4Var, ba4VarC, 2, aVar) || (ba4VarC.e2().a && ((Boolean) aVar.invoke(ba4VarC)).booleanValue())) {
                            return true;
                        }
                        return false;
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            u.b();
                            return false;
                        }
                        aa0.c("ActiveParent must have a focusedChild");
                        return false;
                    }
                }
                return c(ba4Var, ba4VarC, 2, aVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    u.b();
                    return false;
                }
                if (!d(ba4Var, aVar)) {
                    if (!(ba4Var.e2().a ? ((Boolean) aVar.invoke(ba4Var)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return d(ba4Var, aVar);
    }

    public static final boolean b(ba4 ba4Var, h94.a aVar) {
        int iOrdinal = ba4Var.a0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ba4 ba4VarC = fa4.c(ba4Var);
                if (ba4VarC != null) {
                    return b(ba4VarC, aVar) || c(ba4Var, ba4VarC, 1, aVar);
                }
                aa0.c("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return ba4Var.e2().a ? ((Boolean) aVar.invoke(ba4Var)).booleanValue() : e(ba4Var, aVar);
                }
                u.b();
                return false;
            }
        }
        return e(ba4Var, aVar);
    }

    public static final boolean c(ba4 ba4Var, ba4 ba4Var2, int i, h94.a aVar) {
        if (f(ba4Var, ba4Var2, i, aVar)) {
            return true;
        }
        Boolean bool = (Boolean) np0.a(ba4Var, i, new bk7(ew2.g(ba4Var).getFocusOwner().v(), ba4Var, ba4Var2, i, aVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean d(ba4 ba4Var, h94.a aVar) {
        Object[] objArr = new ba4[16];
        if (!ba4Var.t.G) {
            uc5.b("visitChildren called on an unattached node");
        }
        k37 k37Var = new k37(new ox6.c[16]);
        ox6.c cVar = ba4Var.t;
        ox6.c cVar2 = cVar.y;
        if (cVar2 == null) {
            ew2.a(k37Var, cVar);
        } else {
            k37Var.d(cVar2);
        }
        int i = 0;
        while (true) {
            int i2 = k37Var.v;
            if (i2 == 0) {
                break;
            }
            ox6.c cVarB = (ox6.c) k37Var.o(i2 - 1);
            if ((cVarB.w & 1024) == 0) {
                ew2.a(k37Var, cVarB);
            } else {
                while (cVarB != null) {
                    if ((cVarB.v & 1024) != 0) {
                        k37 k37Var2 = null;
                        while (cVarB != null) {
                            if (cVarB instanceof ba4) {
                                ba4 ba4Var2 = (ba4) cVarB;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = ba4Var2;
                                i = i3;
                            } else if ((cVarB.v & 1024) != 0 && (cVarB instanceof gw2)) {
                                int i4 = 0;
                                for (ox6.c cVar3 = ((gw2) cVarB).I; cVar3 != null; cVar3 = cVar3.y) {
                                    if ((cVar3.v & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            cVarB = cVar3;
                                        } else {
                                            if (k37Var2 == null) {
                                                k37Var2 = new k37(new ox6.c[16]);
                                            }
                                            if (cVarB != null) {
                                                k37Var2.d(cVarB);
                                                cVarB = null;
                                            }
                                            k37Var2.d(cVar3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            cVarB = ew2.b(k37Var2);
                        }
                        break;
                    }
                    cVarB = cVarB.y;
                }
            }
        }
        Arrays.sort(objArr, 0, i, ga4.u);
        int i5 = i - 1;
        if (i5 < objArr.length) {
            while (i5 >= 0) {
                ba4 ba4Var3 = (ba4) objArr[i5];
                if (fa4.d(ba4Var3) && a(ba4Var3, aVar)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    public static final boolean e(ba4 ba4Var, h94.a aVar) {
        Object[] objArr = new ba4[16];
        if (!ba4Var.t.G) {
            uc5.b("visitChildren called on an unattached node");
        }
        k37 k37Var = new k37(new ox6.c[16]);
        ox6.c cVar = ba4Var.t;
        ox6.c cVar2 = cVar.y;
        if (cVar2 == null) {
            ew2.a(k37Var, cVar);
        } else {
            k37Var.d(cVar2);
        }
        int i = 0;
        while (true) {
            int i2 = k37Var.v;
            if (i2 == 0) {
                break;
            }
            ox6.c cVarB = (ox6.c) k37Var.o(i2 - 1);
            if ((cVarB.w & 1024) == 0) {
                ew2.a(k37Var, cVarB);
            } else {
                while (cVarB != null) {
                    if ((cVarB.v & 1024) != 0) {
                        k37 k37Var2 = null;
                        while (cVarB != null) {
                            if (cVarB instanceof ba4) {
                                ba4 ba4Var2 = (ba4) cVarB;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = ba4Var2;
                                i = i3;
                            } else if ((cVarB.v & 1024) != 0 && (cVarB instanceof gw2)) {
                                int i4 = 0;
                                for (ox6.c cVar3 = ((gw2) cVarB).I; cVar3 != null; cVar3 = cVar3.y) {
                                    if ((cVar3.v & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            cVarB = cVar3;
                                        } else {
                                            if (k37Var2 == null) {
                                                k37Var2 = new k37(new ox6.c[16]);
                                            }
                                            if (cVarB != null) {
                                                k37Var2.d(cVarB);
                                                cVarB = null;
                                            }
                                            k37Var2.d(cVar3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            cVarB = ew2.b(k37Var2);
                        }
                        break;
                    }
                    cVarB = cVarB.y;
                }
            }
        }
        Arrays.sort(objArr, 0, i, ga4.u);
        for (int i5 = 0; i5 < i; i5++) {
            ba4 ba4Var3 = (ba4) objArr[i5];
            if (fa4.d(ba4Var3) && b(ba4Var3, aVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014a  */
    /* JADX WARN: Code duplicated, block: B:129:0x019a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0138 A[ADDED_TO_REGION, LOOP:6: B:92:0x0138->B:120:0x0185, LOOP_START, PHI: r13
      0x0138: PHI (r13v12 ox6$c) = (r13v7 ox6$c), (r13v13 ox6$c) binds: [B:91:0x0136, B:120:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x013a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0140  */
    /* JADX WARN: Code duplicated, block: B:97:0x0144  */
    public static final boolean f(ba4 ba4Var, ba4 ba4Var2, int i, h94.a aVar) {
        ox6.c cVar;
        ox6.c cVar2;
        qr5 qr5VarF;
        kb7 kb7Var;
        ox6.c cVarB;
        k37 k37Var;
        if (ba4Var.a0() != w94.u) {
            aa0.c("This function should only be used within a parent that has focus.");
            return false;
        }
        Object[] objArr = new ba4[16];
        if (!ba4Var.t.G) {
            uc5.b("visitChildren called on an unattached node");
        }
        k37 k37Var2 = new k37(new ox6.c[16]);
        ox6.c cVar3 = ba4Var.t;
        ox6.c cVar4 = cVar3.y;
        if (cVar4 == null) {
            ew2.a(k37Var2, cVar3);
        } else {
            k37Var2.d(cVar4);
        }
        int i2 = 0;
        while (true) {
            int i3 = k37Var2.v;
            cVar = null;
            if (i3 == 0) {
                break;
            }
            ox6.c cVarB2 = (ox6.c) k37Var2.o(i3 - 1);
            if ((cVarB2.w & 1024) == 0) {
                ew2.a(k37Var2, cVarB2);
            } else {
                while (cVarB2 != null) {
                    if ((cVarB2.v & 1024) != 0) {
                        k37 k37Var3 = null;
                        while (cVarB2 != null) {
                            if (cVarB2 instanceof ba4) {
                                ba4 ba4Var3 = (ba4) cVarB2;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = ba4Var3;
                                i2 = i4;
                            } else if ((cVarB2.v & 1024) != 0 && (cVarB2 instanceof gw2)) {
                                int i5 = 0;
                                for (ox6.c cVar5 = ((gw2) cVarB2).I; cVar5 != null; cVar5 = cVar5.y) {
                                    if ((cVar5.v & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            cVarB2 = cVar5;
                                        } else {
                                            if (k37Var3 == null) {
                                                k37Var3 = new k37(new ox6.c[16]);
                                            }
                                            if (cVarB2 != null) {
                                                k37Var3.d(cVarB2);
                                                cVarB2 = null;
                                            }
                                            k37Var3.d(cVar5);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            cVarB2 = ew2.b(k37Var3);
                        }
                        break;
                    }
                    cVarB2 = cVarB2.y;
                }
            }
        }
        Arrays.sort(objArr, 0, i2, ga4.u);
        if (i != 1) {
            if (i != 2) {
                aa0.c("This function should only be used for 1-D focus search");
                return false;
            }
            fg5 fg5VarJ = uh8.j(0, i2);
            int i6 = fg5VarJ.t;
            int i7 = fg5VarJ.u;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        ba4 ba4Var4 = (ba4) objArr[i7];
                        if (fa4.d(ba4Var4) && a(ba4Var4, aVar)) {
                            return true;
                        }
                    }
                    if (xj5.a(objArr[i7], ba4Var2)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
            if (i != 1) {
                if (!ba4Var.t.G) {
                    uc5.b("visitAncestors called on an unattached node");
                }
                cVar2 = ba4Var.t.x;
                qr5VarF = ew2.f(ba4Var);
                loop5: while (qr5VarF != null) {
                    if ((qr5VarF.Y.f.w & 1024) != 0) {
                        while (cVar2 != null) {
                            if ((cVar2.v & 1024) != 0) {
                                cVarB = cVar2;
                                k37Var = null;
                                while (cVarB != null) {
                                    if (cVarB instanceof ba4) {
                                        cVar = cVarB;
                                        break loop5;
                                    }
                                    if ((cVarB.v & 1024) == 0) {
                                    }
                                    cVarB = ew2.b(k37Var);
                                }
                            }
                            cVar2 = cVar2.x;
                        }
                    }
                    qr5VarF = qr5VarF.I();
                    if (qr5VarF != null) {
                    }
                }
                if (cVar != null) {
                    return ((Boolean) aVar.invoke(ba4Var)).booleanValue();
                }
            }
            return false;
        }
        fg5 fg5VarJ2 = uh8.j(0, i2);
        int i8 = fg5VarJ2.t;
        int i9 = fg5VarJ2.u;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    ba4 ba4Var5 = (ba4) objArr[i8];
                    if (fa4.d(ba4Var5) && b(ba4Var5, aVar)) {
                        return true;
                    }
                }
                if (xj5.a(objArr[i8], ba4Var2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
        }
        if (i != 1 && ba4Var.e2().a) {
            if (!ba4Var.t.G) {
                uc5.b("visitAncestors called on an unattached node");
            }
            cVar2 = ba4Var.t.x;
            qr5VarF = ew2.f(ba4Var);
            loop5: while (qr5VarF != null) {
                if ((qr5VarF.Y.f.w & 1024) != 0) {
                    while (cVar2 != null) {
                        if ((cVar2.v & 1024) != 0) {
                            cVarB = cVar2;
                            k37Var = null;
                            while (cVarB != null) {
                                if (cVarB instanceof ba4) {
                                    cVar = cVarB;
                                    break loop5;
                                }
                                if ((cVarB.v & 1024) == 0 && (cVarB instanceof gw2)) {
                                    int i10 = 0;
                                    for (ox6.c cVar6 = ((gw2) cVarB).I; cVar6 != null; cVar6 = cVar6.y) {
                                        if ((cVar6.v & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                cVarB = cVar6;
                                            } else {
                                                if (k37Var == null) {
                                                    k37Var = new k37(new ox6.c[16]);
                                                }
                                                if (cVarB != null) {
                                                    k37Var.d(cVarB);
                                                    cVarB = null;
                                                }
                                                k37Var.d(cVar6);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                cVarB = ew2.b(k37Var);
                            }
                        }
                        cVar2 = cVar2.x;
                    }
                }
                qr5VarF = qr5VarF.I();
                cVar2 = (qr5VarF != null || (kb7Var = qr5VarF.Y) == null) ? null : kb7Var.e;
            }
            if (cVar != null) {
                return ((Boolean) aVar.invoke(ba4Var)).booleanValue();
            }
        }
        return false;
    }
}
