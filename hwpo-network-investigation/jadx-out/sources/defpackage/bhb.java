package defpackage;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bhb implements yc9<View> {
    public final /* synthetic */ ViewPager2 a;

    public bhb(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // defpackage.yc9
    public final Iterator<View> iterator() {
        return new chb(this.a);
    }
}
