package defpackage;

import a2.a;
import defpackage.a2;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a2<MessageType extends a2<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements zt6 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a<MessageType extends a2<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements bu6, Cloneable {
    }

    public static <T> void k(Iterable<T> iterable, List<? super T> list) {
        Charset charset = zi5.a;
        iterable.getClass();
        if (iterable instanceof h26) {
            List<?> listM = ((h26) iterable).m();
            h26 h26Var = (h26) list;
            int size = list.size();
            for (Object obj : listM) {
                if (obj == null) {
                    String str = "Element at index " + (h26Var.size() - size) + " is null.";
                    for (int size2 = h26Var.size() - 1; size2 >= size; size2--) {
                        h26Var.remove(size2);
                    }
                    ac4.c(str);
                    return;
                }
                if (obj instanceof f01) {
                    h26Var.e0((f01) obj);
                } else {
                    h26Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof k98) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (T t : iterable) {
            if (t == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                ac4.c(str2);
                return;
            }
            list.add(t);
        }
    }

    public int l() {
        throw new UnsupportedOperationException();
    }

    public int m(v49 v49Var) {
        int iL = l();
        if (iL != -1) {
            return iL;
        }
        int iG = v49Var.g(this);
        n(iG);
        return iG;
    }

    public void n(int i) {
        throw new UnsupportedOperationException();
    }
}
