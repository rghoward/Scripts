package defpackage;

import wb5.a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cc5 {
    public static final wb5.a a(wb5 wb5Var, float f, float f2, ub5 ub5Var, String str, jt1 jt1Var, int i, int i2) {
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        return b(wb5Var, Float.valueOf(f), Float.valueOf(f2), b0a.v, ub5Var, str, jt1Var, 33208 | ((i << 3) & 458752));
    }

    public static final wb5.a b(wb5 wb5Var, Object obj, Object obj2, cza czaVar, ub5 ub5Var, String str, jt1 jt1Var, int i) {
        final wb5 wb5Var2;
        final Object obj3;
        final Object obj4;
        final ub5 ub5Var2;
        Object objF = jt1Var.f();
        jt1.a.C0187a c0187a = jt1.a.a;
        if (objF == c0187a) {
            wb5Var2 = wb5Var;
            obj3 = obj;
            obj4 = obj2;
            ub5Var2 = ub5Var;
            wb5.a aVar = wb5Var2.new a(obj3, obj4, czaVar, ub5Var2);
            jt1Var.C(aVar);
            objF = aVar;
        } else {
            wb5Var2 = wb5Var;
            obj3 = obj;
            obj4 = obj2;
            ub5Var2 = ub5Var;
        }
        final wb5.a aVar2 = (wb5.a) objF;
        boolean z = ((((i & 112) ^ 48) > 32 && jt1Var.j(obj3)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && jt1Var.j(obj4)) || (i & 384) == 256) | ((((57344 & i) ^ 24576) > 16384 && jt1Var.j(ub5Var2)) || (i & 24576) == 16384);
        Object objF2 = jt1Var.f();
        if (z || objF2 == c0187a) {
            objF2 = new mh4() { // from class: zb5
                /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.Object] */
                @Override // defpackage.mh4
                public final Object invoke() {
                    wb5.a aVar3 = aVar2;
                    T t = aVar3.t;
                    ?? r5 = obj3;
                    boolean zEquals = r5.equals(t);
                    ?? r6 = obj4;
                    if (!zEquals || !r6.equals(aVar3.u)) {
                        aVar3.t = r5;
                        aVar3.u = r6;
                        ub5 ub5Var3 = ub5Var2;
                        aVar3.x = ub5Var3;
                        aVar3.y = new l9a<>(ub5Var3, aVar3.v, r5, r6, null);
                        wb5.this.b.setValue(Boolean.TRUE);
                        aVar3.z = false;
                        aVar3.A = true;
                    }
                    return g2b.a;
                }
            };
            jt1Var.C(objF2);
        }
        c33 c33Var = wd3.a;
        jt1Var.w((mh4) objF2);
        boolean zJ = jt1Var.j(wb5Var2);
        Object objF3 = jt1Var.f();
        if (zJ || objF3 == c0187a) {
            objF3 = new oh4() { // from class: ac5
                @Override // defpackage.oh4
                public final Object invoke(Object obj5) {
                    wb5 wb5Var3 = wb5Var2;
                    k37<wb5.a<?, ?>> k37Var = wb5Var3.a;
                    wb5.a aVar3 = aVar2;
                    k37Var.d(aVar3);
                    wb5Var3.b.setValue(Boolean.TRUE);
                    return new bc5(wb5Var3, aVar3);
                }
            };
            jt1Var.C(objF3);
        }
        wd3.a(aVar2, (oh4) objF3, jt1Var);
        return aVar2;
    }

    public static final wb5 c(String str, jt1 jt1Var, int i) {
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new wb5();
            jt1Var.C(objF);
        }
        wb5 wb5Var = (wb5) objF;
        wb5Var.a(jt1Var, 0);
        return wb5Var;
    }
}
