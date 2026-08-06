package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class k86 implements Iterator<String>, zn5 {
    public final String t;
    public int u;
    public int v;
    public int w;
    public int x;

    public k86(String str) {
        this.t = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.u;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.x < 0) {
            this.u = 2;
            return false;
        }
        String str = this.t;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.v; i4 < length2; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.u = 1;
                this.x = i;
                this.w = length;
                return true;
            }
        }
        i = -1;
        this.u = 1;
        this.x = i;
        this.w = length;
        return true;
    }

    @Override // java.util.Iterator
    public final String next() {
        if (!hasNext()) {
            vl.b();
            return null;
        }
        this.u = 0;
        int i = this.w;
        int i2 = this.v;
        this.v = this.x + i;
        return this.t.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
