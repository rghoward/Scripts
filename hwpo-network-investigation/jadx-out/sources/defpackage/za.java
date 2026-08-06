package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class za<T> {
    public static final List<Object> b = Collections.EMPTY_LIST;
    public fx9<xa<T>> a;

    public final void a(int i, xa xaVar) {
        fx9<xa<T>> fx9Var = this.a;
        if (xaVar == null) {
            ac4.c("AdapterDelegate is null!");
            return;
        }
        if (i == 2147483646) {
            z90.a("The view type = 2147483646 is reserved for fallback adapter delegate (see setFallbackDelegate() ). Please use another view type.");
        } else if (fx9Var.c(i) == null) {
            fx9Var.e(i, xaVar);
        } else {
            sa1.a(t43.b(i, "An AdapterDelegate is already registered for the viewType = ", ". Already registered AdapterDelegate is "), fx9Var.c(i));
        }
    }

    public final void b(xa xaVar) {
        fx9<xa<T>> fx9Var = this.a;
        int iF = fx9Var.f();
        while (fx9Var.c(iF) != null) {
            iF++;
            if (iF == 2147483646) {
                z90.a("Oops, we are very close to Integer.MAX_VALUE. It seems that there are no more free and unused view type integers left to add another AdapterDelegate.");
                return;
            }
        }
        a(iF, xaVar);
    }

    public final xa<T> c(int i) {
        Object obj;
        fx9<xa<T>> fx9Var = this.a;
        int iD = ty1.d(fx9Var.w, i, fx9Var.u);
        if (iD < 0 || (obj = fx9Var.v[iD]) == zb9.u) {
            obj = null;
        }
        return (xa) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(T t, int i, RecyclerView.e0 e0Var, List list) {
        xa<T> xaVarC = c(e0Var.f);
        if (xaVarC == 0) {
            StringBuilder sbB = t43.b(i, "No delegate found for item at position = ", " for viewType = ");
            sbB.append(e0Var.f);
            throw new NullPointerException(sbB.toString());
        }
        if (list == null) {
            list = b;
        }
        xaVarC.b(t, i, e0Var, list);
    }
}
