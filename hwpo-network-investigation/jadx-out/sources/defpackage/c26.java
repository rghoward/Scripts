package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c26 implements s79 {
    public static final au3 x = xa6.b(new z16(), new tm2(1));
    public boolean a;
    public q16 b;
    public final u16 c;
    public final dt7 d = new dt7(r16.a, ha7.u);
    public final h16 e = new h16();
    public final dt7 f;
    public final dt7 g;
    public fm8 h;
    public final b26 i;
    public final xg0 j;
    public final kv5 k;
    public final boolean l;
    public final lx5 m;
    public final ht2 n;
    public float o;
    public int p;
    public final e27<lx5.b> q;
    public final i27 r;
    public final kx5 s;
    public final vv5<s16> t;
    public final h37<g2b> u;
    public final h37<g2b> v;
    public final nx5 w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState", f = "LazyStaggeredGridState.kt", l = {282, 284}, m = "scroll", v = 1)
    public static final class a extends u02 {
        public o37 t;
        public p6a u;
        public /* synthetic */ Object v;
        public int x;

        public a(r02<? super a> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return c26.this.c(null, null, this);
        }
    }

    public c26(int[] iArr, int[] iArr2) {
        this.c = new u16(iArr, iArr2, new d26(2, this, c26.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0));
        Boolean bool = Boolean.FALSE;
        this.f = bl7.i(bool);
        this.g = bl7.i(bool);
        this.i = new b26(this);
        this.j = new xg0();
        this.k = new kv5();
        this.l = true;
        this.m = new lx5(null, null);
        this.n = new ht2(new a26(0, this));
        this.p = -1;
        e27 e27Var = ag5.a;
        this.q = new e27<>();
        this.r = new i27();
        this.s = new kx5();
        this.t = new vv5<>();
        this.u = f18.a();
        this.v = f18.a();
        this.w = new nx5();
    }

    @Override // defpackage.s79
    public final boolean a() {
        return this.n.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s79
    public final boolean b() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r6.n.c(r7, r8, r0) == r5) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.s79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.o37 r7, defpackage.ci4<? super defpackage.t69, ? super defpackage.r02<? super defpackage.g2b>, ? extends java.lang.Object> r8, defpackage.r02<? super defpackage.g2b> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof c26.a
            if (r0 == 0) goto L13
            r0 = r9
            c26$a r0 = (c26.a) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            c26$a r0 = new c26$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.v
            int r1 = r0.x
            r2 = 0
            r3 = 2
            r4 = 1
            v72 r5 = defpackage.v72.t
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.dv8.b(r9)
            goto L6a
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r6)
            return r2
        L31:
            p6a r7 = r0.u
            r8 = r7
            ci4 r8 = (defpackage.ci4) r8
            o37 r7 = r0.t
            defpackage.dv8.b(r9)
            goto L5b
        L3c:
            defpackage.dv8.b(r9)
            dt7 r9 = r6.d
            java.lang.Object r9 = r9.getValue()
            q16 r1 = defpackage.r16.a
            if (r9 != r1) goto L5b
            r0.t = r7
            r9 = r8
            p6a r9 = (defpackage.p6a) r9
            r0.u = r9
            r0.x = r4
            xg0 r9 = r6.j
            java.lang.Object r9 = r9.c(r0)
            if (r9 != r5) goto L5b
            goto L69
        L5b:
            r0.t = r2
            r0.u = r2
            r0.x = r3
            ht2 r6 = r6.n
            java.lang.Object r6 = r6.c(r7, r8, r0)
            if (r6 != r5) goto L6a
        L69:
            return r5
        L6a:
            g2b r6 = defpackage.g2b.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c26.c(o37, ci4, r02):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s79
    public final boolean d() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    @Override // defpackage.s79
    public final float e(float f) {
        return this.n.e(f);
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0140 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0142 A[LOOP:1: B:62:0x0106->B:72:0x0142, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x0146 A[EDGE_INSN: B:95:0x0146->B:73:0x0146 BREAK  A[LOOP:1: B:62:0x0106->B:72:0x0142], SYNTHETIC] */
    public final void f(q16 q16Var, boolean z, boolean z2) {
        s16 s16Var;
        oh4<Object, g2b> oh4VarE;
        u16 u16Var = this.c;
        nx5 nx5Var = this.w;
        if (!z && this.a) {
            this.b = q16Var;
            hu9 hu9VarA = hu9.a.a();
            oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
            hu9 hu9VarB = hu9.a.b(hu9VarA);
            try {
                if (nx5Var.a() && Arrays.equals(q16Var.a, u16Var.b) && Arrays.equals(q16Var.b, u16Var.d)) {
                    nx5Var.b();
                }
                g2b g2bVar = g2b.a;
                return;
            } finally {
                hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
            }
        }
        if (z) {
            this.a = true;
        }
        float f = this.o;
        float f2 = q16Var.c;
        List<s16> list = q16Var.m;
        int[] iArr = q16Var.a;
        int[] iArr2 = q16Var.b;
        this.o = f - f2;
        this.d.setValue(q16Var);
        if (z2) {
            u16Var.d = iArr2;
            u16Var.e.j(u16.b(u16Var.b, iArr2));
        } else {
            u16Var.getClass();
            int iA = u16.a(iArr);
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    s16Var = null;
                    break;
                }
                s16Var = list.get(i);
                if (s16Var.a == iA) {
                    break;
                } else {
                    i++;
                }
            }
            s16 s16Var2 = s16Var;
            u16Var.g = s16Var2 != null ? s16Var2.b : null;
            u16Var.h.d(iA);
            if (u16Var.f || q16Var.l > 0) {
                u16Var.f = true;
                hu9 hu9VarA2 = hu9.a.a();
                oh4VarE = hu9VarA2 != null ? hu9VarA2.e() : null;
                hu9 hu9VarB2 = hu9.a.b(hu9VarA2);
                try {
                    u16Var.b = iArr;
                    u16Var.c.j(u16.a(iArr));
                    u16Var.d = iArr2;
                    u16Var.e.j(u16.b(iArr, iArr2));
                    g2b g2bVar2 = g2b.a;
                    hu9.a.d(hu9VarA2, hu9VarB2, oh4VarE);
                } catch (Throwable th) {
                    hu9.a.d(hu9VarA2, hu9VarB2, oh4VarE);
                    throw th;
                }
            }
            if (this.p != -1 && !list.isEmpty()) {
                int index = ((w06) th1.y(list)).getIndex();
                int index2 = ((w06) th1.G(list)).getIndex();
                int i2 = this.p;
                if (index > i2 || i2 > index2) {
                    this.p = -1;
                    e27<lx5.b> e27Var = this.q;
                    Object[] objArr = e27Var.c;
                    long[] jArr = e27Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i3 != length) {
                                    break;
                                    break;
                                }
                                i3++;
                            } else {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((j & 255) < 128) {
                                        ((lx5.b) objArr[(i3 << 3) + i5]).cancel();
                                    }
                                    j >>= 8;
                                }
                                if (i4 != 8) {
                                    break;
                                } else if (i3 != length) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    e27Var.c();
                }
            }
        }
        this.g.setValue(Boolean.valueOf(iArr[0] != 0 || iArr2[0] > 0));
        this.f.setValue(Boolean.valueOf(q16Var.f));
        if (z) {
            nx5Var.c(q16Var.e, q16Var.k, q16Var.t);
        }
    }

    public final i16 g() {
        return (i16) this.d.getValue();
    }

    public final void h(float f, q16 q16Var) {
        e27<lx5.b> e27Var;
        int iD;
        long jH;
        if (!this.l || q16Var.m.isEmpty()) {
            return;
        }
        boolean z = f < 0.0f;
        List<s16> list = q16Var.m;
        int i = z ? ((s16) th1.G(list)).a : ((s16) th1.y(list)).a;
        if (i == this.p) {
            return;
        }
        this.p = i;
        f27 f27VarA = jg5.a();
        int[] iArr = q16Var.i.b;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            e27Var = this.q;
            if (i2 >= length) {
                break;
            }
            h16 h16Var = this.e;
            if (z) {
                iD = i + 1;
                int length2 = h16Var.a + h16Var.b.length;
                while (true) {
                    if (iD >= length2) {
                        iD = h16Var.a + h16Var.b.length;
                        break;
                    } else if (h16Var.a(iD, i2)) {
                        break;
                    } else {
                        iD++;
                    }
                }
            } else {
                iD = h16Var.d(i, i2);
            }
            int i3 = iD;
            if (i3 < 0 || i3 >= q16Var.l || f27VarA.c(i3)) {
                break;
            }
            f27VarA.b[f27VarA.d(i3)] = i3;
            if (!e27Var.a(i3)) {
                q16Var.j.a(i3);
                int i4 = iArr[i2];
                if (q16Var.u == fl7.t) {
                    if (i4 < 0) {
                        wc5.a("width must be >= 0");
                    }
                    jH = zx1.h(i4, i4, 0, Integer.MAX_VALUE);
                } else {
                    if (i4 < 0) {
                        wc5.a("height must be >= 0");
                    }
                    jH = zx1.h(0, Integer.MAX_VALUE, i4, i4);
                }
                e27Var.i(i3, this.m.a(i3, jH, true, null));
            }
            i2++;
            i = i3;
        }
        long[] jArr = e27Var.a;
        int length3 = jArr.length - 2;
        if (length3 < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j = jArr[i5];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i5 - length3)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j) < 128) {
                        int i8 = (i5 << 3) + i7;
                        int i9 = e27Var.b[i8];
                        lx5.b bVar = (lx5.b) e27Var.c[i8];
                        boolean zC = f27VarA.c(i9);
                        if (!zC) {
                            bVar.cancel();
                        }
                        if (!zC) {
                            e27Var.h(i8);
                        }
                    }
                    j >>= 8;
                }
                if (i6 != 8) {
                    return;
                }
            }
            if (i5 == length3) {
                return;
            } else {
                i5++;
            }
        }
    }
}
