package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kh2 {
    public final fg5 a;
    public final s99 b;
    public final yg2 c;
    public final yh2 d;
    public final String e;
    public final String f;

    public kh2(fg5 fg5Var, s99 s99Var, yg2 yg2Var, yh2 yh2Var, String str, String str2, String str3) {
        this.a = fg5Var;
        this.b = s99Var;
        this.c = yg2Var;
        this.d = yh2Var;
        this.e = str;
        this.f = str2;
    }

    public final String a(b21 b21Var, Locale locale) {
        if (b21Var == null) {
            String upperCase = this.c.a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            Object[] objArrCopyOf = Arrays.copyOf(new Object[]{upperCase}, 1);
            return String.format(this.e, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }
        int i = b21Var.t;
        fg5 fg5Var = this.a;
        if (fg5Var.d(i)) {
            this.b.getClass();
            return BuildConfig.FLAVOR;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(new Object[]{h21.a(fg5Var.t, locale, 7), h21.a(fg5Var.u, locale, 7)}, 2);
        return String.format(this.f, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
    }
}
