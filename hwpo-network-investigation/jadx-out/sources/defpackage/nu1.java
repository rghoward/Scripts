package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nu1 {
    /* JADX WARN: Code duplicated, block: B:46:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
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
    public static final void a(final kf8<?> kf8Var, final ci4<? super jt1, ? super Integer, g2b> ci4Var, jt1 jt1Var, final int i) {
        oab oabVar;
        boolean z;
        xj8 xj8VarW;
        bj4 bj4VarO = jt1Var.o(-149765515);
        mg5 mg5Var = bj4VarO.x;
        kw7 kw7VarP = bj4VarO.P();
        bj4VarO.w0(201, pt1.b);
        Object objF = bj4VarO.f();
        if (xj5.a(objF, jt1.a.a)) {
            oabVar = null;
        } else {
            objF.getClass();
            oabVar = (oab) objF;
        }
        hf8 hf8Var = kf8Var.a;
        oab oabVarC = hf8Var.c(kf8Var, oabVar);
        boolean zEquals = oabVarC.equals(oabVar);
        if (!zEquals) {
            bj4VarO.C(oabVarC);
        }
        if (!bj4VarO.S) {
            yr9 yr9Var = bj4VarO.G;
            Object objB = yr9Var.b(yr9Var.b, yr9Var.g);
            objB.getClass();
            kw7 kw7Var = (kw7) objB;
            if (!(bj4VarO.r() && zEquals) && (kf8Var.f || !kw7VarP.containsKey(hf8Var))) {
                kw7VarP = kw7VarP.x0(hf8Var, oabVarC);
            } else if ((zEquals && !bj4VarO.w) || !bj4VarO.w) {
                kw7VarP = kw7Var;
            }
            if (bj4VarO.y || kw7Var != kw7VarP) {
                z = true;
            }
            if (z && !bj4VarO.S) {
                bj4VarO.m0(kw7VarP);
            }
            mg5Var.c(bj4VarO.w ? 1 : 0);
            bj4VarO.w = z;
            bj4VarO.K = kw7VarP;
            bj4VarO.u0(202, 0, pt1.c, kw7VarP);
            ci4Var.invoke(bj4VarO, Integer.valueOf((i >> 3) & 14));
            bj4VarO.U(false);
            bj4VarO.U(false);
            bj4VarO.w = mg5Var.b() != 0;
            bj4VarO.K = null;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: lu1
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        int iS = gz3.s(i | 1);
                        nu1.a(kf8Var, ci4Var, (jt1) obj, iS);
                        return g2b.a;
                    }
                };
            }
        }
        if (kf8Var.f || !kw7VarP.containsKey(hf8Var)) {
            kw7VarP = kw7VarP.x0(hf8Var, oabVarC);
        }
        bj4VarO.J = true;
        z = false;
        if (z) {
            bj4VarO.m0(kw7VarP);
        }
        mg5Var.c(bj4VarO.w ? 1 : 0);
        bj4VarO.w = z;
        bj4VarO.K = kw7VarP;
        bj4VarO.u0(202, 0, pt1.c, kw7VarP);
        ci4Var.invoke(bj4VarO, Integer.valueOf((i >> 3) & 14));
        bj4VarO.U(false);
        bj4VarO.U(false);
        bj4VarO.w = mg5Var.b() != 0;
        bj4VarO.K = null;
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: lu1
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iS = gz3.s(i | 1);
                    nu1.a(kf8Var, ci4Var, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00da  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
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
    public static final void b(final kf8<?>[] kf8VarArr, final ci4<? super jt1, ? super Integer, g2b> ci4Var, jt1 jt1Var, final int i) {
        kw7 kw7VarA;
        boolean z;
        xj8 xj8VarW;
        bj4 bj4VarO = jt1Var.o(415205898);
        mg5 mg5Var = bj4VarO.x;
        kw7 kw7VarP = bj4VarO.P();
        bj4VarO.w0(201, pt1.b);
        boolean z2 = bj4VarO.S;
        fk7 fk7Var = pt1.d;
        if (z2) {
            kw7 kw7VarB = pu1.b(kf8VarArr, kw7VarP, jw7.w);
            jw7.a aVarBuilder = kw7VarP.builder();
            aVarBuilder.putAll(kw7VarB);
            kw7VarA = aVarBuilder.a();
            bj4VarO.w0(204, fk7Var);
            bj4VarO.g0();
            bj4VarO.D0(kw7VarA);
            bj4VarO.g0();
            bj4VarO.D0(kw7VarB);
            bj4VarO.U(false);
            bj4VarO.J = true;
        } else {
            yr9 yr9Var = bj4VarO.G;
            Object objH = yr9Var.h(yr9Var.g, 0);
            objH.getClass();
            kw7 kw7Var = (kw7) objH;
            yr9 yr9Var2 = bj4VarO.G;
            Object objH2 = yr9Var2.h(yr9Var2.g, 1);
            objH2.getClass();
            kw7 kw7Var2 = (kw7) objH2;
            kw7 kw7VarB2 = pu1.b(kf8VarArr, kw7VarP, kw7Var2);
            if (!bj4VarO.r() || bj4VarO.y || !kw7Var2.equals(kw7VarB2)) {
                jw7.a aVarBuilder2 = kw7VarP.builder();
                aVarBuilder2.putAll(kw7VarB2);
                kw7VarA = aVarBuilder2.a();
                bj4VarO.w0(204, fk7Var);
                bj4VarO.g0();
                bj4VarO.D0(kw7VarA);
                bj4VarO.g0();
                bj4VarO.D0(kw7VarB2);
                bj4VarO.U(false);
                if (bj4VarO.y || !xj5.a(kw7VarA, kw7Var)) {
                    z = true;
                }
                if (z && !bj4VarO.S) {
                    bj4VarO.m0(kw7VarA);
                }
                mg5Var.c(bj4VarO.w ? 1 : 0);
                bj4VarO.w = z;
                bj4VarO.K = kw7VarA;
                bj4VarO.u0(202, 0, pt1.c, kw7VarA);
                ci4Var.invoke(bj4VarO, Integer.valueOf((i >> 3) & 14));
                bj4VarO.U(false);
                bj4VarO.U(false);
                bj4VarO.w = mg5Var.b() != 0;
                bj4VarO.K = null;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: mu1
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iS = gz3.s(i | 1);
                            nu1.b(kf8VarArr, ci4Var, (jt1) obj, iS);
                            return g2b.a;
                        }
                    };
                }
            }
            bj4VarO.l = bj4VarO.G.s() + bj4VarO.l;
            kw7VarA = kw7Var;
        }
        z = false;
        if (z) {
            bj4VarO.m0(kw7VarA);
        }
        mg5Var.c(bj4VarO.w ? 1 : 0);
        bj4VarO.w = z;
        bj4VarO.K = kw7VarA;
        bj4VarO.u0(202, 0, pt1.c, kw7VarA);
        ci4Var.invoke(bj4VarO, Integer.valueOf((i >> 3) & 14));
        bj4VarO.U(false);
        bj4VarO.U(false);
        bj4VarO.w = mg5Var.b() != 0;
        bj4VarO.K = null;
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: mu1
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i | 1);
                    nu1.b(kf8VarArr, ci4Var, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }
}
