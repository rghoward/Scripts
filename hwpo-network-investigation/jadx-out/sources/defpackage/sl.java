package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sl implements pf1 {
    public final tl a;

    public sl(tl tlVar) {
        this.a = tlVar;
    }

    @Override // defpackage.pf1
    public final g2b a(of1 of1Var) {
        tl tlVar = this.a;
        if (of1Var != null) {
            tlVar.b().setPrimaryClip(of1Var.a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            dx.a(tlVar.b());
        } else {
            tlVar.b().setPrimaryClip(ClipData.newPlainText(BuildConfig.FLAVOR, BuildConfig.FLAVOR));
        }
        return g2b.a;
    }

    @Override // defpackage.pf1
    public final ClipboardManager b() {
        return this.a.b();
    }

    @Override // defpackage.pf1
    public final of1 c() {
        ClipData primaryClip = this.a.b().getPrimaryClip();
        if (primaryClip != null) {
            return new of1(primaryClip);
        }
        return null;
    }
}
