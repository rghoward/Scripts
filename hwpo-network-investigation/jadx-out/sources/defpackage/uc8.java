package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uc8 {
    public final e70 a;
    public final p43 b;

    public uc8(e70 e70Var, p43 p43Var) {
        e70Var.getClass();
        p43Var.getClass();
        this.a = e70Var;
        this.b = p43Var;
    }

    public final tc8 a(vc8 vc8Var) {
        vc8Var.getClass();
        int i = vc8Var.a;
        String str = vc8Var.b;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        List<m89> list = vc8Var.c;
        this.a.getClass();
        return new tc8(i, 8, str, ii6.b(e70.b(list), this.b));
    }
}
