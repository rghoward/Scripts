package defpackage;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class np1 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final a t;
        public static final /* synthetic */ a[] u;

        /* JADX INFO: Fake field, exist only in values array */
        a EF0;

        static {
            a aVar = new a("NOT_SET", 0);
            a aVar2 = new a("EVENT_OVERRIDE", 1);
            t = aVar2;
            u = new a[]{aVar, aVar2};
            SparseArray sparseArray = new SparseArray();
            sparseArray.put(0, aVar);
            sparseArray.put(5, aVar2);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) u.clone();
        }
    }

    public abstract is3 a();

    public abstract a b();
}
