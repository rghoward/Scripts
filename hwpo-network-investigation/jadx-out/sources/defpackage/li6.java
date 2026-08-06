package defpackage;

import com.hwpo_training_app.R;
import java.text.DecimalFormat;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class li6 {
    public static final String a(xn0 xn0Var, bu8 bu8Var, DecimalFormat decimalFormat, m2b m2bVar, double d, Double d2, String str) {
        Object obj;
        xn0Var.getClass();
        bu8Var.getClass();
        decimalFormat.getClass();
        m2bVar.getClass();
        str.getClass();
        if (xn0Var == xn0.u && m2bVar != m2b.u) {
            return ki6.b((long) d, bu8Var);
        }
        if (xn0Var != xn0.D) {
            return cj2.a(decimalFormat.format(d), " ", str);
        }
        String str2 = decimalFormat.format(d);
        str2.getClass();
        if (d2 == null) {
            obj = d2;
            obj = 0;
        }
        obj = d2;
        String str3 = decimalFormat.format(obj);
        str3.getClass();
        return bu8Var.b(R.string.blood_pressure_last_value_format, str2, str3, str);
    }

    public static final String b(psa psaVar, bu8 bu8Var, xn0 xn0Var, DecimalFormat decimalFormat) {
        psaVar.getClass();
        bu8Var.getClass();
        xn0Var.getClass();
        decimalFormat.getClass();
        return a(xn0Var, bu8Var, decimalFormat, psaVar.e, psaVar.b, psaVar.c, psaVar.f);
    }
}
