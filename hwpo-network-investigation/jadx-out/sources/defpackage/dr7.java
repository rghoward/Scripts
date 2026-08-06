package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dr7 implements s79 {
    public final h37<g2b> A;
    public final dt7 B;
    public final dt7 C;
    public final dt7 D;
    public final dt7 E;
    public boolean a;
    public pq7 b;
    public final dt7 c;
    public final sq7 d;
    public int e;
    public int f;
    public long g;
    public long h;
    public float i;
    public float j;
    public final ht2 k;
    public final boolean l;
    public final dt7 m;
    public tx2 n;
    public int o;
    public final i27 p;
    public final bt7 q;
    public final bt7 r;
    public final lx5 s;
    public final tp7 t;
    public final kv5 u;
    public final xg0 v;
    public final dt7 w;
    public final br7 x;
    public final kx5 y;
    public final h37<g2b> z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {691, 696}, m = "scroll$suspendImpl", v = 1)
    public static final class a extends u02 {
        public dr7 t;
        public o37 u;
        public p6a v;
        public /* synthetic */ Object w;
        public int y;

        public a(r02<? super a> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.w = obj;
            this.y |= Integer.MIN_VALUE;
            return dr7.t(dr7.this, null, null, this);
        }
    }

    public dr7(float f, int i) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            xc5.a("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.c = bl7.i(new vf7(0L));
        this.d = new sq7(i, f, this);
        this.e = i;
        this.g = Long.MAX_VALUE;
        this.k = new ht2(new oh4() { // from class: xq7
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Long] */
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                pq7 pq7Var;
                ?? ValueOf = (Float) obj;
                float fFloatValue = ValueOf.floatValue();
                dr7 dr7Var = this.t;
                long jD = zv.d(dr7Var);
                float f2 = dr7Var.i + fFloatValue;
                long jC = wk6.c(f2);
                dr7Var.i = f2 - jC;
                if (Math.abs(fFloatValue) >= 1.0E-4f) {
                    long j = jD + jC;
                    long jH = uh8.h(j, dr7Var.h, dr7Var.g);
                    boolean z = j != jH;
                    long j2 = jH - jD;
                    float f3 = j2;
                    dr7Var.j = f3;
                    if (Math.abs(j2) != 0) {
                        dr7Var.D.setValue(Boolean.valueOf(f3 > 0.0f));
                        dr7Var.E.setValue(Boolean.valueOf(f3 < 0.0f));
                    }
                    int i2 = (int) j2;
                    int i3 = -i2;
                    pq7 pq7VarO = ((pq7) dr7Var.m.getValue()).o(i3);
                    if (pq7VarO != null && (pq7Var = dr7Var.b) != null) {
                        pq7 pq7VarO2 = pq7Var.o(i3);
                        if (pq7VarO2 != null) {
                            dr7Var.b = pq7VarO2;
                        } else {
                            pq7VarO = null;
                        }
                    }
                    if (pq7VarO != null) {
                        dr7Var.h(pq7VarO, dr7Var.a, true);
                        f18.b(dr7Var.z);
                    } else {
                        sq7 sq7Var = dr7Var.d;
                        dr7 dr7Var2 = sq7Var.a;
                        at7 at7Var = sq7Var.c;
                        at7Var.g(at7Var.h() + (dr7Var2.q() != 0 ? i2 / dr7Var2.q() : 0.0f));
                        fm8 fm8Var = (fm8) dr7Var.w.getValue();
                        if (fm8Var != null) {
                            fm8Var.i();
                        }
                    }
                    if (z) {
                        ValueOf = Long.valueOf(j2);
                    }
                    fFloatValue = ValueOf.floatValue();
                }
                return Float.valueOf(fFloatValue);
            }
        });
        int i2 = 1;
        this.l = true;
        this.m = new dt7(hr7.b, ha7.u);
        this.n = hr7.a;
        this.p = new i27();
        this.q = new bt7(-1);
        this.r = new bt7(i);
        d3a d3aVar = d3a.u;
        bl7.g(new gb3(3, this), d3aVar);
        bl7.g(new hb3(i2, this), d3aVar);
        lx5 lx5Var = new lx5(null, new gr3(i2, this));
        this.s = lx5Var;
        this.t = new tp7(new ar7(this), lx5Var, new ib3(1, this));
        this.u = new kv5();
        this.v = new xg0();
        this.w = bl7.i(null);
        this.x = new br7(this);
        zx1.b(0, 0, 0, 0, 15);
        this.y = new kx5();
        this.z = f18.a();
        this.A = f18.a();
        Boolean bool = Boolean.FALSE;
        this.B = bl7.i(bool);
        this.C = bl7.i(bool);
        this.D = bl7.i(bool);
        this.E = bl7.i(bool);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r9.c(r7, r8, r0) == r5) goto L24;
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object t(defpackage.dr7 r6, defpackage.o37 r7, defpackage.ci4<? super defpackage.t69, ? super defpackage.r02<? super defpackage.g2b>, ? extends java.lang.Object> r8, defpackage.r02<? super defpackage.g2b> r9) {
        /*
            boolean r0 = r9 instanceof dr7.a
            if (r0 == 0) goto L13
            r0 = r9
            dr7$a r0 = (dr7.a) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.y = r1
            goto L18
        L13:
            dr7$a r0 = new dr7$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.w
            int r1 = r0.y
            r2 = 0
            r3 = 2
            r4 = 1
            v72 r5 = defpackage.v72.t
            if (r1 == 0) goto L40
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            dr7 r6 = r0.t
            defpackage.dv8.b(r9)
            goto L77
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r6)
            return r2
        L33:
            p6a r6 = r0.v
            r8 = r6
            ci4 r8 = (defpackage.ci4) r8
            o37 r7 = r0.u
            dr7 r6 = r0.t
            defpackage.dv8.b(r9)
            goto L55
        L40:
            defpackage.dv8.b(r9)
            r0.t = r6
            r0.u = r7
            r9 = r8
            p6a r9 = (defpackage.p6a) r9
            r0.v = r9
            r0.y = r4
            java.lang.Object r9 = r6.i(r0)
            if (r9 != r5) goto L55
            goto L76
        L55:
            ht2 r9 = r6.k
            boolean r9 = r9.a()
            if (r9 != 0) goto L66
            int r9 = r6.k()
            bt7 r1 = r6.r
            r1.j(r9)
        L66:
            ht2 r9 = r6.k
            r0.t = r6
            r0.u = r2
            r0.v = r2
            r0.y = r3
            java.lang.Object r7 = r9.c(r7, r8, r0)
            if (r7 != r5) goto L77
        L76:
            return r5
        L77:
            r7 = -1
            bt7 r6 = r6.q
            r6.j(r7)
            g2b r6 = defpackage.g2b.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr7.t(dr7, o37, ci4, r02):java.lang.Object");
    }

    @Override // defpackage.s79
    public final boolean a() {
        return this.k.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s79
    public final boolean b() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }

    @Override // defpackage.s79
    public final Object c(o37 o37Var, ci4<? super t69, ? super r02<? super g2b>, ? extends Object> ci4Var, r02<? super g2b> r02Var) {
        return t(this, o37Var, ci4Var, r02Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s79
    public final boolean d() {
        return ((Boolean) this.B.getValue()).booleanValue();
    }

    @Override // defpackage.s79
    public final float e(float f) {
        return this.k.e(f);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        if (c(defpackage.o37.t, r0, r6) == r9) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r11, defpackage.ty9 r12, defpackage.u02 r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r3 = r13 instanceof defpackage.yq7
            if (r3 == 0) goto L14
            r3 = r13
            yq7 r3 = (defpackage.yq7) r3
            int r4 = r3.x
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L14
            int r4 = r4 - r5
            r3.x = r4
        L12:
            r6 = r3
            goto L1a
        L14:
            yq7 r3 = new yq7
            r3.<init>(r10, r13)
            goto L12
        L1a:
            java.lang.Object r2 = r6.v
            int r3 = r6.x
            r7 = 0
            r4 = 0
            r8 = 2
            r5 = 1
            v72 r9 = defpackage.v72.t
            if (r3 == 0) goto L3e
            if (r3 == r5) goto L34
            if (r3 != r8) goto L2e
            defpackage.dv8.b(r2)
            goto L88
        L2e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r0)
            return r7
        L34:
            int r0 = r6.t
            ty9 r3 = r6.u
            defpackage.dv8.b(r2)
            r2 = r4
            r4 = r3
            goto L69
        L3e:
            defpackage.dv8.b(r2)
            int r2 = r10.k()
            if (r11 != r2) goto L50
            float r2 = r10.l()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L50
            goto L56
        L50:
            int r2 = r10.o()
            if (r2 != 0) goto L59
        L56:
            g2b r0 = defpackage.g2b.a
            return r0
        L59:
            r6.u = r12
            r6.t = r11
            r6.x = r5
            java.lang.Object r3 = r10.i(r6)
            if (r3 != r9) goto L66
            goto L87
        L66:
            r0 = r11
            r2 = r4
            r4 = r12
        L69:
            int r0 = r10.j(r0)
            int r3 = r10.q()
            float r3 = (float) r3
            float r3 = r3 * r2
            r2 = r0
            zq7 r0 = new zq7
            r5 = 0
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r6.u = r7
            r6.x = r8
            o37 r2 = defpackage.o37.t
            java.lang.Object r0 = r10.c(r2, r0, r6)
            if (r0 != r9) goto L88
        L87:
            return r9
        L88:
            g2b r0 = defpackage.g2b.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr7.f(int, ty9, u02):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:121:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:122:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:133:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:145:0x0300 A[Catch: all -> 0x033e, TryCatch #0 {all -> 0x033e, blocks: (B:137:0x02dc, B:140:0x02e5, B:143:0x02f2, B:145:0x0300, B:153:0x0336, B:151:0x0330, B:148:0x0318), top: B:169:0x02dc }] */
    /* JADX WARN: Code duplicated, block: B:147:0x0317  */
    /* JADX WARN: Code duplicated, block: B:148:0x0318 A[Catch: all -> 0x033e, TryCatch #0 {all -> 0x033e, blocks: (B:137:0x02dc, B:140:0x02e5, B:143:0x02f2, B:145:0x0300, B:153:0x0336, B:151:0x0330, B:148:0x0318), top: B:169:0x02dc }] */
    /* JADX WARN: Code duplicated, block: B:150:0x032f  */
    /* JADX WARN: Code duplicated, block: B:151:0x0330 A[Catch: all -> 0x033e, TryCatch #0 {all -> 0x033e, blocks: (B:137:0x02dc, B:140:0x02e5, B:143:0x02f2, B:145:0x0300, B:153:0x0336, B:151:0x0330, B:148:0x0318), top: B:169:0x02dc }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0353  */
    /* JADX WARN: Code duplicated, block: B:161:0x035a  */
    /* JADX WARN: Code duplicated, block: B:164:0x0376  */
    /* JADX WARN: Code duplicated, block: B:169:0x02dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x022b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:96:0x0215  */
    /* JADX WARN: Code duplicated, block: B:98:0x021c A[LOOP:1: B:97:0x021a->B:98:0x021c, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r5v19, types: [int] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v57 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void h(pq7 pq7Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        Object obj;
        boolean z7;
        boolean z8;
        h11 h11VarB;
        List<lx5.b> listG;
        int size;
        int i2;
        ?? r5;
        ?? r11;
        ?? r8;
        float f;
        long jA;
        long jG;
        long j;
        int i3;
        List<ll6> list = pq7Var.a;
        int i4 = pq7Var.l;
        ll6 ll6Var = pq7Var.i;
        ll6 ll6Var2 = pq7Var.j;
        float f2 = pq7Var.k;
        this.s.f = list.size();
        int i5 = pq7Var.b;
        this.o = pq7Var.c + i5;
        if (!z && this.a) {
            this.b = pq7Var;
            return;
        }
        boolean z9 = true;
        if (z) {
            this.a = true;
        }
        tp7 tp7Var = this.t;
        boolean z10 = this.l;
        sq7 sq7Var = this.d;
        if (!z2) {
            sq7Var.getClass();
            sq7Var.e = ll6Var2 != null ? ll6Var2.d : null;
            if (sq7Var.d || !list.isEmpty()) {
                sq7Var.d = true;
                int i6 = ll6Var2 != null ? ll6Var2.a : 0;
                sq7Var.b.j(i6);
                sq7Var.f.d(i6);
                sq7Var.c.g(f2);
            }
            if (z10) {
                boolean z11 = z10;
                vp7 vp7Var = tp7Var.o;
                e27<h11> e27Var = tp7Var.e;
                vp7Var.b = pq7Var;
                vp7Var.c = tp7Var.n;
                ar7 ar7Var = tp7Var.a;
                int i7 = tp7Var.g;
                int i8 = -1;
                float f3 = 0.0f;
                if (i7 != -1 && i7 != vp7Var.i()) {
                    tp7Var.l = true;
                    if (vp7Var.d()) {
                        int i9 = tp7Var.h;
                        if (i9 < 0) {
                            i9 = 0;
                        }
                        tp7Var.h = i9;
                        int i10 = vp7Var.f().a.isEmpty() ? -1 : vp7Var.i() - 1;
                        if (i10 != -1) {
                            int i11 = tp7Var.i;
                            if (i11 <= i10) {
                                i10 = i11;
                            }
                            tp7Var.i = i10;
                        }
                        if (tp7Var.f <= 0.0f) {
                            tp7Var.e(vp7Var.e(), tp7Var.m - 1);
                        } else {
                            tp7Var.e(0, vp7Var.c());
                        }
                    }
                }
                tp7Var.m = vp7Var.i();
                if (vp7Var.d()) {
                    int size2 = vp7Var.f().r.size() + vp7Var.f().a.size() + vp7Var.f().q.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        int size3 = vp7Var.f().q.size();
                        float f4 = f3;
                        int size4 = vp7Var.f().a.size();
                        if (i12 < size3) {
                            i = vp7Var.f().q.get(i12).a;
                        } else if (i12 < size3 || i12 >= size3 + size4) {
                            i = i12 >= size3 + size4 ? vp7Var.f().r.get((i12 - size3) - size4).a : i8;
                        } else {
                            i = vp7Var.f().a.get(i12 - size3).a;
                        }
                        int size5 = vp7Var.f().q.size();
                        int size6 = vp7Var.f().a.size();
                        if (i12 < size5) {
                            obj = vp7Var.f().q.get(i12).d;
                        } else if (i12 < size5 || i12 >= size5 + size6) {
                            obj = i12 >= size5 + size6 ? vp7Var.f().r.get((i12 - size5) - size6).d : h11.c;
                        } else {
                            obj = vp7Var.f().a.get(i12 - size5).d;
                        }
                        int i13 = vp7Var.f().b;
                        if (i != -1) {
                            if (e27Var.a(i)) {
                                h11 h11VarB2 = e27Var.b(i);
                                h11VarB2.getClass();
                                int i14 = h11VarB2.b;
                                h11 h11VarB3 = e27Var.b(i);
                                h11VarB3.getClass();
                                z7 = z11;
                                Object obj2 = h11VarB3.a;
                                if (i14 != i13 || !xj5.a(obj2, obj)) {
                                    z8 = true;
                                    tp7Var.l = true;
                                }
                                h11VarB = e27Var.b(i);
                                if (h11VarB != null) {
                                    h11VarB.b = i13;
                                    h11VarB.a = obj;
                                } else {
                                    h11VarB = new h11();
                                    h11VarB.a = obj;
                                    h11VarB.b = i13;
                                }
                                e27Var.i(i, h11VarB);
                                tp7Var.h = Math.min(tp7Var.h, i);
                                tp7Var.i = Math.max(tp7Var.i, i);
                                listG = tp7Var.b.g(i);
                                if (listG != null) {
                                    size = listG.size();
                                    for (i2 = 0; i2 < size; i2++) {
                                        listG.get(i2).cancel();
                                    }
                                }
                            } else {
                                z7 = z11;
                            }
                            z8 = true;
                            h11VarB = e27Var.b(i);
                            if (h11VarB != null) {
                                h11VarB.b = i13;
                                h11VarB.a = obj;
                            } else {
                                h11VarB = new h11();
                                h11VarB.a = obj;
                                h11VarB.b = i13;
                            }
                            e27Var.i(i, h11VarB);
                            tp7Var.h = Math.min(tp7Var.h, i);
                            tp7Var.i = Math.max(tp7Var.i, i);
                            listG = tp7Var.b.g(i);
                            if (listG != null) {
                                size = listG.size();
                                while (i2 < size) {
                                    listG.get(i2).cancel();
                                }
                            }
                        } else {
                            z7 = z11;
                            z8 = true;
                        }
                        i12++;
                        f3 = f4;
                        z9 = z8;
                        z11 = z7;
                        i8 = -1;
                    }
                    z3 = z11;
                    z4 = z9;
                    float f5 = f3;
                    if (tp7Var.l) {
                        boolean z12 = tp7Var.f <= f5 ? z4 : false;
                        if (vp7Var.d()) {
                            oq3.b(vp7Var.f());
                            z6 = false;
                            tp7Var.d(vp7Var, vp7Var.c(), vp7Var.e(), vp7Var.f().t != null ? ar7Var.a.o : 0, vp7Var.g(), vp7Var.h(), 0.0f, z12);
                        } else {
                            z6 = false;
                        }
                        tp7Var.l = z6;
                        z5 = z6;
                    } else {
                        z5 = false;
                    }
                } else {
                    z3 = z11;
                    z4 = true;
                    z5 = false;
                    tp7Var.f();
                }
                tp7Var.g = vp7Var.i();
                r5 = z5;
            }
            this.m.setValue(pq7Var);
            this.B.setValue(Boolean.valueOf(pq7Var.m));
            if (ll6Var != null) {
                i3 = ll6Var.a;
            } else {
                r11 = r5;
            }
            if (r11 == 0 || i4 != 0) {
                r11 = i3;
                r8 = z4;
            } else {
                r8 = r5;
            }
            this.C.setValue(Boolean.valueOf((boolean) r8));
            if (ll6Var != null) {
                this.e = ll6Var.a;
            }
            this.f = i4;
            hu9 hu9VarA = hu9.a.a();
            oh4<Object, g2b> oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
            hu9 hu9VarB = hu9.a.b(hu9VarA);
            if (z3) {
                try {
                    if (pq7Var.h < o() && Math.abs(this.j) > 0.5f) {
                        f = this.j;
                        if (n().c() == fl7.t) {
                            if (Math.signum(f) == Math.signum(-Float.intBitsToFloat((int) (r() & 4294967295L)))) {
                                if (s()) {
                                }
                            }
                        } else if (Math.signum(f) == Math.signum(-Float.intBitsToFloat((int) (r() >> 32)))) {
                            if (s()) {
                            }
                        }
                        tp7Var.h(this.j, pq7Var);
                        g2b g2bVar = g2b.a;
                    }
                } catch (Throwable th) {
                    hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
                    throw th;
                }
            }
            hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
            this.g = hr7.a(pq7Var, o());
            o();
            if (pq7Var.e == fl7.u) {
                jA = pq7Var.a() >> 32;
            } else {
                jA = pq7Var.a() & 4294967295L;
            }
            int i15 = (int) jA;
            jG = uh8.g(pq7Var.n.f(i15, i5, -pq7Var.f, pq7Var.d), r5, i15);
            j = this.g;
            if (jG > j) {
                jG = j;
            }
            this.h = jG;
        }
        sq7Var.c.g(f2);
        z4 = true;
        z3 = z10;
        r5 = 0;
        this.m.setValue(pq7Var);
        this.B.setValue(Boolean.valueOf(pq7Var.m));
        if (ll6Var != null) {
            i3 = ll6Var.a;
        } else {
            r11 = r5;
        }
        if (r11 == 0) {
            r11 = i3;
            r8 = z4;
        } else {
            r11 = i3;
            r8 = z4;
        }
        this.C.setValue(Boolean.valueOf((boolean) r8));
        if (ll6Var != null) {
            this.e = ll6Var.a;
        }
        this.f = i4;
        hu9 hu9VarA2 = hu9.a.a();
        oh4<Object, g2b> oh4VarE2 = hu9VarA2 != null ? hu9VarA2.e() : null;
        hu9 hu9VarB2 = hu9.a.b(hu9VarA2);
        if (z3) {
            if (pq7Var.h < o()) {
                f = this.j;
                if (n().c() == fl7.t) {
                    if (Math.signum(f) == Math.signum(-Float.intBitsToFloat((int) (r() & 4294967295L)))) {
                        if (s()) {
                        }
                    }
                } else if (Math.signum(f) == Math.signum(-Float.intBitsToFloat((int) (r() >> 32)))) {
                    if (s()) {
                    }
                }
                tp7Var.h(this.j, pq7Var);
                g2b g2bVar2 = g2b.a;
            }
        }
        hu9.a.d(hu9VarA2, hu9VarB2, oh4VarE2);
        this.g = hr7.a(pq7Var, o());
        o();
        if (pq7Var.e == fl7.u) {
            jA = pq7Var.a() >> 32;
        } else {
            jA = pq7Var.a() & 4294967295L;
        }
        int i16 = (int) jA;
        jG = uh8.g(pq7Var.n.f(i16, i5, -pq7Var.f, pq7Var.d), r5, i16);
        j = this.g;
        if (jG > j) {
            jG = j;
        }
        this.h = jG;
    }

    public final Object i(u02 u02Var) throws Throwable {
        if (this.m.getValue() != hr7.b) {
            return g2b.a;
        }
        Object objC = this.v.c(u02Var);
        return objC == v72.t ? objC : g2b.a;
    }

    public final int j(int i) {
        if (o() > 0) {
            return uh8.g(i, 0, o() - 1);
        }
        return 0;
    }

    public final int k() {
        return this.d.b.k();
    }

    public final float l() {
        return this.d.c.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean m() {
        return ((Boolean) this.D.getValue()).booleanValue();
    }

    public final iq7 n() {
        return (iq7) this.m.getValue();
    }

    public abstract int o();

    /* JADX WARN: Multi-variable type inference failed */
    public final int p() {
        return ((pq7) this.m.getValue()).b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int q() {
        return ((pq7) this.m.getValue()).c + p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long r() {
        return ((vf7) this.c.getValue()).a;
    }

    public final boolean s() {
        return ((int) Float.intBitsToFloat((int) (r() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (r() & 4294967295L))) == 0;
    }

    public final void u(float f, int i, boolean z) {
        sq7 sq7Var = this.d;
        bt7 bt7Var = sq7Var.b;
        at7 at7Var = sq7Var.c;
        if (bt7Var.k() != i || at7Var.h() != f) {
            this.t.f();
        }
        sq7Var.b.j(i);
        sq7Var.f.d(i);
        at7Var.g(f);
        sq7Var.e = null;
        if (!z) {
            f18.b(this.A);
            return;
        }
        fm8 fm8Var = (fm8) this.w.getValue();
        if (fm8Var != null) {
            fm8Var.i();
        }
    }
}
