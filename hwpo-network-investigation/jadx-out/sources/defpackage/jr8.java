package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jr8 extends dl0<or8, br8> {
    public static final a Companion = new a();
    public final cm3 A;
    public final int B;
    public final yq6 C;
    public final yq6 D;
    public final yq6 E;
    public final yq6 F;
    public final cl4 x;
    public final c09 y;
    public final bu8 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr8(cl4 cl4Var, c09 c09Var, bu8 bu8Var, cm3 cm3Var, q09 q09Var) {
        super(or8.e);
        cl4Var.getClass();
        c09Var.getClass();
        bu8Var.getClass();
        cm3Var.getClass();
        q09Var.getClass();
        or8.Companion.getClass();
        this.x = cl4Var;
        this.y = c09Var;
        this.z = bu8Var;
        this.A = cm3Var;
        Object objA = q09Var.a("arg_title");
        if (objA == null) {
            z90.a("Required value was null.");
            throw null;
        }
        this.B = ((Number) objA).intValue();
        this.C = oh7.a(this.u, new tk1(1));
        this.D = oh7.a(this.u, new uk1(2));
        this.E = oh7.a(this.u, new kv4(2));
        this.F = oh7.a(this.u, new c42(3));
        oy0.d(rhb.b(this), null, null, new kr8(this, null), 3);
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof br8.c) {
            return or8.a(b(), null, null, false, true, 7);
        }
        if (bl0Var instanceof br8.a) {
            return or8.a(b(), null, null, false, false, 7);
        }
        if (!(bl0Var instanceof br8.b)) {
            return bl0Var instanceof br8.d ? or8.a(b(), null, null, ((br8.d) bl0Var).a, false, 11) : b();
        }
        br8.b bVar = (br8.b) bl0Var;
        return or8.a(b(), bVar.a, bVar.b, false, false, 12);
    }
}
