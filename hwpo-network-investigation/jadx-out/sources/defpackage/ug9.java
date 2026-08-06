package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ug9 {
    public final moa a;
    public final z6b b;

    public ug9(moa moaVar, z6b z6bVar) {
        moaVar.getClass();
        z6bVar.getClass();
        this.a = moaVar;
        this.b = z6bVar;
    }

    public final re9 a(re9 re9Var) {
        String str;
        String string = this.b.next().toString();
        string.getClass();
        String lowerCase = w2a.l(string, "-", BuildConfig.FLAVOR).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return new re9(lowerCase, (re9Var == null || (str = re9Var.b) == null) ? lowerCase : str, re9Var != null ? re9Var.c + 1 : 0, this.a.a().b);
    }
}
