package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yyb extends vxb implements x0c {
    @Override // defpackage.x0c
    public final boolean h() {
        Parcel parcelA = a(g(), 7);
        int i = xac.a;
        boolean z = parcelA.readInt() != 0;
        parcelA.recycle();
        return z;
    }

    @Override // defpackage.x0c
    public final n1d p(uyc uycVar) {
        Parcel parcelG = g();
        int i = xac.a;
        parcelG.writeInt(1);
        uycVar.writeToParcel(parcelG, 0);
        Parcel parcelA = a(parcelG, 6);
        n1d n1dVar = (n1d) xac.a(parcelA, n1d.CREATOR);
        parcelA.recycle();
        return n1dVar;
    }

    @Override // defpackage.x0c
    public final boolean v(n3d n3dVar, se7 se7Var) {
        Parcel parcelG = g();
        int i = xac.a;
        parcelG.writeInt(1);
        n3dVar.writeToParcel(parcelG, 0);
        xac.b(parcelG, se7Var);
        Parcel parcelA = a(parcelG, 5);
        boolean z = parcelA.readInt() != 0;
        parcelA.recycle();
        return z;
    }
}
