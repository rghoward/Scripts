package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hv2 implements k5b {
    public final String a;
    public final xm4 b;

    public hv2(Set<p66> set, xm4 xm4Var) {
        this.a = b(set);
        this.b = xm4Var;
    }

    public static String b(Set<p66> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<p66> it = set.iterator();
        while (it.hasNext()) {
            p66 next = it.next();
            sb.append(next.a());
            sb.append('/');
            sb.append(next.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // defpackage.k5b
    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        xm4 xm4Var = this.b;
        synchronized (xm4Var.a) {
            setUnmodifiableSet = Collections.unmodifiableSet(xm4Var.a);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.a;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (xm4Var.a) {
            setUnmodifiableSet2 = Collections.unmodifiableSet(xm4Var.a);
        }
        sb.append(b(setUnmodifiableSet2));
        return sb.toString();
    }
}
