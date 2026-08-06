package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class tsb extends dl0<usb, gsb> {
    public static final /* synthetic */ int F = 0;
    public final bu8 A;
    public final yq6 B;
    public final yq6 C;
    public final yq6 D;
    public final yq6 E;
    public final is4 x;
    public final w3b y;
    public final cm3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsb(q09 q09Var, is4 is4Var, w3b w3bVar, cm3 cm3Var, bu8 bu8Var) {
        super(new usb(false, null, null));
        q09Var.getClass();
        is4Var.getClass();
        w3bVar.getClass();
        cm3Var.getClass();
        bu8Var.getClass();
        usb.Companion.getClass();
        this.x = is4Var;
        this.y = w3bVar;
        this.z = cm3Var;
        this.A = bu8Var;
        this.B = oh7.a(this.u, new ey5(1));
        this.C = oh7.a(this.u, new rsb());
        int i = 2;
        this.D = oh7.a(this.u, new n70(i));
        this.E = oh7.a(this.u, new g32(i, this));
        yp4 yp4Var = (yp4) q09Var.a("com.hwpo_training_app.your_gym.presentation.YourGymFragment.SELECTED_GYM_KEY");
        e(new gsb.b(yp4Var));
        e(new gsb.c(yp4Var));
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof gsb.d) {
            return usb.a(b(), true, null, null, 6);
        }
        if (bl0Var instanceof gsb.a) {
            return usb.a(b(), false, null, null, 6);
        }
        if (bl0Var instanceof gsb.c) {
            return usb.a(b(), false, null, ((gsb.c) bl0Var).a, 3);
        }
        return bl0Var instanceof gsb.b ? usb.a(b(), false, ((gsb.b) bl0Var).a, null, 5) : b();
    }
}
