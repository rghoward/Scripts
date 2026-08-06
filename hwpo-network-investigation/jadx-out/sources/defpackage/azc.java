package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class azc extends rmc {
    public final /* synthetic */ IBinder u;
    public final /* synthetic */ s1d v;

    public azc(s1d s1dVar, IBinder iBinder) {
        this.u = iBinder;
        this.v = s1dVar;
    }

    @Override // defpackage.rmc
    public final void a() {
        wec vbcVar;
        s3d s3dVar = this.v.t;
        int i = gdc.b;
        IBinder iBinder = this.u;
        if (iBinder == null) {
            vbcVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
            vbcVar = iInterfaceQueryLocalInterface instanceof wec ? (wec) iInterfaceQueryLocalInterface : new vbc(iBinder);
        }
        s3dVar.m = vbcVar;
        nkc nkcVar = s3dVar.b;
        int i2 = 0;
        nkcVar.a("linkToDeath", new Object[0]);
        try {
            s3dVar.m.asBinder().linkToDeath(s3dVar.j, 0);
        } catch (RemoteException e) {
            Object[] objArr = new Object[0];
            nkcVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", nkc.c(nkcVar.a, "linkToDeath failed", objArr), e);
            }
        }
        s3dVar.g = false;
        ArrayList arrayList = s3dVar.d;
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((Runnable) obj).run();
        }
        s3dVar.d.clear();
    }
}
