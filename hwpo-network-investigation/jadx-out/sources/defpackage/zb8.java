package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zb8 extends dl0<ac8, va8> {
    public static final /* synthetic */ int I = 0;
    public final rd6 A;
    public final cm3 B;
    public final yq6 C;
    public final yq6 D;
    public final yq6 E;
    public final yq6 F;
    public final yq6 G;
    public final yq6 H;
    public final pb8 x;
    public final y3b y;
    public final yj9 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb8(pb8 pb8Var, ze7 ze7Var, y3b y3bVar, yj9 yj9Var, rd6 rd6Var, cm3 cm3Var) {
        super(new ac8(false, false, null, BuildConfig.FLAVOR, null, BuildConfig.FLAVOR, null));
        pb8Var.getClass();
        ze7Var.getClass();
        y3bVar.getClass();
        yj9Var.getClass();
        rd6Var.getClass();
        cm3Var.getClass();
        ac8.Companion.getClass();
        this.x = pb8Var;
        this.y = y3bVar;
        this.z = yj9Var;
        this.A = rd6Var;
        this.B = cm3Var;
        this.C = oh7.a(this.u, new sb8(0));
        this.D = oh7.a(this.u, new tb8(0));
        this.E = oh7.a(this.u, new ub8(0));
        this.F = oh7.a(this.u, new m72(1));
        this.G = oh7.a(this.u, new dp6(2));
        this.H = oh7.a(this.u, new ep6(1));
        yk2.o(new k74(ze7Var.b(g2b.a), new wb8(this, null)), rhb.b(this));
        oy0.d(rhb.b(this), null, null, new yb8(this, null), 3);
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        String strValueOf;
        String str;
        bl0Var.getClass();
        if (bl0Var instanceof va8.c) {
            return ac8.a(b(), true, false, 126);
        }
        if (bl0Var instanceof va8.a) {
            return ac8.a(b(), false, false, 126);
        }
        if (bl0Var instanceof va8.d) {
            return ac8.a(b(), false, true, 125);
        }
        if (bl0Var instanceof va8.b) {
            return ac8.a(b(), false, false, 125);
        }
        if (!(bl0Var instanceof va8.e)) {
            return b();
        }
        b();
        h5b h5bVar = ((va8.e) bl0Var).a;
        String str2 = h5bVar.f;
        String str3 = h5bVar.b;
        String str4 = h5bVar.c;
        String str5 = (str4 == null || (strValueOf = String.valueOf(a3a.S(str4))) == null || !((str = h5bVar.f) == null || z2a.w(str))) ? null : strValueOf;
        String str6 = h5bVar.e;
        s10 s10Var = h5bVar.p;
        str3.getClass();
        str6.getClass();
        return new ac8(false, false, str2, str3, str5, str6, s10Var);
    }
}
