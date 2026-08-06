package defpackage;

import androidx.fragment.app.f;
import androidx.fragment.app.i;
import com.hwpo_training_app.notifications.presentation.NotificationsFragment;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class mu0 implements sf4 {
    public final String a;

    public mu0(ju0.c cVar) {
        this.a = cVar.x;
    }

    @Override // defpackage.sf4
    public final f a(i iVar) {
        iVar.getClass();
        return new NotificationsFragment();
    }

    @Override // defpackage.sf4
    public final /* bridge */ boolean b() {
        return true;
    }

    @Override // defpackage.z59
    public final String e() {
        return this.a;
    }
}
