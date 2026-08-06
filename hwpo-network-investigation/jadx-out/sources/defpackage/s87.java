package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s87 {
    public final nr5 a = new nr5();
    public final a0a b;
    public final a0a c;
    public boolean d;
    public final li8 e;
    public final li8 f;

    public s87() {
        a0a a0aVarB = b0a.b(hf3.t);
        this.b = a0aVarB;
        a0a a0aVarB2 = b0a.b(of3.t);
        this.c = a0aVarB2;
        this.e = yk2.b(a0aVarB);
        this.f = yk2.b(a0aVarB2);
    }

    public abstract r47 a(c67 c67Var, Bundle bundle);

    public void b(r47 r47Var) {
        r47Var.getClass();
        a0a a0aVar = this.c;
        LinkedHashSet linkedHashSetA = wx7.a((Set) a0aVar.getValue(), r47Var);
        a0aVar.getClass();
        a0aVar.l(null, linkedHashSetA);
    }

    public void c(r47 r47Var, boolean z) {
        r47Var.getClass();
        synchronized (this.a) {
            try {
                a0a a0aVar = this.b;
                Iterable iterable = (Iterable) a0aVar.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (xj5.a((r47) obj, r47Var)) {
                        break;
                    } else {
                        arrayList.add(obj);
                    }
                }
                a0aVar.getClass();
                a0aVar.l(null, arrayList);
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(r47 r47Var, boolean z) {
        Object objPrevious;
        r47Var.getClass();
        a0a a0aVar = this.c;
        Iterable iterable = (Iterable) a0aVar.getValue();
        boolean z2 = iterable instanceof Collection;
        li8 li8Var = this.e;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((r47) it.next()) == r47Var) {
                    Iterable iterable2 = (Iterable) li8Var.t.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((r47) it2.next()) == r47Var) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        LinkedHashSet linkedHashSetC = wx7.c((Set) a0aVar.getValue(), r47Var);
        a0aVar.getClass();
        a0aVar.l(null, linkedHashSetC);
        List list = (List) li8Var.t.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            r47 r47Var2 = (r47) objPrevious;
            if (!xj5.a(r47Var2, r47Var) && ((List) li8Var.t.getValue()).lastIndexOf(r47Var2) < ((List) li8Var.t.getValue()).lastIndexOf(r47Var)) {
                break;
            }
        }
        r47 r47Var3 = (r47) objPrevious;
        if (r47Var3 != null) {
            LinkedHashSet linkedHashSetC2 = wx7.c((Set) a0aVar.getValue(), r47Var3);
            a0aVar.getClass();
            a0aVar.l(null, linkedHashSetC2);
        }
        c(r47Var, z);
    }

    public void e(r47 r47Var) {
        r47Var.getClass();
        a0a a0aVar = this.c;
        LinkedHashSet linkedHashSetC = wx7.c((Set) a0aVar.getValue(), r47Var);
        a0aVar.getClass();
        a0aVar.l(null, linkedHashSetC);
    }

    public void f(r47 r47Var) {
        r47Var.getClass();
        synchronized (this.a) {
            a0a a0aVar = this.b;
            ArrayList arrayListL = th1.L((Collection) a0aVar.getValue(), r47Var);
            a0aVar.getClass();
            a0aVar.l(null, arrayListL);
            g2b g2bVar = g2b.a;
        }
    }
}
