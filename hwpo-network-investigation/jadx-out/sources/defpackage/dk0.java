package defpackage;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dk0 {
    public final fg5 a;
    public final Locale b;
    public final i21 c;
    public final dt7 d;
    public final dt7 e;

    public dk0(Long l, fg5 fg5Var, s99 s99Var, Locale locale) {
        l21 l21VarG;
        this.a = fg5Var;
        this.b = locale;
        i21 j21Var = Build.VERSION.SDK_INT >= 26 ? new j21(locale) : new j56(locale);
        this.c = j21Var;
        this.d = bl7.i(s99Var);
        if (l != null) {
            l21VarG = j21Var.f(l.longValue());
            if (!fg5Var.d(l21VarG.a)) {
                l21VarG = j21Var.g(j21Var.h());
            }
        } else {
            l21VarG = j21Var.g(j21Var.h());
        }
        this.e = bl7.i(l21VarG);
    }

    public final void c(long j) {
        l21 l21VarF = this.c.f(j);
        if (this.a.d(l21VarF.a)) {
            this.e.setValue(l21VarF);
        }
    }

    public final s99 d() {
        return (s99) this.d.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e() {
        return ((l21) this.e.getValue()).e;
    }

    public final fg5 g() {
        return this.a;
    }

    public final Locale getLocale() {
        return this.b;
    }
}
