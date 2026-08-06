package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ync extends p2 {
    public static final Parcelable.Creator<ync> CREATOR = new aoc();
    public final List t;

    public ync(ArrayList arrayList) {
        this.t = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ync) {
            return this.t.equals(((ync) obj).t);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        boolean z = true;
        for (unc uncVar : this.t) {
            if (!z) {
                sb.append(", ");
            }
            uncVar.j(sb);
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.k(parcel, 2, this.t);
        ms3.n(parcel, iM);
    }
}
