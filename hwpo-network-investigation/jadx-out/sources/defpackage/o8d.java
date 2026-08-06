package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o8d extends ln4 {
    public Object[] x;
    public int y;

    @Override // defpackage.ln4
    public final int b1() {
        return this.y;
    }

    @Override // defpackage.ln4
    public final d9d d1(int i) {
        if (i < this.y) {
            return (d9d) this.x[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.ln4
    public final Object e1(int i) {
        if (i < this.y) {
            return this.x[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.ln4
    public final Object g1(d9d d9dVar) {
        int iI1 = i1(d9dVar);
        if (iI1 == -1) {
            return null;
        }
        return d9dVar.b.cast(this.x[iI1 + iI1 + 1]);
    }

    public final void h1(d9d d9dVar, Object obj) {
        int iI1;
        if (!d9dVar.c && (iI1 = i1(d9dVar)) != -1) {
            qzb.a(obj, "metadata value");
            this.x[iI1 + iI1 + 1] = obj;
            return;
        }
        int i = this.y + 1;
        Object[] objArr = this.x;
        int length = objArr.length;
        if (i + i > length) {
            this.x = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = this.x;
        int i2 = this.y;
        int i3 = i2 + i2;
        objArr2[i3] = d9dVar;
        qzb.a(obj, "metadata value");
        objArr2[i3 + 1] = obj;
        this.y++;
    }

    public final int i1(d9d d9dVar) {
        for (int i = 0; i < this.y; i++) {
            if (this.x[i + i].equals(d9dVar)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.ln4
    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.y; i++) {
            sb.append(" '");
            sb.append(d1(i));
            sb.append("': ");
            sb.append(e1(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
