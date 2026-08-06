package defpackage;

import com.hwpo_training_app.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ct8 extends dl0<dt8, yr8> {
    public static final /* synthetic */ int L = 0;
    public final dl4 A;
    public final cm3 B;
    public final bu8 C;
    public final dm9 D;
    public final yq6 E;
    public final yq6 F;
    public final yq6 G;
    public final yq6 H;
    public final yq6 I;
    public final yq6 J;
    public final yq6 K;
    public final ts8 x;
    public final q09 y;
    public final us8 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct8(ts8 ts8Var, q09 q09Var, us8 us8Var, dl4 dl4Var, uc9 uc9Var, cm3 cm3Var, bu8 bu8Var, dm9 dm9Var) {
        super(dt8.j);
        ts8Var.getClass();
        q09Var.getClass();
        us8Var.getClass();
        dl4Var.getClass();
        uc9Var.getClass();
        cm3Var.getClass();
        bu8Var.getClass();
        dm9Var.getClass();
        dt8.Companion.getClass();
        this.x = ts8Var;
        this.y = q09Var;
        this.z = us8Var;
        this.A = dl4Var;
        this.B = cm3Var;
        this.C = bu8Var;
        this.D = dm9Var;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d MMM y", Locale.getDefault());
        this.E = oh7.a(this.u, new a8(1));
        this.F = oh7.a(this.u, new b8(2));
        this.G = oh7.a(this.u, new r42(1));
        this.H = oh7.a(this.u, new d8(2));
        this.I = oh7.a(this.u, new t47(1));
        this.J = oh7.a(this.u, new t42(2));
        this.K = oh7.a(this.u, new w47(2));
        Integer num = (Integer) q09Var.a("com.hwpo_training_app.reschedule.presentation.RescheduleFragment.PLAN_ID");
        int iIntValue = num != null ? num.intValue() : 0;
        String str = simpleDateFormat.format(new Date());
        str.getClass();
        e(new yr8.b(iIntValue, str));
        oy0.d(rhb.b(this), null, null, new at8(this, null), 3);
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof yr8.b) {
            yr8.b bVar = (yr8.b) bl0Var;
            return dt8.a(b(), bVar.a, bVar.b, 0, false, null, false, null, false, null, 508);
        }
        if (bl0Var instanceof yr8.f) {
            dt8 dt8VarB = b();
            Integer num = ((yr8.f) bl0Var).a;
            return dt8.a(dt8VarB, 0, null, 0, false, num, num != null, null, false, null, 399);
        }
        if (bl0Var instanceof yr8.g) {
            return dt8.a(b(), 0, null, ((yr8.g) bl0Var).a, true, null, false, null, false, vz7.a(b().i), 243);
        }
        if (bl0Var instanceof yr8.c) {
            return dt8.a(b(), 0, null, 0, false, null, false, ((yr8.c) bl0Var).a, false, null, 415);
        }
        if (bl0Var instanceof yr8.e) {
            return dt8.a(b(), 0, null, 0, false, null, false, null, true, vz7.a(b().i), 119);
        }
        if (!(bl0Var instanceof yr8.d)) {
            return bl0Var instanceof yr8.a ? dt8.a(b(), 0, null, 0, false, null, false, null, false, null, 383) : b();
        }
        dt8 dt8VarB2 = b();
        bu8 bu8Var = this.C;
        return dt8.a(dt8VarB2, 0, null, 0, false, null, false, null, false, new vz7(0, true, true, bu8Var.b(R.string.something_went_wrong, new Object[0]), bu8Var.b(R.string.no_internet_description, new Object[0]), bu8Var.b(R.string.reload, new Object[0]), 65), 255);
    }
}
