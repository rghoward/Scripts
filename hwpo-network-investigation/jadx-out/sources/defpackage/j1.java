package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j1<T> extends w2b {
    public a u;
    public T v;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final a t;
        public static final a u;
        public static final a v;
        public static final a w;
        public static final /* synthetic */ a[] x;

        static {
            a aVar = new a("READY", 0);
            t = aVar;
            a aVar2 = new a("NOT_READY", 1);
            u = aVar2;
            a aVar3 = new a("DONE", 2);
            v = aVar3;
            a aVar4 = new a("FAILED", 3);
            w = aVar4;
            x = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) x.clone();
        }
    }

    public j1() {
        super(0);
        this.u = a.u;
    }

    public abstract T a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a aVar = this.u;
        a aVar2 = a.w;
        xl7.r(aVar != aVar2);
        int iOrdinal = this.u.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            this.u = aVar2;
            this.v = a();
            if (this.u != a.v) {
                this.u = a.t;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            vl.b();
            return null;
        }
        this.u = a.u;
        T t = this.v;
        this.v = null;
        return t;
    }
}
