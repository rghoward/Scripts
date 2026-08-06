package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a57 {
    public final String a;
    public final int b;
    public final Bundle c;
    public final Bundle d;

    public a57(Bundle bundle) {
        bundle.getClass();
        String string = bundle.getString("nav-entry-state:id");
        if (string == null) {
            xx.e("nav-entry-state:id");
            throw null;
        }
        this.a = string;
        this.b = wx.b(bundle, "nav-entry-state:destination-id");
        Bundle bundle2 = bundle.getBundle("nav-entry-state:args");
        if (bundle2 == null) {
            xx.e("nav-entry-state:args");
            throw null;
        }
        this.c = bundle2;
        Bundle bundle3 = bundle.getBundle("nav-entry-state:saved-state");
        if (bundle3 != null) {
            this.d = bundle3;
        } else {
            xx.e("nav-entry-state:saved-state");
            throw null;
        }
    }

    public a57(r47 r47Var, int i) {
        this.a = r47Var.y;
        this.b = i;
        u47 u47Var = r47Var.A;
        this.c = u47Var.a();
        Bundle bundleC = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
        this.d = bundleC;
        u47Var.h.c(bundleC);
    }
}
