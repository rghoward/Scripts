package defpackage;

import android.content.ContentResolver;
import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import j$.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class fj3 extends dl0<oj3, vh3> {
    public static final a Companion = new a();
    public final q68 A;
    public final oz9 B;
    public final s31 C;
    public final ov8 D;
    public final e70 E;
    public final ContentResolver F;
    public final bu8 G;
    public final cm3 H;
    public final SimpleDateFormat I;
    public final ebb J;
    public final vn0 K;
    public final boolean L;
    public final Integer M;
    public final o7a N;
    public final yq6 O;
    public final yq6 P;
    public final yq6 Q;
    public final yq6 R;
    public final yq6 S;
    public final yq6 T;
    public final yq6 U;
    public final yq6 V;
    public final yq6 W;
    public final yq6 X;
    public final yq6 Y;
    public final yq6 Z;
    public final pta x;
    public final xc y;
    public final sd3 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public fj3(q09 q09Var, pta ptaVar, xc xcVar, sd3 sd3Var, q68 q68Var, oz9 oz9Var, s31 s31Var, ov8 ov8Var, bf7 bf7Var, e70 e70Var, ContentResolver contentResolver, bu8 bu8Var, cm3 cm3Var) {
        String strB;
        q09Var.getClass();
        ptaVar.getClass();
        xcVar.getClass();
        sd3Var.getClass();
        q68Var.getClass();
        oz9Var.getClass();
        s31Var.getClass();
        ov8Var.getClass();
        bf7Var.getClass();
        e70Var.getClass();
        contentResolver.getClass();
        bu8Var.getClass();
        cm3Var.getClass();
        oj3.a aVar = oj3.Companion;
        boolean z = q09Var.a("com.fitr_training.tracking.presentation.enter_value.EnterValueFragment.VALUE_ID") != null;
        aVar.getClass();
        hf3 hf3Var = hf3.t;
        super(new oj3(BuildConfig.FLAVOR, BuildConfig.FLAVOR, null, BuildConfig.FLAVOR, false, hf3Var, null, hf3Var, z, 0, BuildConfig.FLAVOR));
        this.x = ptaVar;
        this.y = xcVar;
        this.z = sd3Var;
        this.A = q68Var;
        this.B = oz9Var;
        this.C = s31Var;
        this.D = ov8Var;
        this.E = e70Var;
        this.F = contentResolver;
        this.G = bu8Var;
        this.H = cm3Var;
        this.I = new SimpleDateFormat("dd MMM, yyyy", Locale.getDefault());
        ebb ebbVar = (ebb) q09Var.a("com.fitr_training.tracking.presentation.enter_value.EnterValueFragment.VALUE_TYPE");
        if (ebbVar == null) {
            z90.a("VALUE_TYPE must not be null");
            throw null;
        }
        this.J = ebbVar;
        vn0 vn0Var = (vn0) q09Var.a("com.fitr_training.tracking.presentation.enter_value.EnterValueFragment.VALUE");
        if (vn0Var == null) {
            z90.a("VALUE must not be null");
            throw null;
        }
        this.K = vn0Var;
        Boolean bool = (Boolean) q09Var.a("com.fitr_training.tracking.presentation.enter_value.EnterValueFragment.IS_FROM_VALUE_DETAILS");
        if (bool == null) {
            z90.a("IS_FROM_VALUE_DETAILS must not be null");
            throw null;
        }
        this.L = bool.booleanValue();
        Integer num = (Integer) q09Var.a("com.fitr_training.tracking.presentation.enter_value.EnterValueFragment.VALUE_ID");
        this.M = num;
        this.N = new o7a(new xi3(0, this));
        this.O = oh7.a(this.u, new zi3());
        this.P = oh7.a(this.u, new aj3());
        this.Q = oh7.a(this.u, new bj3(0));
        this.R = oh7.a(this.u, new cj3(0));
        this.S = oh7.a(this.u, new dj3(0));
        this.T = oh7.a(this.u, new ej3(0));
        this.U = oh7.a(this.u, new l12(1));
        this.V = oh7.a(this.u, new m12(1));
        this.W = oh7.a(this.u, new oh4() { // from class: yi3
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                fj3.a aVar2 = fj3.Companion;
                LocalDate localDate = ((oj3) obj).g;
                if (localDate == null) {
                    return null;
                }
                return this.t.I.format(Long.valueOf(yk2.v(localDate)));
            }
        });
        this.X = oh7.a(this.u, new o12(1));
        this.Y = oh7.a(this.u, new b40(2));
        this.Z = oh7.a(this.u, new sf2(1, this));
        yk2.o(new k74(new j74(new hj3(bf7Var.b(g2b.a))), new ij3(this, null)), rhb.b(this));
        int iOrdinal = ebbVar.ordinal();
        if (iOrdinal == 0) {
            strB = bu8Var.b(R.string.track_new_personal_records, new Object[0]);
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    u.b();
                    throw null;
                }
                z90.a("Impossible to enter value for challenge");
                throw null;
            }
            strB = bu8Var.b(R.string.track_new_metric, new Object[0]);
        }
        boolean z2 = num == null;
        if (!z2) {
            if (z2) {
                u.b();
                throw null;
            }
            strB = bu8Var.b(R.string.save, new Object[0]);
        }
        ArrayList arrayList = (ArrayList) q09Var.a("com.fitr_training.tracking.presentation.enter_value.EnterValueFragment.ATTACHMENTS");
        if (arrayList != null) {
            e(new vh3.f(arrayList));
        }
        LocalDate localDateNow = (LocalDate) q09Var.a("com.fitr_training.tracking.presentation.enter_value.EnterValueFragment.DATE");
        localDateNow = localDateNow == null ? LocalDate.now() : localDateNow;
        String str = (String) q09Var.a("com.fitr_training.tracking.presentation.enter_value.EnterValueFragment.NOTE");
        str = str == null ? BuildConfig.FLAVOR : str;
        localDateNow.getClass();
        e(new vh3.b(localDateNow));
        e(new vh3.a(vn0Var.u, vn0Var, str, strB));
    }

    public static final void g(fj3 fj3Var, Exception exc) {
        fj3Var.e(vh3.e.a);
        fj3Var.f(new wh3.b(fj3Var.H.a(exc)));
    }

    public static final ArrayList i(fj3 fj3Var, String str) {
        List<l89> list = fj3Var.b().h;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!xj5.a(((l89) obj).w, str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof vh3.f) {
            return oj3.a(b(), null, null, null, null, false, null, null, th1.T(th1.W(((vh3.f) bl0Var).a)), 0, null, 1919);
        }
        if (bl0Var instanceof vh3.d) {
            return oj3.a(b(), null, null, null, null, true, null, null, null, 0, null, 2031);
        }
        if (bl0Var instanceof vh3.e) {
            return oj3.a(b(), null, null, null, null, false, null, null, null, 0, null, 2031);
        }
        if (bl0Var instanceof vh3.b) {
            return oj3.a(b(), null, null, null, null, false, null, ((vh3.b) bl0Var).a, null, 0, null, 1983);
        }
        if (bl0Var instanceof vh3.c) {
            oj3 oj3VarB = b();
            String str = ((vh3.c) bl0Var).a;
            return oj3.a(oj3VarB, null, null, null, null, false, null, null, null, str.length(), str, 511);
        }
        if (!(bl0Var instanceof vh3.a)) {
            if (!(bl0Var instanceof vh3.g)) {
                return b();
            }
            vh3.g gVar = (vh3.g) bl0Var;
            return oj3.a(b(), null, null, null, gVar.a, false, gVar.b, null, null, 0, null, 2007);
        }
        oj3 oj3VarB2 = b();
        vh3.a aVar = (vh3.a) bl0Var;
        String str2 = aVar.a;
        vn0 vn0Var = aVar.b;
        String str3 = aVar.c;
        int length = str3.length();
        return oj3.a(oj3VarB2, str2, aVar.d, vn0Var, wn0.e(aVar.b), false, null, null, null, length, str3, 496);
    }
}
