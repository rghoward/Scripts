package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z9c extends p2 {
    public static final Parcelable.Creator<z9c> CREATOR = new bac();
    public final String t;
    public final v9c u;
    public final String v;
    public final long w;
    public final long x;

    public z9c(z9c z9cVar, long j, long j2) {
        a78.g(z9cVar);
        this.t = z9cVar.t;
        this.u = z9cVar.u;
        this.v = z9cVar.v;
        this.w = j;
        this.x = j2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.u);
        String str = this.v;
        int length = String.valueOf(str).length();
        String str2 = this.t;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        ux1.b(sb, "origin=", str, ",name=", str2);
        return av.a(sb, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bac.a(this, parcel, i);
    }

    public z9c(String str, v9c v9cVar, String str2, long j, long j2) {
        this.t = str;
        this.u = v9cVar;
        this.v = str2;
        this.w = j;
        this.x = j2;
    }
}
