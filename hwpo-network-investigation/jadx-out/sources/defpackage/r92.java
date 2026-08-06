package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r92 implements yi, om8 {
    public final Object t;

    public /* synthetic */ r92(Object obj) {
        this.t = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.om8
    public void accept(Object obj, Object obj2) {
        t9a t9aVar = (t9a) obj2;
        zw zwVar = zwb.k;
        iwb iwbVar = (iwb) ((axb) obj).x();
        oaa oaaVar = (oaa) this.t;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(iwbVar.c);
        int i = avb.a;
        if (oaaVar == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            oaaVar.writeToParcel(parcelObtain, 0);
        }
        try {
            iwbVar.b.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            t9aVar.b(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.yi
    public void c(Bundle bundle) {
        ((si) this.t).e("clx", "_ae", bundle);
    }
}
