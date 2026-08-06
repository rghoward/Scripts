package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r03 implements om8 {
    public final Object t;
    public final Object u;

    public r03() {
        this.t = new tdb(0);
        this.u = new tdb(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.om8
    public void accept(Object obj, Object obj2) {
        int i = kpc.k;
        ipc ipcVar = new ipc((t9a) obj2);
        xpc xpcVar = (xpc) ((zpc) obj).x();
        String[] strArr = (String[]) this.u;
        String str = (String) this.t;
        Parcel parcelG = xpcVar.g();
        iac.c(parcelG, ipcVar);
        parcelG.writeString(str);
        parcelG.writeInt(0);
        parcelG.writeStringArray(strArr);
        parcelG.writeByteArray(null);
        xpcVar.i(parcelG, 1);
    }

    public /* synthetic */ r03(String str, String[] strArr) {
        this.t = str;
        this.u = strArr;
    }
}
