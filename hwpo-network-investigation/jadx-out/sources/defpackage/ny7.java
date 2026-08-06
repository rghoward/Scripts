package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ny7 extends dl0<oy7, cy7> {
    public static final /* synthetic */ int C = 0;
    public final yq6 A;
    public final yq6 B;
    public final sk4 x;
    public final cm3 y;
    public final yq6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny7(sk4 sk4Var, cm3 cm3Var, q09 q09Var) {
        super(oy7.e);
        sk4Var.getClass();
        cm3Var.getClass();
        q09Var.getClass();
        oy7.Companion.getClass();
        this.x = sk4Var;
        this.y = cm3Var;
        this.z = oh7.a(this.u, new r56(1));
        this.A = oh7.a(this.u, new ky7(0));
        this.B = oh7.a(this.u, new ly7(0));
        String str = (String) q09Var.a("selected_country_code");
        if (str != null) {
            String displayCountry = new Locale(BuildConfig.FLAVOR, str).getDisplayCountry();
            displayCountry.getClass();
            e(new cy7.c(new m82(str, displayCountry, true)));
        }
        e(cy7.d.a);
        oy0.d(rhb.b(this), null, null, new my7(this, null), 3);
    }

    public static ArrayList g(String str, ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (xj5.a(((m82) obj).a, str)) {
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList2.set(i, m82.a((m82) arrayList2.get(i), true));
                return arrayList2;
            }
            i++;
        }
        i = -1;
        ArrayList arrayList3 = new ArrayList(arrayList);
        arrayList3.set(i, m82.a((m82) arrayList3.get(i), true));
        return arrayList3;
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof cy7.d) {
            return oy7.a(b(), true, false, null, null, 14);
        }
        if (bl0Var instanceof cy7.b) {
            return oy7.a(b(), false, false, null, null, 14);
        }
        if (bl0Var instanceof cy7.c) {
            return oy7.a(b(), false, false, ((cy7.c) bl0Var).a, null, 11);
        }
        if (bl0Var instanceof cy7.a) {
            return oy7.a(b(), false, false, null, ((cy7.a) bl0Var).a, 6);
        }
        return bl0Var instanceof cy7.e ? oy7.a(b(), false, ((cy7.e) bl0Var).a, null, null, 13) : b();
    }
}
