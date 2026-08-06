package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x51 implements r4a, e5a {
    public final Object t;

    public x51(List list) {
        this.t = list;
    }

    @Override // defpackage.r4a
    public int a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.e5a
    public r9a b(Object obj) {
        nk9 nk9Var = (nk9) obj;
        d92 d92Var = ((z82) this.t).e;
        if (nk9Var != null) {
            return caa.f(Arrays.asList(d92.a(d92Var), d92Var.m.g(null, d92Var.e.a)));
        }
        Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
        return caa.e(null);
    }

    @Override // defpackage.r4a
    public long e(int i) {
        xl7.g(i == 0);
        return 0L;
    }

    @Override // defpackage.r4a
    public List f(long j) {
        return j >= 0 ? (List) this.t : Collections.EMPTY_LIST;
    }

    @Override // defpackage.r4a
    public int g() {
        return 1;
    }

    public x51(z82 z82Var, String str) {
        this.t = z82Var;
    }
}
