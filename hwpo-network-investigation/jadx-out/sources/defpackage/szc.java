package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class szc extends p2 {
    public static final Parcelable.Creator<szc> CREATOR = new uzc();
    public final int t;
    public final String u;
    public final long v;
    public final Long w;
    public final String x;
    public final String y;
    public final Double z;

    public szc(long j, Object obj, String str, String str2) {
        a78.d(str);
        this.t = 2;
        this.u = str;
        this.v = j;
        this.y = str2;
        if (obj == null) {
            this.w = null;
            this.z = null;
            this.x = null;
            return;
        }
        if (obj instanceof Long) {
            this.w = (Long) obj;
            this.z = null;
            this.x = null;
        } else if (obj instanceof String) {
            this.w = null;
            this.z = null;
            this.x = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                z90.a("User attribute given of un-supported type");
                throw null;
            }
            this.w = null;
            this.z = (Double) obj;
            this.x = null;
        }
    }

    public final Object j() {
        Long l = this.w;
        if (l != null) {
            return l;
        }
        Double d = this.z;
        if (d != null) {
            return d;
        }
        String str = this.x;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        uzc.a(this, parcel);
    }

    public szc(vzc vzcVar) {
        this(vzcVar.d, vzcVar.e, vzcVar.c, vzcVar.b);
    }

    public szc(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.t = i;
        this.u = str;
        this.v = j;
        this.w = l;
        this.z = i == 1 ? f != null ? Double.valueOf(f.doubleValue()) : null : d;
        this.x = str2;
        this.y = str3;
    }
}
