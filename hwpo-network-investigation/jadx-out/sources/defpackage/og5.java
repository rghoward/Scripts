package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class og5 implements Parcelable {
    public static final Parcelable.Creator<og5> CREATOR = new a();
    public final IntentSender t;
    public final Intent u;
    public final int v;
    public final int w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Parcelable.Creator<og5> {
        @Override // android.os.Parcelable.Creator
        public final og5 createFromParcel(Parcel parcel) {
            parcel.getClass();
            Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
            parcelable.getClass();
            return new og5((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final og5[] newArray(int i) {
            return new og5[i];
        }
    }

    public og5(IntentSender intentSender, Intent intent, int i, int i2) {
        this.t = intentSender;
        this.u = intent;
        this.v = i;
        this.w = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.t, i);
        parcel.writeParcelable(this.u, i);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
    }
}
