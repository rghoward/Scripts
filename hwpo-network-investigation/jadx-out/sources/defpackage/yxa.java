package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yxa<K, V> {
    public static final yxa e = new yxa(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final x17 c;
    public Object[] d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<K, V> {
        public yxa<K, V> a;
        public final int b;

        public a(yxa<K, V> yxaVar, int i) {
            this.a = yxaVar;
            this.b = i;
        }
    }

    public yxa(int i, int i2, Object[] objArr, x17 x17Var) {
        this.a = i;
        this.b = i2;
        this.c = x17Var;
        this.d = objArr;
    }

    public static yxa j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, x17 x17Var) {
        if (i3 > 30) {
            return new yxa(0, 0, new Object[]{obj, obj2, obj3, obj4}, x17Var);
        }
        int iG = hu1.g(i, i3);
        int iG2 = hu1.g(i2, i3);
        if (iG != iG2) {
            return new yxa((1 << iG) | (1 << iG2), 0, iG < iG2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, x17Var);
        }
        return new yxa(0, 1 << iG, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, x17Var)}, x17Var);
    }

    public final Object[] a(int i, int i2, int i3, K k, V v, int i4, x17 x17Var) {
        Object obj = this.d[i];
        yxa yxaVarJ = j(obj != null ? obj.hashCode() : 0, obj, x(i), i3, k, v, i4 + 5, x17Var);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        gz3.i(0, i, 6, objArr, objArr2);
        gz3.f(i, i + 2, i5, objArr, objArr2);
        objArr2[iT - 1] = yxaVarJ;
        gz3.f(iT, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final boolean c(K k) {
        dg5 dg5VarI = uh8.i(uh8.j(0, this.d.length), 2);
        int i = dg5VarI.t;
        int i2 = dg5VarI.u;
        int i3 = dg5VarI.v;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!xj5.a(k, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(int i, int i2, Object obj) {
        int iG = 1 << hu1.g(i, i2);
        if (h(iG)) {
            return xj5.a(obj, this.d[f(iG)]);
        }
        if (!i(iG)) {
            return false;
        }
        yxa<K, V> yxaVarS = s(t(iG));
        return i2 == 30 ? yxaVarS.c(obj) : yxaVarS.d(i, i2 + 5, obj);
    }

    public final boolean e(yxa<K, V> yxaVar) {
        if (this == yxaVar) {
            return true;
        }
        if (this.b == yxaVar.b && this.a == yxaVar.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == yxaVar.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int iG = 1 << hu1.g(i, i2);
        if (h(iG)) {
            int iF = f(iG);
            if (xj5.a(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iG)) {
            return null;
        }
        yxa<K, V> yxaVarS = s(t(iG));
        if (i2 != 30) {
            return yxaVarS.g(i, i2 + 5, obj);
        }
        dg5 dg5VarI = uh8.i(uh8.j(0, yxaVarS.d.length), 2);
        int i3 = dg5VarI.t;
        int i4 = dg5VarI.u;
        int i5 = dg5VarI.v;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!xj5.a(obj, yxaVarS.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return yxaVarS.x(i3);
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final yxa<K, V> k(int i, sw7<K, V> sw7Var) {
        sw7Var.b(sw7Var.x - 1);
        sw7Var.v = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != sw7Var.t) {
            return new yxa<>(0, 0, hu1.c(i, objArr), sw7Var.t);
        }
        this.d = hu1.c(i, objArr);
        return this;
    }

    public final yxa<K, V> l(int i, K k, V v, int i2, sw7<K, V> sw7Var) {
        sw7<K, V> sw7Var2;
        yxa<K, V> yxaVarL;
        int iG = 1 << hu1.g(i, i2);
        boolean zH = h(iG);
        x17 x17Var = this.c;
        if (zH) {
            int iF = f(iG);
            if (!xj5.a(k, this.d[iF])) {
                sw7Var.b(sw7Var.x + 1);
                x17 x17Var2 = sw7Var.t;
                if (x17Var != x17Var2) {
                    return new yxa<>(this.a ^ iG, this.b | iG, a(iF, iG, i, k, v, i2, x17Var2), x17Var2);
                }
                this.d = a(iF, iG, i, k, v, i2, x17Var2);
                this.a ^= iG;
                this.b |= iG;
                return this;
            }
            sw7Var.v = x(iF);
            if (x(iF) == v) {
                return this;
            }
            if (x17Var == sw7Var.t) {
                this.d[iF + 1] = v;
                return this;
            }
            sw7Var.w++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = v;
            return new yxa<>(this.a, this.b, objArrCopyOf, sw7Var.t);
        }
        if (!i(iG)) {
            sw7Var.b(sw7Var.x + 1);
            x17 x17Var3 = sw7Var.t;
            int iF2 = f(iG);
            Object[] objArr2 = this.d;
            if (x17Var != x17Var3) {
                return new yxa<>(this.a | iG, this.b, hu1.b(objArr2, iF2, k, v), x17Var3);
            }
            this.d = hu1.b(objArr2, iF2, k, v);
            this.a |= iG;
            return this;
        }
        int iT = t(iG);
        yxa<K, V> yxaVarS = s(iT);
        if (i2 == 30) {
            dg5 dg5VarI = uh8.i(uh8.j(0, yxaVarS.d.length), 2);
            int i3 = dg5VarI.t;
            int i4 = dg5VarI.u;
            int i5 = dg5VarI.v;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!xj5.a(k, yxaVarS.d[i3])) {
                        if (i3 == i4) {
                            sw7Var.b(sw7Var.x + 1);
                            yxaVarL = new yxa<>(0, 0, hu1.b(yxaVarS.d, 0, k, v), sw7Var.t);
                            break;
                        }
                        i3 += i5;
                    } else {
                        sw7Var.v = yxaVarS.x(i3);
                        if (yxaVarS.c != sw7Var.t) {
                            sw7Var.w++;
                            Object[] objArr3 = yxaVarS.d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                            objArrCopyOf2[i3 + 1] = v;
                            yxaVarL = new yxa<>(0, 0, objArrCopyOf2, sw7Var.t);
                            break;
                        }
                        yxaVarS.d[i3 + 1] = v;
                        yxaVarL = yxaVarS;
                        break;
                    }
                }
            } else {
                sw7Var.b(sw7Var.x + 1);
                yxaVarL = new yxa<>(0, 0, hu1.b(yxaVarS.d, 0, k, v), sw7Var.t);
                break;
            }
            sw7Var2 = sw7Var;
        } else {
            sw7Var2 = sw7Var;
            yxaVarL = yxaVarS.l(i, k, v, i2 + 5, sw7Var2);
        }
        return yxaVarS == yxaVarL ? this : r(iT, yxaVarL, sw7Var2.t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r27v0, types: [yxa, yxa<K, V>] */
    /* JADX WARN: Type inference failed for: r4v18, types: [yxa] */
    /* JADX WARN: Type inference failed for: r5v14, types: [yxa] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v20, types: [yxa] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v26, types: [yxa] */
    /* JADX WARN: Type inference failed for: r5v28, types: [yxa] */
    /* JADX WARN: Type inference failed for: r5v29, types: [yxa] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type yxa<K, V> to ?? for r27v0 'this'  ??
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:139)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.inline(CodeShrinkVisitor.java:212)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:73)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:48)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:39)
        */
    public final defpackage.yxa<K, V> m(defpackage.yxa<K, V> r28, int r29, defpackage.sx2 r30, defpackage.sw7<K, V> r31) {
        /*
            Method dump skipped, instruction units count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yxa.m(yxa, int, sx2, sw7):yxa");
    }

    public final yxa<K, V> n(int i, K k, int i2, sw7<K, V> sw7Var) {
        yxa<K, V> yxaVarN;
        int iG = 1 << hu1.g(i, i2);
        if (h(iG)) {
            int iF = f(iG);
            if (xj5.a(k, this.d[iF])) {
                return p(iF, iG, sw7Var);
            }
        } else if (i(iG)) {
            int iT = t(iG);
            yxa<K, V> yxaVarS = s(iT);
            if (i2 == 30) {
                dg5 dg5VarI = uh8.i(uh8.j(0, yxaVarS.d.length), 2);
                int i3 = dg5VarI.t;
                int i4 = dg5VarI.u;
                int i5 = dg5VarI.v;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!xj5.a(k, yxaVarS.d[i3])) {
                            if (i3 == i4) {
                                yxaVarN = yxaVarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            yxaVarN = yxaVarS.k(i3, sw7Var);
                            break;
                        }
                    }
                } else {
                    yxaVarN = yxaVarS;
                    break;
                }
            } else {
                yxaVarN = yxaVarS.n(i, k, i2 + 5, sw7Var);
            }
            return q(yxaVarS, yxaVarN, iT, iG, sw7Var.t);
        }
        return this;
    }

    public final yxa<K, V> o(int i, K k, V v, int i2, sw7<K, V> sw7Var) {
        sw7<K, V> sw7Var2;
        yxa<K, V> yxaVarO;
        int iG = 1 << hu1.g(i, i2);
        if (h(iG)) {
            int iF = f(iG);
            return (xj5.a(k, this.d[iF]) && xj5.a(v, x(iF))) ? p(iF, iG, sw7Var) : this;
        }
        if (!i(iG)) {
            return this;
        }
        int iT = t(iG);
        yxa<K, V> yxaVarS = s(iT);
        if (i2 == 30) {
            dg5 dg5VarI = uh8.i(uh8.j(0, yxaVarS.d.length), 2);
            int i3 = dg5VarI.t;
            int i4 = dg5VarI.u;
            int i5 = dg5VarI.v;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!xj5.a(k, yxaVarS.d[i3]) || !xj5.a(v, yxaVarS.x(i3))) {
                        if (i3 == i4) {
                            yxaVarO = yxaVarS;
                            break;
                        }
                        i3 += i5;
                    } else {
                        yxaVarO = yxaVarS.k(i3, sw7Var);
                        break;
                    }
                }
            } else {
                yxaVarO = yxaVarS;
                break;
            }
            sw7Var2 = sw7Var;
        } else {
            sw7Var2 = sw7Var;
            yxaVarO = yxaVarS.o(i, k, v, i2 + 5, sw7Var2);
        }
        return q(yxaVarS, yxaVarO, iT, iG, sw7Var2.t);
    }

    public final yxa<K, V> p(int i, int i2, sw7<K, V> sw7Var) {
        sw7Var.b(sw7Var.x - 1);
        sw7Var.v = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != sw7Var.t) {
            return new yxa<>(i2 ^ this.a, this.b, hu1.c(i, objArr), sw7Var.t);
        }
        this.d = hu1.c(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final yxa<K, V> q(yxa<K, V> yxaVar, yxa<K, V> yxaVar2, int i, int i2, x17 x17Var) {
        x17 x17Var2 = this.c;
        if (yxaVar2 != null) {
            return (x17Var2 == x17Var || yxaVar != yxaVar2) ? r(i, yxaVar2, x17Var) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (x17Var2 != x17Var) {
            return new yxa<>(this.a, this.b ^ i2, hu1.d(i, objArr), x17Var);
        }
        this.d = hu1.d(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final yxa<K, V> r(int i, yxa<K, V> yxaVar, x17 x17Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && yxaVar.d.length == 2 && yxaVar.b == 0) {
            yxaVar.a = this.b;
            return yxaVar;
        }
        if (this.c == x17Var) {
            objArr[i] = yxaVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = yxaVar;
        return new yxa<>(this.a, this.b, objArrCopyOf, x17Var);
    }

    public final yxa<K, V> s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (yxa) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
    
        if (r13 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
    
        if (r13 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d2, code lost:
    
        r13.a = w(r11, r4, r13.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00da, code lost:
    
        return r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yxa.a u(int r12, int r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yxa.u(int, int, java.lang.Object, java.lang.Object):yxa$a");
    }

    public final yxa v(int i, int i2, Object obj) {
        yxa<K, V> yxaVarV;
        int iG = 1 << hu1.g(i, i2);
        if (h(iG)) {
            int iF = f(iG);
            if (!xj5.a(obj, this.d[iF])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new yxa(this.a ^ iG, this.b, hu1.c(iF, objArr), null);
            }
        } else {
            if (!i(iG)) {
                return this;
            }
            int iT = t(iG);
            yxa<K, V> yxaVarS = s(iT);
            if (i2 == 30) {
                dg5 dg5VarI = uh8.i(uh8.j(0, yxaVarS.d.length), 2);
                int i3 = dg5VarI.t;
                int i4 = dg5VarI.u;
                int i5 = dg5VarI.v;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!xj5.a(obj, yxaVarS.d[i3])) {
                            if (i3 == i4) {
                                yxaVarV = yxaVarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            Object[] objArr2 = yxaVarS.d;
                            if (objArr2.length != 2) {
                                yxaVarV = new yxa<>(0, 0, hu1.c(i3, objArr2), null);
                                break;
                            }
                            yxaVarV = null;
                            break;
                        }
                    }
                } else {
                    yxaVarV = yxaVarS;
                    break;
                }
            } else {
                yxaVarV = yxaVarS.v(i, i2 + 5, obj);
            }
            if (yxaVarV != null) {
                return yxaVarS != yxaVarV ? w(iT, iG, yxaVarV) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new yxa(this.a, this.b ^ iG, hu1.d(iT, objArr3), null);
            }
        }
        return null;
    }

    public final yxa<K, V> w(int i, int i2, yxa<K, V> yxaVar) {
        Object[] objArr = yxaVar.d;
        if (objArr.length != 2 || yxaVar.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = yxaVar;
            return new yxa<>(this.a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            yxaVar.a = this.b;
            return yxaVar;
        }
        int iF = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        gz3.f(i + 2, i + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        gz3.f(iF + 2, iF, i, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new yxa<>(this.a ^ i2, this.b ^ i2, objArrCopyOf2, null);
    }

    public final V x(int i) {
        return (V) this.d[i + 1];
    }
}
