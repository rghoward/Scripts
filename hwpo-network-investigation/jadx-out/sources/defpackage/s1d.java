package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s1d implements ServiceConnection {
    public final /* synthetic */ s3d t;

    public /* synthetic */ s1d(s3d s3dVar) {
        this.t = s3dVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        s3d s3dVar = this.t;
        s3dVar.b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        s3dVar.a().post(new azc(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        s3d s3dVar = this.t;
        s3dVar.b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        s3dVar.a().post(new o0d(this));
    }
}
