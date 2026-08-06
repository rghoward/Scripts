package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vua {
    public static final vua b;
    public final k95<a> a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;
        public final esa b;
        public final boolean c;
        public final int[] d;
        public final boolean[] e;

        static {
            n6b.H(0);
            n6b.H(1);
            n6b.H(3);
            n6b.H(4);
        }

        public a(esa esaVar, boolean z, int[] iArr, boolean[] zArr) {
            int i = esaVar.a;
            this.a = i;
            boolean z2 = false;
            xl7.g(i == iArr.length && i == zArr.length);
            this.b = esaVar;
            if (z && i > 1) {
                z2 = true;
            }
            this.c = z2;
            this.d = (int[]) iArr.clone();
            this.e = (boolean[]) zArr.clone();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.c == aVar.c && this.b.equals(aVar.b) && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
        }
    }

    static {
        k95.b bVar = k95.u;
        b = new vua(ul8.x);
        n6b.H(0);
    }

    public vua(ul8 ul8Var) {
        this.a = k95.q(ul8Var);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            k95<a> k95Var = this.a;
            if (i2 >= k95Var.size()) {
                return false;
            }
            a aVar = k95Var.get(i2);
            for (boolean z : aVar.e) {
                if (z) {
                    if (aVar.b.c != i) {
                        break;
                    }
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vua.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((vua) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
