package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class wx7 {
    public static final /* synthetic */ int a = 0;

    public static LinkedHashSet a(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(pi6.g(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && xj5.a(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static LinkedHashSet b(Set set, Iterable iterable) {
        int size;
        set.getClass();
        iterable.getClass();
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(pi6.g(size));
        linkedHashSet.addAll(set);
        rh1.o(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet c(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(pi6.g(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static final Object d(i59 i59Var, boolean z, i59 i59Var2, ci4 ci4Var) throws Throwable {
        Object jp1Var;
        Object objI0;
        try {
            if (ci4Var instanceof ak0) {
                fza.b(2, ci4Var);
                jp1Var = ci4Var.invoke(i59Var2, i59Var);
            } else {
                jp1Var = th0.f(ci4Var, i59Var2, i59Var);
            }
        } catch (x13 e) {
            Throwable th = e.t;
            i59Var.h0(new jp1(th, false));
            throw th;
        } catch (Throwable th2) {
            jp1Var = new jp1(th2, false);
        }
        v72 v72Var = v72.t;
        if (jp1Var == v72Var || (objI0 = i59Var.i0(jp1Var)) == ml5.u) {
            return v72Var;
        }
        i59Var.E0();
        if (!(objI0 instanceof jp1)) {
            return ml5.d(objI0);
        }
        if (!z) {
            Throwable th3 = ((jp1) objI0).a;
            if ((th3 instanceof woa) && ((woa) th3).t == i59Var) {
                if (jp1Var instanceof jp1) {
                    throw ((jp1) jp1Var).a;
                }
                return jp1Var;
            }
        }
        throw ((jp1) objI0).a;
    }
}
