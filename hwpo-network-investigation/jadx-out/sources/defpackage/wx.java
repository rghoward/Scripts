package defpackage;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wx implements jac {
    public static final /* synthetic */ wx t = new wx();

    public static final int b(Bundle bundle, String str) {
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        xx.e(str);
        throw null;
    }

    public static final boolean c(Bundle bundle, String str) {
        str.getClass();
        return bundle.containsKey(str) && bundle.get(str) == null;
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Boolean.valueOf(((s6c) r6c.u.t.t).a());
    }
}
