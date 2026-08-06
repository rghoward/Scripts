package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tac {
    public static final q95 a = q95.r("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
    public static final ul8 b;
    public static final ul8 c;
    public static final ul8 d;
    public static final ul8 e;
    public static final ul8 f;

    static {
        k95.b bVar = k95.u;
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        pp0.b(7, objArr);
        b = k95.n(7, objArr);
        Object[] objArr2 = {"auto", "app", "am"};
        pp0.b(3, objArr2);
        c = k95.n(3, objArr2);
        d = k95.w("_r", "_dbg");
        k95.a aVar = new k95.a();
        aVar.f(bw5.b);
        aVar.f(bw5.c);
        e = aVar.g();
        f = k95.w("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(String str) {
        return !c.contains(str);
    }

    public static boolean b(Bundle bundle, String str) {
        if (!b.contains(str)) {
            if (bundle == null) {
                return true;
            }
            ul8 ul8Var = d;
            int i = ul8Var.w;
            int i2 = 0;
            while (i2 < i) {
                boolean zContainsKey = bundle.containsKey((String) ul8Var.get(i2));
                i2++;
                if (zContainsKey) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            if (str.equals("fcm") || str.equals("frc")) {
                return true;
            }
        } else if ("_ln".equals(str2)) {
            if (str.equals("fcm") || str.equals("fiam")) {
                return true;
            }
        } else if (!e.contains(str2)) {
            ul8 ul8Var = f;
            int i = ul8Var.w;
            int i2 = 0;
            while (i2 < i) {
                boolean zMatches = str2.matches((String) ul8Var.get(i2));
                i2++;
                if (zMatches) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean d(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (a(str) && bundle != null) {
            ul8 ul8Var = d;
            int i = ul8Var.w;
            int i2 = 0;
            while (i2 < i) {
                boolean zContainsKey = bundle.containsKey((String) ul8Var.get(i2));
                i2++;
                if (zContainsKey) {
                }
            }
            int iHashCode = str.hashCode();
            if (iHashCode != 101200) {
                if (iHashCode != 101230) {
                    if (iHashCode == 3142703 && str.equals("fiam")) {
                        bundle.putString("_cis", "fiam_integration");
                        return true;
                    }
                } else if (str.equals("fdl")) {
                    bundle.putString("_cis", "fdl_integration");
                    return true;
                }
            } else if (str.equals("fcm")) {
                bundle.putString("_cis", "fcm_integration");
                return true;
            }
        }
        return false;
    }
}
