package defpackage;

import android.os.Parcel;
import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kpc extends vn4 {
    public static final /* synthetic */ int k = 0;

    static {
        Pair.create(new y48(), caa.e(null));
    }

    public final q6d c(final String str) {
        s9a.a aVarA = s9a.a();
        aVarA.a = new om8() { // from class: yoc
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.om8
            public final void accept(Object obj, Object obj2) {
                int i = kpc.k;
                ipc ipcVar = new ipc((t9a) obj2);
                xpc xpcVar = (xpc) ((zpc) obj).x();
                Parcel parcelG = xpcVar.g();
                iac.c(parcelG, ipcVar);
                parcelG.writeString(str);
                xpcVar.i(parcelG, 5);
            }
        };
        return b(0, aVarA.a());
    }
}
