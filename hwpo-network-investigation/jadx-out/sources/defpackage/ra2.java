package defpackage;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ra2 extends pi4 implements mh4<Boolean> {
    @Override // defpackage.mh4
    public final Boolean invoke() {
        ((sa2.a) this.receiver).getClass();
        return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
    }
}
