package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class coc extends p2 implements Comparable<coc> {
    public static final Parcelable.Creator<coc> CREATOR = new eoc();
    public final int t;
    public final int u;

    public coc(int i, int i2) {
        this.t = i;
        this.u = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(coc cocVar) {
        coc cocVar2 = cocVar;
        int i = cocVar2.t;
        int i2 = this.t;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        int i3 = cocVar2.u;
        int i4 = this.u;
        if (i4 < i3) {
            return -1;
        }
        return i4 > i3 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
    
        r0 = (r3 = (defpackage.coc) r3).t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
    
        r3 = r3.u;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof defpackage.coc
            if (r0 == 0) goto L1c
            coc r3 = (defpackage.coc) r3
            int r0 = r3.t
            int r1 = r2.t
            if (r1 >= r0) goto Ld
            goto L1c
        Ld:
            if (r1 <= r0) goto L10
            goto L1c
        L10:
            int r3 = r3.u
            int r2 = r2.u
            if (r2 >= r3) goto L17
            goto L1c
        L17:
            if (r2 <= r3) goto L1a
            goto L1c
        L1a:
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coc.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (this.t * 31) + this.u;
    }

    public final String toString() {
        int i = this.t;
        int length = String.valueOf(i).length();
        int i2 = this.u;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(i2).length() + 1);
        sb.append("GenericDimension(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.l(parcel, 1, 4);
        parcel.writeInt(this.t);
        ms3.l(parcel, 2, 4);
        parcel.writeInt(this.u);
        ms3.n(parcel, iM);
    }
}
