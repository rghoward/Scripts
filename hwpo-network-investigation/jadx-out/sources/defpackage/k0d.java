package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k0d extends vxb {
    public final y55 O(se7 se7Var, String str, int i, se7 se7Var2) {
        Parcel parcelG = g();
        xac.b(parcelG, se7Var);
        parcelG.writeString(str);
        parcelG.writeInt(i);
        xac.b(parcelG, se7Var2);
        Parcel parcelA = a(parcelG, 3);
        y55 y55VarG = y55.a.g(parcelA.readStrongBinder());
        parcelA.recycle();
        return y55VarG;
    }

    public final y55 i(se7 se7Var, String str, int i, se7 se7Var2) {
        Parcel parcelG = g();
        xac.b(parcelG, se7Var);
        parcelG.writeString(str);
        parcelG.writeInt(i);
        xac.b(parcelG, se7Var2);
        Parcel parcelA = a(parcelG, 2);
        y55 y55VarG = y55.a.g(parcelA.readStrongBinder());
        parcelA.recycle();
        return y55VarG;
    }
}
