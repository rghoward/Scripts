package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zoa implements Parcelable {
    public static final Parcelable.Creator<zoa> CREATOR = new a();
    public long t;
    public long u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Parcelable.Creator<zoa> {
        @Override // android.os.Parcelable.Creator
        public final zoa createFromParcel(Parcel parcel) {
            return new zoa(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final zoa[] newArray(int i) {
            return new zoa[i];
        }
    }

    public zoa() {
        this(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()), SystemClock.elapsedRealtimeNanos() / 1000);
    }

    public final long a() {
        return new zoa().u - this.u;
    }

    public final long b(zoa zoaVar) {
        return zoaVar.u - this.u;
    }

    public final void c() {
        this.t = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.u = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.t);
        parcel.writeLong(this.u);
    }

    public zoa(long j, long j2) {
        this.t = j;
        this.u = j2;
    }
}
