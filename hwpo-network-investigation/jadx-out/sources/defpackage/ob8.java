package defpackage;

import android.content.Context;
import androidx.profileinstaller.c;
import io.intercom.android.sdk.blocks.views.VideoPreviewView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ob8 implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ ob8(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                c.b((Context) obj, new ql6(), c.a, false);
                break;
            default:
                ((VideoPreviewView) obj).lambda$showFailedImage$0();
                break;
        }
    }
}
