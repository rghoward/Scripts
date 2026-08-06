package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kuc {
    public static final kuc b;
    public final r95 a;

    static {
        int i = r95.y;
        b = new kuc(xl8.A);
    }

    public kuc(r95 r95Var) {
        this.a = r95Var;
    }

    public static kuc a(s0c s0cVar) throws k2c {
        String strW;
        long j;
        iuc iucVar;
        int iG = s0cVar.G();
        if (iG < 0) {
            ao2.b("Negative number of flags");
            return null;
        }
        int i = r95.y;
        r95.a aVar = new r95.a(n47.t);
        long j2 = 0;
        for (int i2 = 0; i2 < iG; i2++) {
            long jH = s0cVar.H();
            int i3 = (int) jH;
            long j3 = jH >>> 3;
            if (j3 == 0) {
                j = 0;
                strW = s0cVar.w();
            } else {
                long j4 = j3 + j2;
                if (j4 > 2305843009213693951L) {
                    ao2.b("Flag name larger than max size");
                    return null;
                }
                strW = null;
                j = j4;
            }
            int i4 = i3 & 7;
            if (i4 == 0 || i4 == 1) {
                iucVar = new iuc(j, strW, i4, 0L, null);
            } else if (i4 == 2) {
                iucVar = new iuc(j, strW, i4, s0cVar.H(), null);
            } else if (i4 == 3) {
                iucVar = new iuc(j, strW, i4, Double.doubleToRawLongBits(s0cVar.o()), null);
            } else if (i4 == 4) {
                iucVar = new iuc(j, strW, i4, 0L, s0cVar.w());
            } else {
                if (i4 != 5) {
                    ao2.b(d43.a(i4, "Unrecognized flag type ", new StringBuilder(String.valueOf(i4).length() + 23)));
                    return null;
                }
                iucVar = new iuc(j, strW, i4, 0L, s0cVar.z());
            }
            long j5 = iucVar.t;
            if (j5 != 0) {
                j2 = j5;
            }
            aVar.c(iucVar);
        }
        return new kuc(aVar.h());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kuc)) {
            return false;
        }
        return this.a.equals(((kuc) obj).a);
    }

    public final int hashCode() {
        r95 r95Var = this.a;
        r95Var.getClass();
        return lk9.c(r95Var);
    }
}
