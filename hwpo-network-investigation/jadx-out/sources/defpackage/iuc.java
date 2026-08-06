package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iuc implements Comparable {
    public final long t;
    public final String u;
    public final int v;
    public final long w;
    public final Object x;
    public final RuntimeException y;

    public iuc(long j, String str, int i, long j2, Object obj) {
        xl7.g(((j > 0L ? 1 : (j == 0L ? 0 : -1)) == 0) == (str != null));
        this.t = j;
        this.u = str;
        this.v = i;
        this.w = j2;
        this.x = obj;
        if (i != 5) {
            this.y = null;
            return;
        }
        if (obj == null) {
            this.y = new NullPointerException("Null stringOrBytes");
        } else if ((obj instanceof byte[]) || (obj instanceof p0c)) {
            this.y = null;
        } else {
            this.y = new RuntimeException("Wrong stringOrBytes type: ".concat(String.valueOf(obj.getClass())));
        }
    }

    public final Object a() {
        int i = this.v;
        if (i == 0) {
            return Boolean.FALSE;
        }
        if (i == 1) {
            return Boolean.TRUE;
        }
        long j = this.w;
        if (i == 2) {
            return Long.valueOf(j);
        }
        if (i == 3) {
            return Double.valueOf(Double.longBitsToDouble(j));
        }
        Object obj = this.x;
        if (i == 4) {
            obj.getClass();
            return obj;
        }
        if (i != 5) {
            sx0.a("Impossible, this was validated when parsed or created");
            return null;
        }
        obj.getClass();
        try {
            return obj instanceof byte[] ? (byte[]) obj : ((p0c) obj).p();
        } catch (Throwable th) {
            RuntimeException runtimeException = this.y;
            if (runtimeException != null) {
                th.addSuppressed(runtimeException);
            }
            throw th;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        iuc iucVar = (iuc) obj;
        long j = iucVar.t;
        long j2 = this.t;
        int iCompare = Long.compare(j2, j);
        if (iCompare != 0) {
            return iCompare;
        }
        if (j2 != 0) {
            return 0;
        }
        String str = this.u;
        str.getClass();
        String str2 = iucVar.u;
        str2.getClass();
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iuc)) {
            return false;
        }
        iuc iucVar = (iuc) obj;
        return this.t == iucVar.t && Objects.equals(this.u, iucVar.u);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.t), this.u);
    }

    public final String toString() {
        String string = this.u;
        if (string == null) {
            string = Long.toString(this.t);
        }
        String strValueOf = String.valueOf(a());
        return w27.a(new StringBuilder(String.valueOf(string).length() + 1 + strValueOf.length()), string, ":", strValueOf);
    }
}
