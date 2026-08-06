package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n5d extends vxb implements p7d {
    @Override // defpackage.p7d
    public final y55 d() {
        Parcel parcelA = a(g(), 1);
        y55 y55VarG = y55.a.g(parcelA.readStrongBinder());
        parcelA.recycle();
        return y55VarG;
    }

    @Override // defpackage.p7d
    public final int e() {
        Parcel parcelA = a(g(), 2);
        int i = parcelA.readInt();
        parcelA.recycle();
        return i;
    }
}
