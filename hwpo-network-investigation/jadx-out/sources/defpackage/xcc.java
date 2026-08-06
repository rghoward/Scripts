package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xcc extends gac implements qbc {
    public final /* synthetic */ fwc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xcc(ycc yccVar, fwc fwcVar) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.b = fwcVar;
    }

    @Override // defpackage.gac
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        e();
        return true;
    }

    @Override // defpackage.qbc
    public final void e() {
        this.b.run();
    }
}
