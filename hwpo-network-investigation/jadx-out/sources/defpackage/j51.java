package defpackage;

import androidx.fragment.app.l;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j51 implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ j51(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                ((CarouselLayoutManager) obj).d1();
                break;
            default:
                ArrayList<l.p> arrayList = ((l) obj).o;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    l.p pVar = arrayList.get(i2);
                    i2++;
                    pVar.getClass();
                }
                break;
        }
    }
}
