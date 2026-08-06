package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ccc extends txb implements qec {
    @Override // defpackage.qec
    public final String c() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcelA = a(parcelObtain, 1);
        String string = parcelA.readString();
        parcelA.recycle();
        return string;
    }

    @Override // defpackage.qec
    public final boolean e() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        int i = wac.a;
        parcelObtain.writeInt(1);
        Parcel parcelA = a(parcelObtain, 2);
        boolean z = parcelA.readInt() != 0;
        parcelA.recycle();
        return z;
    }
}
