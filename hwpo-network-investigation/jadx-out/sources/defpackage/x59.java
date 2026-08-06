package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x59 {
    /* JADX WARN: Code duplicated, block: B:56:0x00a5 A[RETURN] */
    public static final boolean a(w59 w59Var, v59 v59Var, int i) {
        w59Var.getClass();
        int i2 = w59Var.b;
        double d = w59Var.d;
        int i3 = w59Var.c;
        List<w59> list = w59Var.g;
        v59Var.getClass();
        switch (v59Var.ordinal()) {
            case 0:
                if (d > 0.0d) {
                    return true;
                }
                return false;
            case 1:
                if (d > 0.0d) {
                    return true;
                }
                return false;
            case 2:
                if (i2 == -1 || i3 == -1) {
                    if (i2 == -1 || i != 0) {
                        if (d > 0.0d) {
                            return true;
                        }
                    } else if (i3 > 0) {
                        return true;
                    }
                } else if (i2 > 0 || i3 > 0) {
                    return true;
                }
                return false;
            case 3:
                if (i2 > 0 || i3 > 0) {
                    return true;
                }
                return false;
            case 4:
                if (!list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (a((w59) it.next(), v59.t, i)) {
                            return true;
                        }
                    }
                }
                return false;
            case 5:
                if (!list.isEmpty()) {
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (a((w59) it2.next(), v59.u, i)) {
                            return true;
                        }
                    }
                }
                return false;
            case 6:
                if (!list.isEmpty()) {
                    Iterator<T> it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (a((w59) it3.next(), v59.w, i)) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                u.b();
                return false;
        }
    }
}
