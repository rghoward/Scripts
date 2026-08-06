package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e5c extends p2 {
    public static final Parcelable.Creator<e5c> CREATOR = new h6c();
    public long A;
    public z9c B;
    public final long C;
    public final z9c D;
    public String t;
    public String u;
    public szc v;
    public long w;
    public boolean x;
    public String y;
    public final z9c z;

    public e5c(e5c e5cVar) {
        a78.g(e5cVar);
        this.t = e5cVar.t;
        this.u = e5cVar.u;
        this.v = e5cVar.v;
        this.w = e5cVar.w;
        this.x = e5cVar.x;
        this.y = e5cVar.y;
        this.z = e5cVar.z;
        this.A = e5cVar.A;
        this.B = e5cVar.B;
        this.C = e5cVar.C;
        this.D = e5cVar.D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.i(parcel, 2, this.t);
        ms3.i(parcel, 3, this.u);
        ms3.h(parcel, 4, this.v, i);
        long j = this.w;
        ms3.l(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.x;
        ms3.l(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        ms3.i(parcel, 7, this.y);
        ms3.h(parcel, 8, this.z, i);
        long j2 = this.A;
        ms3.l(parcel, 9, 8);
        parcel.writeLong(j2);
        ms3.h(parcel, 10, this.B, i);
        ms3.l(parcel, 11, 8);
        parcel.writeLong(this.C);
        ms3.h(parcel, 12, this.D, i);
        ms3.n(parcel, iM);
    }

    public e5c(String str, String str2, szc szcVar, long j, boolean z, String str3, z9c z9cVar, long j2, z9c z9cVar2, long j3, z9c z9cVar3) {
        this.t = str;
        this.u = str2;
        this.v = szcVar;
        this.w = j;
        this.x = z;
        this.y = str3;
        this.z = z9cVar;
        this.A = j2;
        this.B = z9cVar2;
        this.C = j3;
        this.D = z9cVar3;
    }
}
