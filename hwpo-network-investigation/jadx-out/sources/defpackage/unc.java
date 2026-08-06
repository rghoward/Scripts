package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class unc extends p2 {
    public static final Parcelable.Creator<unc> CREATOR = new wnc();
    public final String t;
    public final String u;
    public final rnc v;
    public final boolean w;

    public unc(String str, String str2, rnc rncVar, boolean z) {
        this.t = str;
        this.u = str2;
        this.v = rncVar;
        this.w = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unc)) {
            return false;
        }
        unc uncVar = (unc) obj;
        return mpc.a(this.t, uncVar.t) && mpc.a(this.u, uncVar.u) && mpc.a(this.v, uncVar.v) && this.w == uncVar.w;
    }

    public final void j(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.t);
        sb.append(", ");
        sb.append(this.u);
        sb.append(", ");
        this.v.j(sb);
        sb.append(", ");
        sb.append(this.w);
        sb.append(")");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        j(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.i(parcel, 2, this.t);
        ms3.i(parcel, 3, this.u);
        ms3.h(parcel, 4, this.v, i);
        ms3.l(parcel, 5, 4);
        parcel.writeInt(this.w ? 1 : 0);
        ms3.n(parcel, iM);
    }
}
