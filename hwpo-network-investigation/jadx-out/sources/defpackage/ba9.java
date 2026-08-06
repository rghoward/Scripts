package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ba9 {
    public final a a;
    public final a b;
    public final boolean c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final jt8 a;
        public final int b;
        public final long c;

        public a(jt8 jt8Var, int i, long j) {
            this.a = jt8Var;
            this.b = i;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + os2.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
            sb.append(this.a);
            sb.append(", offset=");
            sb.append(this.b);
            sb.append(", selectableId=");
            return fh0.b(sb, this.c, ')');
        }
    }

    public ba9(a aVar, a aVar2, boolean z) {
        this.a = aVar;
        this.b = aVar2;
        this.c = z;
    }

    public static ba9 a(ba9 ba9Var, a aVar, a aVar2, boolean z, int i) {
        if ((i & 1) != 0) {
            aVar = ba9Var.a;
        }
        if ((i & 2) != 0) {
            aVar2 = ba9Var.b;
        }
        ba9Var.getClass();
        return new ba9(aVar, aVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba9)) {
            return false;
        }
        ba9 ba9Var = (ba9) obj;
        return xj5.a(this.a, ba9Var.a) && xj5.a(this.b, ba9Var.b) && this.c == ba9Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", handlesCrossed=");
        return pi1.a(sb, this.c, ')');
    }
}
