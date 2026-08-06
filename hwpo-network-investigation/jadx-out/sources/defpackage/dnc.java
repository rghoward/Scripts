package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dnc extends p2 implements Comparable<dnc> {
    public static final Parcelable.Creator<dnc> CREATOR = new fnc();
    public final int t;
    public final rnc[] u;
    public final String[] v;
    public final TreeMap w = new TreeMap();

    public dnc(int i, rnc[] rncVarArr, String[] strArr) {
        this.t = i;
        this.u = rncVarArr;
        for (rnc rncVar : rncVarArr) {
            this.w.put(rncVar.t, rncVar);
        }
        this.v = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(dnc dncVar) {
        return this.t - dncVar.t;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dnc)) {
            return false;
        }
        dnc dncVar = (dnc) obj;
        return this.t == dncVar.t && mpc.a(this.w, dncVar.w) && Arrays.equals(this.v, dncVar.v);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.t);
        sb.append(", (");
        Iterator it = this.w.values().iterator();
        while (it.hasNext()) {
            sb.append((rnc) it.next());
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.v;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.l(parcel, 2, 4);
        parcel.writeInt(this.t);
        ms3.j(parcel, 3, this.u, i);
        String[] strArr = this.v;
        if (strArr != null) {
            int iM2 = ms3.m(parcel, 4);
            parcel.writeStringArray(strArr);
            ms3.n(parcel, iM2);
        }
        ms3.n(parcel, iM);
    }
}
