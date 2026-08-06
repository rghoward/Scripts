package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class en4 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ en4(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                synchronized (qu9.c) {
                    List<? extends oh4<Object, g2b>> list = qu9.i;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        list.get(i).invoke(obj);
                    }
                }
                return g2b.a;
            default:
                String str = obj != null ? (String) obj : null;
                str.getClass();
                return new xdb(str);
        }
    }
}
