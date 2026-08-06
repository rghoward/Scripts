package defpackage;

import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ybb extends dl0<icb, hbb> {
    public static final a Companion = new a();
    public final dx2 A;
    public final ll4 B;
    public final bu8 C;
    public final cm3 D;
    public String E;
    public final DecimalFormat F;
    public Integer G;
    public boolean H;
    public final ebb I;
    public final yq6 J;
    public final yq6 K;
    public final yq6 L;
    public final pta x;
    public final vq8 y;
    public final of7 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybb(q09 q09Var, pta ptaVar, vq8 vq8Var, of7 of7Var, mf7 mf7Var, dx2 dx2Var, ll4 ll4Var, bu8 bu8Var, cm3 cm3Var) {
        super(icb.f);
        q09Var.getClass();
        ptaVar.getClass();
        vq8Var.getClass();
        of7Var.getClass();
        mf7Var.getClass();
        dx2Var.getClass();
        ll4Var.getClass();
        bu8Var.getClass();
        cm3Var.getClass();
        icb.Companion.getClass();
        this.x = ptaVar;
        this.y = vq8Var;
        this.z = of7Var;
        this.A = dx2Var;
        this.B = ll4Var;
        this.C = bu8Var;
        this.D = cm3Var;
        this.E = BuildConfig.FLAVOR;
        this.F = new DecimalFormat("0.###");
        ebb ebbVar = (ebb) q09Var.a("com.fitr_training.tracking.presentation.values_list.ValuesListFragment.VALUE_TYPE");
        if (ebbVar == null) {
            z90.a("VALUE_TYPE must not be null");
            throw null;
        }
        this.I = ebbVar;
        yk2.o(new k74(new jm2(mf7Var.b(g2b.a), this, 1), new bcb(this, null)), rhb.b(this));
        g(BuildConfig.FLAVOR);
        oy0.d(rhb.b(this), null, null, new gcb(this, null), 3);
        this.J = oh7.a(this.u, new g9(3));
        this.K = oh7.a(this.u, new on1(1));
        this.L = oh7.a(this.u, new fz0(3));
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        vz7 vz7Var;
        String strB;
        String strB2;
        bl0Var.getClass();
        if (bl0Var instanceof hbb.a) {
            return icb.a(b(), null, false, false, ((hbb.a) bl0Var).a, null, 23);
        }
        if (bl0Var instanceof hbb.e) {
            return icb.a(b(), null, true, false, false, null, 29);
        }
        if (bl0Var instanceof hbb.g) {
            return icb.a(b(), null, false, false, false, null, 29);
        }
        if (bl0Var instanceof hbb.f) {
            return icb.a(b(), th1.L(b().a, or7.a), false, true, false, null, 26);
        }
        if (bl0Var instanceof hbb.h) {
            icb icbVarB = b();
            List<y23> list = b().a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!(((y23) obj) instanceof or7)) {
                    arrayList.add(obj);
                }
            }
            return icb.a(icbVarB, arrayList, false, false, false, null, 26);
        }
        if (bl0Var instanceof hbb.b) {
            return icb.a(b(), ((hbb.b) bl0Var).a, false, false, false, vz7.a(b().e), 8);
        }
        boolean z = bl0Var instanceof hbb.d;
        bu8 bu8Var = this.C;
        hf3 hf3Var = hf3.t;
        if (z) {
            return icb.a(b(), hf3Var, false, false, false, new vz7(0, true, true, bu8Var.b(R.string.something_went_wrong, new Object[0]), bu8Var.b(R.string.no_internet_description, new Object[0]), bu8Var.b(R.string.reload, new Object[0]), 65), 12);
        }
        if (!(bl0Var instanceof hbb.c)) {
            return b();
        }
        icb icbVarB2 = b();
        boolean z2 = this.E.length() == 0;
        if (z2) {
            ebb ebbVar = this.I;
            int iOrdinal = ebbVar.ordinal();
            if (iOrdinal == 0) {
                strB = bu8Var.b(R.string.no_personal_records_placeholder_title, new Object[0]);
            } else if (iOrdinal == 1) {
                strB = bu8Var.b(R.string.no_metrics_placeholder_title, new Object[0]);
            } else {
                if (iOrdinal != 2) {
                    u.b();
                    return null;
                }
                strB = bu8Var.b(R.string.no_benchmark_workouts_placeholder_title, new Object[0]);
            }
            String str = strB;
            int iOrdinal2 = ebbVar.ordinal();
            if (iOrdinal2 == 0) {
                strB2 = bu8Var.b(R.string.no_personal_records_placeholder_description, new Object[0]);
            } else if (iOrdinal2 == 1) {
                strB2 = bu8Var.b(R.string.no_metrics_placeholder_description, new Object[0]);
            } else {
                if (iOrdinal2 != 2) {
                    u.b();
                    return null;
                }
                strB2 = bu8Var.b(R.string.no_benchmark_workouts_placeholder_description, new Object[0]);
            }
            vz7Var = new vz7(0, true, false, str, strB2, null, 101);
        } else {
            if (z2) {
                u.b();
                return null;
            }
            vz7Var = new vz7(0, true, false, bu8Var.b(R.string.no_results_found, new Object[0]), BuildConfig.FLAVOR, null, 101);
        }
        return icb.a(icbVarB2, hf3Var, false, false, false, vz7Var, 12);
    }

    public final dz9 g(String str) {
        return oy0.d(rhb.b(this), null, null, new ecb(this, str, null), 3);
    }
}
