package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z7c extends p2 {
    public static final Parcelable.Creator<z7c> CREATOR = new b8c();
    public final Bundle t;

    public z7c(Bundle bundle) {
        this.t = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.c(parcel, 1, this.t);
        ms3.n(parcel, iM);
    }
}
