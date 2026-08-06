package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gnc extends p2 {
    public static final Parcelable.Creator<gnc> CREATOR = new inc();
    public final String t;
    public final byte[] u;
    public final String v;
    public final dnc[] w;
    public final TreeMap x = new TreeMap();
    public final boolean y;
    public final long z;

    public gnc(String str, String str2, dnc[] dncVarArr, boolean z, byte[] bArr, long j) {
        this.t = str;
        this.v = str2;
        this.w = dncVarArr;
        this.y = z;
        this.u = bArr;
        this.z = j;
        for (dnc dncVar : dncVarArr) {
            this.x.put(Integer.valueOf(dncVar.t), dncVar);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gnc)) {
            return false;
        }
        gnc gncVar = (gnc) obj;
        return mpc.a(this.t, gncVar.t) && mpc.a(this.v, gncVar.v) && this.x.equals(gncVar.x) && this.y == gncVar.y && Arrays.equals(this.u, gncVar.u) && this.z == gncVar.z;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.t, this.v, this.x, Boolean.valueOf(this.y), this.u, Long.valueOf(this.z)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.t);
        sb.append("', '");
        sb.append(this.v);
        sb.append("', (");
        Iterator it = this.x.values().iterator();
        while (it.hasNext()) {
            sb.append((dnc) it.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.y);
        sb.append(", ");
        byte[] bArr = this.u;
        sb.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb.append(", ");
        return fh0.b(sb, this.z, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.i(parcel, 2, this.t);
        ms3.i(parcel, 3, this.v);
        ms3.j(parcel, 4, this.w, i);
        ms3.l(parcel, 5, 4);
        parcel.writeInt(this.y ? 1 : 0);
        ms3.d(parcel, 6, this.u);
        ms3.l(parcel, 7, 8);
        parcel.writeLong(this.z);
        ms3.n(parcel, iM);
    }
}
