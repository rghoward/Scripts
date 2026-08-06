package defpackage;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qt2 implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ qt2(Object obj, Object obj2, Object obj3, int i) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
        this.w = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.t;
        Object obj = this.w;
        Object obj2 = this.v;
        Object obj3 = this.u;
        switch (i) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) obj3;
                c.a aVar = (c.a) obj;
                viewGroup.getClass();
                viewGroup.endViewTransition((View) obj2);
                aVar.c.a.c(aVar);
                break;
            default:
                ((vg3) obj3).lambda$processIntent$0((Intent) obj2, (t9a) obj);
                break;
        }
    }
}
