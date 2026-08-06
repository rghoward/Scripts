package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class epc implements om8 {
    public final /* synthetic */ kpc t;
    public final /* synthetic */ String u;
    public final /* synthetic */ db6 v;

    public /* synthetic */ epc(kpc kpcVar, String str, db6 db6Var) {
        this.t = kpcVar;
        this.u = str;
        this.v = db6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.om8
    public final void accept(Object obj, Object obj2) {
        xpc xpcVar = (xpc) ((zpc) obj).x();
        uoc uocVar = new uoc(this.t, this.v);
        Parcel parcelG = xpcVar.g();
        parcelG.writeString(this.u);
        iac.c(parcelG, uocVar);
        xpcVar.i(parcelG, 28);
    }
}
