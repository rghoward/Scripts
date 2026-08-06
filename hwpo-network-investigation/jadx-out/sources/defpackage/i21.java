package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i21 {
    public final Locale a;
    public final LinkedHashMap b = new LinkedHashMap();

    public i21(Locale locale) {
        this.a = locale;
    }

    public abstract String a(long j, String str, Locale locale);

    public abstract b21 b(long j);

    public abstract yg2 c(Locale locale);

    public abstract int d();

    public abstract l21 e(int i, int i2);

    public abstract l21 f(long j);

    public abstract l21 g(b21 b21Var);

    public abstract b21 h();

    public abstract List<js7<String, String>> i();

    public abstract b21 j(String str, String str2, Locale locale);

    public abstract l21 k(l21 l21Var, int i);
}
