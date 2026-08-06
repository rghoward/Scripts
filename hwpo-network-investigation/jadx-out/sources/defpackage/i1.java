package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i1<T> implements Iterator<T> {
    public a t;
    public String u;

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

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a aVar;
        String string;
        pa1 pa1Var;
        a aVar2 = this.t;
        a aVar3 = a.w;
        xl7.r(aVar2 != aVar3);
        int iOrdinal = this.t.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            this.t = aVar3;
            oy9.b bVar = (oy9.b) this;
            int i = bVar.y;
            while (true) {
                int i2 = bVar.y;
                aVar = a.v;
                if (i2 == -1) {
                    bVar.t = aVar;
                    string = null;
                    break;
                }
                int iB = bVar.b(i2);
                CharSequence charSequence = bVar.v;
                if (iB == -1) {
                    iB = charSequence.length();
                    bVar.y = -1;
                } else {
                    bVar.y = bVar.a(iB);
                }
                int i3 = bVar.y;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    bVar.y = i4;
                    if (i4 > charSequence.length()) {
                        bVar.y = -1;
                    }
                } else {
                    while (true) {
                        pa1Var = bVar.w;
                        if (i >= iB || !pa1Var.a(charSequence.charAt(i))) {
                            break;
                        }
                        i++;
                    }
                    while (iB > i && pa1Var.a(charSequence.charAt(iB - 1))) {
                        iB--;
                    }
                    if (!bVar.x || i != iB) {
                        int i5 = bVar.z;
                        if (i5 == 1) {
                            iB = charSequence.length();
                            bVar.y = -1;
                            while (iB > i && pa1Var.a(charSequence.charAt(iB - 1))) {
                                iB--;
                            }
                        } else {
                            bVar.z = i5 - 1;
                        }
                        string = charSequence.subSequence(i, iB).toString();
                        break;
                    }
                    i = bVar.y;
                }
            }
            this.u = string;
            if (this.t != aVar) {
                this.t = a.t;
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
        this.t = a.u;
        T t = (T) this.u;
        this.u = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
