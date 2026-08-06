package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qib implements z23, om8, xzc {
    public final Object t;

    public /* synthetic */ qib(Object obj) {
        this.t = obj;
    }

    @Override // defpackage.xzc
    public void a(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        lzc lzcVar = (lzc) this.t;
        if (!zIsEmpty) {
            lzcVar.e().p(new czc(this, str, str2, bundle));
            return;
        }
        tkc tkcVar = lzcVar.l;
        if (tkcVar != null) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.f.b(str2, "AppId not known when logging event");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.om8
    public void accept(Object obj, Object obj2) {
        t9a t9aVar = (t9a) obj2;
        zw zwVar = vwb.k;
        fwb fwbVar = (fwb) ((iub) obj).x();
        hub hubVar = (hub) this.t;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(fwbVar.c);
        int i = avb.a;
        parcelObtain.writeInt(1);
        hubVar.writeToParcel(parcelObtain, 0);
        try {
            fwbVar.b.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            t9aVar.b(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    public qib(View view, vv2 vv2Var) {
        this.t = view;
    }
}
