package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gb4 implements sy1<hb4.a> {
    public final /* synthetic */ String a;

    public gb4(String str) {
        this.a = str;
    }

    @Override // defpackage.sy1
    public final void accept(hb4.a aVar) {
        hb4.a aVar2 = aVar;
        synchronized (hb4.c) {
            try {
                ep9<String, ArrayList<sy1<hb4.a>>> ep9Var = hb4.d;
                ArrayList<sy1<hb4.a>> arrayList = ep9Var.get(this.a);
                if (arrayList == null) {
                    return;
                }
                ep9Var.remove(this.a);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).accept(aVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
