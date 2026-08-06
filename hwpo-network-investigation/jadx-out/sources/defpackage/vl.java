package defpackage;

import android.view.autofill.AutofillManager;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vl implements ry1 {
    public static /* bridge */ /* synthetic */ AutofillManager a(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* synthetic */ void b() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.ry1
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }
}
