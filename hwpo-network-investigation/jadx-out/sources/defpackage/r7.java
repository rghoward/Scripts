package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class r7 extends dl0<t7, m6> {
    public static final /* synthetic */ int G = 0;
    public final yq6 A;
    public final yq6 B;
    public final yq6 C;
    public final yq6 D;
    public final yq6 E;
    public final yq6 F;
    public final u3b x;
    public final yj9 y;
    public final cm3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(ze7 ze7Var, u3b u3bVar, yj9 yj9Var, cm3 cm3Var) {
        super(t7.g);
        ze7Var.getClass();
        u3bVar.getClass();
        yj9Var.getClass();
        cm3Var.getClass();
        t7.Companion.getClass();
        this.x = u3bVar;
        this.y = yj9Var;
        this.z = cm3Var;
        this.A = oh7.a(this.u, new h7(0));
        this.B = oh7.a(this.u, new i7());
        this.C = oh7.a(this.u, new j7());
        this.D = oh7.a(this.u, new k7());
        this.E = oh7.a(this.u, new l7(0));
        this.F = oh7.a(this.u, new m7(0));
        yk2.o(new k74(ze7Var.b(g2b.a), new p7(this, null)), rhb.b(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object g(r7 r7Var, z3b z3bVar, r02 r02Var) throws Throwable {
        n7 n7Var;
        r7Var.getClass();
        if (r02Var instanceof n7) {
            n7Var = (n7) r02Var;
            int i = n7Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                n7Var.w = i - Integer.MIN_VALUE;
            } else {
                n7Var = new n7(r7Var, r02Var);
            }
        } else {
            n7Var = new n7(r7Var, r02Var);
        }
        Object objB = n7Var.u;
        int i2 = n7Var.w;
        if (i2 == 0) {
            dv8.b(objB);
            if (!z3bVar.a) {
                return new xd3.b(z3bVar);
            }
            yj9 yj9Var = r7Var.y;
            s10 s10Var = r7Var.b().d;
            if (s10Var == null) {
                return new xd3.a(new IllegalArgumentException("selectedLanguage = null"));
            }
            n7Var.t = z3bVar;
            n7Var.w = 1;
            yj9Var.getClass();
            objB = g5b.b(yj9Var, s10Var, n7Var);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z3bVar = n7Var.t;
            dv8.b(objB);
        }
        xd3 xd3Var = (xd3) objB;
        xd3Var.getClass();
        yd3.c cVar = new yd3.c(xd3Var);
        if (xd3Var instanceof xd3.a) {
            return new xd3.a(((xd3.a) xd3Var).a);
        }
        if (xd3Var instanceof xd3.b) {
            ((g2b) ((xd3.b) xd3Var).a).getClass();
            return (xd3) cVar.invoke(z3bVar);
        }
        u.b();
        return null;
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        zlb zlbVar;
        bl0Var.getClass();
        if (bl0Var instanceof m6.e) {
            return t7.a(b(), null, null, null, null, false, true, 31);
        }
        if (bl0Var instanceof m6.b) {
            return t7.a(b(), null, null, null, null, false, false, 31);
        }
        if (bl0Var instanceof m6.f) {
            return t7.a(b(), null, null, null, null, ((m6.f) bl0Var).a, false, 47);
        }
        if (bl0Var instanceof m6.c) {
            return t7.a(b(), ((m6.c) bl0Var).a, null, null, null, false, false, 62);
        }
        if (bl0Var instanceof m6.h) {
            return t7.a(b(), null, ((m6.h) bl0Var).a, null, null, false, false, 61);
        }
        if (bl0Var instanceof m6.a) {
            return t7.a(b(), null, null, ((m6.a) bl0Var).a, null, false, false, 59);
        }
        if (bl0Var instanceof m6.d) {
            return t7.a(b(), null, null, null, ((m6.d) bl0Var).a, false, false, 55);
        }
        if (!(bl0Var instanceof m6.g)) {
            return b();
        }
        t7 t7VarB = b();
        h5b h5bVar = ((m6.g) bl0Var).a;
        uj4 uj4Var = h5bVar.k;
        o33 o33Var = null;
        wj4 wj4VarB = uj4Var != null ? l1b.b(uj4Var) : null;
        ylb ylbVar = h5bVar.l;
        if (ylbVar != null) {
            int iOrdinal = ylbVar.ordinal();
            if (iOrdinal == 0) {
                zlbVar = zlb.t;
            } else {
                if (iOrdinal != 1) {
                    u.b();
                    return null;
                }
                zlbVar = zlb.u;
            }
        } else {
            zlbVar = null;
        }
        n33 n33Var = h5bVar.m;
        if (n33Var != null) {
            int iOrdinal2 = n33Var.ordinal();
            if (iOrdinal2 == 0) {
                o33Var = o33.t;
            } else {
                if (iOrdinal2 != 1) {
                    u.b();
                    return null;
                }
                o33Var = o33.u;
            }
        }
        return t7.a(t7VarB, wj4VarB, zlbVar, o33Var, h5bVar.p, false, false, 48);
    }
}
