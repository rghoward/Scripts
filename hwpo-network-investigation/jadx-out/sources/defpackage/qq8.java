package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qq8 {
    public final Set<kp8> a = Collections.newSetFromMap(new WeakHashMap());
    public final HashSet b = new HashSet();
    public boolean c;

    public final boolean a(kp8 kp8Var) {
        boolean z = true;
        if (kp8Var == null) {
            return true;
        }
        boolean zRemove = this.a.remove(kp8Var);
        if (!this.b.remove(kp8Var) && !zRemove) {
            z = false;
        }
        if (z) {
            kp8Var.clear();
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{numRequests=");
        sb.append(this.a.size());
        sb.append(", isPaused=");
        return fz.c(sb, this.c, "}");
    }
}
