package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dv {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<Boolean, Boolean> {
        public static final a u = new a(1);

        @Override // defpackage.oh4
        public final Boolean invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return bool2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements ci4<jt1, Integer, g2b> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;
        public final /* synthetic */ boolean u;
        public final /* synthetic */ ox6 v;
        public final /* synthetic */ uh3 w;
        public final /* synthetic */ jo3 x;
        public final /* synthetic */ String y;
        public final /* synthetic */ fr1 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, ox6 ox6Var, uh3 uh3Var, jo3 jo3Var, String str, fr1 fr1Var, int i, int i2) {
            super(2);
            this.u = z;
            this.v = ox6Var;
            this.w = uh3Var;
            this.x = jo3Var;
            this.y = str;
            this.z = fr1Var;
            this.A = i;
            this.B = i2;
        }

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            num.intValue();
            dv.d(this.u, this.v, this.w, this.x, this.y, this.z, jt1Var, gz3.s(this.A | 1), this.B);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends wp5 implements ei4<hl6, cl6, xx1, gl6> {
        public final /* synthetic */ oh4<T, Boolean> u;
        public final /* synthetic */ tva<T> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(oh4<? super T, Boolean> oh4Var, tva<T> tvaVar) {
            super(3);
            this.u = oh4Var;
            this.v = tvaVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0032  */
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
        @Override // defpackage.ei4
        public final gl6 invoke(hl6 hl6Var, cl6 cl6Var, xx1 xx1Var) {
            long j;
            hl6 hl6Var2 = hl6Var;
            jz7 jz7VarE = cl6Var.E(xx1Var.a);
            if (hl6Var2.P0()) {
                if (this.u.invoke(this.v.d.getValue()).booleanValue()) {
                    j = (((long) jz7VarE.t) << 32) | (((long) jz7VarE.u) & 4294967295L);
                } else {
                    j = 0;
                }
            } else {
                j = (((long) jz7VarE.t) << 32) | (((long) jz7VarE.u) & 4294967295L);
            }
            return hl6Var2.y0((int) (j >> 32), (int) (4294967295L & j), if3.t, new iv(jz7VarE));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends wp5 implements ci4<wg3, wg3, Boolean> {
        public static final d u = new d(2);

        @Override // defpackage.ci4
        public final Boolean invoke(wg3 wg3Var, wg3 wg3Var2) {
            wg3 wg3Var3 = wg3Var2;
            return Boolean.valueOf(wg3Var == wg3Var3 && wg3Var3 == wg3.v);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e extends wp5 implements ci4<jt1, Integer, g2b> {
        public final /* synthetic */ int A;
        public final /* synthetic */ tva<T> u;
        public final /* synthetic */ oh4<T, Boolean> v;
        public final /* synthetic */ ox6 w;
        public final /* synthetic */ th3 x;
        public final /* synthetic */ jo3 y;
        public final /* synthetic */ ei4<jv, jt1, Integer, g2b> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(tva<T> tvaVar, oh4<? super T, Boolean> oh4Var, ox6 ox6Var, th3 th3Var, jo3 jo3Var, ei4<? super jv, ? super jt1, ? super Integer, g2b> ei4Var, int i) {
            super(2);
            this.u = tvaVar;
            this.v = oh4Var;
            this.w = ox6Var;
            this.x = th3Var;
            this.y = jo3Var;
            this.z = ei4Var;
            this.A = i;
        }

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) throws Throwable {
            num.intValue();
            dv.e(this.u, this.v, this.w, this.x, this.y, this.z, jt1Var, gz3.s(this.A | 1));
            return g2b.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final tva tvaVar, oh4 oh4Var, ox6 ox6Var, th3 th3Var, jo3 jo3Var, ci4 ci4Var, ei4 ei4Var, jt1 jt1Var, int i) throws Throwable {
        int i2;
        Throwable th;
        Throwable th2;
        jt1.a.C0187a c0187a;
        tva tvaVar2;
        boolean z;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z2;
        Object obj5;
        Object objB;
        final th3 th3Var2;
        final jo3 jo3Var2;
        boolean z3;
        ei4 ei4Var2 = ei4Var;
        bj4 bj4VarO = jt1Var.o(1912839215);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(tvaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(oh4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.J(ox6Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.J(th3Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bj4VarO.J(jo3Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bj4VarO.j(ci4Var) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i3 |= bj4VarO.j(ei4Var2) ? 8388608 : 4194304;
        }
        if (bj4VarO.A(i3 & 1, (4793491 & i3) != 4793490)) {
            dt7 dt7Var = tvaVar.d;
            l4c l4cVar = tvaVar.a;
            if (((Boolean) oh4Var.invoke(dt7Var.getValue())).booleanValue() || ((Boolean) oh4Var.invoke(l4cVar.b())).booleanValue() || tvaVar.g() || tvaVar.d()) {
                bj4VarO.K(-232386135);
                int i4 = i3 & 14;
                int i5 = i4 | 48;
                int i6 = i5 & 14;
                boolean z4 = ((i6 ^ 6) > 4 && bj4VarO.J(tvaVar)) || (i5 & 6) == 4;
                Object objF = bj4VarO.f();
                boolean z5 = z4;
                jt1.a.C0187a c0187a2 = jt1.a.a;
                if (z5 || objF == c0187a2) {
                    objF = l4cVar.b();
                    bj4VarO.C(objF);
                }
                if (tvaVar.g()) {
                    objF = l4cVar.b();
                }
                bj4VarO.K(1844425648);
                wg3 wg3VarF = f(tvaVar, oh4Var, objF, bj4VarO);
                bj4VarO.U(false);
                T value = tvaVar.d.getValue();
                bj4VarO.K(1844425648);
                wg3 wg3VarF2 = f(tvaVar, oh4Var, value, bj4VarO);
                bj4VarO.U(false);
                int i7 = i6 | 3072;
                int i8 = (i7 & 14) ^ 6;
                int i9 = i3;
                boolean z6 = (i8 > 4 && bj4VarO.J(tvaVar)) || (i7 & 6) == 4;
                Object objF2 = bj4VarO.f();
                if (z6 || objF2 == c0187a2) {
                    objF2 = new tva(new j37(wg3VarF), tvaVar, av.a(new StringBuilder(), tvaVar.c, " > EnterExitTransition"));
                    bj4VarO.C(objF2);
                }
                final tva tvaVar3 = (tva) objF2;
                boolean zJ = ((i8 > 4 && bj4VarO.J(tvaVar)) || (i7 & 6) == 4) | bj4VarO.J(tvaVar3);
                Object objF3 = bj4VarO.f();
                if (zJ || objF3 == c0187a2) {
                    objF3 = new oh4() { // from class: bwa
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj6) {
                            tva tvaVar4 = tvaVar;
                            fv9<tva<?>> fv9Var = tvaVar4.j;
                            tva<?> tvaVar5 = tvaVar3;
                            fv9Var.add(tvaVar5);
                            return new gwa(tvaVar4, tvaVar5);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                wd3.a(tvaVar3, (oh4) objF3, bj4VarO);
                if (tvaVar.g()) {
                    tvaVar3.k(wg3VarF, wg3VarF2);
                } else {
                    tvaVar3.p(wg3VarF2);
                    tvaVar3.k.setValue(Boolean.FALSE);
                }
                dza dzaVar = zg3.a;
                boolean zJ2 = bj4VarO.J(tvaVar3);
                Object objF4 = bj4VarO.f();
                if (zJ2 || objF4 == c0187a2) {
                    objF4 = bl7.i(th3Var);
                    bj4VarO.C(objF4);
                }
                h37 h37Var = (h37) objF4;
                l4c l4cVar2 = tvaVar3.a;
                l4c l4cVar3 = tvaVar3.a;
                dt7 dt7Var2 = tvaVar3.d;
                Object objB2 = l4cVar2.b();
                Object value2 = dt7Var2.getValue();
                wg3 wg3Var = wg3.u;
                if (objB2 == value2 && l4cVar3.b() == wg3Var) {
                    if (tvaVar3.g()) {
                        h37Var.setValue(th3Var);
                    } else {
                        h37Var.setValue(th3.a);
                    }
                } else if (dt7Var2.getValue() == wg3Var) {
                    h37Var.setValue(((th3) h37Var.getValue()).b(th3Var));
                }
                th3 th3Var3 = (th3) h37Var.getValue();
                boolean zJ3 = bj4VarO.J(tvaVar3);
                Object objF5 = bj4VarO.f();
                if (zJ3 || objF5 == c0187a2) {
                    objF5 = bl7.i(jo3Var);
                    bj4VarO.C(objF5);
                }
                h37 h37Var2 = (h37) objF5;
                if (l4cVar3.b() == dt7Var2.getValue() && l4cVar3.b() == wg3Var) {
                    if (tvaVar3.g()) {
                        h37Var2.setValue(jo3Var);
                    } else {
                        h37Var2.setValue(jo3.a);
                    }
                } else if (dt7Var2.getValue() != wg3Var) {
                    h37Var2.setValue(((jo3) h37Var2.getValue()).b(jo3Var));
                }
                jo3 jo3Var3 = (jo3) h37Var2.getValue();
                h37 h37VarJ = bl7.j(ci4Var, bj4VarO);
                Object objInvoke = ci4Var.invoke(l4cVar3.b(), dt7Var2.getValue());
                boolean zJ4 = bj4VarO.J(tvaVar3) | bj4VarO.J(h37VarJ);
                Object objF6 = bj4VarO.f();
                if (zJ4 || objF6 == c0187a2) {
                    objF6 = new cv(tvaVar3, h37VarJ, null);
                    bj4VarO.C(objF6);
                }
                ci4 ci4Var2 = (ci4) objF6;
                Object objF7 = bj4VarO.f();
                if (objF7 == c0187a2) {
                    objF7 = bl7.i(objInvoke);
                    bj4VarO.C(objF7);
                }
                h37 h37Var3 = (h37) objF7;
                g2b g2bVar = g2b.a;
                boolean zJ5 = bj4VarO.j(ci4Var2);
                Object objF8 = bj4VarO.f();
                if (zJ5 || objF8 == c0187a2) {
                    th = null;
                    objF8 = new yu9(ci4Var2, h37Var3, null);
                    bj4VarO.C(objF8);
                } else {
                    th = null;
                }
                wd3.d(bj4VarO, (ci4) objF8, g2bVar);
                Object objB3 = l4cVar3.b();
                wg3 wg3Var2 = wg3.v;
                if (objB3 == wg3Var2 && dt7Var2.getValue() == wg3Var2 && ((Boolean) h37Var3.getValue()).booleanValue()) {
                    bj4VarO.K(-229368781);
                    bj4VarO.U(false);
                    ei4Var2 = ei4Var;
                    z3 = false;
                } else {
                    bj4VarO.K(-230699766);
                    boolean z7 = i4 == 4;
                    Object objF9 = bj4VarO.f();
                    if (z7 || objF9 == c0187a2) {
                        objF9 = new kv();
                        bj4VarO.C(objF9);
                    }
                    kv kvVar = (kv) objF9;
                    dza dzaVar2 = b0a.B;
                    Object objF10 = bj4VarO.f();
                    if (objF10 == c0187a2) {
                        objF10 = hh3.u;
                        bj4VarO.C(objF10);
                    }
                    mh4 mh4Var = (mh4) objF10;
                    bj4VarO.K(-167964673);
                    bj4VarO.U(false);
                    bj4VarO.K(-167961890);
                    bj4VarO.U(false);
                    th3Var3.a().getClass();
                    jo3Var3.a().getClass();
                    boolean z8 = (th3Var3.a().b == null && jo3Var3.a().b == null) ? false : true;
                    boolean z9 = (th3Var3.a().c == null && jo3Var3.a().c == null) ? false : true;
                    if (z8) {
                        bj4VarO.K(-911488127);
                        Object objF11 = bj4VarO.f();
                        if (objF11 == c0187a2) {
                            objF11 = "Built-in slide";
                            bj4VarO.C("Built-in slide");
                        }
                        String str = (String) objF11;
                        th2 = th;
                        c0187a = c0187a2;
                        tvaVar2 = tvaVar3;
                        z = true;
                        tva.a aVarB = owa.b(tvaVar2, dzaVar2, str, bj4VarO, 384, 0);
                        bj4VarO.U(false);
                        obj = aVarB;
                    } else {
                        th2 = th;
                        c0187a = c0187a2;
                        tvaVar2 = tvaVar3;
                        z = true;
                        bj4VarO.K(-911382324);
                        bj4VarO.U(false);
                        obj = th2;
                    }
                    if (z9) {
                        bj4VarO.K(-911290533);
                        dza dzaVar3 = b0a.C;
                        Object objF12 = bj4VarO.f();
                        if (objF12 == c0187a) {
                            objF12 = "Built-in shrink/expand";
                            bj4VarO.C("Built-in shrink/expand");
                        }
                        tva.a aVarB2 = owa.b(tvaVar2, dzaVar3, (String) objF12, bj4VarO, 384, 0);
                        bj4VarO.U(false);
                        obj2 = aVarB2;
                    } else {
                        bj4VarO.K(-911179709);
                        bj4VarO.U(false);
                        obj2 = th2;
                    }
                    if (z9) {
                        bj4VarO.K(-911106083);
                        Object objF13 = bj4VarO.f();
                        if (objF13 == c0187a) {
                            objF13 = "Built-in InterruptionHandlingOffset";
                            bj4VarO.C("Built-in InterruptionHandlingOffset");
                        }
                        tva.a aVarB3 = owa.b(tvaVar2, dzaVar2, (String) objF13, bj4VarO, 384, 0);
                        bj4VarO.U(false);
                        obj3 = aVarB3;
                    } else {
                        bj4VarO.K(-910935677);
                        bj4VarO.U(false);
                        obj3 = th2;
                    }
                    o91 o91Var = th3Var3.a().c;
                    o91 o91Var2 = jo3Var3.a().c;
                    boolean z10 = !z9;
                    th3Var3.a().getClass();
                    th3Var3.a().getClass();
                    jo3Var3.a().getClass();
                    jo3Var3.a().getClass();
                    float[] fArr = si1.a;
                    bj4VarO.K(-910130296);
                    bj4VarO.U(false);
                    th3Var3.a().getClass();
                    jo3Var3.a().getClass();
                    dza dzaVar4 = b0a.v;
                    boolean z11 = (th3Var3.a().a == null && jo3Var3.a().a == null) ? false : z;
                    boolean z12 = (th3Var3.a().d == null && jo3Var3.a().d == null) ? false : z;
                    if (z11) {
                        bj4VarO.K(-703879421);
                        Object objF14 = bj4VarO.f();
                        if (objF14 == c0187a) {
                            objF14 = "Built-in alpha";
                            bj4VarO.C("Built-in alpha");
                        }
                        tva.a aVarB4 = owa.b(tvaVar2, dzaVar4, (String) objF14, bj4VarO, 384, 0);
                        bj4VarO.U(false);
                        obj4 = aVarB4;
                    } else {
                        bj4VarO.K(-703709976);
                        bj4VarO.U(false);
                        obj4 = th2;
                    }
                    if (z12) {
                        bj4VarO.K(-703642333);
                        Object objF15 = bj4VarO.f();
                        if (objF15 == c0187a) {
                            objF15 = "Built-in scale";
                            bj4VarO.C("Built-in scale");
                        }
                        tva.a aVarB5 = owa.b(tvaVar2, dzaVar4, (String) objF15, bj4VarO, 384, 0);
                        z2 = false;
                        bj4VarO.U(false);
                        obj5 = aVarB5;
                    } else {
                        z2 = false;
                        bj4VarO.K(-703472888);
                        bj4VarO.U(false);
                        obj5 = th2;
                    }
                    if (z12) {
                        bj4VarO.K(-703395232);
                        objB = owa.b(tvaVar2, zg3.a, "TransformOriginInterruptionHandling", bj4VarO, 384, 0);
                        bj4VarO.U(z2);
                    } else {
                        bj4VarO.K(-703222904);
                        bj4VarO.U(z2);
                        objB = th2;
                    }
                    boolean zJ6 = bj4VarO.j(obj4) | bj4VarO.J(th3Var3) | bj4VarO.J(jo3Var3) | bj4VarO.j(obj5) | bj4VarO.J(tvaVar2) | bj4VarO.j(objB);
                    Object objF16 = bj4VarO.f();
                    if (zJ6 || objF16 == c0187a) {
                        th3Var2 = th3Var3;
                        final tva.a aVar = obj4;
                        final tva.a aVar2 = obj5;
                        jo3Var2 = jo3Var3;
                        final tva tvaVar4 = tvaVar2;
                        final tva.a aVar3 = objB;
                        objF16 = new lo4() { // from class: yg3
                            /* JADX WARN: Code duplicated, block: B:18:0x0059  */
                            @Override // defpackage.lo4
                            public final ch3 a() {
                                ava avaVar;
                                tva.a aVar4 = aVar;
                                th3 th3Var4 = th3Var2;
                                jo3 jo3Var4 = jo3Var2;
                                tva.a.C0252a c0252aA = null;
                                tva.a.C0252a c0252aA2 = aVar4 != null ? aVar4.a(new ah3(th3Var4, jo3Var4), new bh3(th3Var4, jo3Var4)) : null;
                                tva.a aVar5 = aVar2;
                                tva.a.C0252a c0252aA3 = aVar5 != null ? aVar5.a(new dh3(th3Var4, jo3Var4), new eh3(th3Var4, jo3Var4)) : null;
                                if (tvaVar4.a.b() == wg3.t) {
                                    t39 t39Var = th3Var4.a().d;
                                    if (t39Var != null) {
                                        avaVar = new ava(t39Var.b);
                                    } else {
                                        t39 t39Var2 = jo3Var4.a().d;
                                        if (t39Var2 != null) {
                                            avaVar = new ava(t39Var2.b);
                                        } else {
                                            avaVar = null;
                                        }
                                    }
                                } else {
                                    t39 t39Var3 = jo3Var4.a().d;
                                    if (t39Var3 != null) {
                                        avaVar = new ava(t39Var3.b);
                                    } else {
                                        t39 t39Var4 = th3Var4.a().d;
                                        if (t39Var4 != null) {
                                            avaVar = new ava(t39Var4.b);
                                        } else {
                                            avaVar = null;
                                        }
                                    }
                                }
                                tva.a aVar6 = aVar3;
                                if (aVar6 != null) {
                                    c0252aA = aVar6.a(fh3.u, new gh3(avaVar, th3Var4, jo3Var4));
                                }
                                return new ch3(c0252aA2, c0252aA3, c0252aA);
                            }
                        };
                        bj4VarO.C(objF16);
                    } else {
                        th3Var2 = th3Var3;
                        jo3Var2 = jo3Var3;
                    }
                    lo4 lo4Var = (lo4) objF16;
                    boolean zC = bj4VarO.c(z10) | bj4VarO.J(mh4Var);
                    Object objF17 = bj4VarO.f();
                    if (zC || objF17 == c0187a) {
                        objF17 = new ih3(mh4Var, z10);
                        bj4VarO.C(objF17);
                    }
                    ox6.a aVar4 = ox6.a.t;
                    ox6 ox6VarH = po4.a(aVar4, (oh4) objF17).H(new xg3(tvaVar2, obj2, obj3, obj, th3Var2, jo3Var2, mh4Var, lo4Var)).H(aVar4);
                    bj4VarO.K(-7404393);
                    bj4VarO.U(false);
                    ox6 ox6VarH2 = ox6Var.H(ox6VarH.H(aVar4));
                    Object objF18 = bj4VarO.f();
                    if (objF18 == c0187a) {
                        objF18 = new vu(kvVar);
                        bj4VarO.C(objF18);
                    }
                    vu vuVar = (vu) objF18;
                    int iHashCode = Long.hashCode(bj4VarO.T);
                    kw7 kw7VarP = bj4VarO.P();
                    ox6 ox6VarC = it1.c(bj4VarO, ox6VarH2);
                    bt1.c.getClass();
                    qr5.a aVar5 = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw th2;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar5);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, vuVar);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    bt1.a.b bVar = bt1.a.g;
                    if (bj4VarO.l()) {
                        bj4VarO.b(bVar, numValueOf);
                    }
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    ei4Var2 = ei4Var;
                    ei4Var2.invoke(kvVar, bj4VarO, Integer.valueOf((i9 >> 18) & 112));
                    bj4VarO.U(z);
                    z3 = false;
                    bj4VarO.U(false);
                }
                bj4VarO.U(z3);
            } else {
                bj4VarO.K(-229362829);
                bj4VarO.U(false);
            }
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new bv(tvaVar, oh4Var, ox6Var, th3Var, jo3Var, ci4Var, ei4Var2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0070  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    public static final void b(j37 j37Var, ox6 ox6Var, th3 th3Var, jo3 jo3Var, String str, fr1 fr1Var, jt1 jt1Var, int i, int i2) {
        jo3 jo3Var2;
        int i3;
        boolean z;
        ox6 ox6Var2;
        String str2;
        jo3 jo3Var3;
        xj8 xj8VarW;
        jo3 jo3VarB;
        Object objF;
        bj4 bj4VarO = jt1Var.o(657024243);
        int i4 = (bj4VarO.J(j37Var) ? 4 : 2) | i | 48;
        if ((i & 384) == 0) {
            i4 |= bj4VarO.J(th3Var) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                jo3Var2 = jo3Var;
                i4 |= bj4VarO.J(jo3Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
            }
            i3 = i4 | 24576;
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (bj4VarO.A(i3 & 1, z)) {
                if (i5 != 0) {
                    jo3VarB = zg3.d(null, 3).b(zg3.g(null, 15));
                } else {
                    jo3VarB = jo3Var2;
                }
                tva tvaVarD = owa.d(j37Var, "AnimatedVisibility", bj4VarO, (i3 & 14) | 48);
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = gv.u;
                    bj4VarO.C(objF);
                }
                int i6 = i3 << 3;
                ox6.a aVar = ox6.a.t;
                e(tvaVarD, (oh4) objF, aVar, th3Var, jo3VarB, fr1Var, bj4VarO, (i6 & 57344) | (i6 & 7168) | 432 | 196608);
                str2 = "AnimatedVisibility";
                ox6Var2 = aVar;
                jo3Var3 = jo3VarB;
            } else {
                bj4VarO.u();
                ox6Var2 = ox6Var;
                str2 = str;
                jo3Var3 = jo3Var2;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new hv(j37Var, ox6Var2, th3Var, jo3Var3, str2, fr1Var, i, i2);
            }
        }
        i4 |= 3072;
        jo3Var2 = jo3Var;
        i3 = i4 | 24576;
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (bj4VarO.A(i3 & 1, z)) {
            if (i5 != 0) {
                jo3VarB = zg3.d(null, 3).b(zg3.g(null, 15));
            } else {
                jo3VarB = jo3Var2;
            }
            tva tvaVarD2 = owa.d(j37Var, "AnimatedVisibility", bj4VarO, (i3 & 14) | 48);
            objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = gv.u;
                bj4VarO.C(objF);
            }
            int i7 = i3 << 3;
            ox6.a aVar2 = ox6.a.t;
            e(tvaVarD2, (oh4) objF, aVar2, th3Var, jo3VarB, fr1Var, bj4VarO, (i7 & 57344) | (i7 & 7168) | 432 | 196608);
            str2 = "AnimatedVisibility";
            ox6Var2 = aVar2;
            jo3Var3 = jo3VarB;
        } else {
            bj4VarO.u();
            ox6Var2 = ox6Var;
            str2 = str;
            jo3Var3 = jo3Var2;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new hv(j37Var, ox6Var2, th3Var, jo3Var3, str2, fr1Var, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:70:0x0102  */
    /* JADX WARN: Code duplicated, block: B:73:0x0110  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void c(boolean z, ox6 ox6Var, th3 th3Var, jo3 jo3Var, String str, ei4 ei4Var, jt1 jt1Var, int i, int i2) {
        int i3;
        ox6 ox6Var2;
        int i4;
        th3 th3Var2;
        int i5;
        int i6;
        jo3 jo3Var2;
        int i7;
        int i8;
        boolean z2;
        ox6 ox6Var3;
        th3 th3Var3;
        jo3 jo3Var3;
        String str2;
        xj8 xj8VarW;
        ox6 ox6Var4;
        th3 th3VarB;
        jo3 jo3VarB;
        Object objF;
        int i9;
        bj4 bj4VarO = jt1Var.o(1799879339);
        if ((i & 48) == 0) {
            i3 = (bj4VarO.c(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 256 : 128;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    th3Var2 = th3Var;
                    if (bj4VarO.J(th3Var2)) {
                        i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        jo3Var2 = jo3Var;
                        if (bj4VarO.J(jo3Var2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i3 | 196608;
                    if ((1572864 & i) == 0) {
                        if (bj4VarO.j(ei4Var)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i8 |= i9;
                    }
                    if ((599185 & i8) != 599184) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (bj4VarO.A(i8 & 1, z2)) {
                        if (i10 != 0) {
                            ox6Var4 = ox6.a.t;
                        } else {
                            ox6Var4 = ox6Var2;
                        }
                        if (i4 != 0) {
                            th3VarB = zg3.c(null, 3).b(zg3.b(null, 15));
                        } else {
                            th3VarB = th3Var2;
                        }
                        if (i6 != 0) {
                            jo3VarB = zg3.d(null, 3).b(zg3.h(null, 15));
                        } else {
                            jo3VarB = jo3Var2;
                        }
                        int i11 = i8 >> 3;
                        str2 = "AnimatedVisibility";
                        tva tvaVarF = owa.f(Boolean.valueOf(z), "AnimatedVisibility", bj4VarO, (i11 & 14) | ((i8 >> 12) & 112));
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = ev.u;
                            bj4VarO.C(objF);
                        }
                        e(tvaVarF, (oh4) objF, ox6Var4, th3VarB, jo3VarB, ei4Var, bj4VarO, (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | (458752 & i11));
                        ox6Var3 = ox6Var4;
                        th3Var3 = th3VarB;
                        jo3Var3 = jo3VarB;
                    } else {
                        bj4VarO.u();
                        ox6Var3 = ox6Var2;
                        th3Var3 = th3Var2;
                        jo3Var3 = jo3Var2;
                        str2 = str;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new fv(z, ox6Var3, th3Var3, jo3Var3, str2, ei4Var, i, i2);
                    }
                }
                i3 |= 24576;
                jo3Var2 = jo3Var;
                i8 = i3 | 196608;
                if ((1572864 & i) == 0) {
                    if (bj4VarO.j(ei4Var)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i8 |= i9;
                }
                if ((599185 & i8) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bj4VarO.A(i8 & 1, z2)) {
                    if (i10 != 0) {
                        ox6Var4 = ox6.a.t;
                    } else {
                        ox6Var4 = ox6Var2;
                    }
                    if (i4 != 0) {
                        th3VarB = zg3.c(null, 3).b(zg3.b(null, 15));
                    } else {
                        th3VarB = th3Var2;
                    }
                    if (i6 != 0) {
                        jo3VarB = zg3.d(null, 3).b(zg3.h(null, 15));
                    } else {
                        jo3VarB = jo3Var2;
                    }
                    int i12 = i8 >> 3;
                    str2 = "AnimatedVisibility";
                    tva tvaVarF2 = owa.f(Boolean.valueOf(z), "AnimatedVisibility", bj4VarO, (i12 & 14) | ((i8 >> 12) & 112));
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = ev.u;
                        bj4VarO.C(objF);
                    }
                    e(tvaVarF2, (oh4) objF, ox6Var4, th3VarB, jo3VarB, ei4Var, bj4VarO, (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | (458752 & i12));
                    ox6Var3 = ox6Var4;
                    th3Var3 = th3VarB;
                    jo3Var3 = jo3VarB;
                } else {
                    bj4VarO.u();
                    ox6Var3 = ox6Var2;
                    th3Var3 = th3Var2;
                    jo3Var3 = jo3Var2;
                    str2 = str;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new fv(z, ox6Var3, th3Var3, jo3Var3, str2, ei4Var, i, i2);
                }
            }
            i3 |= 3072;
            th3Var2 = th3Var;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    jo3Var2 = jo3Var;
                    if (bj4VarO.J(jo3Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 196608;
                if ((1572864 & i) == 0) {
                    if (bj4VarO.j(ei4Var)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i8 |= i9;
                }
                if ((599185 & i8) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bj4VarO.A(i8 & 1, z2)) {
                    if (i10 != 0) {
                        ox6Var4 = ox6.a.t;
                    } else {
                        ox6Var4 = ox6Var2;
                    }
                    if (i4 != 0) {
                        th3VarB = zg3.c(null, 3).b(zg3.b(null, 15));
                    } else {
                        th3VarB = th3Var2;
                    }
                    if (i6 != 0) {
                        jo3VarB = zg3.d(null, 3).b(zg3.h(null, 15));
                    } else {
                        jo3VarB = jo3Var2;
                    }
                    int i13 = i8 >> 3;
                    str2 = "AnimatedVisibility";
                    tva tvaVarF3 = owa.f(Boolean.valueOf(z), "AnimatedVisibility", bj4VarO, (i13 & 14) | ((i8 >> 12) & 112));
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = ev.u;
                        bj4VarO.C(objF);
                    }
                    e(tvaVarF3, (oh4) objF, ox6Var4, th3VarB, jo3VarB, ei4Var, bj4VarO, (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | (458752 & i13));
                    ox6Var3 = ox6Var4;
                    th3Var3 = th3VarB;
                    jo3Var3 = jo3VarB;
                } else {
                    bj4VarO.u();
                    ox6Var3 = ox6Var2;
                    th3Var3 = th3Var2;
                    jo3Var3 = jo3Var2;
                    str2 = str;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new fv(z, ox6Var3, th3Var3, jo3Var3, str2, ei4Var, i, i2);
                }
            }
            i3 |= 24576;
            jo3Var2 = jo3Var;
            i8 = i3 | 196608;
            if ((1572864 & i) == 0) {
                if (bj4VarO.j(ei4Var)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i8 |= i9;
            }
            if ((599185 & i8) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bj4VarO.A(i8 & 1, z2)) {
                if (i10 != 0) {
                    ox6Var4 = ox6.a.t;
                } else {
                    ox6Var4 = ox6Var2;
                }
                if (i4 != 0) {
                    th3VarB = zg3.c(null, 3).b(zg3.b(null, 15));
                } else {
                    th3VarB = th3Var2;
                }
                if (i6 != 0) {
                    jo3VarB = zg3.d(null, 3).b(zg3.h(null, 15));
                } else {
                    jo3VarB = jo3Var2;
                }
                int i14 = i8 >> 3;
                str2 = "AnimatedVisibility";
                tva tvaVarF4 = owa.f(Boolean.valueOf(z), "AnimatedVisibility", bj4VarO, (i14 & 14) | ((i8 >> 12) & 112));
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = ev.u;
                    bj4VarO.C(objF);
                }
                e(tvaVarF4, (oh4) objF, ox6Var4, th3VarB, jo3VarB, ei4Var, bj4VarO, (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | (458752 & i14));
                ox6Var3 = ox6Var4;
                th3Var3 = th3VarB;
                jo3Var3 = jo3VarB;
            } else {
                bj4VarO.u();
                ox6Var3 = ox6Var2;
                th3Var3 = th3Var2;
                jo3Var3 = jo3Var2;
                str2 = str;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new fv(z, ox6Var3, th3Var3, jo3Var3, str2, ei4Var, i, i2);
            }
        }
        i3 |= 384;
        ox6Var2 = ox6Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                th3Var2 = th3Var;
                if (bj4VarO.J(th3Var2)) {
                    i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    jo3Var2 = jo3Var;
                    if (bj4VarO.J(jo3Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 196608;
                if ((1572864 & i) == 0) {
                    if (bj4VarO.j(ei4Var)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i8 |= i9;
                }
                if ((599185 & i8) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bj4VarO.A(i8 & 1, z2)) {
                    if (i10 != 0) {
                        ox6Var4 = ox6.a.t;
                    } else {
                        ox6Var4 = ox6Var2;
                    }
                    if (i4 != 0) {
                        th3VarB = zg3.c(null, 3).b(zg3.b(null, 15));
                    } else {
                        th3VarB = th3Var2;
                    }
                    if (i6 != 0) {
                        jo3VarB = zg3.d(null, 3).b(zg3.h(null, 15));
                    } else {
                        jo3VarB = jo3Var2;
                    }
                    int i15 = i8 >> 3;
                    str2 = "AnimatedVisibility";
                    tva tvaVarF5 = owa.f(Boolean.valueOf(z), "AnimatedVisibility", bj4VarO, (i15 & 14) | ((i8 >> 12) & 112));
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = ev.u;
                        bj4VarO.C(objF);
                    }
                    e(tvaVarF5, (oh4) objF, ox6Var4, th3VarB, jo3VarB, ei4Var, bj4VarO, (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | (458752 & i15));
                    ox6Var3 = ox6Var4;
                    th3Var3 = th3VarB;
                    jo3Var3 = jo3VarB;
                } else {
                    bj4VarO.u();
                    ox6Var3 = ox6Var2;
                    th3Var3 = th3Var2;
                    jo3Var3 = jo3Var2;
                    str2 = str;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new fv(z, ox6Var3, th3Var3, jo3Var3, str2, ei4Var, i, i2);
                }
            }
            i3 |= 24576;
            jo3Var2 = jo3Var;
            i8 = i3 | 196608;
            if ((1572864 & i) == 0) {
                if (bj4VarO.j(ei4Var)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i8 |= i9;
            }
            if ((599185 & i8) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bj4VarO.A(i8 & 1, z2)) {
                if (i10 != 0) {
                    ox6Var4 = ox6.a.t;
                } else {
                    ox6Var4 = ox6Var2;
                }
                if (i4 != 0) {
                    th3VarB = zg3.c(null, 3).b(zg3.b(null, 15));
                } else {
                    th3VarB = th3Var2;
                }
                if (i6 != 0) {
                    jo3VarB = zg3.d(null, 3).b(zg3.h(null, 15));
                } else {
                    jo3VarB = jo3Var2;
                }
                int i16 = i8 >> 3;
                str2 = "AnimatedVisibility";
                tva tvaVarF6 = owa.f(Boolean.valueOf(z), "AnimatedVisibility", bj4VarO, (i16 & 14) | ((i8 >> 12) & 112));
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = ev.u;
                    bj4VarO.C(objF);
                }
                e(tvaVarF6, (oh4) objF, ox6Var4, th3VarB, jo3VarB, ei4Var, bj4VarO, (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | (458752 & i16));
                ox6Var3 = ox6Var4;
                th3Var3 = th3VarB;
                jo3Var3 = jo3VarB;
            } else {
                bj4VarO.u();
                ox6Var3 = ox6Var2;
                th3Var3 = th3Var2;
                jo3Var3 = jo3Var2;
                str2 = str;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new fv(z, ox6Var3, th3Var3, jo3Var3, str2, ei4Var, i, i2);
            }
        }
        i3 |= 3072;
        th3Var2 = th3Var;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                jo3Var2 = jo3Var;
                if (bj4VarO.J(jo3Var2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i3 | 196608;
            if ((1572864 & i) == 0) {
                if (bj4VarO.j(ei4Var)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i8 |= i9;
            }
            if ((599185 & i8) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bj4VarO.A(i8 & 1, z2)) {
                if (i10 != 0) {
                    ox6Var4 = ox6.a.t;
                } else {
                    ox6Var4 = ox6Var2;
                }
                if (i4 != 0) {
                    th3VarB = zg3.c(null, 3).b(zg3.b(null, 15));
                } else {
                    th3VarB = th3Var2;
                }
                if (i6 != 0) {
                    jo3VarB = zg3.d(null, 3).b(zg3.h(null, 15));
                } else {
                    jo3VarB = jo3Var2;
                }
                int i17 = i8 >> 3;
                str2 = "AnimatedVisibility";
                tva tvaVarF7 = owa.f(Boolean.valueOf(z), "AnimatedVisibility", bj4VarO, (i17 & 14) | ((i8 >> 12) & 112));
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = ev.u;
                    bj4VarO.C(objF);
                }
                e(tvaVarF7, (oh4) objF, ox6Var4, th3VarB, jo3VarB, ei4Var, bj4VarO, (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | (458752 & i17));
                ox6Var3 = ox6Var4;
                th3Var3 = th3VarB;
                jo3Var3 = jo3VarB;
            } else {
                bj4VarO.u();
                ox6Var3 = ox6Var2;
                th3Var3 = th3Var2;
                jo3Var3 = jo3Var2;
                str2 = str;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new fv(z, ox6Var3, th3Var3, jo3Var3, str2, ei4Var, i, i2);
            }
        }
        i3 |= 24576;
        jo3Var2 = jo3Var;
        i8 = i3 | 196608;
        if ((1572864 & i) == 0) {
            if (bj4VarO.j(ei4Var)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i8 |= i9;
        }
        if ((599185 & i8) != 599184) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bj4VarO.A(i8 & 1, z2)) {
            if (i10 != 0) {
                ox6Var4 = ox6.a.t;
            } else {
                ox6Var4 = ox6Var2;
            }
            if (i4 != 0) {
                th3VarB = zg3.c(null, 3).b(zg3.b(null, 15));
            } else {
                th3VarB = th3Var2;
            }
            if (i6 != 0) {
                jo3VarB = zg3.d(null, 3).b(zg3.h(null, 15));
            } else {
                jo3VarB = jo3Var2;
            }
            int i18 = i8 >> 3;
            str2 = "AnimatedVisibility";
            tva tvaVarF8 = owa.f(Boolean.valueOf(z), "AnimatedVisibility", bj4VarO, (i18 & 14) | ((i8 >> 12) & 112));
            objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = ev.u;
                bj4VarO.C(objF);
            }
            e(tvaVarF8, (oh4) objF, ox6Var4, th3VarB, jo3VarB, ei4Var, bj4VarO, (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | (458752 & i18));
            ox6Var3 = ox6Var4;
            th3Var3 = th3VarB;
            jo3Var3 = jo3VarB;
        } else {
            bj4VarO.u();
            ox6Var3 = ox6Var2;
            th3Var3 = th3Var2;
            jo3Var3 = jo3Var2;
            str2 = str;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new fv(z, ox6Var3, th3Var3, jo3Var3, str2, ei4Var, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    public static final void d(boolean z, ox6 ox6Var, uh3 uh3Var, jo3 jo3Var, String str, fr1 fr1Var, jt1 jt1Var, int i, int i2) {
        int i3;
        ox6 ox6Var2;
        int i4;
        jo3 jo3Var2;
        int i5;
        int i6;
        boolean z2;
        ox6 ox6Var3;
        jo3 jo3Var3;
        String str2;
        xj8 xj8VarW;
        ox6 ox6Var4;
        jo3 jo3VarB;
        Object objF;
        int i7;
        int i8;
        bj4 bj4VarO = jt1Var.o(-1448730565);
        if ((i & 6) == 0) {
            i3 = (bj4VarO.c(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (bj4VarO.J(uh3Var)) {
                    i8 = 256;
                } else {
                    i8 = 128;
                }
                i3 |= i8;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    jo3Var2 = jo3Var;
                    if (bj4VarO.J(jo3Var2)) {
                        i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i3 | 24576;
                if ((196608 & i) == 0) {
                    if (bj4VarO.j(fr1Var)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i6 |= i7;
                }
                if ((74899 & i6) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bj4VarO.A(i6 & 1, z2)) {
                    if (i9 != 0) {
                        ox6Var4 = ox6.a.t;
                    } else {
                        ox6Var4 = ox6Var2;
                    }
                    if (i4 != 0) {
                        jo3VarB = zg3.g(null, 15).b(zg3.d(null, 3));
                    } else {
                        jo3VarB = jo3Var2;
                    }
                    tva tvaVarF = owa.f(Boolean.valueOf(z), "AnimatedVisibility", bj4VarO, (i6 & 14) | ((i6 >> 9) & 112));
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = a.u;
                        bj4VarO.C(objF);
                    }
                    oh4 oh4Var = (oh4) objF;
                    int i10 = i6 << 3;
                    e(tvaVarF, oh4Var, ox6Var4, uh3Var, jo3VarB, fr1Var, bj4VarO, (i10 & 57344) | (i10 & 896) | 48 | (i10 & 7168) | (i6 & 458752));
                    str2 = "AnimatedVisibility";
                    ox6Var3 = ox6Var4;
                    jo3Var3 = jo3VarB;
                } else {
                    bj4VarO.u();
                    ox6Var3 = ox6Var2;
                    jo3Var3 = jo3Var2;
                    str2 = str;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new b(z, ox6Var3, uh3Var, jo3Var3, str2, fr1Var, i, i2);
                }
            }
            i3 |= 3072;
            jo3Var2 = jo3Var;
            i6 = i3 | 24576;
            if ((196608 & i) == 0) {
                if (bj4VarO.j(fr1Var)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i6 |= i7;
            }
            if ((74899 & i6) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bj4VarO.A(i6 & 1, z2)) {
                if (i9 != 0) {
                    ox6Var4 = ox6.a.t;
                } else {
                    ox6Var4 = ox6Var2;
                }
                if (i4 != 0) {
                    jo3VarB = zg3.g(null, 15).b(zg3.d(null, 3));
                } else {
                    jo3VarB = jo3Var2;
                }
                tva tvaVarF2 = owa.f(Boolean.valueOf(z), "AnimatedVisibility", bj4VarO, (i6 & 14) | ((i6 >> 9) & 112));
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = a.u;
                    bj4VarO.C(objF);
                }
                oh4 oh4Var2 = (oh4) objF;
                int i11 = i6 << 3;
                e(tvaVarF2, oh4Var2, ox6Var4, uh3Var, jo3VarB, fr1Var, bj4VarO, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i6 & 458752));
                str2 = "AnimatedVisibility";
                ox6Var3 = ox6Var4;
                jo3Var3 = jo3VarB;
            } else {
                bj4VarO.u();
                ox6Var3 = ox6Var2;
                jo3Var3 = jo3Var2;
                str2 = str;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new b(z, ox6Var3, uh3Var, jo3Var3, str2, fr1Var, i, i2);
            }
        }
        i3 |= 48;
        ox6Var2 = ox6Var;
        if ((i & 384) == 0) {
            if (bj4VarO.J(uh3Var)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                jo3Var2 = jo3Var;
                if (bj4VarO.J(jo3Var2)) {
                    i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i3 | 24576;
            if ((196608 & i) == 0) {
                if (bj4VarO.j(fr1Var)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i6 |= i7;
            }
            if ((74899 & i6) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bj4VarO.A(i6 & 1, z2)) {
                if (i9 != 0) {
                    ox6Var4 = ox6.a.t;
                } else {
                    ox6Var4 = ox6Var2;
                }
                if (i4 != 0) {
                    jo3VarB = zg3.g(null, 15).b(zg3.d(null, 3));
                } else {
                    jo3VarB = jo3Var2;
                }
                tva tvaVarF3 = owa.f(Boolean.valueOf(z), "AnimatedVisibility", bj4VarO, (i6 & 14) | ((i6 >> 9) & 112));
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = a.u;
                    bj4VarO.C(objF);
                }
                oh4 oh4Var3 = (oh4) objF;
                int i12 = i6 << 3;
                e(tvaVarF3, oh4Var3, ox6Var4, uh3Var, jo3VarB, fr1Var, bj4VarO, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i6 & 458752));
                str2 = "AnimatedVisibility";
                ox6Var3 = ox6Var4;
                jo3Var3 = jo3VarB;
            } else {
                bj4VarO.u();
                ox6Var3 = ox6Var2;
                jo3Var3 = jo3Var2;
                str2 = str;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new b(z, ox6Var3, uh3Var, jo3Var3, str2, fr1Var, i, i2);
            }
        }
        i3 |= 3072;
        jo3Var2 = jo3Var;
        i6 = i3 | 24576;
        if ((196608 & i) == 0) {
            if (bj4VarO.j(fr1Var)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i6 |= i7;
        }
        if ((74899 & i6) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bj4VarO.A(i6 & 1, z2)) {
            if (i9 != 0) {
                ox6Var4 = ox6.a.t;
            } else {
                ox6Var4 = ox6Var2;
            }
            if (i4 != 0) {
                jo3VarB = zg3.g(null, 15).b(zg3.d(null, 3));
            } else {
                jo3VarB = jo3Var2;
            }
            tva tvaVarF4 = owa.f(Boolean.valueOf(z), "AnimatedVisibility", bj4VarO, (i6 & 14) | ((i6 >> 9) & 112));
            objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = a.u;
                bj4VarO.C(objF);
            }
            oh4 oh4Var4 = (oh4) objF;
            int i13 = i6 << 3;
            e(tvaVarF4, oh4Var4, ox6Var4, uh3Var, jo3VarB, fr1Var, bj4VarO, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (i6 & 458752));
            str2 = "AnimatedVisibility";
            ox6Var3 = ox6Var4;
            jo3Var3 = jo3VarB;
        } else {
            bj4VarO.u();
            ox6Var3 = ox6Var2;
            jo3Var3 = jo3Var2;
            str2 = str;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new b(z, ox6Var3, uh3Var, jo3Var3, str2, fr1Var, i, i2);
        }
    }

    public static final <T> void e(tva<T> tvaVar, oh4<? super T, Boolean> oh4Var, ox6 ox6Var, th3 th3Var, jo3 jo3Var, ei4<? super jv, ? super jt1, ? super Integer, g2b> ei4Var, jt1 jt1Var, int i) throws Throwable {
        int i2;
        th3 th3Var2;
        jo3 jo3Var2;
        ei4<? super jv, ? super jt1, ? super Integer, g2b> ei4Var2;
        bj4 bj4VarO = jt1Var.o(1706321816);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(tvaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(oh4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.J(ox6Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            th3Var2 = th3Var;
            i2 |= bj4VarO.J(th3Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        } else {
            th3Var2 = th3Var;
        }
        if ((i & 24576) == 0) {
            jo3Var2 = jo3Var;
            i2 |= bj4VarO.J(jo3Var2) ? 16384 : 8192;
        } else {
            jo3Var2 = jo3Var;
        }
        if ((i & 196608) == 0) {
            ei4Var2 = ei4Var;
            i2 |= bj4VarO.j(ei4Var2) ? 131072 : 65536;
        } else {
            ei4Var2 = ei4Var;
        }
        if (bj4VarO.A(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (z || objF == c0187a) {
                objF = new c(oh4Var, tvaVar);
                bj4VarO.C(objF);
            }
            ox6 ox6VarA = kr5.a(ox6Var, (ei4) objF);
            Object objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                objF2 = d.u;
                bj4VarO.C(objF2);
            }
            a(tvaVar, oh4Var, ox6VarA, th3Var2, jo3Var2, (ci4) objF2, ei4Var2, bj4VarO, 196608 | i4 | i3 | (i2 & 7168) | (57344 & i2) | ((i2 << 6) & 29360128));
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new e(tvaVar, oh4Var, ox6Var, th3Var, jo3Var, ei4Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final wg3 f(tva tvaVar, oh4 oh4Var, Object obj, jt1 jt1Var) {
        jt1Var.p(-422486745, tvaVar);
        boolean zG = tvaVar.g();
        l4c l4cVar = tvaVar.a;
        wg3 wg3Var = wg3.t;
        wg3 wg3Var2 = wg3.v;
        wg3 wg3Var3 = wg3.u;
        if (zG) {
            jt1Var.K(-212166497);
            jt1Var.B();
            if (((Boolean) oh4Var.invoke(obj)).booleanValue()) {
                wg3Var = wg3Var3;
            } else if (((Boolean) oh4Var.invoke(l4cVar.b())).booleanValue()) {
                wg3Var = wg3Var2;
            }
        } else {
            jt1Var.K(-211892364);
            Object objF = jt1Var.f();
            if (objF == jt1.a.a) {
                objF = bl7.i(Boolean.FALSE);
                jt1Var.C(objF);
            }
            h37 h37Var = (h37) objF;
            if (((Boolean) oh4Var.invoke(l4cVar.b())).booleanValue()) {
                h37Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) oh4Var.invoke(obj)).booleanValue()) {
                wg3Var = wg3Var3;
            } else if (((Boolean) h37Var.getValue()).booleanValue()) {
                wg3Var = wg3Var2;
            }
            jt1Var.B();
        }
        jt1Var.G();
        return wg3Var;
    }
}
