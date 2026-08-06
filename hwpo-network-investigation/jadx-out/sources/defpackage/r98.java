package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r98 {
    public static final SparseArray<o98> a = new SparseArray<>();
    public static final HashMap<o98, Integer> b;

    static {
        HashMap<o98, Integer> map = new HashMap<>();
        b = map;
        map.put(o98.t, 0);
        map.put(o98.u, 1);
        map.put(o98.v, 2);
        for (o98 o98Var : map.keySet()) {
            a.append(b.get(o98Var).intValue(), o98Var);
        }
    }

    public static int a(o98 o98Var) {
        Integer num = b.get(o98Var);
        if (num != null) {
            return num.intValue();
        }
        p51.c(o98Var, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static o98 b(int i) {
        o98 o98Var = a.get(i);
        if (o98Var != null) {
            return o98Var;
        }
        z90.a(pp2.a(i, "Unknown Priority for value "));
        return null;
    }
}
