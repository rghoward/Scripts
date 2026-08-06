package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jg1 extends p2 {
    public static final Parcelable.Creator<jg1> CREATOR = new oxb();
    public final Intent t;

    public jg1(Intent intent) {
        this.t = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.h(parcel, 1, this.t, i);
        ms3.n(parcel, iM);
    }
}
