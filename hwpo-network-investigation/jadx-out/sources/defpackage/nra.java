package defpackage;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nra implements Comparator<js7<? extends sk8, ? extends List<ub9>>> {
    public static final nra t = new nra();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(js7<? extends sk8, ? extends List<ub9>> js7Var, js7<? extends sk8, ? extends List<ub9>> js7Var2) {
        js7<? extends sk8, ? extends List<ub9>> js7Var3 = js7Var;
        js7<? extends sk8, ? extends List<ub9>> js7Var4 = js7Var2;
        int iCompare = Float.compare(((sk8) js7Var3.t).b, ((sk8) js7Var4.t).b);
        return iCompare != 0 ? iCompare : Float.compare(((sk8) js7Var3.t).d, ((sk8) js7Var4.t).d);
    }
}
