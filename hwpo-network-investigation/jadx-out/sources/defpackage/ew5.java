package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ew5 {
    public final f09 a;
    public final yb5 b;
    public final c37<Object, a> c = z39.b();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a {
        public final Object a;
        public final Object b;
        public int c;
        public fr1 d;

        public a(int i, Object obj, Object obj2) {
            this.a = obj;
            this.b = obj2;
            this.c = i;
        }
    }

    public ew5(f09 f09Var, yb5 yb5Var) {
        this.a = f09Var;
        this.b = yb5Var;
    }

    public final ci4<jt1, Integer, g2b> a(int i, Object obj, Object obj2) {
        c37<Object, a> c37Var = this.c;
        final a aVarD = c37Var.d(obj);
        if (aVarD != null && aVarD.c == i && xj5.a(aVarD.b, obj2)) {
            fr1 fr1Var = aVarD.d;
            if (fr1Var != null) {
                return fr1Var;
            }
            final ew5 ew5Var = ew5.this;
            fr1 fr1Var2 = new fr1(true, 818252804, new ci4() { // from class: cw5
                @Override // defpackage.ci4
                public final Object invoke(Object obj3, Object obj4) {
                    jt1 jt1Var = (jt1) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if (jt1Var.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ew5 ew5Var2 = this.t;
                        hw5 hw5Var = (hw5) ew5Var2.b.invoke();
                        ew5.a aVar = aVarD;
                        int iD = aVar.c;
                        Object obj5 = aVar.a;
                        if ((iD >= hw5Var.b() || !hw5Var.f(iD).equals(obj5)) && (iD = hw5Var.d(obj5)) != -1) {
                            aVar.c = iD;
                        }
                        if (iD != -1) {
                            jt1Var.K(-1664741271);
                            lb5.a(hw5Var, ew5Var2.a, iD, aVar.a, jt1Var, 0);
                            jt1Var.B();
                        } else {
                            jt1Var.K(-1664505826);
                            jt1Var.B();
                        }
                        boolean zJ = jt1Var.j(aVar);
                        Object objF = jt1Var.f();
                        if (zJ || objF == jt1.a.a) {
                            objF = new s1(3, aVar);
                            jt1Var.C(objF);
                        }
                        wd3.a(obj5, (oh4) objF, jt1Var);
                    } else {
                        jt1Var.u();
                    }
                    return g2b.a;
                }
            });
            aVarD.d = fr1Var2;
            return fr1Var2;
        }
        final a aVar = new a(i, obj, obj2);
        c37Var.m(obj, aVar);
        fr1 fr1Var3 = aVar.d;
        if (fr1Var3 != null) {
            return fr1Var3;
        }
        fr1 fr1Var4 = new fr1(true, 818252804, new ci4() { // from class: cw5
            @Override // defpackage.ci4
            public final Object invoke(Object obj3, Object obj4) {
                jt1 jt1Var = (jt1) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if (jt1Var.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ew5 ew5Var2 = this.t;
                    hw5 hw5Var = (hw5) ew5Var2.b.invoke();
                    ew5.a aVar2 = aVar;
                    int iD = aVar2.c;
                    Object obj5 = aVar2.a;
                    if ((iD >= hw5Var.b() || !hw5Var.f(iD).equals(obj5)) && (iD = hw5Var.d(obj5)) != -1) {
                        aVar2.c = iD;
                    }
                    if (iD != -1) {
                        jt1Var.K(-1664741271);
                        lb5.a(hw5Var, ew5Var2.a, iD, aVar2.a, jt1Var, 0);
                        jt1Var.B();
                    } else {
                        jt1Var.K(-1664505826);
                        jt1Var.B();
                    }
                    boolean zJ = jt1Var.j(aVar2);
                    Object objF = jt1Var.f();
                    if (zJ || objF == jt1.a.a) {
                        objF = new s1(3, aVar2);
                        jt1Var.C(objF);
                    }
                    wd3.a(obj5, (oh4) objF, jt1Var);
                } else {
                    jt1Var.u();
                }
                return g2b.a;
            }
        });
        aVar.d = fr1Var4;
        return fr1Var4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVarD = this.c.d(obj);
        if (aVarD != null) {
            return aVarD.b;
        }
        hw5 hw5Var = (hw5) this.b.invoke();
        int iD = hw5Var.d(obj);
        if (iD != -1) {
            return hw5Var.g(iD);
        }
        return null;
    }
}
