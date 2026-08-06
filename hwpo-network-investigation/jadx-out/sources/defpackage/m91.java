package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m91 extends dl0<n91, j81> {
    public static final /* synthetic */ int I = 0;
    public final yq6 A;
    public final yq6 B;
    public final yq6 C;
    public final yq6 D;
    public final yq6 E;
    public final yq6 F;
    public final yq6 G;
    public final yq6 H;
    public final l7b x;
    public final a91 y;
    public final cm3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m91(l7b l7bVar, a91 a91Var, cm3 cm3Var) {
        super(n91.i);
        l7bVar.getClass();
        a91Var.getClass();
        cm3Var.getClass();
        n91.Companion.getClass();
        this.x = l7bVar;
        this.y = a91Var;
        this.z = cm3Var;
        this.A = oh7.a(this.u, new t00(1));
        this.B = oh7.a(this.u, new c91(0));
        this.C = oh7.a(this.u, new d91(0));
        this.D = oh7.a(this.u, new e91(0));
        this.E = oh7.a(this.u, new f91(0));
        this.F = oh7.a(this.u, new g91());
        this.G = oh7.a(this.u, new h91(0));
        this.H = oh7.a(this.u, new i91(0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object g(m91 m91Var, u02 u02Var) throws Throwable {
        k91 k91Var;
        if (u02Var instanceof k91) {
            k91Var = (k91) u02Var;
            int i = k91Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                k91Var.v = i - Integer.MIN_VALUE;
            } else {
                k91Var = new k91(m91Var, u02Var);
            }
        } else {
            k91Var = new k91(m91Var, u02Var);
        }
        Object objB = k91Var.t;
        int i2 = k91Var.v;
        if (i2 == 0) {
            dv8.b(objB);
            m91Var.e(j81.f.a);
            a91 a91Var = m91Var.y;
            a91.a aVar = new a91.a(m91Var.b().a, m91Var.b().b, m91Var.b().c);
            k91Var.v = 1;
            a91Var.getClass();
            objB = g5b.b(a91Var, aVar, k91Var);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objB);
        }
        xd3 xd3Var = (xd3) objB;
        xd3Var.getClass();
        m91Var.e(j81.b.a);
        g2b g2bVar = g2b.a;
        l91 l91Var = new l91(1, m91Var, m91.class, "onError", "onError(Ljava/lang/Exception;)V", 0);
        if (xd3Var instanceof xd3.a) {
            l91Var.invoke(((xd3.a) xd3Var).a);
        } else {
            if (!(xd3Var instanceof xd3.b)) {
                u.b();
                return null;
            }
            ((g2b) ((xd3.b) xd3Var).a).getClass();
            m91Var.f(new w81.a(o81.b.t));
        }
        return g2b.a;
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof j81.f) {
            return n91.a(b(), null, null, null, null, null, null, false, true, 127);
        }
        if (bl0Var instanceof j81.b) {
            return n91.a(b(), null, null, null, null, null, null, false, false, 127);
        }
        if (bl0Var instanceof j81.a) {
            return n91.a(b(), ((j81.a) bl0Var).a, null, null, null, null, null, false, false, 246);
        }
        if (bl0Var instanceof j81.d) {
            return n91.a(b(), null, ((j81.d) bl0Var).a, null, null, null, null, false, false, 237);
        }
        if (bl0Var instanceof j81.c) {
            return n91.a(b(), null, null, ((j81.c) bl0Var).a, null, null, null, false, false, 219);
        }
        if (bl0Var instanceof j81.g) {
            return n91.a(b(), null, null, null, null, null, null, ((j81.g) bl0Var).a, false, 191);
        }
        if (!(bl0Var instanceof j81.e)) {
            return b();
        }
        j81.e eVar = (j81.e) bl0Var;
        return n91.a(b(), null, null, null, eVar.a, eVar.b, eVar.c, false, false, 199);
    }

    public final void i() {
        n91 n91VarB = b();
        e(new j81.g((z2a.w(n91VarB.a) || z2a.w(n91VarB.b) || z2a.w(n91VarB.c)) ? false : true));
    }
}
