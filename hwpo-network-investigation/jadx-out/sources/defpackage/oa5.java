package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class oa5 extends nab {
    public final String[] a;
    public final int b;

    public oa5(ArrayList arrayList) {
        this.a = new String[0];
        this.b = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        strArr = strArr == null ? new String[0] : strArr;
        this.a = strArr;
        this.b = strArr.length;
    }

    @Override // defpackage.nab
    public final String a(float f) {
        int iRound = Math.round(f);
        return (iRound < 0 || iRound >= this.b || iRound != ((int) f)) ? BuildConfig.FLAVOR : this.a[iRound];
    }
}
