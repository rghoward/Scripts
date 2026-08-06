package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zz1 {
    public final u10 a;
    public final q5b b;

    public zz1(u10 u10Var, q5b q5bVar) {
        u10Var.getClass();
        q5bVar.getClass();
        this.a = u10Var;
        this.b = q5bVar;
    }

    public final void a(Resources resources) {
        String strA = this.a.a();
        if (strA == null) {
            return;
        }
        Locale locale = resources.getConfiguration().getLocales().get(0);
        if (locale == null) {
            z90.a("Required value was null.");
        } else {
            if (strA.equalsIgnoreCase(locale.getLanguage())) {
                return;
            }
            Configuration configuration = new Configuration(resources.getConfiguration());
            configuration.locale = new Locale(strA);
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
    }
}
