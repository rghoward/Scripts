package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fj7 extends dl0<hj7, mi7> {
    public static final /* synthetic */ int K = 0;
    public final u3b A;
    public final yj9 B;
    public final ju3 C;
    public final xo1 D;
    public final cm3 E;
    public final yq6 F;
    public final yq6 G;
    public final yq6 H;
    public final yq6 I;
    public final yq6 J;
    public final o52 x;
    public final ze7 y;
    public final b87 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj7(o52 o52Var, ze7 ze7Var, b87 b87Var, u3b u3bVar, yj9 yj9Var, ju3 ju3Var, xo1 xo1Var, cm3 cm3Var) {
        super(hj7.g);
        o52Var.getClass();
        ze7Var.getClass();
        b87Var.getClass();
        u3bVar.getClass();
        yj9Var.getClass();
        ju3Var.getClass();
        xo1Var.getClass();
        cm3Var.getClass();
        hj7.Companion.getClass();
        this.x = o52Var;
        this.y = ze7Var;
        this.z = b87Var;
        this.A = u3bVar;
        this.B = yj9Var;
        this.C = ju3Var;
        this.D = xo1Var;
        this.E = cm3Var;
        this.F = oh7.a(this.u, new b60(2));
        this.G = oh7.a(this.u, new c60(2));
        this.H = oh7.a(this.u, new d60(2));
        this.I = oh7.a(this.u, new xk3(1));
        this.J = oh7.a(this.u, new yk3(2));
        oy0.d(rhb.b(this), null, null, new cj7(this, null), 3);
    }

    public static final void g(fj7 fj7Var, Exception exc) {
        fj7Var.getClass();
        rma.a.b(exc);
        fj7Var.f(new ni7.b(fj7Var.E.a(exc)));
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        zlb zlbVar;
        bl0Var.getClass();
        if (bl0Var instanceof mi7.e) {
            return hj7.a(b(), null, null, null, false, true, null, 47);
        }
        if (bl0Var instanceof mi7.b) {
            return hj7.a(b(), null, null, null, false, false, null, 47);
        }
        if (bl0Var instanceof mi7.c) {
            return hj7.a(b(), ((mi7.c) bl0Var).a, null, null, false, false, null, 62);
        }
        if (bl0Var instanceof mi7.h) {
            return hj7.a(b(), null, ((mi7.h) bl0Var).a, null, false, false, null, 61);
        }
        if (bl0Var instanceof mi7.d) {
            return hj7.a(b(), null, null, null, false, false, ((mi7.d) bl0Var).a, 31);
        }
        if (bl0Var instanceof mi7.f) {
            return hj7.a(b(), null, null, null, ((mi7.f) bl0Var).a, false, null, 55);
        }
        if (bl0Var instanceof mi7.a) {
            return hj7.a(b(), null, null, ((mi7.a) bl0Var).a, false, false, null, 59);
        }
        if (!(bl0Var instanceof mi7.g)) {
            return b();
        }
        hj7 hj7VarB = b();
        h5b h5bVar = ((mi7.g) bl0Var).a;
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
        return hj7.a(hj7VarB, wj4VarB, zlbVar, o33Var, false, false, h5bVar.p, 24);
    }
}
