package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zyb {
    public zxb a;
    public zxb b;
    public final ArrayList c;

    public zyb() {
        this.a = new zxb(BuildConfig.FLAVOR, 0L, null);
        this.b = new zxb(BuildConfig.FLAVOR, 0L, null);
        this.c = new ArrayList();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zyb zybVar = new zyb(this.a.clone());
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            zybVar.c.add(((zxb) obj).clone());
        }
        return zybVar;
    }

    public zyb(zxb zxbVar) {
        this.a = zxbVar;
        this.b = zxbVar.clone();
        this.c = new ArrayList();
    }
}
