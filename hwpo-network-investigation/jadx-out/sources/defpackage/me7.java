package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class me7 {
    public static final Object[] a = new Object[0];
    public static final t27 b = new t27(0);

    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            r.b(a30.b("Index ", " is out of bounds. The list has ", " elements.", i, size));
        }
    }

    public static final void b(int i, int i2, List list) {
        int size = list.size();
        if (i > i2) {
            z90.a(a30.b("Indices are out of order. fromIndex (", ") is greater than toIndex (", ").", i, i2));
            return;
        }
        if (i < 0) {
            r.b(pk.d(i, "fromIndex (", ") is less than 0."));
            return;
        }
        if (i2 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
    }
}
